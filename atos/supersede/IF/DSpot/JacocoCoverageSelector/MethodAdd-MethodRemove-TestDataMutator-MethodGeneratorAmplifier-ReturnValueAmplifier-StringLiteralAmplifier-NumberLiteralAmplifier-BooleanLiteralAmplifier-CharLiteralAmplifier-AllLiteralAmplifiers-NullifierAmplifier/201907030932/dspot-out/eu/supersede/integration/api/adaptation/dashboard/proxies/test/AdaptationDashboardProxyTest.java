package eu.supersede.integration.api.adaptation.dashboard.proxies.test;


import eu.supersede.integration.api.adaptation.dashboad.types.Action;
import eu.supersede.integration.api.adaptation.dashboad.types.Adaptation;
import eu.supersede.integration.api.adaptation.dashboad.types.Enactment;
import eu.supersede.integration.api.adaptation.dashboard.proxies.AdaptationDashboardProxy;
import eu.supersede.integration.api.adaptation.types.ModelSystem;
import eu.supersede.integration.api.adaptation.types.Tenant;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;


public class AdaptationDashboardProxyTest {
    private static AdaptationDashboardProxy<Object, Object> proxy;

    private static String adaptationId;

    private static String enactmentId;

    @BeforeClass
    public static void setup() throws Exception {
        AdaptationDashboardProxyTest.proxy = new AdaptationDashboardProxy<>("adaptation", "adaptation", "senercon");
        List<Adaptation> adaptations = AdaptationDashboardProxyTest.proxy.getAllAdaptations();
        Assert.notEmpty(adaptations);
        AdaptationDashboardProxyTest.adaptationId = adaptations.get(0).getFc_id();
        Assert.notNull(AdaptationDashboardProxyTest.adaptationId);





    }

