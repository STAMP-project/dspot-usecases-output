package no.tellu.lib.data;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DataHandleTest {
    DataHandle data;

    @Before
    public void setUp() {
        DataGroupNode root = new DataGroupNode("root");
        DataGroupNode header = new DataGroupNode("header");
        header.addNodeRaw(new DataValueNode("booltest", true));
        header.addNodeRaw(new DataValueNode("nulltest", null));
        header.addNodeRaw(new DataValueNode("array", "str1"));
        header.addNodeRaw(new DataValueNode("array", "str2"));
        header.addNodeRaw(new DataValueNode("array", "str3"));
        root.addNodeRaw(header);
        DataGroupNode person = new DataGroupNode("person");
        person.addNodeRaw(new DataValueNode("name", "Testman"));
        person.addNodeRaw(new DataValueNode("age", 99));
        DataGroupNode addr = new DataGroupNode("address");
        addr.addNodeRaw(new DataValueNode("street", "Teststreet"));
        addr.addNodeRaw(new DataValueNode("city", "Testcity"));
        addr.addNodeRaw(new DataValueNode("code", "1234"));
        person.addNodeRaw(addr);
        DataGroupNode phone = new DataGroupNode("phone");
        phone.addNodeRaw(new DataValueNode("type", "home"));
        phone.addNodeRaw(new DataValueNode("number", "12345678"));
        person.addNodeRaw(phone);
        phone = new DataGroupNode("phone");
        phone.addNodeRaw(new DataValueNode("type", "mobile"));
        phone.addNodeRaw(new DataValueNode("number", "23456789"));
        person.addNodeRaw(phone);
        root.addNodeRaw(person);
        person = new DataGroupNode("person");
        person.addNodeRaw(new DataValueNode("name", "Person2"));
        person.addNodeRaw(new DataValueNode("age", 11));
        addr = new DataGroupNode("address");
        addr.addNodeRaw(new DataValueNode("street", "Teststreet"));
        addr.addNodeRaw(new DataValueNode("city", "Testcity"));
        addr.addNodeRaw(new DataValueNode("code", "1234"));
        person.addNodeRaw(addr);
        phone = new DataGroupNode("phone");
        phone.addNodeRaw(new DataValueNode("type", "home"));
        phone.addNodeRaw(new DataValueNode("number", "12345678"));
        person.addNodeRaw(phone);
        root.addNodeRaw(person);
        data = new DataHandleImpl(root);
    }

    @Test(timeout = 1000)
    public void testSetValue() throws Exception {
        DataHandle h = data.getDataHandle("header");
        Assert.assertTrue(((DataHandleImpl) (h)).isValid());
        Assert.assertTrue(((DataHandleImpl) (h)).hasNode());
        Assert.assertFalse(((DataHandleImpl) (h)).isValueNode());
        Assert.assertFalse(((DataHandleImpl) (h)).hasOpenTransaction());
        Assert.assertEquals("header", ((DataHandleImpl) (h)).getName());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isValid());
        Assert.assertFalse(((DataNode) (((DataHandleImpl) (h)).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandleImpl) (h)).getNode())).getMetaNode());
        Assert.assertEquals("header", ((DataNode) (((DataHandleImpl) (h)).getNode())).getName());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasOpenTransaction());
        Assert.assertEquals("header", ((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).getName());
        h.setValue("nulltest", "notnull");
        boolean o_testSetValue__4 = h.getNode().getValueNode("nulltest").isModified();
        Assert.assertTrue(o_testSetValue__4);
        h = data.getDataHandle("person[1]/age");
        Assert.assertTrue(((DataHandleImpl) (h)).isValid());
        Assert.assertTrue(((DataHandleImpl) (h)).hasNode());
        Assert.assertTrue(((DataHandleImpl) (h)).isValueNode());
        Assert.assertFalse(((DataHandleImpl) (h)).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandleImpl) (h)).getName());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isValid());
        Assert.assertFalse(((DataNode) (((DataHandleImpl) (h)).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandleImpl) (h)).getNode())).getMetaNode());
        Assert.assertEquals("age", ((DataNode) (((DataHandleImpl) (h)).getNode())).getName());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).getName());
        h.setValue(null, 20);
        DataValueNode o_testSetValue__10 = h.getNode().getValueNode(null);
        Assert.assertTrue(((DataValueNode) (o_testSetValue__10)).isValid());
        Assert.assertNull(((DataValueNode) (o_testSetValue__10)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testSetValue__10)).getMetaItem());
        Assert.assertEquals("age=20", ((DataValueNode) (o_testSetValue__10)).toString());
        Assert.assertEquals(20, ((int) (((DataValueNode) (o_testSetValue__10)).getInt())));
        Assert.assertEquals(20L, ((long) (((DataValueNode) (o_testSetValue__10)).getLong())));
        Assert.assertEquals(20.0F, ((float) (((DataValueNode) (o_testSetValue__10)).getFloat())), 0.1);
        Assert.assertEquals(20.0, ((double) (((DataValueNode) (o_testSetValue__10)).getDouble())), 0.1);
        Assert.assertTrue(((DataValueNode) (o_testSetValue__10)).isModified());
        Assert.assertEquals("age", ((DataValueNode) (o_testSetValue__10)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).isValid());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).getMetaNode());
        Assert.assertEquals("age", ((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).getName());
        boolean o_testSetValue__12 = h.getNode().isModified();
        Assert.assertTrue(o_testSetValue__12);
        Assert.assertTrue(((DataHandleImpl) (h)).isValid());
        Assert.assertTrue(((DataHandleImpl) (h)).hasNode());
        Assert.assertTrue(((DataHandleImpl) (h)).isValueNode());
        Assert.assertFalse(((DataHandleImpl) (h)).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandleImpl) (h)).getName());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isValid());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandleImpl) (h)).getNode())).getMetaNode());
        Assert.assertEquals("age", ((DataNode) (((DataHandleImpl) (h)).getNode())).getName());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).getName());
        Assert.assertTrue(o_testSetValue__4);
        Assert.assertTrue(((DataHandleImpl) (h)).isValid());
        Assert.assertTrue(((DataHandleImpl) (h)).hasNode());
        Assert.assertTrue(((DataHandleImpl) (h)).isValueNode());
        Assert.assertFalse(((DataHandleImpl) (h)).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandleImpl) (h)).getName());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isValid());
        Assert.assertTrue(((DataNode) (((DataHandleImpl) (h)).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandleImpl) (h)).getNode())).getMetaNode());
        Assert.assertEquals("age", ((DataNode) (((DataHandleImpl) (h)).getNode())).getName());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandle) (((DataNode) (((DataHandleImpl) (h)).getNode())).getHandle())).getName());
        Assert.assertTrue(((DataValueNode) (o_testSetValue__10)).isValid());
        Assert.assertNull(((DataValueNode) (o_testSetValue__10)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testSetValue__10)).getMetaItem());
        Assert.assertEquals("age=20", ((DataValueNode) (o_testSetValue__10)).toString());
        Assert.assertEquals(20, ((int) (((DataValueNode) (o_testSetValue__10)).getInt())));
        Assert.assertEquals(20L, ((long) (((DataValueNode) (o_testSetValue__10)).getLong())));
        Assert.assertEquals(20.0F, ((float) (((DataValueNode) (o_testSetValue__10)).getFloat())), 0.1);
        Assert.assertEquals(20.0, ((double) (((DataValueNode) (o_testSetValue__10)).getDouble())), 0.1);
        Assert.assertTrue(((DataValueNode) (o_testSetValue__10)).isModified());
        Assert.assertEquals("age", ((DataValueNode) (o_testSetValue__10)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("age", ((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).isValid());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).getMetaNode());
        Assert.assertEquals("age", ((DataNode) (((DataHandle) (((DataValueNode) (o_testSetValue__10)).getHandle())).getNode())).getName());
    }
}

