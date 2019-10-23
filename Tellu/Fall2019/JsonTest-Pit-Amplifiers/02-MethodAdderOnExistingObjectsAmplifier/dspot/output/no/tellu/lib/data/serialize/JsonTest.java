package no.tellu.lib.data.serialize;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataSerializer;
import org.junit.Assert;
import org.junit.Test;


public class JsonTest {
    @Test(timeout = 1000)
    public void testJsonException_mg8277() throws IOException {
        DataGroupNode __DSPOT_node_10003 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("[F;_f5,.PUtK0SYnEJ&l", -790462572, false, false));
        File f = new File("src/test/resources/invalid.json");
        boolean o_testJsonException_mg8277__6 = f.exists();
        Assert.assertTrue(o_testJsonException_mg8277__6);
        FileInputStream is = new FileInputStream(f);
        JsonSerializer ser = new JsonSerializer();
        ser.setRootName("root");
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        boolean boolean_872 = (result.data) == null;
        boolean boolean_873 = (result.errors.size()) == 1;
        int errorLine = result.errors.get(0).getCode();
        boolean boolean_874 = (errorLine >= 30) && (errorLine <= 32);
        String o_testJsonException_mg8277__21 = ser.serialize(__DSPOT_node_10003);
        Assert.assertEquals("{\n\n}", o_testJsonException_mg8277__21);
        Assert.assertTrue(o_testJsonException_mg8277__6);
    }

    @Test(timeout = 1000)
    public void testJsonException_mg8277_mg8300() throws IOException {
        boolean __DSPOT_keepMeta_10012 = false;
        boolean __DSPOT_modifiedOnly_10011 = true;
        String __DSPOT_newName_10010 = "dx@bEi421Im!EXTKMg9E";
        DataGroupNode __DSPOT_node_10003 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("[F;_f5,.PUtK0SYnEJ&l", -790462572, false, false));
        File f = new File("src/test/resources/invalid.json");
        boolean o_testJsonException_mg8277__6 = f.exists();
        FileInputStream is = new FileInputStream(f);
        JsonSerializer ser = new JsonSerializer();
        ser.setRootName("root");
        DataSerializer.ParseResult result = ser.deSerialize(is, null);
        boolean boolean_872 = (result.data) == null;
        boolean boolean_873 = (result.errors.size()) == 1;
        int errorLine = result.errors.get(0).getCode();
        boolean boolean_874 = (errorLine >= 30) && (errorLine <= 32);
        String o_testJsonException_mg8277__21 = ser.serialize(__DSPOT_node_10003);
        Assert.assertEquals("{\n\n}", o_testJsonException_mg8277__21);
        DataNode o_testJsonException_mg8277_mg8300__29 = __DSPOT_node_10003.cloneNode(__DSPOT_newName_10010, __DSPOT_modifiedOnly_10011, __DSPOT_keepMeta_10012);
        Assert.assertTrue(((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).isModified());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).hasOpenTransaction());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).hasNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).isValid());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testJsonException_mg8277_mg8300__29)).getHandle())).getNode())).isModified());
        Assert.assertEquals("{\n\n}", o_testJsonException_mg8277__21);
    }
}

