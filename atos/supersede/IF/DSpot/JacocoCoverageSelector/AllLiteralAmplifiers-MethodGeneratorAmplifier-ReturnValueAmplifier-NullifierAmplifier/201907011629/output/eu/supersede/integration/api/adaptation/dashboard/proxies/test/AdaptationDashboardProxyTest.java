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
    public void testGetAdaptationlitNum2221() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum2221__10)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).toString());
        int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptation_mg2227__14)));
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg2227__12)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2233_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2233 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2234_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2234 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2235_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2235 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull2236_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull2236 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221_mg2287() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_274 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum2221_mg2287__16 = adaptation.compareTo(__DSPOT_a_274);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum2221_mg2287__16)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221null2325_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2221null2325 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221null2331_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2221null2331 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221null2337_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum2221null2337 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227_mg2347_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_computation_timestamp_305 = new java.util.Date("$d:PtF]or`woVZX>^L,%");
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
            __DSPOT_a_267.setComputation_timestamp(__DSPOT_computation_timestamp_305);
            org.junit.Assert.fail("testGetAdaptation_mg2227_mg2347 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227null2401_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
            org.junit.Assert.fail("testGetAdaptation_mg2227null2401 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221_mg2287_mg2676() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_316 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_274 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum2221_mg2287__16 = adaptation.compareTo(__DSPOT_a_274);
        int o_testGetAdaptationlitNum2221_mg2287_mg2676__21 = __DSPOT_a_274.compareTo(__DSPOT_a_316);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum2221_mg2287_mg2676__21)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221_mg2287null2737_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_274 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2221_mg2287__16 = adaptation.compareTo(__DSPOT_a_274);
            org.junit.Assert.fail("testGetAdaptationlitNum2221_mg2287null2737 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221_mg2287null2740_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_274 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2221_mg2287__16 = adaptation.compareTo(__DSPOT_a_274);
            org.junit.Assert.fail("testGetAdaptationlitNum2221_mg2287null2740 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221_mg2287null2743_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_274 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum2221_mg2287__16 = adaptation.compareTo(__DSPOT_a_274);
            org.junit.Assert.fail("testGetAdaptationlitNum2221_mg2287null2743 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum2221null2337_failAssert0_mg2690_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_330 = new java.util.Date(",IK)Mo+)A*O^;uS9b&r5");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(null);
                org.springframework.http.HttpStatus o_testGetAdaptationlitNum2221__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testGetAdaptationlitNum2221null2337 should have thrown IllegalArgumentException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_330);
            }
            org.junit.Assert.fail("testGetAdaptationlitNum2221null2337_failAssert0_mg2690 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227_mg2347_failAssert0_mg2739_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_357 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_computation_timestamp_305 = new java.util.Date("$d:PtF]or`woVZX>^L,%");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
                __DSPOT_a_267.setComputation_timestamp(__DSPOT_computation_timestamp_305);
                org.junit.Assert.fail("testGetAdaptation_mg2227_mg2347 should have thrown IllegalArgumentException");
                __DSPOT_a_267.compareTo(__DSPOT_a_357);
            }
            org.junit.Assert.fail("testGetAdaptation_mg2227_mg2347_failAssert0_mg2739 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227_mg2347_failAssert0_mg2742_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Action> __DSPOT_actions_358 = java.util.Collections.singletonList(new eu.supersede.integration.api.adaptation.dashboad.types.Action());
                java.util.Date __DSPOT_computation_timestamp_305 = new java.util.Date("$d:PtF]or`woVZX>^L,%");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
                __DSPOT_a_267.setComputation_timestamp(__DSPOT_computation_timestamp_305);
                org.junit.Assert.fail("testGetAdaptation_mg2227_mg2347 should have thrown IllegalArgumentException");
                __DSPOT_a_267.setActions(__DSPOT_actions_358);
            }
            org.junit.Assert.fail("testGetAdaptation_mg2227_mg2347_failAssert0_mg2742 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg2227null2401_failAssert0_mg2677_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_317 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_267 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg2227__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg2227__14 = adaptation.compareTo(__DSPOT_a_267);
                org.junit.Assert.fail("testGetAdaptation_mg2227null2401 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_267.compareTo(__DSPOT_a_317);
            }
            org.junit.Assert.fail("testGetAdaptation_mg2227null2401_failAssert0_mg2677 should have thrown HttpMessageNotWritableException");
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
    public void testAddAdaptationlitNum1null93_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null93 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null98_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null98 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null150_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
            org.junit.Assert.fail("testAddAdaptation_mg7null150 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull15_failAssert0_mg95_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_22 = new java.util.Date("Rl&{ha!&Bcvg[?i!rb0/");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(null);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationnull15 should have thrown IllegalArgumentException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_22);
            }
            org.junit.Assert.fail("testAddAdaptationnull15_failAssert0_mg95 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62_mg370() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_46 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
        int o_testAddAdaptationlitNum1_mg62_mg370__17 = __DSPOT_a_7.compareTo(__DSPOT_a_46);
        org.junit.Assert.assertEquals(0, ((int) (o_testAddAdaptationlitNum1_mg62_mg370__17)));
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null421_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null421 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null423_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null423 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null150_failAssert0_mg366_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_42 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
                org.junit.Assert.fail("testAddAdaptation_mg7null150 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_0.compareTo(__DSPOT_a_42);
            }
            org.junit.Assert.fail("testAddAdaptation_mg7null150_failAssert0_mg366 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null150_failAssert0_mg376_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_52 = new java.util.Date("lKC*+{5@T5!^MYU(dM7K");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
                org.junit.Assert.fail("testAddAdaptation_mg7null150 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_0.setComputation_timestamp(__DSPOT_computation_timestamp_52);
            }
            org.junit.Assert.fail("testAddAdaptation_mg7null150_failAssert0_mg376 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
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
    public void testGetAllEnactmentsnull2953_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull2953 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2956_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
            org.springframework.util.Assert.notNull(enactment);
            org.junit.Assert.fail("testGetEnactmentlitNum2956 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2964_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_enactment_request_timestamp_371 = new java.util.Date("AD^|dc@;rWqb8+-h[6n*");
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
            org.springframework.util.Assert.notNull(enactment);
            enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_371);
            org.junit.Assert.fail("testGetEnactment_mg2964 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2968_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetEnactmentnull2968 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2956_failAssert0_mg3001_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_374 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                org.junit.Assert.fail("testGetEnactmentlitNum2956 should have thrown ArrayIndexOutOfBoundsException");
                enactment.setAdaptation(__DSPOT_adaptation_374);
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2956_failAssert0_mg3001 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2964_failAssert0litString3000_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_enactment_request_timestamp_371 = new java.util.Date("atos");
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_371);
                org.junit.Assert.fail("testGetEnactment_mg2964 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0litString3000 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2964_failAssert0_mg3033_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_384 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_enactment_request_timestamp_371 = new java.util.Date("AD^|dc@;rWqb8+-h[6n*");
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_371);
                org.junit.Assert.fail("testGetEnactment_mg2964 should have thrown IllegalArgumentException");
                enactment.setAdaptation(__DSPOT_adaptation_384);
            }
            org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0_mg3033 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2968_failAssert0litNum3013_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(null);
                org.junit.Assert.fail("testGetEnactmentnull2968 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactmentnull2968_failAssert0litNum3013 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2956_failAssert0_mg3001_failAssert0null3167_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_374 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    org.junit.Assert.fail("testGetEnactmentlitNum2956 should have thrown ArrayIndexOutOfBoundsException");
                    enactment.setAdaptation(__DSPOT_adaptation_374);
                }
                org.junit.Assert.fail("testGetEnactmentlitNum2956_failAssert0_mg3001 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2956_failAssert0_mg3001_failAssert0null3167 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2964_failAssert0litString3000_failAssert0litNum3124_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.Date __DSPOT_enactment_request_timestamp_371 = new java.util.Date("atos");
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(enactments);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_371);
                    org.junit.Assert.fail("testGetEnactment_mg2964 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0litString3000 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0litString3000_failAssert0litNum3124 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactment_mg2964_failAssert0_mg3033_failAssert0litString3123_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_384 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.Date __DSPOT_enactment_request_timestamp_371 = new java.util.Date("Medium load configuration for HSK service");
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(enactments);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_371);
                    org.junit.Assert.fail("testGetEnactment_mg2964 should have thrown IllegalArgumentException");
                    enactment.setAdaptation(__DSPOT_adaptation_384);
                }
                org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0_mg3033 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactment_mg2964_failAssert0_mg3033_failAssert0litString3123 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg606_failAssert0() throws java.lang.Exception {
        try {
            java.util.Date __DSPOT_enactment_request_timestamp_92 = new java.util.Date("t2Y][1u)p]QM-k,I]-r8");
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
            enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_92);
            org.junit.Assert.fail("testAddEnactment_mg606 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0() throws java.lang.Exception {
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
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
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
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
            org.springframework.util.Assert.notNull(enactment);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull622_failAssert0() throws java.lang.Exception {
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
            org.junit.Assert.fail("testAddEnactmentnull622 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg606_failAssert0litString690_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_enactment_request_timestamp_92 = new java.util.Date("Medium load configuration for HSK service");
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
                enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_92);
                org.junit.Assert.fail("testAddEnactment_mg606 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactment_mg606_failAssert0litString690 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg606_failAssert0_mg760_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_129 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.Date __DSPOT_enactment_request_timestamp_92 = new java.util.Date("t2Y][1u)p]QM-k,I]-r8");
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
                enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_92);
                org.junit.Assert.fail("testAddEnactment_mg606 should have thrown IllegalArgumentException");
                adaptation.compareTo(__DSPOT_a_129);
            }
            org.junit.Assert.fail("testAddEnactment_mg606_failAssert0_mg760 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0_mg693_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                adaptation.compareTo(__DSPOT_a_95);
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg693 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum695_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum695 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum713_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(java.lang.Integer.MIN_VALUE);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum713 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0litNum692_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0litNum692 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg733_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_110 = new java.util.Date(-1244704648, 820282934, -1771905559, -1204814236, 1724064495, 466383236);
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
                org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_110);
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg733 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull622_failAssert0litNum691_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull622 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull622_failAssert0litNum691 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull622_failAssert0_mg723_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_102 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
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
                org.junit.Assert.fail("testAddEnactmentnull622 should have thrown IllegalArgumentException");
                adaptation.compareTo(__DSPOT_a_102);
            }
            org.junit.Assert.fail("testAddEnactmentnull622_failAssert0_mg723 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0litNum695_failAssert0null1721_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum695 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum695_failAssert0null1721 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0litNum692_failAssert0null1733_failAssert0() throws java.lang.Exception {
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
                    org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull621_failAssert0litNum692 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0litNum692_failAssert0null1733 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactment_mg606_failAssert0_mg760_failAssert0litNum1482_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_129 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.Date __DSPOT_enactment_request_timestamp_92 = new java.util.Date("t2Y][1u)p]QM-k,I]-r8");
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
                    enactment.setEnactment_request_time(__DSPOT_enactment_request_timestamp_92);
                    org.junit.Assert.fail("testAddEnactment_mg606 should have thrown IllegalArgumentException");
                    adaptation.compareTo(__DSPOT_a_129);
                }
                org.junit.Assert.fail("testAddEnactment_mg606_failAssert0_mg760 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactment_mg606_failAssert0_mg760_failAssert0litNum1482 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg733_failAssert0litNum1663_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.Date __DSPOT_computation_timestamp_110 = new java.util.Date(-1244704648, 820282934, -1771905559, -1204814236, 1724064495, 466383236);
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
                    org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
                    adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_110);
                }
                org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg733 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg733_failAssert0litNum1663 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull621_failAssert0_mg733_failAssert0null1858_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.util.Date __DSPOT_computation_timestamp_110 = new java.util.Date(-1244704648, 820282934, -1771905559, -1204814236, 1724064495, 466383236);
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
                    org.junit.Assert.fail("testAddEnactmentnull621 should have thrown NullPointerException");
                    adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_110);
                }
                org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg733 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull621_failAssert0_mg733_failAssert0null1858 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
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