    @Test(timeout = 30000)
    public void testGetAdaptation_add3370() throws Exception {
        Adaptation o_testGetAdaptation_add3370__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3370__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3370__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3370__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3370__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3370__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3370__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3370__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3370__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3370__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3387() throws Exception {
        Adaptation __DSPOT_a_286 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3387__14 = adaptation.compareTo(__DSPOT_a_286);
        assertEquals(0, ((int) (o_testGetAdaptation_mg3387__14)));
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3381_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3381 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3387_add3574() throws Exception {
        Adaptation __DSPOT_a_286 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        Adaptation o_testGetAdaptation_mg3387_add3574__9 = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getFc_id());
        assertEquals(0.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3387__14 = adaptation.compareTo(__DSPOT_a_286);
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getFc_id());
        assertEquals(0.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3387_add3574__9)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3382_failAssert0_mg3637_failAssert0() throws Exception {
        try {
            {
                Date __DSPOT_computation_timestamp_313 = new Date("cEWMHUZo@XT$QA3=&:J/");
                Adaptation adaptation = createAdaptation("Players - Smart platform Handshake service in single VM");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Assert.notNull(adaptation);
                Assert.notNull(adaptation);
                adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testGetAdaptation_literalMutationString3382 should have thrown URISyntaxException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_313);
            }
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3382_failAssert0_mg3637 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3387_add3574litString4758_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_a_286 = new Adaptation();
            Adaptation adaptation = createAdaptation("+Q;");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            Adaptation o_testGetAdaptation_mg3387_add3574__9 = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg3387__14 = adaptation.compareTo(__DSPOT_a_286);
            org.junit.Assert.fail("testGetAdaptation_mg3387_add3574litString4758 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_add1() throws Exception {
        Adaptation o_testAddAdaptation_add1__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_add1__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_add1__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_add1__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_add1__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_add1__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_add1__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_add1__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_add1__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals(0, ((int) (o_testAddAdaptation_mg14__10)));
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_literalMutationString9_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("9}05");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptation_literalMutationString9 should have thrown URISyntaxException");
        } catch (URISyntaxException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptationlitString28_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("Medium load configuration for HSK service");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitString28 should have thrown URISyntaxException");
        } catch (URISyntaxException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptationnull36_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation(null);
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationnull36 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptationnull37_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationnull37 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_add175() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        Adaptation o_testAddAdaptation_mg14_add175__5 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add175__5)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_add175null1252_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_a_0 = new Adaptation();
            Adaptation adaptation = createAdaptation("905");
            Adaptation o_testAddAdaptation_mg14_add175__5 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
            org.junit.Assert.fail("testAddAdaptation_mg14_add175null1252 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    private Adaptation createAdaptation(String fc_id) {
        Adaptation adaptation = new Adaptation();
        adaptation.setFc_id(fc_id);
        adaptation.setComputation_timestamp(Calendar.getInstance().getTime());
        adaptation.setModel_system(ModelSystem.Atos_HSK);
        adaptation.setName("Medium load configuration for HSK service");
        adaptation.setRank(1.0);
        adaptation.getActions().add(createAction());
        return adaptation;
    }

    private Action createAction() {
        Action action = new Action();
        action.setAction_id("vm2_b_high");
        action.setDescription("Medium load configuration for HSK service");
        action.setName("VM2_B_HighConfiguration");
        action.setEnabled(true);
        return action;
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5287_failAssert0() throws Exception {
        try {
            List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull5287 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5287_failAssert0_add5299_failAssert0() throws Exception {
        try {
            {
                AdaptationDashboardProxyTest.proxy.getAllEnactments();
                List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
                Assert.notNull(null);
                org.junit.Assert.fail("testGetAllEnactmentsnull5287 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAllEnactmentsnull5287_failAssert0_add5299 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5329() throws Exception {
        Enactment o_testGetEnactment_add5329__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
        assertNull(o_testGetEnactment_add5329__1);
        Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

        assertNull(o_testGetEnactment_add5329__1);
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5330_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_429 = new Adaptation();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_429);
            org.junit.Assert.fail("testGetEnactment_mg5330 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5333_failAssert0() throws Exception {
        try {
            String __DSPOT_fc_id_432 = "x=_<%ft4ZcWnP&.ZuHnJ";
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setFc_id(__DSPOT_fc_id_432);
            org.junit.Assert.fail("testGetEnactment_mg5333 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5330_failAssert0_mg5363_failAssert0() throws Exception {
        try {
            {
                List<Action> __DSPOT_actions_441 = Collections.singletonList(new Action());
                Adaptation __DSPOT_adaptation_429 = new Adaptation();
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                enactment.setAdaptation(__DSPOT_adaptation_429);
                org.junit.Assert.fail("testGetEnactment_mg5330 should have thrown NullPointerException");
                __DSPOT_adaptation_429.setActions(__DSPOT_actions_441);
            }
            org.junit.Assert.fail("testGetEnactment_mg5330_failAssert0_mg5363 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5329_mg5353_failAssert0_add5530_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_adaptation_434 = new Adaptation();
                AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
                Enactment o_testGetEnactment_add5329__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                o_testGetEnactment_add5329__1.setAdaptation(__DSPOT_adaptation_434);
                org.junit.Assert.fail("testGetEnactment_add5329_mg5353 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testGetEnactment_add5329_mg5353_failAssert0_add5530 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1801_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1801 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_mg1818_failAssert0() throws Exception {
        try {
            Date __DSPOT_computation_timestamp_140 = new Date(1756234953, -1046351086, 2037508841, -771485774, 773695503, 948657429);
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_140);
            org.junit.Assert.fail("testAddEnactment_mg1818 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1845_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull1845 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1843_failAssert0_mg2064_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_fc_id_171 = ",Hzr;m#.W9*#qYoA($d%";
                Adaptation adaptation = createAdaptation(null);
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Enactment enactment = createEnactment(adaptation.getFc_id());
                enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                Assert.notNull(enactment);
                AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull1843 should have thrown HttpMessageNotReadableException");
                enactment.setFc_id(__DSPOT_fc_id_171);
            }
            org.junit.Assert.fail("testAddEnactmentnull1843_failAssert0_mg2064 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    private Enactment createEnactment(String fc_id) {
        Enactment enactment = new Enactment();
        enactment.setFc_id(fc_id);
        enactment.setEnactment_completion_time(Calendar.getInstance().getTime());
        enactment.setEnactment_request_time(Calendar.getInstance().getTime());
        enactment.setResult(true);
        return enactment;
    }
}

