package eu.supersede.integration.api.adaptation.dashboard.proxies.test;


public class AdaptationDashboardProxyTest {
    private static eu.supersede.integration.api.adaptation.dashboard.proxies.AdaptationDashboardProxy<java.lang.Object, java.lang.Object> proxy;

    private static java.lang.String adaptationId;

    private static java.lang.String enactmentId;

    private static eu.supersede.integration.api.adaptation.dashboad.types.Adaptation createdAdaptation;

    private static eu.supersede.integration.api.adaptation.dashboad.types.Enactment createdEnactment;

    @org.junit.BeforeClass
    public static void setup() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy = new eu.supersede.integration.api.adaptation.dashboard.proxies.AdaptationDashboardProxy<>("adaptation", "adaptation", "atos");
        java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Adaptation> adaptations = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllAdaptations();
        java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
        for (eu.supersede.integration.api.adaptation.dashboad.types.Enactment e : enactments) {
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(e.getFc_id());
        }
        for (eu.supersede.integration.api.adaptation.dashboad.types.Adaptation a : adaptations) {
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(a.getFc_id());
        }
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(1);
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation);
        adaptations = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllAdaptations();
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.adaptationId = adaptations.get(0).getFc_id();
        org.springframework.util.Assert.notNull(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.adaptationId);
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdEnactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation.getFc_id());
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdEnactment);
        enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.enactmentId = enactments.get(0).getFc_id();
        org.springframework.util.Assert.notNull(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.enactmentId);
    }

    @org.junit.AfterClass
    public static void cleanup() throws java.lang.Exception {
        if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdEnactment) != null)
            org.junit.Assert.assertEquals(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation.getFc_id()), org.springframework.http.HttpStatus.OK);

        if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation) != null)
            org.junit.Assert.assertEquals(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createdAdaptation.getFc_id()), org.springframework.http.HttpStatus.OK);

    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2180__10)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).toString());
        int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptation_mg2186__14)));
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2186__12)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2192_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2192 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2193_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2193 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2194_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2194 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2195_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2195 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180_mg2247() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum2180_mg2247__16 = adaptation.compareTo(__DSPOT_a_267);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum2180_mg2247__16)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180null2282_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2180null2282 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180null2287_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2180null2287 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180null2293_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2180null2293 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186_mg2303_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_computation_timestamp_297 = new java.util.Date("1FoAgu-u1_)f(dMmVFwF");
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
            __DSPOT_a_260.setComputation_timestamp(__DSPOT_computation_timestamp_297);
            org.junit.Assert.fail("testGetAdaptation_mg2186_mg2303 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186null2361_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
            org.junit.Assert.fail("testGetAdaptation_mg2186null2361 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180_mg2247_mg2635() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_310 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum2180_mg2247__16 = adaptation.compareTo(__DSPOT_a_267);
        int o_testGetAdaptationlitNum2180_mg2247_mg2635__21 = __DSPOT_a_267.compareTo(__DSPOT_a_310);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum2180_mg2247_mg2635__21)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180_mg2247null2697_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2180_mg2247__16 = adaptation.compareTo(__DSPOT_a_267);
            org.junit.Assert.fail("testGetAdaptationlitNum2180_mg2247null2697 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180_mg2247null2699_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2180_mg2247__16 = adaptation.compareTo(__DSPOT_a_267);
            org.junit.Assert.fail("testGetAdaptationlitNum2180_mg2247null2699 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2180_mg2247null2702_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2180__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2180_mg2247__16 = adaptation.compareTo(__DSPOT_a_267);
            org.junit.Assert.fail("testGetAdaptationlitNum2180_mg2247null2702 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186_mg2303_failAssert0litString2634_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_297 = new java.util.Date("vm2_b_high");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
                __DSPOT_a_260.setComputation_timestamp(__DSPOT_computation_timestamp_297);
                org.junit.Assert.fail("testGetAdaptation_mg2186_mg2303 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetAdaptation_mg2186_mg2303_failAssert0litString2634 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186_mg2303_failAssert0_mg2700_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_350 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_computation_timestamp_297 = new java.util.Date("1FoAgu-u1_)f(dMmVFwF");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
                __DSPOT_a_260.setComputation_timestamp(__DSPOT_computation_timestamp_297);
                org.junit.Assert.fail("testGetAdaptation_mg2186_mg2303 should have thrown IllegalArgumentException");
                __DSPOT_a_260.compareTo(__DSPOT_a_350);
            }
            org.junit.Assert.fail("testGetAdaptation_mg2186_mg2303_failAssert0_mg2700 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2186null2361_failAssert0_mg2636_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_311 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_260 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2186__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2186__14 = adaptation.compareTo(__DSPOT_a_260);
                org.junit.Assert.fail("testGetAdaptation_mg2186null2361 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_260.compareTo(__DSPOT_a_311);
            }
            org.junit.Assert.fail("testGetAdaptation_mg2186null2361_failAssert0_mg2636 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testAddAdaptationlitNum1__6)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).toString());
        int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
        org.junit.Assert.assertEquals(0, ((int) (o_testAddAdaptation_mg7__10)));
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testAddAdaptation_mg7__8)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull13_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationnull13 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull14_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationnull14 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull15_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationnull15 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
        org.junit.Assert.assertEquals(0, ((int) (o_testAddAdaptationlitNum1_mg62__12)));
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null91_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null91 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null95_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null95 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null149_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
            org.junit.Assert.fail("testAddAdaptation_mg7null149 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull14_failAssert0_mg97_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_22 = new java.util.Date("Rl&{ha!&Bcvg[?i!rb0/");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                org.springframework.util.Assert.notNull(adaptation);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationnull14 should have thrown NullPointerException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_22);
            }
            org.junit.Assert.fail("testAddAdaptationnull14_failAssert0_mg97 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62_mg366() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_42 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
        int o_testAddAdaptationlitNum1_mg62_mg366__17 = __DSPOT_a_7.compareTo(__DSPOT_a_42);
        org.junit.Assert.assertEquals(0, ((int) (o_testAddAdaptationlitNum1_mg62_mg366__17)));
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null418_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null418 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null420_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null420 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null91_failAssert0_mg378_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_49 = new java.util.Date("mI6N*:lKC*+{5@T5!^MY");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationlitNum1null91 should have thrown NullPointerException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_49);
            }
            org.junit.Assert.fail("testAddAdaptationlitNum1null91_failAssert0_mg378 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null149_failAssert0_mg369_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_46 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
                org.junit.Assert.fail("testAddAdaptation_mg7null149 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_0.compareTo(__DSPOT_a_46);
            }
            org.junit.Assert.fail("testAddAdaptation_mg7null149_failAssert0_mg369 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    private static eu.supersede.integration.api.adaptation.dashboad.types.Adaptation createAdaptation(java.lang.Integer fc_id) {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        adaptation.setFc_id(fc_id);
        adaptation.setComputation_timestamp(java.util.Calendar.getInstance().getTime());
        adaptation.setModel_system(eu.supersede.integration.api.adaptation.types.ModelSystem.Atos_HSK);
        adaptation.setName("Medium load configuration for HSK service");
        adaptation.setRank(1.0);
        adaptation.getActions().add(eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAction());
        return adaptation;
    }

    private static eu.supersede.integration.api.adaptation.dashboad.types.Action createAction() {
        eu.supersede.integration.api.adaptation.dashboad.types.Action action = new eu.supersede.integration.api.adaptation.dashboad.types.Action();
        action.setAction_id("vm2_b_high");
        action.setDescription("Medium load configuration for HSK service");
        action.setName("VM2_B_HighConfiguration");
        action.setEnabled(true);
        return action;
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAllEnactmentsnull2913_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull2913 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2916_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
            org.springframework.util.Assert.notNull(enactment);
            org.junit.Assert.fail("testGetEnactmentlitNum2916 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2923_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_enactment_completion_time_363 = new java.util.Date("4mdp[_EdB`v*a[[KUdhw");
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
            org.springframework.util.Assert.notNull(enactment);
            enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_363);
            org.junit.Assert.fail("testGetEnactment_mg2923 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2928_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetEnactmentnull2928 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2916_failAssert0_mg2960_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_367 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                org.junit.Assert.fail("testGetEnactmentlitNum2916 should have thrown ArrayIndexOutOfBoundsException");
                enactment.setAdaptation(__DSPOT_adaptation_367);
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2916_failAssert0_mg2960 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2923_failAssert0litString2959_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_enactment_completion_time_363 = new java.util.Date("adaptation");
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_363);
                org.junit.Assert.fail("testGetEnactment_mg2923 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0litString2959 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2923_failAssert0_mg2992_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_377 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_enactment_completion_time_363 = new java.util.Date("4mdp[_EdB`v*a[[KUdhw");
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_363);
                org.junit.Assert.fail("testGetEnactment_mg2923 should have thrown IllegalArgumentException");
                enactment.setAdaptation(__DSPOT_adaptation_377);
            }
            org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0_mg2992 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2928_failAssert0litNum2971_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(null);
                org.junit.Assert.fail("testGetEnactmentnull2928 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactmentnull2928_failAssert0litNum2971 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2916_failAssert0_mg2960_failAssert0null3126_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_367 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    org.junit.Assert.fail("testGetEnactmentlitNum2916 should have thrown ArrayIndexOutOfBoundsException");
                    enactment.setAdaptation(__DSPOT_adaptation_367);
                }
                org.junit.Assert.fail("testGetEnactmentlitNum2916_failAssert0_mg2960 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2916_failAssert0_mg2960_failAssert0null3126 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2923_failAssert0litString2959_failAssert0litNum3084_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.Date __DSPOT_enactment_completion_time_363 = new java.util.Date("adaptation");
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(enactments);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_363);
                    org.junit.Assert.fail("testGetEnactment_mg2923 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0litString2959 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0litString2959_failAssert0litNum3084 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2923_failAssert0_mg2992_failAssert0litString3082_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_377 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.Date __DSPOT_enactment_completion_time_363 = new java.util.Date("Medium load configuration for HSK service");
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(enactments);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    enactment.setEnactment_completion_time(__DSPOT_enactment_completion_time_363);
                    org.junit.Assert.fail("testGetEnactment_mg2923 should have thrown IllegalArgumentException");
                    enactment.setAdaptation(__DSPOT_adaptation_377);
                }
                org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0_mg2992 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2923_failAssert0_mg2992_failAssert0litString3082 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg599_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_computation_timestamp_86 = new java.util.Date("yc.L`HJ*J8r}4@(!YL#Z");
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
            if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            }
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            org.springframework.util.Assert.notNull(enactment);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_86);
            org.junit.Assert.fail("testAddEnactment_mg599 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            }
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            org.springframework.util.Assert.notNull(enactment);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
            if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            }
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            org.springframework.util.Assert.notNull(enactment);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
            if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            }
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
            org.springframework.util.Assert.notNull(enactment);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
            if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            }
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull621 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg599_failAssert0litString689_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_86 = new java.util.Date("atos");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_86);
                org.junit.Assert.fail("testAddEnactment_mg599 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactment_mg599_failAssert0litString689 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg599_failAssert0_mg760_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_130 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_computation_timestamp_86 = new java.util.Date("yc.L`HJ*J8r}4@(!YL#Z");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_86);
                org.junit.Assert.fail("testAddEnactment_mg599 should have thrown IllegalArgumentException");
                adaptation.compareTo(__DSPOT_a_130);
            }
            org.junit.Assert.fail("testAddEnactment_mg599_failAssert0_mg760 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0_mg693_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_95 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
                adaptation.compareTo(__DSPOT_a_95);
            }
            org.junit.Assert.fail("testAddEnactmentnull618_failAssert0_mg693 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0litNum692_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum692 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0litNum701_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(java.lang.Integer.MAX_VALUE);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum701 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum690_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0_mg738_failAssert0() throws java.lang.Exception {
        try {
            {
                java.lang.Integer __DSPOT_fc_id_115 = -631894873;
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                adaptation.setFc_id(__DSPOT_fc_id_115);
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg738 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0litNum691_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(null);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull621 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0litNum691 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg726_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Action> __DSPOT_actions_105 = java.util.Collections.<eu.supersede.integration.api.adaptation.dashboad.types.Action>emptyList();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(null);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull621 should have thrown IllegalArgumentException");
                adaptation.setActions(__DSPOT_actions_105);
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg726 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum690_failAssert0null1746_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690_failAssert0null1746 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum690_failAssert0null1750_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690_failAssert0null1750 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0litNum701_failAssert0null1740_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(java.lang.Integer.MAX_VALUE);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum701 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum701_failAssert0null1740 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0_mg738_failAssert0litNum1434_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.lang.Integer __DSPOT_fc_id_115 = -631894873;
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(1);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                    adaptation.setFc_id(__DSPOT_fc_id_115);
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg738 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg738_failAssert0litNum1434 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg599_failAssert0_mg760_failAssert0litNum1465_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_130 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.Date __DSPOT_computation_timestamp_86 = new java.util.Date("yc.L`HJ*J8r}4@(!YL#Z");
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(java.lang.Integer.MAX_VALUE);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_86);
                    org.junit.Assert.fail("testAddEnactment_mg599 should have thrown IllegalArgumentException");
                    adaptation.compareTo(__DSPOT_a_130);
                }
                org.junit.Assert.fail("testAddEnactment_mg599_failAssert0_mg760 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactment_mg599_failAssert0_mg760_failAssert0litNum1465 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0_mg738_failAssert0null1799_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.lang.Integer __DSPOT_fc_id_115 = -631894873;
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                    adaptation.setFc_id(__DSPOT_fc_id_115);
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg738 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg738_failAssert0null1799 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg726_failAssert0litNum1399_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Action> __DSPOT_actions_105 = java.util.Collections.<eu.supersede.integration.api.adaptation.dashboad.types.Action>emptyList();
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(java.lang.Integer.MIN_VALUE);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull621 should have thrown IllegalArgumentException");
                    adaptation.setActions(__DSPOT_actions_105);
                }
                org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg726 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg726_failAssert0litNum1399 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg599_failAssert0litString689_failAssert0null1801_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.Date __DSPOT_computation_timestamp_86 = new java.util.Date("atos");
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    adaptation.setComputation_timestamp(null);
                    org.junit.Assert.fail("testAddEnactment_mg599 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testAddEnactment_mg599_failAssert0litString689 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactment_mg599_failAssert0litString689_failAssert0null1801 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg726_failAssert0litNum1383_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Action> __DSPOT_actions_105 = java.util.Collections.<eu.supersede.integration.api.adaptation.dashboad.types.Action>emptyList();
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(1);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull621 should have thrown IllegalArgumentException");
                    adaptation.setActions(__DSPOT_actions_105);
                }
                org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg726 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg726_failAssert0litNum1383 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    private static eu.supersede.integration.api.adaptation.dashboad.types.Enactment createEnactment(java.lang.String fc_id) {
        eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = new eu.supersede.integration.api.adaptation.dashboad.types.Enactment();
        enactment.setFc_id(fc_id);
        enactment.setEnactment_completion_time(java.util.Calendar.getInstance().getTime());
        enactment.setEnactment_request_time(java.util.Calendar.getInstance().getTime());
        enactment.setResult(true);
        return enactment;
    }
}

