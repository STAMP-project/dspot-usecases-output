package no.tellu.findit.services;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import no.tellu.findit.cfg.Environment;
import no.tellu.findit.cfg.HibernateUtil;
import no.tellu.findit.cmd.hibernate.CommandHandlerImpl;
import no.tellu.findit.dao.AssetDAO;
import no.tellu.findit.dao.DAOFactory;
import no.tellu.findit.domain.Asset;
import no.tellu.findit.domain.AssetImpl;
import no.tellu.findit.domain.Customer;
import no.tellu.findit.domain.CustomerImpl;
import no.tellu.findit.domain.DomainFactory;
import no.tellu.findit.domain.FinditUser;
import no.tellu.findit.domain.FinditUserImpl;
import no.tellu.findit.domain.LocationImpl;
import no.tellu.findit.domain.Position;
import no.tellu.findit.domain.PositionImpl;
import no.tellu.findit.domain.Rule;
import no.tellu.findit.domain.RuleImpl;
import no.tellu.findit.domain.SensorDevice;
import no.tellu.findit.domain.SensorDeviceImpl;
import no.tellu.findit.domain.ServiceProviderImpl;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.vividsolutions.jts.util.Assert.isTrue;


@RunWith(JUnit4.class)
public class AddressLookupServiceTest {
    AddressLookupServiceImpl service = null;

    DatabaseServiceImpl dbservice = null;

    DAOFactory daoFactory = null;

    Customer c;

    @Before
    public void setUp() throws Exception {
        Environment.setDataSourceEnvironment("test");
        daoFactory = DAOFactory.instance(DAOFactory.HIBERNATE);
        dbservice = new DatabaseServiceImpl();
        CommandHandlerImpl h = new CommandHandlerImpl();
        h.setDAOFactory(daoFactory);
        dbservice.setCommandHandler(h);
        service = AddressLookupServiceImpl.createInstance(dbservice);
        setUpData();
    }

    private void setUpData() throws Exception {
        Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        FinditUser u = DomainFactory.createUser("name", "password", "emailAddress", null);
        c = DomainFactory.createCustomer(u, "TestCustomer", null);
        ServiceProviderImpl sp = ((ServiceProviderImpl) (DomainFactory.createServiceProvider(u, "spname", null)));
        sp.setGoogleEnabled(true);
        c.setServiceProvider(sp);
        SensorDevice sensor = DomainFactory.createSensorDevice("sensor1", "description", "uuid1", null, c, null);
        Rule r = DomainFactory.createRule("rule number 1", "rule 'as text'", c, true);
        Asset a1 = DomainFactory.createAsset("asset1", "asset number 1", c, null);
        Asset a2 = DomainFactory.createAsset("asset2", "asset number 2", c, null);
        Asset a3 = DomainFactory.createAsset("asset3", "asset number 3", c, null);
        a1.setPositionedBy(a3);
        a3.setPositionedBy(sensor);
        Position p = DomainFactory.createPosition(59.58669, 10.22541, 500.0, 0.0, new Date());
        sensor.setPosition(p);
        List<Position> positions = new LinkedList<Position>();
        positions.add(new PositionImpl(59.59017, 10.22232));
        positions.add(new PositionImpl(59.5903, 10.23493));
        positions.add(new PositionImpl(59.58378, 10.23159));
        positions.add(new PositionImpl(59.58404, 10.21837));
        LocationImpl loc = ((LocationImpl) (DomainFactory.createLocation("loc1", "Beskrivelse", c, positions.get(0), null)));
        loc.setPoints(positions);
        loc.getPosition().setAddress("Dunihagen indre");
        positions = new LinkedList<Position>();
        positions.add(new PositionImpl(59.59212, 10.21511));
        positions.add(new PositionImpl(59.5923, 10.24008));
        positions.add(new PositionImpl(59.57852, 10.24008));
        positions.add(new PositionImpl(59.57865, 10.21596));
        LocationImpl loc2 = ((LocationImpl) (DomainFactory.createLocation("loc2", "Beskrivelse", c, positions.get(0), null)));
        loc2.setPoints(positions);
        loc2.getPosition().setAddress("Dunihagen ytre");
        daoFactory.getPositionDAO().saveOrUpdate(((PositionImpl) (loc.getPosition())));
        daoFactory.getPositionDAO().saveOrUpdate(((PositionImpl) (loc2.getPosition())));
        daoFactory.getPositionDAO().saveOrUpdate(((PositionImpl) (p)));
        daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        daoFactory.getServiceProviderDAO().saveOrUpdate(((ServiceProviderImpl) (sp)));
        daoFactory.getCustomerDAO().saveOrUpdate(((CustomerImpl) (c)));
        daoFactory.getSensorDeviceDAO().saveOrUpdate(((SensorDeviceImpl) (sensor)));
        daoFactory.getLocationDAO().saveOrUpdate(((LocationImpl) (loc)));
        daoFactory.getLocationDAO().saveOrUpdate(((LocationImpl) (loc2)));
        AssetDAO assetDAO = daoFactory.getAssetDAO();
        assetDAO.saveOrUpdate(((AssetImpl) (a1)));
        assetDAO.saveOrUpdate(((AssetImpl) (a2)));
        assetDAO.saveOrUpdate(((AssetImpl) (a3)));
        daoFactory.getRuleDAO().saveOrUpdate(((RuleImpl) (r)));
        t.commit();
        Assert.assertNotNull("Customer saved", c.getId());
    }

