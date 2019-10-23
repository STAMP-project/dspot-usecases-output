package no.tellu.lib.data;


public class DataNodeTest {
    no.tellu.lib.data.DataGroupNode data;

    class TestTraverser implements no.tellu.lib.data.DataNode.Traverser {
        public int groupCount = 0;

        public int itemCount = 0;

        @java.lang.Override
        public boolean enterGroup(no.tellu.lib.data.DataGroupNode node) {
            (groupCount)++;
            return true;
        }

        @java.lang.Override
        public boolean exitGroup(no.tellu.lib.data.DataGroupNode node) {
            return true;
        }

        @java.lang.Override
        public boolean processItem(no.tellu.lib.data.DataValueNode item) {
            (itemCount)++;
            return true;
        }
    }

    @org.junit.Before
    public void setUp() {
        data = new no.tellu.lib.data.DataGroupNode("root");
        no.tellu.lib.data.DataGroupNode header = new no.tellu.lib.data.DataGroupNode("header");
        header.addNodeRaw(new no.tellu.lib.data.DataValueNode("booltest", true));
        header.addNodeRaw(new no.tellu.lib.data.DataValueNode("nulltest", null));
        header.addNodeRaw(new no.tellu.lib.data.DataValueNode("array", "str1"));
        header.addNodeRaw(new no.tellu.lib.data.DataValueNode("array", "str2"));
        header.addNodeRaw(new no.tellu.lib.data.DataValueNode("array", "str3"));
        data.addNodeRaw(header);
        no.tellu.lib.data.DataGroupNode person = new no.tellu.lib.data.DataGroupNode("person");
        person.addNodeRaw(new no.tellu.lib.data.DataValueNode("name", "Testman"));
        person.addNodeRaw(new no.tellu.lib.data.DataValueNode("age", 99));
        no.tellu.lib.data.DataGroupNode addr = new no.tellu.lib.data.DataGroupNode("address");
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("street", "Teststreet"));
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("city", "Testcity"));
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("code", "1234"));
        person.addNodeRaw(addr);
        no.tellu.lib.data.DataGroupNode phone = new no.tellu.lib.data.DataGroupNode("phone");
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("type", "home"));
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("number", "12345678"));
        person.addNodeRaw(phone);
        phone = new no.tellu.lib.data.DataGroupNode("phone");
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("type", "mobile"));
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("number", "23456789"));
        person.addNodeRaw(phone);
        data.addNodeRaw(person);
        person = new no.tellu.lib.data.DataGroupNode("person");
        person.addNodeRaw(new no.tellu.lib.data.DataValueNode("name", "Person2"));
        person.addNodeRaw(new no.tellu.lib.data.DataValueNode("age", 11));
        addr = new no.tellu.lib.data.DataGroupNode("address");
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("street", "Teststreet"));
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("city", "Testcity"));
        addr.addNodeRaw(new no.tellu.lib.data.DataValueNode("code", "1234"));
        person.addNodeRaw(addr);
        phone = new no.tellu.lib.data.DataGroupNode("phone");
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("type", "home"));
        phone.addNodeRaw(new no.tellu.lib.data.DataValueNode("number", "12345678"));
        person.addNodeRaw(phone);
        data.addNodeRaw(person);
    }

    @org.junit.Test
    public void testTraverser() {
        no.tellu.lib.data.DataNodeTest.TestTraverser trav = new no.tellu.lib.data.DataNodeTest.TestTraverser();
        data.process(trav);
        org.junit.Assert.assertTrue(((trav.groupCount) == 9));
        org.junit.Assert.assertTrue(((trav.itemCount) == 21));
    }

    @org.junit.Test
    public void testModified() {
        org.junit.Assert.assertFalse(data.updateModified());
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        org.junit.Assert.assertTrue(data.updateModified());
        data.clearModified();
        org.junit.Assert.assertFalse(data.updateModified());
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        org.junit.Assert.assertTrue(data.updateModified());
        data.clearModified();
        org.junit.Assert.assertFalse(data.updateModified());
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3687() throws java.lang.Exception {
        data.updateModified();
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3688() throws java.lang.Exception {
        data.updateModified();
        data.getChildNode(1);
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3689() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3691() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3693() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3694() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3695() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3697() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3698() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3699() throws java.lang.Exception {
        data.updateModified();
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.updateModified();
        data.updateModified();
        data.clearModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
        data.updateModified();
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3687_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3687__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1");
        boolean o_testModified_add3687__2 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3687__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7");
        data.clearModified();
        boolean o_testModified_add3687__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9");
        boolean o_testModified_add3687__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3687__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13");
        boolean o_testModified_add3687__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14");
        data.clearModified();
        boolean o_testModified_add3687__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16");
        boolean o_testModified_add3687__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17");
        boolean o_testModified_add3687__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__18, "o_testModified_add3687__18", "testModified_add3687__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3688_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3688__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1");
        no.tellu.lib.data.DataNode o_testModified_add3688__2 = data.getChildNode(1);
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3688__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7");
        data.clearModified();
        boolean o_testModified_add3688__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9");
        boolean o_testModified_add3688__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3688__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13");
        boolean o_testModified_add3688__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14");
        data.clearModified();
        boolean o_testModified_add3688__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16");
        boolean o_testModified_add3688__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17");
        boolean o_testModified_add3688__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__18, "o_testModified_add3688__18", "testModified_add3688__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3689_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3689__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3689__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8");
        data.clearModified();
        boolean o_testModified_add3689__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10");
        boolean o_testModified_add3689__11 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3689__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14");
        boolean o_testModified_add3689__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15");
        data.clearModified();
        boolean o_testModified_add3689__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17");
        boolean o_testModified_add3689__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18");
        boolean o_testModified_add3689__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__19, "o_testModified_add3689__19", "testModified_add3689__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3691_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3691__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3691__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6");
        boolean o_testModified_add3691__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7");
        data.clearModified();
        boolean o_testModified_add3691__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9");
        boolean o_testModified_add3691__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3691__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13");
        boolean o_testModified_add3691__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14");
        data.clearModified();
        boolean o_testModified_add3691__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16");
        boolean o_testModified_add3691__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17");
        boolean o_testModified_add3691__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__18, "o_testModified_add3691__18", "testModified_add3691__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3693_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3693__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3693__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3693__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9");
        boolean o_testModified_add3693__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3693__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13");
        boolean o_testModified_add3693__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14");
        data.clearModified();
        boolean o_testModified_add3693__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16");
        boolean o_testModified_add3693__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17");
        boolean o_testModified_add3693__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__18, "o_testModified_add3693__18", "testModified_add3693__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3694_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3694__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3694__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6");
        data.clearModified();
        boolean o_testModified_add3694__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8");
        boolean o_testModified_add3694__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9");
        boolean o_testModified_add3694__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3694__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13");
        boolean o_testModified_add3694__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14");
        data.clearModified();
        boolean o_testModified_add3694__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16");
        boolean o_testModified_add3694__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17");
        boolean o_testModified_add3694__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__18, "o_testModified_add3694__18", "testModified_add3694__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3695_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3695__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3695__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6");
        data.clearModified();
        boolean o_testModified_add3695__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8");
        boolean o_testModified_add3695__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3695__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14");
        boolean o_testModified_add3695__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15");
        data.clearModified();
        boolean o_testModified_add3695__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17");
        boolean o_testModified_add3695__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18");
        boolean o_testModified_add3695__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__19, "o_testModified_add3695__19", "testModified_add3695__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3697_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3697__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3697__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6");
        data.clearModified();
        boolean o_testModified_add3697__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8");
        boolean o_testModified_add3697__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3697__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12");
        boolean o_testModified_add3697__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13");
        boolean o_testModified_add3697__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14");
        data.clearModified();
        boolean o_testModified_add3697__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16");
        boolean o_testModified_add3697__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17");
        boolean o_testModified_add3697__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__18, "o_testModified_add3697__18", "testModified_add3697__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3698_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3698__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3698__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6");
        data.clearModified();
        boolean o_testModified_add3698__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8");
        boolean o_testModified_add3698__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3698__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12");
        boolean o_testModified_add3698__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3698__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16");
        boolean o_testModified_add3698__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17");
        boolean o_testModified_add3698__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__18, "o_testModified_add3698__18", "testModified_add3698__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3699_withlog0() throws java.lang.Exception {
        boolean o_testModified_add3699__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3699__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6");
        data.clearModified();
        boolean o_testModified_add3699__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8");
        boolean o_testModified_add3699__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3699__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12");
        boolean o_testModified_add3699__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13");
        data.clearModified();
        boolean o_testModified_add3699__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15");
        boolean o_testModified_add3699__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16");
        boolean o_testModified_add3699__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17");
        boolean o_testModified_add3699__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__18, "o_testModified_add3699__18", "testModified_add3699__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3687_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3687__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1");
        boolean o_testModified_add3687__2 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3687__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7");
        data.clearModified();
        boolean o_testModified_add3687__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9");
        boolean o_testModified_add3687__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3687__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13");
        boolean o_testModified_add3687__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14");
        data.clearModified();
        boolean o_testModified_add3687__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16");
        boolean o_testModified_add3687__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17");
        boolean o_testModified_add3687__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__18, "o_testModified_add3687__18", "testModified_add3687__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3688_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3688__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1");
        no.tellu.lib.data.DataNode o_testModified_add3688__2 = data.getChildNode(1);
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3688__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7");
        data.clearModified();
        boolean o_testModified_add3688__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9");
        boolean o_testModified_add3688__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3688__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13");
        boolean o_testModified_add3688__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14");
        data.clearModified();
        boolean o_testModified_add3688__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16");
        boolean o_testModified_add3688__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17");
        boolean o_testModified_add3688__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__18, "o_testModified_add3688__18", "testModified_add3688__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3689_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3689__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3689__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8");
        data.clearModified();
        boolean o_testModified_add3689__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10");
        boolean o_testModified_add3689__11 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3689__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14");
        boolean o_testModified_add3689__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15");
        data.clearModified();
        boolean o_testModified_add3689__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17");
        boolean o_testModified_add3689__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18");
        boolean o_testModified_add3689__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__19, "o_testModified_add3689__19", "testModified_add3689__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3691_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3691__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3691__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6");
        boolean o_testModified_add3691__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7");
        data.clearModified();
        boolean o_testModified_add3691__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9");
        boolean o_testModified_add3691__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3691__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13");
        boolean o_testModified_add3691__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14");
        data.clearModified();
        boolean o_testModified_add3691__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16");
        boolean o_testModified_add3691__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17");
        boolean o_testModified_add3691__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__18, "o_testModified_add3691__18", "testModified_add3691__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3693_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3693__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3693__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3693__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9");
        boolean o_testModified_add3693__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3693__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13");
        boolean o_testModified_add3693__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14");
        data.clearModified();
        boolean o_testModified_add3693__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16");
        boolean o_testModified_add3693__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17");
        boolean o_testModified_add3693__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__18, "o_testModified_add3693__18", "testModified_add3693__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3694_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3694__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3694__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6");
        data.clearModified();
        boolean o_testModified_add3694__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8");
        boolean o_testModified_add3694__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9");
        boolean o_testModified_add3694__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3694__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13");
        boolean o_testModified_add3694__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14");
        data.clearModified();
        boolean o_testModified_add3694__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16");
        boolean o_testModified_add3694__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17");
        boolean o_testModified_add3694__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__18, "o_testModified_add3694__18", "testModified_add3694__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3695_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3695__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3695__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6");
        data.clearModified();
        boolean o_testModified_add3695__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8");
        boolean o_testModified_add3695__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3695__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14");
        boolean o_testModified_add3695__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15");
        data.clearModified();
        boolean o_testModified_add3695__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17");
        boolean o_testModified_add3695__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18");
        boolean o_testModified_add3695__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__19, "o_testModified_add3695__19", "testModified_add3695__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3697_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3697__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3697__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6");
        data.clearModified();
        boolean o_testModified_add3697__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8");
        boolean o_testModified_add3697__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3697__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12");
        boolean o_testModified_add3697__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13");
        boolean o_testModified_add3697__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14");
        data.clearModified();
        boolean o_testModified_add3697__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16");
        boolean o_testModified_add3697__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17");
        boolean o_testModified_add3697__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__18, "o_testModified_add3697__18", "testModified_add3697__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3698_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3698__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3698__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6");
        data.clearModified();
        boolean o_testModified_add3698__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8");
        boolean o_testModified_add3698__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3698__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12");
        boolean o_testModified_add3698__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3698__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16");
        boolean o_testModified_add3698__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17");
        boolean o_testModified_add3698__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__18, "o_testModified_add3698__18", "testModified_add3698__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3699_withlog1() throws java.lang.Exception {
        boolean o_testModified_add3699__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3699__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6");
        data.clearModified();
        boolean o_testModified_add3699__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8");
        boolean o_testModified_add3699__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3699__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12");
        boolean o_testModified_add3699__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13");
        data.clearModified();
        boolean o_testModified_add3699__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15");
        boolean o_testModified_add3699__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16");
        boolean o_testModified_add3699__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17");
        boolean o_testModified_add3699__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__18, "o_testModified_add3699__18", "testModified_add3699__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3687_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3687__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1");
        boolean o_testModified_add3687__2 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3687__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7");
        data.clearModified();
        boolean o_testModified_add3687__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9");
        boolean o_testModified_add3687__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3687__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13");
        boolean o_testModified_add3687__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14");
        data.clearModified();
        boolean o_testModified_add3687__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16");
        boolean o_testModified_add3687__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17");
        boolean o_testModified_add3687__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__18, "o_testModified_add3687__18", "testModified_add3687__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__1, "o_testModified_add3687__1", "testModified_add3687__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__2, "o_testModified_add3687__2", "testModified_add3687__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3687__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__7, "o_testModified_add3687__7", "testModified_add3687__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__9, "o_testModified_add3687__9", "testModified_add3687__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__10, "o_testModified_add3687__10", "testModified_add3687__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__13, "o_testModified_add3687__13", "testModified_add3687__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__14, "o_testModified_add3687__14", "testModified_add3687__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__16, "o_testModified_add3687__16", "testModified_add3687__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3687__17, "o_testModified_add3687__17", "testModified_add3687__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3688_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3688__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1");
        no.tellu.lib.data.DataNode o_testModified_add3688__2 = data.getChildNode(1);
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3688__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7");
        data.clearModified();
        boolean o_testModified_add3688__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9");
        boolean o_testModified_add3688__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3688__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13");
        boolean o_testModified_add3688__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14");
        data.clearModified();
        boolean o_testModified_add3688__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16");
        boolean o_testModified_add3688__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17");
        boolean o_testModified_add3688__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__18, "o_testModified_add3688__18", "testModified_add3688__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__1, "o_testModified_add3688__1", "testModified_add3688__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__2, "o_testModified_add3688__2", "testModified_add3688__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3688__3___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__7, "o_testModified_add3688__7", "testModified_add3688__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__9, "o_testModified_add3688__9", "testModified_add3688__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__10, "o_testModified_add3688__10", "testModified_add3688__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__13, "o_testModified_add3688__13", "testModified_add3688__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__14, "o_testModified_add3688__14", "testModified_add3688__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__16, "o_testModified_add3688__16", "testModified_add3688__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3688__17, "o_testModified_add3688__17", "testModified_add3688__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3689_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3689__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3689__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8");
        data.clearModified();
        boolean o_testModified_add3689__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10");
        boolean o_testModified_add3689__11 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3689__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14");
        boolean o_testModified_add3689__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15");
        data.clearModified();
        boolean o_testModified_add3689__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17");
        boolean o_testModified_add3689__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18");
        boolean o_testModified_add3689__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__19, "o_testModified_add3689__19", "testModified_add3689__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__1, "o_testModified_add3689__1", "testModified_add3689__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3689__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__8, "o_testModified_add3689__8", "testModified_add3689__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__10, "o_testModified_add3689__10", "testModified_add3689__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__11, "o_testModified_add3689__11", "testModified_add3689__11___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__14, "o_testModified_add3689__14", "testModified_add3689__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__15, "o_testModified_add3689__15", "testModified_add3689__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__17, "o_testModified_add3689__17", "testModified_add3689__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3689__18, "o_testModified_add3689__18", "testModified_add3689__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3691_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3691__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3691__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6");
        boolean o_testModified_add3691__7 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7");
        data.clearModified();
        boolean o_testModified_add3691__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9");
        boolean o_testModified_add3691__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3691__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13");
        boolean o_testModified_add3691__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14");
        data.clearModified();
        boolean o_testModified_add3691__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16");
        boolean o_testModified_add3691__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17");
        boolean o_testModified_add3691__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__18, "o_testModified_add3691__18", "testModified_add3691__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__1, "o_testModified_add3691__1", "testModified_add3691__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3691__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__6, "o_testModified_add3691__6", "testModified_add3691__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__7, "o_testModified_add3691__7", "testModified_add3691__7___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__9, "o_testModified_add3691__9", "testModified_add3691__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__10, "o_testModified_add3691__10", "testModified_add3691__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__13, "o_testModified_add3691__13", "testModified_add3691__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__14, "o_testModified_add3691__14", "testModified_add3691__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__16, "o_testModified_add3691__16", "testModified_add3691__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3691__17, "o_testModified_add3691__17", "testModified_add3691__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3693_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3693__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3693__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3693__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9");
        boolean o_testModified_add3693__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3693__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13");
        boolean o_testModified_add3693__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14");
        data.clearModified();
        boolean o_testModified_add3693__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16");
        boolean o_testModified_add3693__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17");
        boolean o_testModified_add3693__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__18, "o_testModified_add3693__18", "testModified_add3693__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__1, "o_testModified_add3693__1", "testModified_add3693__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3693__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__6, "o_testModified_add3693__6", "testModified_add3693__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__9, "o_testModified_add3693__9", "testModified_add3693__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__10, "o_testModified_add3693__10", "testModified_add3693__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__13, "o_testModified_add3693__13", "testModified_add3693__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__14, "o_testModified_add3693__14", "testModified_add3693__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__16, "o_testModified_add3693__16", "testModified_add3693__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3693__17, "o_testModified_add3693__17", "testModified_add3693__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3694_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3694__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3694__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6");
        data.clearModified();
        boolean o_testModified_add3694__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8");
        boolean o_testModified_add3694__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9");
        boolean o_testModified_add3694__10 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3694__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13");
        boolean o_testModified_add3694__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14");
        data.clearModified();
        boolean o_testModified_add3694__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16");
        boolean o_testModified_add3694__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17");
        boolean o_testModified_add3694__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__18, "o_testModified_add3694__18", "testModified_add3694__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__1, "o_testModified_add3694__1", "testModified_add3694__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3694__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__6, "o_testModified_add3694__6", "testModified_add3694__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__8, "o_testModified_add3694__8", "testModified_add3694__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__9, "o_testModified_add3694__9", "testModified_add3694__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__10, "o_testModified_add3694__10", "testModified_add3694__10___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__13, "o_testModified_add3694__13", "testModified_add3694__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__14, "o_testModified_add3694__14", "testModified_add3694__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__16, "o_testModified_add3694__16", "testModified_add3694__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3694__17, "o_testModified_add3694__17", "testModified_add3694__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3695_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3695__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3695__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6");
        data.clearModified();
        boolean o_testModified_add3695__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8");
        boolean o_testModified_add3695__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3695__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14");
        boolean o_testModified_add3695__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15");
        data.clearModified();
        boolean o_testModified_add3695__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17");
        boolean o_testModified_add3695__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18");
        boolean o_testModified_add3695__19 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__19, "o_testModified_add3695__19", "testModified_add3695__19");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__1, "o_testModified_add3695__1", "testModified_add3695__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3695__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__6, "o_testModified_add3695__6", "testModified_add3695__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__8, "o_testModified_add3695__8", "testModified_add3695__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__9, "o_testModified_add3695__9", "testModified_add3695__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__14, "o_testModified_add3695__14", "testModified_add3695__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__15, "o_testModified_add3695__15", "testModified_add3695__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__17, "o_testModified_add3695__17", "testModified_add3695__17___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3695__18, "o_testModified_add3695__18", "testModified_add3695__18___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3697_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3697__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3697__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6");
        data.clearModified();
        boolean o_testModified_add3697__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8");
        boolean o_testModified_add3697__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3697__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12");
        boolean o_testModified_add3697__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13");
        boolean o_testModified_add3697__14 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14");
        data.clearModified();
        boolean o_testModified_add3697__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16");
        boolean o_testModified_add3697__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17");
        boolean o_testModified_add3697__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__18, "o_testModified_add3697__18", "testModified_add3697__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__1, "o_testModified_add3697__1", "testModified_add3697__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3697__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__6, "o_testModified_add3697__6", "testModified_add3697__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__8, "o_testModified_add3697__8", "testModified_add3697__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__9, "o_testModified_add3697__9", "testModified_add3697__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__12, "o_testModified_add3697__12", "testModified_add3697__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__13, "o_testModified_add3697__13", "testModified_add3697__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__14, "o_testModified_add3697__14", "testModified_add3697__14___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__16, "o_testModified_add3697__16", "testModified_add3697__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3697__17, "o_testModified_add3697__17", "testModified_add3697__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3698_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3698__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3698__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6");
        data.clearModified();
        boolean o_testModified_add3698__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8");
        boolean o_testModified_add3698__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3698__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12");
        boolean o_testModified_add3698__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13");
        data.clearModified();
        data.clearModified();
        boolean o_testModified_add3698__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16");
        boolean o_testModified_add3698__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17");
        boolean o_testModified_add3698__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__18, "o_testModified_add3698__18", "testModified_add3698__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__1, "o_testModified_add3698__1", "testModified_add3698__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3698__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__6, "o_testModified_add3698__6", "testModified_add3698__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__8, "o_testModified_add3698__8", "testModified_add3698__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__9, "o_testModified_add3698__9", "testModified_add3698__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__12, "o_testModified_add3698__12", "testModified_add3698__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__13, "o_testModified_add3698__13", "testModified_add3698__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__16, "o_testModified_add3698__16", "testModified_add3698__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3698__17, "o_testModified_add3698__17", "testModified_add3698__17___end");
    }

    @org.junit.Test(timeout = 1000)
    public void testModified_add3699_withlog2() throws java.lang.Exception {
        boolean o_testModified_add3699__1 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1");
        no.tellu.lib.data.DataGroupNode n = ((no.tellu.lib.data.DataGroupNode) (data.getChildNode(1)));
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2");
        n.addNode(new no.tellu.lib.data.DataValueNode("name", "NewName"));
        boolean o_testModified_add3699__6 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6");
        data.clearModified();
        boolean o_testModified_add3699__8 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8");
        boolean o_testModified_add3699__9 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9");
        data.addNode(new no.tellu.lib.data.DataGroupNode("mod"));
        boolean o_testModified_add3699__12 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12");
        boolean o_testModified_add3699__13 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13");
        data.clearModified();
        boolean o_testModified_add3699__15 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15");
        boolean o_testModified_add3699__16 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16");
        boolean o_testModified_add3699__17 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17");
        boolean o_testModified_add3699__18 = data.updateModified();
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__18, "o_testModified_add3699__18", "testModified_add3699__18");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__1, "o_testModified_add3699__1", "testModified_add3699__1___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(n, "n", "testModified_add3699__2___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__6, "o_testModified_add3699__6", "testModified_add3699__6___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__8, "o_testModified_add3699__8", "testModified_add3699__8___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__9, "o_testModified_add3699__9", "testModified_add3699__9___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__12, "o_testModified_add3699__12", "testModified_add3699__12___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__13, "o_testModified_add3699__13", "testModified_add3699__13___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__15, "o_testModified_add3699__15", "testModified_add3699__15___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__16, "o_testModified_add3699__16", "testModified_add3699__16___end");
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.log(o_testModified_add3699__17, "o_testModified_add3699__17", "testModified_add3699__17___end");
    }

    @org.junit.Test
    public void testValid() {
        org.junit.Assert.assertTrue(data.isValid());
    }

    @org.junit.Test
    public void testGetNodes() {
        org.junit.Assert.assertTrue(((data.childNodes()) == 3));
        org.junit.Assert.assertTrue(((data.childNodes("person")) == 2));
        org.junit.Assert.assertTrue(((data.childNodes("per")) == 0));
        no.tellu.lib.data.DataNode n = data.getChildNode(0);
        org.junit.Assert.assertTrue(n.getName().equals("header"));
        org.junit.Assert.assertTrue(((data.getChildNodes(null, null).size()) == 3));
        no.tellu.lib.data.DataPredicate dp = new no.tellu.lib.data.DataPredicate("name=Testman");
        org.junit.Assert.assertTrue(((data.getChildNodes(null, dp).size()) == 1));
        org.junit.Assert.assertEquals("root", data.getGroupNode(null).getName());
        org.junit.Assert.assertNull(data.getValueNode("header"));
        no.tellu.lib.data.DataGroupNode header = data.getGroupNode("header");
        org.junit.Assert.assertNotNull(header);
        org.junit.Assert.assertNull(header.getGroupNode("booltest"));
        no.tellu.lib.data.DataValueNode val = header.getValueNode("booltest");
        org.junit.Assert.assertNotNull(val);
        org.junit.Assert.assertTrue(val.getBoolean(false));
        val = val.getValueNode(null);
        org.junit.Assert.assertNotNull(val);
        org.junit.Assert.assertTrue(val.getBoolean(false));
    }

    @org.junit.Test
    public void testGetPath() throws no.tellu.lib.data.DataNotFoundException {
        java.util.List<no.tellu.lib.data.DataNode> nodes = data.getNodes("person/phone");
        org.junit.Assert.assertTrue(((nodes.size()) == 3));
        nodes = data.getNodes("/person/phone");
        org.junit.Assert.assertTrue(((nodes.size()) == 3));
        nodes = data.getNodes("person[1]/phone[2]");
        org.junit.Assert.assertTrue(((nodes.size()) == 1));
        no.tellu.lib.data.DataValueNode val = nodes.get(0).getValueNode("type");
        org.junit.Assert.assertTrue(val.getString().equals("mobile"));
        nodes = data.getNodes("person[name=Person2]/age");
        org.junit.Assert.assertTrue(((nodes.size()) == 1));
        val = nodes.get(0).getValueNode(null);
        org.junit.Assert.assertTrue(((val.getInt()) == 11));
        nodes = data.getNodes("person[address/code=1234]/address");
        org.junit.Assert.assertTrue(((nodes.size()) == 2));
    }

    @org.junit.Test
    public void testPredicate() throws no.tellu.lib.data.DataNotFoundException {
        java.util.List<no.tellu.lib.data.DataNode> nodes = data.getChildNodes("person", null);
        org.junit.Assert.assertTrue(((nodes.size()) == 2));
        nodes = data.getChildNodes("person", new no.tellu.lib.data.DataPredicate("2"));
        org.junit.Assert.assertTrue(((nodes.size()) == 1));
        no.tellu.lib.data.DataPredicate pred = new no.tellu.lib.data.DataPredicate("name=Person2");
        org.junit.Assert.assertTrue(((pred.getIndex()) == (-1)));
        org.junit.Assert.assertTrue(pred.hasExpression());
        org.junit.Assert.assertTrue(pred.getFrontPathName().equals("name"));
        pred.reset();
        no.tellu.lib.data.DataValueNode vn = new no.tellu.lib.data.DataValueNode("name", "Person2");
        org.junit.Assert.assertTrue(pred.evaluate(vn));
        nodes = data.getChildNodes("person", pred);
        org.junit.Assert.assertTrue(((nodes.size()) == 1));
        org.junit.Assert.assertTrue(((nodes.get(0).getValueNode("age").getInt()) == 11));
        org.junit.Assert.assertTrue(data.contains(new no.tellu.lib.data.DataPredicate("person/name=Person2")));
        org.junit.Assert.assertFalse(data.contains(new no.tellu.lib.data.DataPredicate("person/name=Person3")));
    }

    @org.junit.Test
    public void testGetValue() throws no.tellu.lib.data.DataNotFoundException {
        no.tellu.lib.data.DataNode n = data.getChildNode(0);
        org.junit.Assert.assertTrue(((n.getValueNode("nulltest").getValue()) == null));
        org.junit.Assert.assertTrue(n.getValueNode("booltest").getBoolean());
        n = data.getChildNode(1);
        org.junit.Assert.assertTrue(n.getValueNode("name").getString().equals("Testman"));
        org.junit.Assert.assertTrue(((n.getValueNode("age").getInt(0)) == 99));
        java.util.List<no.tellu.lib.data.DataNode> nodes = ((no.tellu.lib.data.DataGroupNode) (n)).getChildNodes("name", null);
        no.tellu.lib.data.DataValueNode name = ((no.tellu.lib.data.DataValueNode) (nodes.get(0)));
        org.junit.Assert.assertTrue(name.getString().equals("Testman"));
        org.junit.Assert.assertTrue(name.getValue().equals("Testman"));
        no.tellu.lib.data.DataValueNode val = data.getChildNode(0).getValueNode("nulltest");
        org.junit.Assert.assertNotNull(val);
        no.tellu.lib.data.DataNotFoundException ex = null;
        try {
            val.getInt();
        } catch (no.tellu.lib.data.DataNotFoundException e) {
            ex = e;
        }
        org.junit.Assert.assertNotNull(ex);
        org.junit.Assert.assertTrue(((ex.getReason()) == (no.tellu.lib.data.DataNotFoundException.REASON_NULL)));
        val = data.getChildNode(1).getValueNode("name");
        ex = null;
        try {
            val.getInt();
        } catch (no.tellu.lib.data.DataNotFoundException e) {
            ex = e;
        }
        org.junit.Assert.assertNotNull(ex);
        org.junit.Assert.assertTrue(((ex.getReason()) == (no.tellu.lib.data.DataNotFoundException.REASON_TYPE)));
        val = data.getChildNode(1).getValueNode("age");
        java.lang.String s = val.getString("notfound");
        org.junit.Assert.assertTrue(s.equals("notfound"));
        double d = val.getDouble();
        org.junit.Assert.assertTrue((d == 99.0));
    }

    @org.junit.Test
    public void testSetValue() throws no.tellu.lib.data.DataNotFoundException {
        no.tellu.lib.data.DataGroupNode header = data.getGroupNode("header");
        no.tellu.lib.data.DataValueNode val = header.getValueNode("booltest");
        val.setValue(true);
        org.junit.Assert.assertFalse(val.isModified());
        val.setValue(false);
        org.junit.Assert.assertTrue(val.isModified());
        val.setValue("string");
        org.junit.Assert.assertTrue(val.isModified());
    }

    @org.junit.Test
    public void testRemoveNodes() {
        java.util.List<no.tellu.lib.data.DataNode> nodes = data.getChildNodes("person", null);
        org.junit.Assert.assertTrue(((nodes.size()) == 2));
        data.removeNodes("person", null);
        nodes = data.getChildNodes("person", null);
        org.junit.Assert.assertTrue(((nodes.size()) == 0));
        data.clearModified();
        data.removeNodes("none", null);
        org.junit.Assert.assertFalse(data.updateModified());
        org.junit.Assert.assertTrue(((data.childNodes()) == 1));
        data.removeNodes(null, null);
        org.junit.Assert.assertTrue(((data.childNodes()) == 0));
    }

    @org.junit.Test
    public void testRemovePredicate() {
        java.util.List<no.tellu.lib.data.DataNode> nodes = data.getChildNodes("person", null);
        org.junit.Assert.assertTrue(((nodes.size()) == 2));
        no.tellu.lib.data.DataPredicate dp = new no.tellu.lib.data.DataPredicate("name=Testman");
        data.removeNodes(null, dp);
        nodes = data.getChildNodes("person", null);
        org.junit.Assert.assertTrue(((nodes.size()) == 1));
        org.junit.Assert.assertTrue(((data.childNodes()) == 2));
    }

    @org.junit.Test
    public void testCloneNode() throws no.tellu.lib.data.DataNotFoundException {
        no.tellu.lib.data.DataGroupNode header = data.getGroupNode("header");
        no.tellu.lib.data.DataGroupNode clone = ((no.tellu.lib.data.DataGroupNode) (header.cloneNode(null, true, false)));
        org.junit.Assert.assertNotNull(clone);
        org.junit.Assert.assertTrue(((clone.childNodes()) == 0));
        header.getValueNode("booltest").setValue(false);
        header.addNode(new no.tellu.lib.data.DataValueNode("newnode", 3));
        org.junit.Assert.assertFalse(clone.isModified());
        clone = ((no.tellu.lib.data.DataGroupNode) (header.cloneNode(null, true, false)));
        org.junit.Assert.assertTrue(((clone.childNodes()) == 2));
        clone = ((no.tellu.lib.data.DataGroupNode) (header.cloneNode()));
        org.junit.Assert.assertTrue(((clone.childNodes()) == 6));
        clone.getValueNode("booltest").setValue(true);
        org.junit.Assert.assertFalse(header.getValueNode("booltest").getBoolean());
        org.junit.Assert.assertEquals("header", clone.getName());
        clone = ((no.tellu.lib.data.DataGroupNode) (header.cloneNode("clone", false, false)));
        org.junit.Assert.assertEquals("clone", clone.getName());
        org.junit.Assert.assertTrue(((clone.childNodes()) == 6));
    }

    @org.junit.AfterClass
    public static void afterClass() {
        eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.observer.testwithloggenerator.objectlogsyntaxbuilder_constructs.ObjectLog.save();
    }
}

