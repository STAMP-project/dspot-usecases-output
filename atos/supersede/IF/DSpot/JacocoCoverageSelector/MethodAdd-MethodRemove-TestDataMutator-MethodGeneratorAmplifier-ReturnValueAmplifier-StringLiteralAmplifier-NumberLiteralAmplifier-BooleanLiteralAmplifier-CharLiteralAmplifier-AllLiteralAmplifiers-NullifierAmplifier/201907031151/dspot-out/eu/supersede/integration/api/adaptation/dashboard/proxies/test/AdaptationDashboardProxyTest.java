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
    public void testGetAdaptation_add3497() throws Exception {
        Adaptation o_testGetAdaptation_add3497__1 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3497__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3497__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3497__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3497__1)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_add3497__1)).getFc_id());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_add3497__1)).getRank())), 0.1);
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_add3497__1)).getModel_system())).getId());
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_add3497__1)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_add3497__1)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3514() throws Exception {
        Adaptation __DSPOT_a_280 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3514__14 = adaptation.compareTo(__DSPOT_a_280);
        assertEquals(0, ((int) (o_testGetAdaptation_mg3514__14)));
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_literalMutationString3508_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_literalMutationString3508 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptationlitString3522_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("9/05");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitString3522 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptationnull3536_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation(null);
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull3536 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3514_add3701() throws Exception {
        Adaptation __DSPOT_a_280 = new Adaptation();
        Adaptation o_testGetAdaptation_mg3514_add3701__3 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        Assert.notNull(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptation_mg3514__14 = adaptation.compareTo(__DSPOT_a_280);
        assertEquals("905", ((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testGetAdaptation_mg3514_add3701__3)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3514litString3825_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_a_280 = new Adaptation();
            Adaptation adaptation = createAdaptation("9?05");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg3514__14 = adaptation.compareTo(__DSPOT_a_280);
            org.junit.Assert.fail("testGetAdaptation_mg3514litString3825 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3514litString3825_failAssert0_mg4668_failAssert0() throws Exception {
        try {
            {
                String __DSPOT_name_382 = "U@79_,7q>6EK|ECO>A_p";
                Adaptation __DSPOT_a_280 = new Adaptation();
                Adaptation adaptation = createAdaptation("9?05");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Assert.notNull(adaptation);
                Assert.notNull(adaptation);
                adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg3514__14 = adaptation.compareTo(__DSPOT_a_280);
                org.junit.Assert.fail("testGetAdaptation_mg3514litString3825 should have thrown NullPointerException");
                __DSPOT_a_280.setName(__DSPOT_name_382);
            }
            org.junit.Assert.fail("testGetAdaptation_mg3514litString3825_failAssert0_mg4668 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_add3497_add3819null5030_failAssert0() throws Exception {
        try {
            Adaptation o_testGetAdaptation_add3497__1 = createAdaptation("905");
            Adaptation adaptation = createAdaptation("905");
            Adaptation o_testGetAdaptation_add3497_add3819__6 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            Assert.notNull(adaptation);
            Assert.notNull(adaptation);
            adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptation_add3497_add3819null5030 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAdaptation_mg3514_mg3787_failAssert0_mg4685_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_a_391 = new Adaptation();
                Date __DSPOT_computation_timestamp_318 = new Date("6u@-w1+/`d>#Um]cj_J,");
                Adaptation __DSPOT_a_280 = new Adaptation();
                Adaptation adaptation = createAdaptation("905");
                adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                Assert.notNull(adaptation);
                Assert.notNull(adaptation);
                adaptation = AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg3514__14 = adaptation.compareTo(__DSPOT_a_280);
                __DSPOT_a_280.setComputation_timestamp(__DSPOT_computation_timestamp_318);
                org.junit.Assert.fail("testGetAdaptation_mg3514_mg3787 should have thrown IllegalArgumentException");
                __DSPOT_a_280.compareTo(__DSPOT_a_391);
            }
            org.junit.Assert.fail("testGetAdaptation_mg3514_mg3787_failAssert0_mg4685 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
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
    public void testAddAdaptation_mg14_add157() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation adaptation = createAdaptation("905");
        Adaptation o_testAddAdaptation_mg14_add157__5 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getActions())).isEmpty());
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getModel_system())).getId());
        assertEquals(0.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add157__5)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_mg14_add157_add915() throws Exception {
        Adaptation __DSPOT_a_0 = new Adaptation();
        Adaptation o_testAddAdaptation_mg14_add157_add915__3 = createAdaptation("905");
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getActions())).isEmpty());
        Adaptation adaptation = createAdaptation("905");
        Adaptation o_testAddAdaptation_mg14_add157__5 = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        Assert.notNull(adaptation);
        AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptation_mg14__10 = adaptation.compareTo(__DSPOT_a_0);
        assertEquals("905", ((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getFc_id());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getTenant())).toString());
        assertEquals("atos", ((Tenant) (((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getTenant())).getId());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).toString());
        assertEquals("Atos_HSK", ((ModelSystem) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getModel_system())).getId());
        assertEquals(1.0, ((double) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getRank())), 0.1);
        assertEquals("Medium load configuration for HSK service", ((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getName());
        assertFalse(((Collection) (((Adaptation) (o_testAddAdaptation_mg14_add157_add915__3)).getActions())).isEmpty());
    }

    @Test(timeout = 30000)
    public void testAddAdaptation_add1_mg343_mg1010_failAssert0() throws Exception {
        try {
            Date __DSPOT_computation_timestamp_74 = new Date("TtKz.F5M(E@of6;bU#J;");
            Adaptation __DSPOT_a_42 = new Adaptation();
            Adaptation o_testAddAdaptation_add1__1 = createAdaptation("905");
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Assert.notNull(adaptation);
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_add1_mg343__13 = o_testAddAdaptation_add1__1.compareTo(__DSPOT_a_42);
            __DSPOT_a_42.setComputation_timestamp(__DSPOT_computation_timestamp_74);
            org.junit.Assert.fail("testAddAdaptation_add1_mg343_mg1010 should have thrown IllegalArgumentException");
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
    public void testGetAllEnactmentsnull5521_failAssert0() throws Exception {
        try {
            List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull5521 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetAllEnactmentsnull5521_failAssert0_add5533_failAssert0() throws Exception {
        try {
            {
                AdaptationDashboardProxyTest.proxy.getAllEnactments();
                List<Enactment> adaptations = AdaptationDashboardProxyTest.proxy.getAllEnactments();
                Assert.notNull(null);
                org.junit.Assert.fail("testGetAllEnactmentsnull5521 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAllEnactmentsnull5521_failAssert0_add5533 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_add5563() throws Exception {
        Enactment o_testGetEnactment_add5563__1 = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);
        assertNull(o_testGetEnactment_add5563__1);
        Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

        assertNull(o_testGetEnactment_add5563__1);
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5564_failAssert0() throws Exception {
        try {
            Adaptation __DSPOT_adaptation_454 = new Adaptation();
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setAdaptation(__DSPOT_adaptation_454);
            org.junit.Assert.fail("testGetEnactment_mg5564 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5568_failAssert0() throws Exception {
        try {
            boolean __DSPOT_result_458 = true;
            Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

            enactment.setResult(__DSPOT_result_458);
            org.junit.Assert.fail("testGetEnactment_mg5568 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5564_failAssert0_add5589_failAssert0() throws Exception {
        try {
            {
                Adaptation __DSPOT_adaptation_454 = new Adaptation();
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                enactment.setAdaptation(__DSPOT_adaptation_454);
                org.junit.Assert.fail("testGetEnactment_mg5564 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testGetEnactment_mg5564_failAssert0_add5589 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testGetEnactment_mg5564_failAssert0_mg5598_failAssert0() throws Exception {
        try {
            {
                List<Action> __DSPOT_actions_466 = Collections.singletonList(new Action());
                Adaptation __DSPOT_adaptation_454 = new Adaptation();
                Enactment enactment = AdaptationDashboardProxyTest.proxy.getEnactment(AdaptationDashboardProxyTest.enactmentId);

                enactment.setAdaptation(__DSPOT_adaptation_454);
                org.junit.Assert.fail("testGetEnactment_mg5564 should have thrown NullPointerException");
                __DSPOT_adaptation_454.setActions(__DSPOT_actions_466);
            }
            org.junit.Assert.fail("testGetEnactment_mg5564_failAssert0_mg5598 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_add1805_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactment_add1805 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactment_mg1827_failAssert0() throws Exception {
        try {
            Date __DSPOT_enactment_completion_time_139 = new Date(-901728374, 1857685266, 1693887568, -117117386, -1546321842, 1117527178);
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_139);
            org.junit.Assert.fail("testAddEnactment_mg1827 should have thrown HttpMessageNotReadableException");
        } catch (HttpMessageNotReadableException expected) {
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1849_failAssert0() throws Exception {
        try {
            Adaptation adaptation = createAdaptation("905");
            adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            Enactment enactment = createEnactment(adaptation.getFc_id());
            enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
            Assert.notNull(enactment);
            AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull1849 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAddEnactmentnull1849_failAssert0_mg2065_failAssert0_literalMutationString2837_failAssert0() throws Exception {
        try {
            {
                {
                    Adaptation __DSPOT_a_151 = new Adaptation();
                    Adaptation adaptation = createAdaptation(">@9");
                    adaptation = AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    Enactment enactment = createEnactment(adaptation.getFc_id());
                    enactment = AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    Assert.notNull(enactment);
                    AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull1849 should have thrown NullPointerException");
                    adaptation.compareTo(__DSPOT_a_151);
                }
                org.junit.Assert.fail("testAddEnactmentnull1849_failAssert0_mg2065 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull1849_failAssert0_mg2065_failAssert0_literalMutationString2837 should have thrown NullPointerException");
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