    @Ignore
    @Test
    public void doCoordinateFromAddressGoogle() throws ServiceException {
        service.setDatabaseService(dbservice);
        List<Position> res = service.lookupCoordinateFromAddressGoogle(c, "Roderweg 84");
        Assert.assertTrue("Lookup returns multiple results", ((res.size()) > 0));
    }

    @Ignore
    @Test
    public void doCoordinateFromAddressOSM() throws ServiceException {
        service.setDatabaseService(dbservice);
        List<Position> res = service.lookupCoordinateFromAddressOSM(c, "Sande");
        Assert.assertTrue("Lookup returns multiple results", ((res.size()) > 0));
    }

    @Test(timeout = 2000)
    public void doAddressLookupNoZoneString() throws ServiceException {
        service.setDatabaseService(dbservice);
        String res = service.lookupAddress("59.58704", "10.22601", c.getId(), false);
        Assert.assertEquals("Hesteskoen 17, Dunihagen, 3072, no", res);
        System.out.println(res);
        Assert.assertEquals("Hesteskoen 17, Dunihagen, 3072, no", res);
    }

    @Ignore
    @Test
    public void doGoogleAddressLookup() throws ServiceException {
        Position pos = new PositionImpl(59.58693, 10.20773);
        service.setDatabaseService(dbservice);
        service.lookupAddressFromGoogleProvider(pos);
        Assert.assertNotNull(pos.getAddress());
        System.out.println(pos.getAddress());
    }

    @Test(timeout = 2000)
    public void doOSMAddressLookup() throws ServiceException {
        Position pos = new PositionImpl(59.58693, 10.20773);
        service.setDatabaseService(dbservice);
        boolean o_doOSMAddressLookup__4 = service.lookupAddressFromOSMProvider(pos);
        Assert.assertTrue(o_doOSMAddressLookup__4);
        String o_doOSMAddressLookup__5 = pos.getAddress();
        Assert.assertEquals("Rev\u00e5veien 12, 3070 Sande, Norge", o_doOSMAddressLookup__5);
        System.out.println(pos.getAddress());
        Assert.assertTrue(o_doOSMAddressLookup__4);
        Assert.assertEquals("Rev\u00e5veien 12, 3070 Sande, Norge", o_doOSMAddressLookup__5);
    }

    @Ignore
    @Test
    public void doGoogleAddressLookupInBush() throws ServiceException {
        Position pos = new PositionImpl(59.58535, 10.27038);
        service.setDatabaseService(dbservice);
        boolean res = service.lookupAddressFromGoogleProvider(pos);
        isTrue(res);
        Assert.assertNotNull(pos.getAddress());
        System.out.println(pos.getAddress());
    }

    @Test(timeout = 2000)
    public void doOSMAddressLookupInBush() throws ServiceException {
        Position pos = new PositionImpl(59.58537, 10.27039);
        service.setDatabaseService(dbservice);
        boolean o_doOSMAddressLookupInBush__4 = service.lookupAddressFromOSMProvider(pos);
        Assert.assertTrue(o_doOSMAddressLookupInBush__4);
        String o_doOSMAddressLookupInBush__5 = pos.getAddress();
        Assert.assertEquals("3076 Selvik, Norge", o_doOSMAddressLookupInBush__5);
        System.out.println(pos.getAddress());
        Assert.assertTrue(o_doOSMAddressLookupInBush__4);
        Assert.assertEquals("3076 Selvik, Norge", o_doOSMAddressLookupInBush__5);
    }

    public void doOSMAddressLookupInBush100withCache() throws ServiceException {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            double lat = 59.58637 + (i / 10);
            double lon = 10.27039 + (i / 10);
            System.out.println(((("lat:" + lat) + ", lon:") + lon));
            Position pos = new PositionImpl((59.58637 + (i / 10.0)), (10.27039 + (i / 10.0)));
            service.setDatabaseService(dbservice);
            service.lookupAddressFromOSMProvider(pos);
            Assert.assertNotNull(pos.getAddress());
            System.out.println(pos.getAddress());
        }
        System.out.println(("Used time with cache:" + (String.valueOf(((System.currentTimeMillis()) - time)))));
    }

    public void doOSMAddressLookupInBush100withoutCache() throws ServiceException {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Position pos = new PositionImpl(59.58637, 10.27339);
            service.setDatabaseService(dbservice);
            service.lookupAddressFromOSMProvider(pos, false);
            Assert.assertNotNull(pos.getAddress());
        }
        System.out.println(("Used time without cache:" + (String.valueOf(((System.currentTimeMillis()) - time)))));
    }
}

