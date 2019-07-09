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
    public void testGetAdaptation_add3417() throws Exception {
        Adaptation o_testGetAdaptation_add3417__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3417__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3417__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3417__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3417__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3417__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3417__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3417__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3417__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3417__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3434() throws Exception {
        Adaptation __DSPOT_a_343 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3434__14 = adaptation.compareTo(__DSPOT_a_343);
        assertEquals(0, ((int) (o_testGetAdaptation_mg3434__14)));
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3430_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3430 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3434_add3618() throws Exception {
        Adaptation __DSPOT_a_343 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        Adaptation o_testGetAdaptation_mg3434_add3618__9 = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3434__14 = adaptation.compareTo(__DSPOT_a_343);
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3434_add3618__9)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_add3417_literalMutationString3828_failAssert0() throws Exception {
        try {
            Adaptation o_testGetAdaptation_add3417__1 = createAdaptation("905");
            Adaptation adaptation = createAdaptation("9/05");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_add3417_literalMutationString3828 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3430_failAssert0litString3712_failAssert0_add4388_failAssert0() throws Exception {
        try {
            {
                {
                    createAdaptation("");
                    Adaptation adaptation = createAdaptation("");
                    adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    Assert.notNull(adaptation);
                    Assert.notNull(adaptation);
                    adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                    AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testGetAdaptation_literalMutationString3430 should have thrown HttpMessageNotReadableException");
                }
                org.junit.Assert.fail("testGetAdaptation_literalMutationString3430_failAssert0litString3712 should have thrown HttpMessageNotReadableException");
            }
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3430_failAssert0litString3712_failAssert0_add4388 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_add3417_add3748litString4964_failAssert0() throws Exception {
        try {
            Adaptation o_testGetAdaptation_add3417__1 = createAdaptation("905");
            Adaptation adaptation = createAdaptation("+q/");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            Adaptation o_testGetAdaptation_add3417_add3748__9 = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_add3417_add3748litString4964 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_add1() throws Exception {
        Adaptation o_testAddAdaptation_add1__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_add1__1)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_add1__1)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_add1__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_add1__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_add1__1)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_add1__1)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_add1__1)).getRank())), 0.1);
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
    public void testAddAdaptation_mg14_add164() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        Adaptation o_testAddAdaptation_mg14_add164__5 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add164__5)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_mg250_failAssert0() throws Exception {
        try {
            Date __DSPOT_computation_timestamp_38 = new Date("q8xal:7%uE_&Ml%;sG#A");
            Adaptation __DSPOT_a_0 = new Adaptation();
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
            adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_38);
            org.junit.Assert.fail("testAddAdaptation_mg14_mg250 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptationnull36_failAssert0_add149_failAssert0() throws Exception {
        try {
            {
                Adaptation adaptation = createAdaptation(null);
                AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Assert.notNull(adaptation);
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationnull36 should have thrown HttpMessageNotReadableException");
            }
            org.junit.Assert.fail("testAddAdaptationnull36_failAssert0_add149 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
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
    public void testGetAllEnactmentsnull5445_failAssert0() throws Exception {
        try {
            List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull5445 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5445_failAssert0_add5457_failAssert0() throws Exception {
        try {
            {
                AdaptationDashboardProxyTest.proxy.getAllEnactments();
                List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
                Assert.notNull(null);
                org.junit.Assert.fail("testGetAllEnactmentsnull5445 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAllEnactmentsnull5445_failAssert0_add5457 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5487() throws Exception {
        Enactment o_testGetEnactment_add5487__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
        assertNull(o_testGetEnactment_add5487__1);
        Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

        assertNull(o_testGetEnactment_add5487__1);
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5488_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_505 = new Adaptation();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_505);
            org.junit.Assert.fail("testGetEnactment_mg5488 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5489_failAssert0() throws Exception {
        try {
            Date __DSPOT_enactment_completion_time_506 = new Date();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_506);
            org.junit.Assert.fail("testGetEnactment_mg5489 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5487_mg5513_failAssert0_mg5642_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_fc_id_544 = "0Wn<6(B1ohN#bUwM2fXs";
                Adaptation __DSPOT_adaptation_510 = new Adaptation();
                Enactment o_testGetEnactment_add5487__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                o_testGetEnactment_add5487__1.setAdaptation(__DSPOT_adaptation_510);
                org.junit.Assert.fail("testGetEnactment_add5487_mg5513 should have thrown NullPointerException");
                __DSPOT_adaptation_510.setFc_id(__DSPOT_fc_id_544);
            }
            org.junit.Assert.fail("testGetEnactment_add5487_mg5513_failAssert0_mg5642 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5487_mg5517_failAssert0_mg5646_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_adaptation_547 = new Adaptation();
                Date __DSPOT_enactment_completion_time_514 = new Date("/c-44h!,y)$>(xx8O:>9");
                Enactment o_testGetEnactment_add5487__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                o_testGetEnactment_add5487__1.setEnactment_completion_time(__DSPOT_enactment_completion_time_514);
                org.junit.Assert.fail("testGetEnactment_add5487_mg5517 should have thrown IllegalArgumentException");
                o_testGetEnactment_add5487__1.setAdaptation(__DSPOT_adaptation_547);
            }
            org.junit.Assert.fail("testGetEnactment_add5487_mg5517_failAssert0_mg5646 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1868_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1868 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentlitString1907_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentlitString1907 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1912_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull1912 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1912_failAssert0_add2046_failAssert0() throws Exception {
        try {
            {
                createAdaptation("905");
                Adaptation adaptation = createAdaptation("905");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Enactment enactment = createEnactment(adaptation.getFc_id());
                enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
                Assert.notNull(enactment);
                AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull1912 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull1912_failAssert0_add2046 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
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
