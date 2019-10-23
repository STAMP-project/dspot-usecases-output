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


public class XmlTest {
    @Test(timeout = 1000)
    public void testXmlSerializer_add8() throws IOException, DataNotFoundException {
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_add8__4 = f.exists();
        Assert.assertTrue(o_testXmlSerializer_add8__4);
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_40 = (result.errors.size()) == 0;
        boolean boolean_41 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        DataValueNode o_testXmlSerializer_add8__18 = n.getValueNode("name");
        Assert.assertNull(((DataValueNode) (o_testXmlSerializer_add8__18)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testXmlSerializer_add8__18)).getMetaItem());
        Assert.assertEquals("Testman", ((DataValueNode) (o_testXmlSerializer_add8__18)).getString());
        Assert.assertTrue(((DataValueNode) (o_testXmlSerializer_add8__18)).isValid());
        Assert.assertEquals("name=Testman", ((DataValueNode) (o_testXmlSerializer_add8__18)).toString());
        Assert.assertFalse(((DataValueNode) (o_testXmlSerializer_add8__18)).isModified());
        Assert.assertEquals("name", ((DataValueNode) (o_testXmlSerializer_add8__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).isValid());
        Assert.assertEquals("name", ((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getName());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).isModified());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).isValid());
        Assert.assertEquals("name", ((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).getName());
        boolean o_testXmlSerializer_add8__19 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testXmlSerializer_add8__19);
        boolean boolean_42 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_43 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_44 = ex == null;
        Assert.assertTrue(o_testXmlSerializer_add8__4);
        Assert.assertNull(((DataValueNode) (o_testXmlSerializer_add8__18)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testXmlSerializer_add8__18)).getMetaItem());
        Assert.assertEquals("Testman", ((DataValueNode) (o_testXmlSerializer_add8__18)).getString());
        Assert.assertTrue(((DataValueNode) (o_testXmlSerializer_add8__18)).isValid());
        Assert.assertEquals("name=Testman", ((DataValueNode) (o_testXmlSerializer_add8__18)).toString());
        Assert.assertFalse(((DataValueNode) (o_testXmlSerializer_add8__18)).isModified());
        Assert.assertEquals("name", ((DataValueNode) (o_testXmlSerializer_add8__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).isValid());
        Assert.assertEquals("name", ((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getName());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).isModified());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).isValid());
        Assert.assertEquals("name", ((DataNode) (((DataHandle) (((DataValueNode) (o_testXmlSerializer_add8__18)).getHandle())).getNode())).getName());
        Assert.assertTrue(o_testXmlSerializer_add8__19);
    }

    @Test(timeout = 1000)
    public void testXmlSerializer_add5() throws IOException, DataNotFoundException {
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_add5__4 = f.exists();
        Assert.assertTrue(o_testXmlSerializer_add5__4);
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_25 = (result.errors.size()) == 0;
        boolean boolean_26 = (data.childNodes()) == 3;
        DataNode o_testXmlSerializer_add5__16 = data.getChildNode(1);
        Assert.assertNull(((DataGroupNode) (o_testXmlSerializer_add5__16)).getMetaNode());
        Assert.assertTrue(((DataGroupNode) (o_testXmlSerializer_add5__16)).isValid());
        Assert.assertEquals("person[5]", ((DataGroupNode) (o_testXmlSerializer_add5__16)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testXmlSerializer_add5__16)).isModified());
        Assert.assertEquals("person", ((DataGroupNode) (o_testXmlSerializer_add5__16)).getName());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).isValid());
        Assert.assertEquals("person", ((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getName());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).isModified());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).isValid());
        Assert.assertEquals("person", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).getName());
        DataNode n = data.getChildNode(1);
        boolean o_testXmlSerializer_add5__19 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testXmlSerializer_add5__19);
        boolean boolean_27 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_28 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_29 = ex == null;
        Assert.assertTrue(o_testXmlSerializer_add5__4);
        Assert.assertNull(((DataGroupNode) (o_testXmlSerializer_add5__16)).getMetaNode());
        Assert.assertTrue(((DataGroupNode) (o_testXmlSerializer_add5__16)).isValid());
        Assert.assertEquals("person[5]", ((DataGroupNode) (o_testXmlSerializer_add5__16)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testXmlSerializer_add5__16)).isModified());
        Assert.assertEquals("person", ((DataGroupNode) (o_testXmlSerializer_add5__16)).getName());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).isValid());
        Assert.assertEquals("person", ((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getName());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).isModified());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).isValid());
        Assert.assertEquals("person", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_add5__16)).getHandle())).getNode())).getName());
        Assert.assertTrue(o_testXmlSerializer_add5__19);
    }
}

