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
    public void testGetAdaptation_add3408() throws Exception {
        Adaptation o_testGetAdaptation_add3408__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3408__1)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3408__1)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3408__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3408__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3408__1)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3408__1)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3408__1)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3408__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3408__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3425() throws Exception {
        Adaptation __DSPOT_a_312 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3425__14 = adaptation.compareTo(__DSPOT_a_312);
        assertEquals(0, ((int) (o_testGetAdaptation_mg3425__14)));
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3419_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3419 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptationlitString3433_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("9;05");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitString3433 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3425_mg3741_add4426() throws Exception {
        Adaptation __DSPOT_a_360 = new Adaptation();
        Adaptation __DSPOT_a_312 = new Adaptation();
        Adaptation o_testGetAdaptation_mg3425_mg3741_add4426__5 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3425__14 = adaptation.compareTo(__DSPOT_a_312);
        int o_testGetAdaptation_mg3425_mg3741__19 = adaptation.compareTo(__DSPOT_a_360);
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3425_mg3741_add4426__5)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptationnull3447_failAssert0_add3590_failAssert0_add4451_failAssert0() throws Exception {
        try {
            {
                {
                    Adaptation adaptation = createAdaptation(null);
                    adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    Assert.notNull(adaptation);
                    Assert.notNull(adaptation);
                    adaptation.getFc_id();
                    adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                    adaptation.getFc_id();
                    AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testGetAdaptationnull3447 should have thrown HttpMessageNotReadableException");
                }
                org.junit.Assert.fail("testGetAdaptationnull3447_failAssert0_add3590 should have thrown HttpMessageNotReadableException");
            }
            org.junit.Assert.fail("testGetAdaptationnull3447_failAssert0_add3590_failAssert0_add4451 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
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
    public void testAddAdaptation_mg14_add160() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation o_testAddAdaptation_mg14_add160__3 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add160__3)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_mg229_add897() throws Exception {
        Adaptation __DSPOT_a_32 = new Adaptation();
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        Adaptation o_testAddAdaptation_mg14_mg229_add897__7 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        int o_testAddAdaptation_mg14_mg229__15 = adaptation.compareTo(__DSPOT_a_32);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_mg229_add897__7)).getActions())).isEmpty());
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
    public void testGetAllEnactmentsnull5102_failAssert0() throws Exception {
        try {
            List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull5102 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5102_failAssert0_add5114_failAssert0() throws Exception {
        try {
            {
                AdaptationDashboardProxyTest.proxy.getAllEnactments();
                List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
                Assert.notNull(null);
                org.junit.Assert.fail("testGetAllEnactmentsnull5102 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAllEnactmentsnull5102_failAssert0_add5114 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5144() throws Exception {
        Enactment o_testGetEnactment_add5144__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
        assertNull(o_testGetEnactment_add5144__1);
        Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

        assertNull(o_testGetEnactment_add5144__1);
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5145_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_438 = new Adaptation();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_438);
            org.junit.Assert.fail("testGetEnactment_mg5145 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5144_mg5187_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_453 = new Adaptation();
            Enactment o_testGetEnactment_add5144__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_453);
            org.junit.Assert.fail("testGetEnactment_add5144_mg5187 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1786_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1786 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1789_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            adaptation.getFc_id();
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1789 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_mg1803_failAssert0() throws Exception {
        try {
            Date __DSPOT_computation_timestamp_134 = new Date(".O[{SF[5qeWJi&w1WL[g");
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_134);
            org.junit.Assert.fail("testAddEnactment_mg1803 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1830_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull1830 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_mg1803_failAssert0_mg2095_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_adaptation_182 = new Adaptation();
                Date __DSPOT_computation_timestamp_134 = new Date(".O[{SF[5qeWJi&w1WL[g");
                Adaptation adaptation = createAdaptation("905");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Enactment enactment = createEnactment(adaptation.getFc_id());
                enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                Assert.notNull(enactment);
                AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_134);
                org.junit.Assert.fail("testAddEnactment_mg1803 should have thrown IllegalArgumentException");
                enactment.setAdaptation(__DSPOT_adaptation_182);
            }
            org.junit.Assert.fail("testAddEnactment_mg1803_failAssert0_mg2095 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1830_failAssert0litString2126_failAssert0() throws Exception {
        try {
            {
                Adaptation adaptation = createAdaptation("9d05");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Enactment enactment = createEnactment(adaptation.getFc_id());
                enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
                Assert.notNull(enactment);
                AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull1830 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull1830_failAssert0litString2126 should have thrown NullPointerException");
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

