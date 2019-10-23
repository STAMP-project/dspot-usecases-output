package no.tellu.lib.data.serialize;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.DataSerializer;
import no.tellu.lib.data.DataValueNode;
import org.junit.Assert;
import org.junit.Test;


public class JsonTest {
    @Test(timeout = 1000)
    public void testJsonSerializer_add1196() throws IOException, DataNotFoundException {
        File f = new File("src/test/resources/data.json");
        boolean o_testJsonSerializer_add1196__4 = f.exists();
        Assert.assertTrue(o_testJsonSerializer_add1196__4);
        FileInputStream is = new FileInputStream(f);
        JsonSerializer ser = new JsonSerializer();
        ser.setRootName("root");
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_118 = (result.errors.size()) == 0;
        boolean boolean_119 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        DataValueNode o_testJsonSerializer_add1196__19 = n.getValueNode("name");
        Assert.assertEquals("Testman", ((DataValueNode) (o_testJsonSerializer_add1196__19)).getString());
        Assert.assertTrue(((DataValueNode) (o_testJsonSerializer_add1196__19)).isValid());
        Assert.assertNull(((DataValueNode) (o_testJsonSerializer_add1196__19)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testJsonSerializer_add1196__19)).getMetaItem());
        Assert.assertEquals("name=Testman", ((DataValueNode) (o_testJsonSerializer_add1196__19)).toString());
        Assert.assertFalse(((DataValueNode) (o_testJsonSerializer_add1196__19)).isModified());
        Assert.assertEquals("name", ((DataValueNode) (o_testJsonSerializer_add1196__19)).getName());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).isValid());
        Assert.assertEquals("name", ((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("name", ((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).getName());
        boolean o_testJsonSerializer_add1196__20 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testJsonSerializer_add1196__20);
        boolean boolean_120 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_121 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("JSON output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_122 = ex == null;
        Assert.assertTrue(o_testJsonSerializer_add1196__4);
        Assert.assertEquals("Testman", ((DataValueNode) (o_testJsonSerializer_add1196__19)).getString());
        Assert.assertTrue(((DataValueNode) (o_testJsonSerializer_add1196__19)).isValid());
        Assert.assertNull(((DataValueNode) (o_testJsonSerializer_add1196__19)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testJsonSerializer_add1196__19)).getMetaItem());
        Assert.assertEquals("name=Testman", ((DataValueNode) (o_testJsonSerializer_add1196__19)).toString());
        Assert.assertFalse(((DataValueNode) (o_testJsonSerializer_add1196__19)).isModified());
        Assert.assertEquals("name", ((DataValueNode) (o_testJsonSerializer_add1196__19)).getName());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).isValid());
        Assert.assertEquals("name", ((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("name", ((DataNode) (((DataHandle) (((DataValueNode) (o_testJsonSerializer_add1196__19)).getHandle())).getNode())).getName());
        Assert.assertTrue(o_testJsonSerializer_add1196__20);
    }

    @Test(timeout = 1000)
    public void testJsonSerializer_add1193() throws IOException, DataNotFoundException {
        File f = new File("src/test/resources/data.json");
        boolean o_testJsonSerializer_add1193__4 = f.exists();
        Assert.assertTrue(o_testJsonSerializer_add1193__4);
        FileInputStream is = new FileInputStream(f);
        JsonSerializer ser = new JsonSerializer();
        ser.setRootName("root");
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_103 = (result.errors.size()) == 0;
        boolean boolean_104 = (data.childNodes()) == 3;
        DataNode o_testJsonSerializer_add1193__17 = data.getChildNode(1);
        Assert.assertTrue(((DataGroupNode) (o_testJsonSerializer_add1193__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testJsonSerializer_add1193__17)).getMetaNode());
        Assert.assertEquals("person[5]", ((DataGroupNode) (o_testJsonSerializer_add1193__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testJsonSerializer_add1193__17)).isModified());
        Assert.assertEquals("person", ((DataGroupNode) (o_testJsonSerializer_add1193__17)).getName());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).isValid());
        Assert.assertEquals("person", ((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("person", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).getName());
        DataNode n = data.getChildNode(1);
        boolean o_testJsonSerializer_add1193__20 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testJsonSerializer_add1193__20);
        boolean boolean_105 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_106 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("JSON output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_107 = ex == null;
        Assert.assertTrue(o_testJsonSerializer_add1193__4);
        Assert.assertTrue(((DataGroupNode) (o_testJsonSerializer_add1193__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testJsonSerializer_add1193__17)).getMetaNode());
        Assert.assertEquals("person[5]", ((DataGroupNode) (o_testJsonSerializer_add1193__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testJsonSerializer_add1193__17)).isModified());
        Assert.assertEquals("person", ((DataGroupNode) (o_testJsonSerializer_add1193__17)).getName());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).isValid());
        Assert.assertEquals("person", ((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("person", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonSerializer_add1193__17)).getHandle())).getNode())).getName());
        Assert.assertTrue(o_testJsonSerializer_add1193__20);
    }
}

