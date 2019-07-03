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
    public void testGetAdaptation_add3343() throws Exception {
        Adaptation o_testGetAdaptation_add3343__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3343__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3343__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3343__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3343__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3343__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3343__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3343__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3343__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3343__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3360() throws Exception {
        Adaptation __DSPOT_a_296 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3360__14 = adaptation.compareTo(__DSPOT_a_296);
        assertEquals(0, ((int) (o_testGetAdaptation_mg3360__14)));
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3354_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3354 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3355_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("a?A");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3355 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptationnull3382_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation(null);
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull3382 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3360_add3539_add4331() throws Exception {
        Adaptation __DSPOT_a_296 = new Adaptation();
        Adaptation o_testGetAdaptation_mg3360_add3539_add4331__3 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3360_add3539__14 = adaptation.compareTo(__DSPOT_a_296);
        int o_testGetAdaptation_mg3360__14 = adaptation.compareTo(__DSPOT_a_296);
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3360_add3539_add4331__3)).getActions())).isEmpty());
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
    public void testAddAdaptation_mg14_add165() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation o_testAddAdaptation_mg14_add165__3 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add165__3)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_mg233_failAssert0() throws Exception {
        try {
            Date __DSPOT_computation_timestamp_31 = new Date("N/#yO[*WW4JN-$nw<}7E");
            Adaptation __DSPOT_a_0 = new Adaptation();
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
            __DSPOT_a_0.setComputation_timestamp(__DSPOT_computation_timestamp_31);
            org.junit.Assert.fail("testAddAdaptation_mg14_mg233 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_mg233_failAssert0_mg1018_failAssert0() throws Exception {
        try {
            {
                List<Action> __DSPOT_actions_84 = Collections.singletonList(new Action());
                Date __DSPOT_computation_timestamp_31 = new Date("N/#yO[*WW4JN-$nw<}7E");
                Adaptation __DSPOT_a_0 = new Adaptation();
                Adaptation adaptation = createAdaptation("905");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Assert.notNull(adaptation);
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
                __DSPOT_a_0.setComputation_timestamp(__DSPOT_computation_timestamp_31);
                org.junit.Assert.fail("testAddAdaptation_mg14_mg233 should have thrown IllegalArgumentException");
                adaptation.setActions(__DSPOT_actions_84);
            }
            org.junit.Assert.fail("testAddAdaptation_mg14_mg233_failAssert0_mg1018 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
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
    public void testGetAllEnactmentsnull5227_failAssert0() throws Exception {
        try {
            List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull5227 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5227_failAssert0_add5239_failAssert0() throws Exception {
        try {
            {
                AdaptationDashboardProxyTest.proxy.getAllEnactments();
                List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
                Assert.notNull(null);
                org.junit.Assert.fail("testGetAllEnactmentsnull5227 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAllEnactmentsnull5227_failAssert0_add5239 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5272() throws Exception {
        Enactment o_testGetEnactment_add5272__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
        assertNull(o_testGetEnactment_add5272__1);
        Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

        assertNull(o_testGetEnactment_add5272__1);
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5273_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_434 = new Adaptation();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_434);
            org.junit.Assert.fail("testGetEnactment_mg5273 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5275_failAssert0() throws Exception {
        try {
            Date __DSPOT_enactment_request_timestamp_436 = new Date(-788597161, -1822770440, -752402900);
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_436);
            org.junit.Assert.fail("testGetEnactment_mg5275 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5273_failAssert0_mg5319_failAssert0() throws Exception {
        try {
            {
                List<Action> __DSPOT_actions_444 = Collections.singletonList(new Action());
                Adaptation __DSPOT_adaptation_434 = new Adaptation();
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                enactment.setAdaptation(__DSPOT_adaptation_434);
                org.junit.Assert.fail("testGetEnactment_mg5273 should have thrown NullPointerException");
                __DSPOT_adaptation_434.setActions(__DSPOT_actions_444);
            }
            org.junit.Assert.fail("testGetEnactment_mg5273_failAssert0_mg5319 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5274_failAssert0_mg5316_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_adaptation_442 = new Adaptation();
                Date __DSPOT_enactment_completion_time_435 = new Date(":S4[z*)lE|II(+VTO@{^");
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_435);
                org.junit.Assert.fail("testGetEnactment_mg5274 should have thrown IllegalArgumentException");
                enactment.setAdaptation(__DSPOT_adaptation_442);
            }
            org.junit.Assert.fail("testGetEnactment_mg5274_failAssert0_mg5316 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1859_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1859 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentlitString1891_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("\n");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentlitString1891 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1903_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull1903 should have thrown NullPointerException");
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

