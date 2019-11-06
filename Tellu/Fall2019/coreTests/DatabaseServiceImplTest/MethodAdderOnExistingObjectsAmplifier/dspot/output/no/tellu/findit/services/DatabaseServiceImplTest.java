package no.tellu.findit.services;


import java.util.Date;
import java.util.List;
import junit.framework.TestCase;
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
import no.tellu.findit.domain.Position;
import no.tellu.findit.domain.PositionImpl;
import no.tellu.findit.domain.Rule;
import no.tellu.findit.domain.RuleImpl;
import no.tellu.findit.domain.SensorDevice;
import no.tellu.findit.domain.SensorDeviceImpl;
import org.hibernate.LazyInitializationException;
import org.hibernate.Transaction;


public class DatabaseServiceImplTest extends TestCase {
    DatabaseServiceImpl service;

    DAOFactory daoFactory;

    DomainFactory objFactory;

    Customer customer = null;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Environment.setDataSourceEnvironment("test");
        daoFactory = DAOFactory.instance(DAOFactory.HIBERNATE);
        service = new DatabaseServiceImpl();
        CommandHandlerImpl h = new CommandHandlerImpl();
        h.setDAOFactory(daoFactory);
        service.setCommandHandler(h);
        setUpData();
    }

    public void testDeleteCustomer_mg1_failAssert0() throws Exception {
        try {
            Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            List<CustomerImpl> cl = daoFactory.getCustomerDAO().findAll();
            t.commit();
            for (CustomerImpl c : cl) {
                RuleImpl __DSPOT_rule_0 = new RuleImpl();
                System.out.println(("Customer Name: " + (c.getName())));
                service.deleteCustomer(((Customer) (c)));
                c.addRule(__DSPOT_rule_0);
            }
            Transaction t2 = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            List<CustomerImpl> cl2 = daoFactory.getCustomerDAO().findAll();
            t2.commit();
            cl2.size();
            junit.framework.TestCase.fail("testDeleteCustomer_mg1 should have thrown LazyInitializationException");
        } catch (LazyInitializationException expected) {
            TestCase.assertEquals("failed to lazily initialize a collection of role: no.tellu.findit.domain.CustomerImpl.rules, no session or session was closed", expected.getMessage());
        }
    }

    public void testDeleteCustomer_mg3_failAssert0() throws Exception {
        try {
            Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            List<CustomerImpl> cl = daoFactory.getCustomerDAO().findAll();
            t.commit();
            for (CustomerImpl c : cl) {
                RuleImpl __DSPOT_rule_2 = new RuleImpl();
                System.out.println(("Customer Name: " + (c.getName())));
                service.deleteCustomer(((Customer) (c)));
                c.removeRule(__DSPOT_rule_2);
            }
            Transaction t2 = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            List<CustomerImpl> cl2 = daoFactory.getCustomerDAO().findAll();
            t2.commit();
            cl2.size();
            junit.framework.TestCase.fail("testDeleteCustomer_mg3 should have thrown LazyInitializationException");
        } catch (LazyInitializationException expected) {
            TestCase.assertEquals("failed to lazily initialize a collection of role: no.tellu.findit.domain.CustomerImpl.rules, no session or session was closed", expected.getMessage());
        }
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        HibernateUtil.shutdown();
    }

    public void testAddSensorDevice() throws Exception {
        SensorDevice s = new SensorDeviceImpl();
        s.setUuid("uuid2");
        SensorDevice r = service.saveSensorDevice(s);
        TestCase.assertNull(((SensorDeviceImpl) (r)).getServiceProvider());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getServiceProviderId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).isOffline());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isDeleted());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isPositioned());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getPrimaryPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getPrimaryProperties().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getDelayBeforeGpsTrust());
        TestCase.assertEquals(0.0, ((double) (((SensorDeviceImpl) (r)).getMessagesPerHour())), 0.1);
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getMessagesPerTimeCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSensorDeviceConfiguration());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getNextTimeoutPerFilterString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getNextTimeoutPerFilter().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getNextFilterTimeout());
        TestCase.assertEquals("uuid2", ((SensorDeviceImpl) (r)).getIdentifierCode());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSubscriptionCriteria());
        TestCase.assertEquals("uuid2", ((SensorDeviceImpl) (r)).getUuid());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSensorDeviceType());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isTracked());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getOrigin());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastBeaconUpdate());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getFilterConfigString());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getFilterStateString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getFilterState().isEmpty());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getFilterConfig().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getCustomerId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).isActive());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getAccumulatedPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getAccumulatedProperties().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getCommandPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getCommandProperties().isEmpty());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getAdditionalPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getAdditionalProperties().isEmpty());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getLastFilterPoll())));
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isMessagesPerHourOutdated());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSubscription());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).getTransitiveToPermanentMode());
        TestCase.assertEquals(5, ((int) (((SensorDeviceImpl) (r)).hashCode())));
        TestCase.assertEquals("sensorDevice", ((SensorDeviceImpl) (r)).getTypeCode());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getOwner());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getDescription());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getVersion())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPlacement());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPositionedBy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getTimeStamp());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getBattery());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isEmbeddedPositionSet());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getResourceId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getValidCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationX());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationY());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationZ());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMeta());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLatitude());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLongitude());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedAccuracy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedFloor());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedTextual());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedAddress());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getName());
        TestCase.assertEquals(5L, ((long) (((SensorDeviceImpl) (r)).getId())));
        Long o_testAddSensorDevice__6 = r.getId();
        TestCase.assertEquals(5L, ((long) (o_testAddSensorDevice__6)));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getServiceProvider());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getServiceProviderId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).isOffline());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isDeleted());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isPositioned());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getPrimaryPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getPrimaryProperties().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getDelayBeforeGpsTrust());
        TestCase.assertEquals(0.0, ((double) (((SensorDeviceImpl) (r)).getMessagesPerHour())), 0.1);
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getMessagesPerTimeCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSensorDeviceConfiguration());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getNextTimeoutPerFilterString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getNextTimeoutPerFilter().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getNextFilterTimeout());
        TestCase.assertEquals("uuid2", ((SensorDeviceImpl) (r)).getIdentifierCode());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSubscriptionCriteria());
        TestCase.assertEquals("uuid2", ((SensorDeviceImpl) (r)).getUuid());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSensorDeviceType());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isTracked());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getOrigin());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastBeaconUpdate());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getFilterConfigString());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getFilterStateString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getFilterState().isEmpty());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getFilterConfig().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getCustomerId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).isActive());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getAccumulatedPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getAccumulatedProperties().isEmpty());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getCommandPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getCommandProperties().isEmpty());
        TestCase.assertEquals("", ((SensorDeviceImpl) (r)).getAdditionalPropertiesString());
        TestCase.assertTrue(((SensorDeviceImpl) (r)).getAdditionalProperties().isEmpty());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getLastFilterPoll())));
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isMessagesPerHourOutdated());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getSubscription());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).getTransitiveToPermanentMode());
        TestCase.assertEquals(5, ((int) (((SensorDeviceImpl) (r)).hashCode())));
        TestCase.assertEquals("sensorDevice", ((SensorDeviceImpl) (r)).getTypeCode());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getOwner());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getDescription());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getVersion())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPlacement());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPositionedBy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getTimeStamp());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getBattery());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isEmbeddedPositionSet());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getResourceId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getValidCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationX());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationY());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLocationZ());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMeta());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLatitude());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedLongitude());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedAccuracy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedFloor());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedTextual());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedAddress());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getName());
        TestCase.assertEquals(5L, ((long) (((SensorDeviceImpl) (r)).getId())));
    }

    private void setUpData() {
        Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        FinditUser u = DomainFactory.createUser("name", "password", "emailAddress", null);
        Customer c = DomainFactory.createCustomer(u, "TestCustomer", null);
        SensorDevice sensor = DomainFactory.createSensorDevice("sensor1", "description", "uuid1", null, c, null);
        Rule r = DomainFactory.createRule("rule number 1", "rule 'as text'", c, true);
        Asset a1 = DomainFactory.createAsset("asset1", "asset number 1", c, null);
        Asset a2 = DomainFactory.createAsset("asset2", "asset number 2", c, null);
        Asset a3 = DomainFactory.createAsset("asset3", "asset number 3", c, null);
        a1.setPositionedBy(a3);
        a3.setPositionedBy(sensor);
        Position p = DomainFactory.createPosition(59.0, 10.0, 500.0, 5.0, new Date());
        sensor.setPosition(p);
        daoFactory.getPositionDAO().saveOrUpdate(((PositionImpl) (p)));
        daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        daoFactory.getCustomerDAO().saveOrUpdate(((CustomerImpl) (c)));
        daoFactory.getSensorDeviceDAO().saveOrUpdate(((SensorDeviceImpl) (sensor)));
        AssetDAO assetDAO = daoFactory.getAssetDAO();
        assetDAO.saveOrUpdate(((AssetImpl) (a1)));
        assetDAO.saveOrUpdate(((AssetImpl) (a2)));
        assetDAO.saveOrUpdate(((AssetImpl) (a3)));
        daoFactory.getRuleDAO().saveOrUpdate(((RuleImpl) (r)));
        t.commit();
        customer = c;
        TestCase.assertNotNull("Customer saved", customer.getId());
    }
}

