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
    public void testXmlSerializer_mg2() throws IOException, DataNotFoundException {
        DataValueNode __DSPOT_item_1 = new DataValueNode("(q2 5[gpbL[{$QV5:Wz2", new Object());
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_mg2__7 = f.exists();
        Assert.assertTrue(o_testXmlSerializer_mg2__7);
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_10 = (result.errors.size()) == 0;
        boolean boolean_11 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        boolean o_testXmlSerializer_mg2__21 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testXmlSerializer_mg2__21);
        boolean boolean_12 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_13 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_14 = ex == null;
        ser.processItem(__DSPOT_item_1);
        Assert.assertTrue(o_testXmlSerializer_mg2__7);
        Assert.assertTrue(o_testXmlSerializer_mg2__21);
    }

    @Test(timeout = 1000)
    public void testXmlSerializer_mg8() throws IOException, DataNotFoundException {
        boolean __DSPOT_keepMeta_8 = false;
        boolean __DSPOT_modifiedOnly_7 = true;
        String __DSPOT_newName_6 = "A=SO/woO!OKS@Rl&{ha!";
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_mg8__7 = f.exists();
        Assert.assertTrue(o_testXmlSerializer_mg8__7);
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_40 = (result.errors.size()) == 0;
        boolean boolean_41 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        boolean o_testXmlSerializer_mg8__21 = n.getValueNode("name").getString().equals("Testman");
        Assert.assertTrue(o_testXmlSerializer_mg8__21);
        boolean boolean_42 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_43 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_44 = ex == null;
        DataNode o_testXmlSerializer_mg8__36 = data.cloneNode(__DSPOT_newName_6, __DSPOT_modifiedOnly_7, __DSPOT_keepMeta_8);
        Assert.assertNull(((DataGroupNode) (o_testXmlSerializer_mg8__36)).getMetaNode());
        Assert.assertTrue(((DataGroupNode) (o_testXmlSerializer_mg8__36)).isValid());
        Assert.assertFalse(((DataGroupNode) (o_testXmlSerializer_mg8__36)).isModified());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).isValid());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).getNode())).isModified());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).getNode())).getMetaNode());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testXmlSerializer_mg8__36)).getHandle())).getNode())).isValid());
        Assert.assertTrue(o_testXmlSerializer_mg8__7);
        Assert.assertTrue(o_testXmlSerializer_mg8__21);
    }

    @Test(timeout = 1000)
    public void testXmlSerializer_mg2_mg527() throws IOException, DataNotFoundException {
        double __DSPOT_defaultVal_512 = 0.44212160372781306;
        DataValueNode __DSPOT_item_1 = new DataValueNode("(q2 5[gpbL[{$QV5:Wz2", new Object());
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_mg2__7 = f.exists();
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_10 = (result.errors.size()) == 0;
        boolean boolean_11 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        boolean o_testXmlSerializer_mg2__21 = n.getValueNode("name").getString().equals("Testman");
        boolean boolean_12 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_13 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_14 = ex == null;
        ser.processItem(__DSPOT_item_1);
        double o_testXmlSerializer_mg2_mg527__42 = __DSPOT_item_1.getDouble(__DSPOT_defaultVal_512);
        Assert.assertEquals(0.44212160372781306, ((double) (o_testXmlSerializer_mg2_mg527__42)), 0.1);
    }

    @Test(timeout = 1000)
    public void testXmlSerializer_mg2_mg520() throws IOException, DataNotFoundException {
        Object __DSPOT_val_500 = new Object();
        DataValueNode __DSPOT_item_1 = new DataValueNode("(q2 5[gpbL[{$QV5:Wz2", new Object());
        File f = new File("src/test/resources/data.xml");
        boolean o_testXmlSerializer_mg2__7 = f.exists();
        FileInputStream is = new FileInputStream(f);
        XmlSerializer ser = new XmlSerializer();
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        DataGroupNode data = result.data;
        boolean boolean_10 = (result.errors.size()) == 0;
        boolean boolean_11 = (data.childNodes()) == 3;
        DataNode n = data.getChildNode(1);
        boolean o_testXmlSerializer_mg2__21 = n.getValueNode("name").getString().equals("Testman");
        boolean boolean_12 = (n.getValueNode("age").getInt(0)) == 99;
        List<DataNode> nodes = data.getNodes("person[address/code=1234]/address");
        boolean boolean_13 = (nodes.size()) == 2;
        IOException ex = null;
        System.out.println("XML output:");
        {
            ser.serialize(data, System.out);
        }
        boolean boolean_14 = ex == null;
        ser.processItem(__DSPOT_item_1);
        boolean o_testXmlSerializer_mg2_mg520__43 = __DSPOT_item_1.equalsValue(__DSPOT_val_500);
        Assert.assertFalse(o_testXmlSerializer_mg2_mg520__43);
    }
}

