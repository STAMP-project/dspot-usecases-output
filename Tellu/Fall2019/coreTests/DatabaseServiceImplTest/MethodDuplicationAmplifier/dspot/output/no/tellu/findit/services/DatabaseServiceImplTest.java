package no.tellu.findit.services;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import junit.framework.TestCase;
import no.tellu.findit.cfg.Environment;
import no.tellu.findit.cfg.HibernateUtil;
import no.tellu.findit.cmd.hibernate.CommandHandlerImpl;
import no.tellu.findit.dao.AssetDAO;
import no.tellu.findit.dao.DAOFactory;
import no.tellu.findit.domain.AccessToken;
import no.tellu.findit.domain.AccessTokenImpl;
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
import no.tellu.security.User;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;


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

    public void testDeleteCustomer_add2024_failAssert0_add2240_failAssert0_add4272_failAssert0() throws Exception {
        try {
            {
                {
                    Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                    List<CustomerImpl> cl = daoFactory.getCustomerDAO().findAll();
                    t.commit();
                    t.commit();
                    for (CustomerImpl c : cl) {
                        System.out.println(("Customer Name: " + (c.getName())));
                        service.deleteCustomer(((Customer) (c)));
                    }
                    HibernateUtil.getSessionFactory();
                    Transaction t2 = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                    List<CustomerImpl> cl2 = daoFactory.getCustomerDAO().findAll();
                    t2.commit();
                    t2.commit();
                    cl2.size();
                    junit.framework.TestCase.fail("testDeleteCustomer_add2024 should have thrown TransactionException");
                }
                junit.framework.TestCase.fail("testDeleteCustomer_add2024_failAssert0_add2240 should have thrown TransactionException");
            }
            junit.framework.TestCase.fail("testDeleteCustomer_add2024_failAssert0_add2240_failAssert0_add4272 should have thrown TransactionException");
        } catch (TransactionException expected) {
            TestCase.assertEquals("Transaction not successfully started", expected.getMessage());
        }
    }

    public void testDeleteCustomer_add2021_add2236_failAssert0_add4005_failAssert0() throws Exception {
        try {
            {
                Transaction t = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                List<CustomerImpl> cl = daoFactory.getCustomerDAO().findAll();
                t.commit();
                for (CustomerImpl c : cl) {
                    System.out.println(("Customer Name: " + (c.getName())));
                    service.deleteCustomer(((Customer) (c)));
                }
                HibernateUtil.getSessionFactory();
                Transaction t2 = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
                List<CustomerImpl> cl2 = daoFactory.getCustomerDAO().findAll();
                t2.commit();
                t2.commit();
                cl2.size();
                int o_testDeleteCustomer_add2021__24 = cl2.size();
                junit.framework.TestCase.fail("testDeleteCustomer_add2021_add2236 should have thrown TransactionException");
            }
            junit.framework.TestCase.fail("testDeleteCustomer_add2021_add2236_failAssert0_add4005 should have thrown TransactionException");
        } catch (TransactionException expected) {
            TestCase.assertEquals("Transaction not successfully started", expected.getMessage());
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
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPositionedBy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getTimeStamp());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getVersion())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyValidPosition());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isEmbeddedPositionSet());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getResourceId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPlacement());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getValidCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getBattery());
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
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPositionedBy());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getTimeStamp());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getVersion())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPosition());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyValidPosition());
        TestCase.assertFalse(((SensorDeviceImpl) (r)).isEmbeddedPositionSet());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getEmbeddedPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getResourceId());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getPlacement());
        TestCase.assertEquals(0L, ((long) (((SensorDeviceImpl) (r)).getValidCounter())));
        TestCase.assertNull(((SensorDeviceImpl) (r)).getLastValidPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getMyPosition());
        TestCase.assertNull(((SensorDeviceImpl) (r)).getBattery());
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

    public void testSaveAccessToken_add5720_add5752() throws Exception {
        Transaction o_testSaveAccessToken_add5720__1 = HibernateUtil.beginTransaction("DatabaseServiceImplTest");
        FinditUser o_testSaveAccessToken_add5720_add5752__4 = DomainFactory.createUser("magnus", "secret", "magnus@tellu.no", null);
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getTimeZone());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getAllowedToBypassInvitations());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwnerRole());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getSuperUser());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLimitedServiceOwner());
        TestCase.assertEquals("magnus", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getUsername());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isPasswordExpired());
        TestCase.assertEquals("secret", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getPassword());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isAccountExpired());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isEnabled());
        TestCase.assertEquals("magnus@tellu.no", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getEmailAddress());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isAccountLocked());
        TestCase.assertEquals("magnus", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getUsername());
        TestCase.assertEquals("", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwnerLimitation());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileNumber());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwner());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getConfirmationKey());
        TestCase.assertTrue(((Collection) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getUserGroups())).isEmpty());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getCustomer());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLastName());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceProvider());
        TestCase.assertEquals("", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getExternalIdentifier());
        TestCase.assertEquals("magnus@tellu.no", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getEmailAddress());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getAccessRestriction());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getPhoneNumber());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getRecoveryKey());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileVerified());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getFirstName());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getResourceId());
        TestCase.assertTrue(((Collection) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getApprovedIp())).isEmpty());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getApprovedIpString());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileVerificationCode());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getDemoUser());
        TestCase.assertTrue(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getNotificationsEnabled());
        TestCase.assertEquals("en", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLanguage());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getId());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getType());
        FinditUser u = DomainFactory.createUser("magnus", "secret", "magnus@tellu.no", null);
        daoFactory.getFinditUserDAO();
        FinditUserImpl o_testSaveAccessToken_add5720__5 = daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        AccessTokenImpl t = ((AccessTokenImpl) (DomainFactory.createAccessToken(new Date(), "map magnus", u)));
        AccessToken o_testSaveAccessToken_add5720__10 = service.saveAccessToken(t);
        HibernateUtil.commit();
        Long o_testSaveAccessToken_add5720__12 = t.getId();
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getTimeZone());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getAllowedToBypassInvitations());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwnerRole());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getSuperUser());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLimitedServiceOwner());
        TestCase.assertEquals("magnus", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getUsername());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isPasswordExpired());
        TestCase.assertEquals("secret", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getPassword());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isAccountExpired());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isEnabled());
        TestCase.assertEquals("magnus@tellu.no", ((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).getEmailAddress());
        TestCase.assertFalse(((User) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getBaseUser())).isAccountLocked());
        TestCase.assertEquals("magnus", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getUsername());
        TestCase.assertEquals("", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwnerLimitation());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileNumber());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceOwner());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getConfirmationKey());
        TestCase.assertTrue(((Collection) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getUserGroups())).isEmpty());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getCustomer());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLastName());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getServiceProvider());
        TestCase.assertEquals("", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getExternalIdentifier());
        TestCase.assertEquals("magnus@tellu.no", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getEmailAddress());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getAccessRestriction());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getPhoneNumber());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getRecoveryKey());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileVerified());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getFirstName());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getResourceId());
        TestCase.assertTrue(((Collection) (((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getApprovedIp())).isEmpty());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getApprovedIpString());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getMobileVerificationCode());
        TestCase.assertFalse(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getDemoUser());
        TestCase.assertTrue(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getNotificationsEnabled());
        TestCase.assertEquals("en", ((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getLanguage());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getId());
        TestCase.assertNull(((FinditUserImpl) (o_testSaveAccessToken_add5720_add5752__4)).getType());
    }

    public void testSaveAccessToken_add5717_add5779_add8778() throws Exception {
        Transaction o_testSaveAccessToken_add5717__1 = HibernateUtil.beginTransaction("DatabaseServiceImplTest");
        Transaction o_testSaveAccessToken_add5717_add5779_add8778__4 = HibernateUtil.beginTransaction("DatabaseServiceImplTest");
        TestCase.assertNull(o_testSaveAccessToken_add5717_add5779_add8778__4);
        Transaction o_testSaveAccessToken_add5717__2 = HibernateUtil.beginTransaction("DatabaseServiceImplTest");
        FinditUser u = DomainFactory.createUser("magnus", "secret", "magnus@tellu.no", null);
        FinditUserImpl o_testSaveAccessToken_add5717_add5779__9 = daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        FinditUserImpl o_testSaveAccessToken_add5717__5 = daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        AccessTokenImpl t = ((AccessTokenImpl) (DomainFactory.createAccessToken(new Date(), "map magnus", u)));
        AccessToken o_testSaveAccessToken_add5717__10 = service.saveAccessToken(t);
        HibernateUtil.commit();
        Long o_testSaveAccessToken_add5717__12 = t.getId();
        TestCase.assertNull(o_testSaveAccessToken_add5717_add5779_add8778__4);
    }

    public void testSaveAccessToken_add5720_add6362_add8758() throws Exception {
        Transaction o_testSaveAccessToken_add5720__1 = HibernateUtil.beginTransaction("DatabaseServiceImplTest");
        FinditUser u = DomainFactory.createUser("magnus", "secret", "magnus@tellu.no", null);
        daoFactory.getFinditUserDAO();
        FinditUserImpl o_testSaveAccessToken_add5720__5 = daoFactory.getFinditUserDAO().saveOrUpdate(((FinditUserImpl) (u)));
        AccessTokenImpl t = ((AccessTokenImpl) (DomainFactory.createAccessToken(new Date(), "map magnus", u)));
        AccessToken o_testSaveAccessToken_add5720_add6362_add8758__14 = service.saveAccessToken(t);
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getTimeZone());
        TestCase.assertEquals("", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwnerLimitation());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getFirstName());
        TestCase.assertTrue(((Collection) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getUserGroups())).isEmpty());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getRecoveryKey());
        TestCase.assertEquals("magnus@tellu.no", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getEmailAddress());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isEnabled());
        TestCase.assertEquals("magnus", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getUsername());
        TestCase.assertEquals("secret", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getPassword());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isAccountExpired());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isPasswordExpired());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isAccountLocked());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getConfirmationKey());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwnerRole());
        TestCase.assertEquals("", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getExternalIdentifier());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLimitedServiceOwner());
        TestCase.assertTrue(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getNotificationsEnabled());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getDemoUser());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLastName());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwner());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getAllowedToBypassInvitations());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getSuperUser());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceProvider());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getPhoneNumber());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getAccessRestriction());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getResourceId());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getCustomer());
        TestCase.assertEquals("en", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLanguage());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getType());
        TestCase.assertEquals(2L, ((long) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getId())));
        TestCase.assertEquals("map magnus", ((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getCommand());
        TestCase.assertEquals(1L, ((long) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getId())));
        AccessToken o_testSaveAccessToken_add5720__10 = service.saveAccessToken(t);
        HibernateUtil.commit();
        Long o_testSaveAccessToken_add5720_add6362__18 = t.getId();
        Long o_testSaveAccessToken_add5720__12 = t.getId();
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getTimeZone());
        TestCase.assertEquals("", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwnerLimitation());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getFirstName());
        TestCase.assertTrue(((Collection) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getUserGroups())).isEmpty());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getRecoveryKey());
        TestCase.assertEquals("magnus@tellu.no", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getEmailAddress());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isEnabled());
        TestCase.assertEquals("magnus", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getUsername());
        TestCase.assertEquals("secret", ((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).getPassword());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isAccountExpired());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isPasswordExpired());
        TestCase.assertFalse(((User) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getBaseUser())).isAccountLocked());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getConfirmationKey());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwnerRole());
        TestCase.assertEquals("", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getExternalIdentifier());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLimitedServiceOwner());
        TestCase.assertTrue(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getNotificationsEnabled());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getDemoUser());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLastName());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceOwner());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getAllowedToBypassInvitations());
        TestCase.assertFalse(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getSuperUser());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getServiceProvider());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getPhoneNumber());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getAccessRestriction());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getResourceId());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getCustomer());
        TestCase.assertEquals("en", ((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getLanguage());
        TestCase.assertNull(((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getType());
        TestCase.assertEquals(2L, ((long) (((FinditUser) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getUser())).getId())));
        TestCase.assertEquals("map magnus", ((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getCommand());
        TestCase.assertEquals(1L, ((long) (((AccessTokenImpl) (o_testSaveAccessToken_add5720_add6362_add8758__14)).getId())));
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

