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
    public void testGetAdaptationlitNum1898() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptationlitNum1898__10)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg1904() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_222 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptation_mg1904__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).toString());
        int o_testGetAdaptation_mg1904__14 = adaptation.compareTo(__DSPOT_a_222);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptation_mg1904__14)));
        org.junit.Assert.assertEquals("OK", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).getReasonPhrase());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is1xxInformational());
        org.junit.Assert.assertTrue(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is2xxSuccessful());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is3xxRedirection());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is4xxClientError());
        org.junit.Assert.assertFalse(((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).is5xxServerError());
        org.junit.Assert.assertEquals("200", ((org.springframework.http.HttpStatus) (o_testGetAdaptation_mg1904__12)).toString());
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull1910_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull1910 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull1911_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull1911 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull1912_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull1912 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationnull1913_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(3);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationnull1913 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898_mg1961() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_229 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum1898_mg1961__16 = adaptation.compareTo(__DSPOT_a_229);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum1898_mg1961__16)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898null1998_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum1898null1998 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898null2004_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum1898null2004 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898null2010_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testGetAdaptationlitNum1898null2010 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg1904null2079_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_222 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptation_mg1904__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptation_mg1904__14 = adaptation.compareTo(__DSPOT_a_222);
            org.junit.Assert.fail("testGetAdaptation_mg1904null2079 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898_mg1961_mg2357() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_275 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_229 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testGetAdaptationlitNum1898_mg1961__16 = adaptation.compareTo(__DSPOT_a_229);
        int o_testGetAdaptationlitNum1898_mg1961_mg2357__21 = __DSPOT_a_229.compareTo(__DSPOT_a_275);
        org.junit.Assert.assertEquals(0, ((int) (o_testGetAdaptationlitNum1898_mg1961_mg2357__21)));
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898_mg1961null2403_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_229 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum1898_mg1961__16 = adaptation.compareTo(__DSPOT_a_229);
            org.junit.Assert.fail("testGetAdaptationlitNum1898_mg1961null2403 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898_mg1961null2405_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_229 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum1898_mg1961__16 = adaptation.compareTo(__DSPOT_a_229);
            org.junit.Assert.fail("testGetAdaptationlitNum1898_mg1961null2405 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898_mg1961null2407_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_229 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testGetAdaptationlitNum1898_mg1961__16 = adaptation.compareTo(__DSPOT_a_229);
            org.junit.Assert.fail("testGetAdaptationlitNum1898_mg1961null2407 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptationlitNum1898null2010_failAssert0_mg2365_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_282 = new java.util.Date("/J9r^9e<Un((j*-vj<@X");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(null);
                org.springframework.http.HttpStatus o_testGetAdaptationlitNum1898__10 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testGetAdaptationlitNum1898null2010 should have thrown IllegalArgumentException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_282);
            }
            org.junit.Assert.fail("testGetAdaptationlitNum1898null2010_failAssert0_mg2365 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetAdaptation_mg1904null2079_failAssert0_mg2355_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_273 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_222 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAdaptation(adaptation.getFc_id());
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testGetAdaptation_mg1904__12 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testGetAdaptation_mg1904__14 = adaptation.compareTo(__DSPOT_a_222);
                org.junit.Assert.fail("testGetAdaptation_mg1904null2079 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_222.compareTo(__DSPOT_a_273);
            }
            org.junit.Assert.fail("testGetAdaptation_mg1904null2079_failAssert0_mg2355 should have thrown HttpMessageNotWritableException");
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
    public void testAddAdaptationlitNum1null96_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null96 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null101_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddAdaptationlitNum1null101 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null148_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
            org.junit.Assert.fail("testAddAdaptation_mg7null148 should have thrown HttpMessageNotWritableException");
        } catch (org.springframework.http.converter.HttpMessageNotWritableException expected) {
            org.junit.Assert.assertEquals("Could not write content: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.NullPointerException) (through reference chain: eu.supersede.integration.api.adaptation.dashboad.types.Adaptation[\"fc_id\"])", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationnull14_failAssert0_mg98_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_24 = new java.util.Date("Bcvg[?i!rb0/|]6^FT)-");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(4);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                org.springframework.util.Assert.notNull(adaptation);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationnull14 should have thrown NullPointerException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_24);
            }
            org.junit.Assert.fail("testAddAdaptationnull14_failAssert0_mg98 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62_mg364() throws java.lang.Exception {
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_43 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
        eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
        adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
        org.springframework.util.Assert.notNull(adaptation);
        org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
        int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
        int o_testAddAdaptationlitNum1_mg62_mg364__17 = __DSPOT_a_7.compareTo(__DSPOT_a_43);
        org.junit.Assert.assertEquals(0, ((int) (o_testAddAdaptationlitNum1_mg62_mg364__17)));
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null412_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
            org.springframework.util.Assert.notNull(adaptation);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null412 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1_mg62null415_failAssert0() throws java.lang.Exception {
        try {
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_7 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
            eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            org.springframework.util.Assert.notNull(null);
            org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            int o_testAddAdaptationlitNum1_mg62__12 = adaptation.compareTo(__DSPOT_a_7);
            org.junit.Assert.fail("testAddAdaptationlitNum1_mg62null415 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptationlitNum1null96_failAssert0_mg375_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.Date __DSPOT_computation_timestamp_51 = new java.util.Date(":lKC*+{5@T5!^MYU(dM7");
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(5);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptationlitNum1__6 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddAdaptationlitNum1null96 should have thrown NullPointerException");
                adaptation.setComputation_timestamp(__DSPOT_computation_timestamp_51);
            }
            org.junit.Assert.fail("testAddAdaptationlitNum1null96_failAssert0_mg375 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddAdaptation_mg7null148_failAssert0_mg368_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_47 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_a_0 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(null);
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                org.springframework.util.Assert.notNull(adaptation);
                org.springframework.http.HttpStatus o_testAddAdaptation_mg7__8 = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                int o_testAddAdaptation_mg7__10 = adaptation.compareTo(__DSPOT_a_0);
                org.junit.Assert.fail("testAddAdaptation_mg7null148 should have thrown HttpMessageNotWritableException");
                __DSPOT_a_0.compareTo(__DSPOT_a_47);
            }
            org.junit.Assert.fail("testAddAdaptation_mg7null148_failAssert0_mg368 should have thrown HttpMessageNotWritableException");
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
    public void testGetAllEnactmentsnull2536_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetAllEnactmentsnull2536 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2539_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
            org.springframework.util.Assert.notNull(enactment);
            org.junit.Assert.fail("testGetEnactmentlitNum2539 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2551_failAssert0() throws java.lang.Exception {
        try {
            java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
            org.springframework.util.Assert.notNull(enactments);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
            org.springframework.util.Assert.notNull(null);
            org.junit.Assert.fail("testGetEnactmentnull2551 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2539_failAssert0_mg2585_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_317 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                org.springframework.util.Assert.notNull(enactment);
                org.junit.Assert.fail("testGetEnactmentlitNum2539 should have thrown ArrayIndexOutOfBoundsException");
                enactment.setAdaptation(__DSPOT_adaptation_317);
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2539_failAssert0_mg2585 should have thrown ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException expected) {
            org.junit.Assert.assertEquals("1", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentnull2551_failAssert0litNum2591_failAssert0() throws java.lang.Exception {
        try {
            {
                java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                org.springframework.util.Assert.notNull(enactments);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(0).getFc_id());
                org.springframework.util.Assert.notNull(null);
                org.junit.Assert.fail("testGetEnactmentnull2551 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testGetEnactmentnull2551_failAssert0litNum2591 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testGetEnactmentlitNum2539_failAssert0_mg2585_failAssert0null2658_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation __DSPOT_adaptation_317 = new eu.supersede.integration.api.adaptation.dashboad.types.Adaptation();
                    java.util.List<eu.supersede.integration.api.adaptation.dashboad.types.Enactment> enactments = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getAllEnactments();
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(enactments.get(1).getFc_id());
                    org.springframework.util.Assert.notNull(enactment);
                    org.junit.Assert.fail("testGetEnactmentlitNum2539 should have thrown ArrayIndexOutOfBoundsException");
                    enactment.setAdaptation(__DSPOT_adaptation_317);
                }
                org.junit.Assert.fail("testGetEnactmentlitNum2539_failAssert0_mg2585 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testGetEnactmentlitNum2539_failAssert0_mg2585_failAssert0null2658 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull617_failAssert0() throws java.lang.Exception {
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
            org.junit.Assert.fail("testAddEnactmentnull617 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0() throws java.lang.Exception {
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
            adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
            eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
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
            enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
            org.springframework.util.Assert.notNull(null);
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
            eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
            org.junit.Assert.fail("testAddEnactmentnull620 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull617_failAssert0_mg691_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull617 should have thrown NullPointerException");
                adaptation.compareTo(__DSPOT_a_95);
            }
            org.junit.Assert.fail("testAddEnactmentnull617_failAssert0_mg691 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0litNum692_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum692 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0litNum696_failAssert0() throws java.lang.Exception {
        try {
            {
                eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(1);
                if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                }
                adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(enactment);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum696 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0litNum689_failAssert0() throws java.lang.Exception {
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
                org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum689 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0_mg739_failAssert0() throws java.lang.Exception {
        try {
            {
                java.lang.String __DSPOT_name_124 = "i}cRQHCH3r6EO;&FZRy/";
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
                org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                adaptation.setName(__DSPOT_name_124);
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg739 should have thrown NullPointerException");
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
                enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(enactment);
                org.springframework.util.Assert.notNull(null);
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0litNum690 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0_mg726_failAssert0() throws java.lang.Exception {
        try {
            {
                java.lang.Integer __DSPOT_fc_id_113 = -267407017;
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
                org.junit.Assert.fail("testAddEnactmentnull620 should have thrown IllegalArgumentException");
                adaptation.setFc_id(__DSPOT_fc_id_113);
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg726 should have thrown IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException expected) {
            org.junit.Assert.assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0litNum692_failAssert0null1501_failAssert0() throws java.lang.Exception {
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
                    org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum692 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum692_failAssert0null1501 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull618_failAssert0litNum696_failAssert0null1504_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(1);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(null);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(enactment);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull618 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum696 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull618_failAssert0litNum696_failAssert0null1504 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0litNum689_failAssert0null1503_failAssert0() throws java.lang.Exception {
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
                    org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                }
                org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum689 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0litNum689_failAssert0null1503 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0_mg739_failAssert0null1550_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.lang.String __DSPOT_name_124 = "i}cRQHCH3r6EO;&FZRy/";
                    eu.supersede.integration.api.adaptation.dashboad.types.Adaptation adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createAdaptation(2);
                    if ((eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.getEnactment(adaptation.getFc_id())) != null) {
                        eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    }
                    adaptation = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addAdaptation(adaptation);
                    eu.supersede.integration.api.adaptation.dashboad.types.Enactment enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.createEnactment(adaptation.getFc_id());
                    enactment = eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.addEnactment(null);
                    org.springframework.util.Assert.notNull(null);
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteEnactment(adaptation.getFc_id());
                    eu.supersede.integration.api.adaptation.dashboard.proxies.test.AdaptationDashboardProxyTest.proxy.deleteAdaptation(adaptation.getFc_id());
                    org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                    adaptation.setName(__DSPOT_name_124);
                }
                org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg739 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg739_failAssert0null1550 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull619_failAssert0_mg739_failAssert0null1544_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.lang.String __DSPOT_name_124 = "i}cRQHCH3r6EO;&FZRy/";
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
                    org.junit.Assert.fail("testAddEnactmentnull619 should have thrown NullPointerException");
                    adaptation.setName(__DSPOT_name_124);
                }
                org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg739 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testAddEnactmentnull619_failAssert0_mg739_failAssert0null1544 should have thrown NullPointerException");
        } catch (java.lang.NullPointerException expected) {
            org.junit.Assert.assertEquals(null, expected.getMessage());
        }
    }

    @org.junit.Test(timeout = 30000)
    public void testAddEnactmentnull620_failAssert0_mg726_failAssert0null1549_failAssert0() throws java.lang.Exception {
        try {
            {
                {
                    java.lang.Integer __DSPOT_fc_id_113 = -267407017;
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
                    org.junit.Assert.fail("testAddEnactmentnull620 should have thrown IllegalArgumentException");
                    adaptation.setFc_id(null);
                }
                org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg726 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testAddEnactmentnull620_failAssert0_mg726_failAssert0null1549 should have thrown IllegalArgumentException");
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

