package no.tellu.lib.data.template;


import java.io.IOException;
import java.util.Collections;
import java.util.List;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataHandleImpl;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.DataPath;
import no.tellu.lib.data.DataPredicate;
import no.tellu.lib.data.DataValueNode;
import no.tellu.lib.data.serialize.JsonSerializer;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TemplateTest {
    static final int SAMPLE_SIZE = 6;

    static DataHandle dataHandle;

    @BeforeClass
    public static void createNodes() {
        DataGroupNode template = new DataGroupNode("r");
        template.addNode(new DataValueNode("uuid", "$UUID"));
        template.addNode(new DataValueNode("timeCreated", "$DATETIME:yyyy-MM-dd'T'HH:mm:ss.SSS"));
        template.addNode(new DataValueNode("senderName", "TemplateTest"));
        template.addNode(new DataValueNode("customerId", "$DATA:customers/id"));
        DataGroupNode payload = new DataGroupNode("payload");
        payload.addNode(new DataValueNode("customerId", "$DATA:customers/id"));
        payload.addNode(new DataValueNode("deviceId", "$DATA:customers/deviceIds"));
        payload.addNode(new DataValueNode("observationId", "$INCR:1000:1"));
        template.addNodeRaw(payload);
        DataGroupNode dataSource = new DataGroupNode();
        DataGroupNode customer = new DataGroupNode("customers");
        customer.addNodeRaw(new DataValueNode("id", 1));
        customer.addNodeRaw(new DataValueNode("deviceIds", 1));
        customer.addNodeRaw(new DataValueNode("deviceIds", 2));
        customer.addNodeRaw(new DataValueNode("deviceIds", 3));
        dataSource.addNodeRaw(customer);
        customer = new DataGroupNode("customers");
        customer.addNodeRaw(new DataValueNode("id", 2));
        customer.addNodeRaw(new DataValueNode("deviceIds", 4));
        customer.addNodeRaw(new DataValueNode("deviceIds", 5));
        dataSource.addNodeRaw(customer);
        DataTemplate dt = new DataTemplate(template, dataSource, "customers/deviceIds");
        DataGroupNode results = new DataGroupNode();
        for (int i = 0; i < (TemplateTest.SAMPLE_SIZE); i++) {
            results.addNodeRaw(dt.getNode());
            if (!(dt.nextNode())) {
                dt.resetNode();
            }
        }
        JsonSerializer ser = new JsonSerializer();
        try {
            ser.serialize(((DataGroupNode) (results.getChildNode(((TemplateTest.SAMPLE_SIZE) - 1)))), System.out);
        } catch (IOException e) {
        }
        TemplateTest.dataHandle = new DataHandleImpl(results);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1663() throws DataNotFoundException {
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_93 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_93);
        boolean boolean_94 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1663__12 = results.getGroupNode(__DSPOT_name_8);
        Assert.assertNull(o_testGeneratedTrees_mg1663__12);
        Assert.assertEquals("Created 6 node trees", String_93);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        Assert.assertTrue(o_testGeneratedTrees_mg1664__12.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_99);
        boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
        Assert.assertNull(o_testGeneratedTrees_mg1666__12);
        Assert.assertEquals("Created 6 node trees", String_99);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1681() throws DataNotFoundException {
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_129 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_129);
        boolean boolean_130 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        Assert.assertEquals("Created 6 node trees", String_129);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1660() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_87 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_87);
        boolean boolean_88 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1660__13 = results.contains(__DSPOT_predicate_4);
        Assert.assertFalse(o_testGeneratedTrees_mg1660__13);
        Assert.assertEquals("Created 6 node trees", String_87);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1682() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_131 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_131);
        boolean boolean_132 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1682__11 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1682__11);
        Assert.assertEquals("Created 6 node trees", String_131);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1661() throws DataNotFoundException {
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_89 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_89);
        boolean boolean_90 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1661__12 = results.getChildNode(__DSPOT_index_5);
        Assert.assertNull(o_testGeneratedTrees_mg1661__12);
        Assert.assertEquals("Created 6 node trees", String_89);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        Assert.assertTrue(o_testGeneratedTrees_mg1662__14.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1667() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_101 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_101);
        boolean boolean_102 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        Assert.assertEquals("Created 6 node trees", String_101);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1668() throws DataNotFoundException {
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_103 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_103);
        boolean boolean_104 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        Assert.assertEquals("Created 6 node trees", String_103);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1669() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_105 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_105);
        boolean boolean_106 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1669__11 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1669__11);
        Assert.assertEquals("Created 6 node trees", String_105);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674() throws DataNotFoundException {
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_115);
        boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
        Assert.assertNull(o_testGeneratedTrees_mg1674__12);
        Assert.assertEquals("Created 6 node trees", String_115);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683() throws DataNotFoundException {
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_133);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        Assert.assertTrue(o_testGeneratedTrees_mg1675__14.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        Assert.assertNull(o_testGeneratedTrees_mg1676__12);
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677() throws DataNotFoundException {
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        Assert.assertTrue(o_testGeneratedTrees_mg1677__12.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1670__11)));
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_add1687__8)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687__8)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687__8)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_add1687__8)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).getName());
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_add1687__8)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687__8)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687__8)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_add1687__8)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle())).getNode())).getName());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671() throws DataNotFoundException {
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1671__12)));
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1686() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_139 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_139);
        boolean boolean_140 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_139);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getMetaNode());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l[4]", ((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).getNode())).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        Assert.assertFalse(o_testGeneratedTrees_mg1673__13);
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_add1684__3)));
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_add1684__3)));
        Assert.assertEquals("Created 6 node trees", String_135);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1657() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_81 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_81);
        boolean boolean_82 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1657__11 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1657__11)));
        Assert.assertEquals("Created 6 node trees", String_81);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679() throws DataNotFoundException {
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        Assert.assertNull(o_testGeneratedTrees_mg1679__12);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658() throws DataNotFoundException {
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1658__12)));
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getMetaNode());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W[0]", ((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).isModified());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).hasOpenTransaction());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).getNode())).isModified());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_add2400() throws DataNotFoundException {
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataNode o_testGeneratedTrees_add1683_add2400__7 = results.getChildNode(0);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getMetaNode());
        Assert.assertEquals("r[5]", ((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).toString());
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).isModified());
        Assert.assertEquals("r", ((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("r", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).getMetaNode());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).isModified());
        Assert.assertEquals("r", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).getName());
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getMetaNode());
        Assert.assertEquals("r[5]", ((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).toString());
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).isModified());
        Assert.assertEquals("r", ((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("r", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).getMetaNode());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).isModified());
        Assert.assertEquals("r", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_add2400__7)).getHandle())).getNode())).getName());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_add2829() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        o_testGeneratedTrees_mg1672__14.getHandle();
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1663_mg2295() throws DataNotFoundException {
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_93 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_93);
        boolean boolean_94 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1663__12 = results.getGroupNode(__DSPOT_name_8);
        boolean o_testGeneratedTrees_mg1663_mg2295__15 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1663_mg2295__15);
        Assert.assertEquals("Created 6 node trees", String_93);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_mg2114() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_433 = true;
        boolean __DSPOT_modifiedOnly_430 = true;
        String __DSPOT_newName_428 = "e/q[NKD[/hFAO[^U-(Xu";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        DataNode o_testGeneratedTrees_mg1675_mg2114__20 = results.cloneNode(__DSPOT_newName_428, __DSPOT_modifiedOnly_430, __DSPOT_keepMeta_433);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1675_mg2114__20)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1785() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        int o_testGeneratedTrees_mg1676_mg1785__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1676_mg1785__15)));
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671_mg2071() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_374 = new DataPredicate("Id=zIrfO$YaM)]&FgYic");
        String __DSPOT_nodeName_373 = "<J!z&e#9R[n4Y#_=2(^Z";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        List<DataNode> o_testGeneratedTrees_mg1671_mg2071__18 = results.getChildNodes(__DSPOT_nodeName_373, __DSPOT_predicate_374);
        Assert.assertTrue(o_testGeneratedTrees_mg1671_mg2071__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1661_add1941() throws DataNotFoundException {
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_89 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_89);
        boolean boolean_90 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1661__12 = results.getChildNode(__DSPOT_index_5);
        Assert.assertEquals("Created 6 node trees", String_89);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2770() throws DataNotFoundException {
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666_add1963() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_99);
        boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
        Assert.assertEquals("Created 6 node trees", String_99);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2887() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle().getName();
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670_mg1778() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        int o_testGeneratedTrees_mg1670_mg1778__14 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1670_mg1778__14)));
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_add1888() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        int o_testGeneratedTrees_mg1664_add1888__5 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1664_add1888__5)));
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1664_add1888__5)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_add2736() throws DataNotFoundException {
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2803() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        o_testGeneratedTrees_add1687__8.getHandle();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671_mg2109() throws DataNotFoundException {
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        int o_testGeneratedTrees_mg1671_mg2109__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1671_mg2109__15)));
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2649() throws DataNotFoundException {
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        int o_testGeneratedTrees_mg1677_mg2649__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1677_mg2649__15)));
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2506() throws DataNotFoundException {
        boolean __DSPOT_internal_886 = false;
        DataPredicate __DSPOT_pred_867 = new DataPredicate();
        String __DSPOT_name_866 = "HSJ*HpXRxF:Dlw]+obP ";
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_115);
        boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
        gen.removeNodes(__DSPOT_name_866, __DSPOT_pred_867, __DSPOT_internal_886);
        Assert.assertEquals("Created 6 node trees", String_115);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1937() throws DataNotFoundException {
        boolean __DSPOT_internal_252 = false;
        DataPredicate __DSPOT_pred_239 = new DataPredicate();
        String __DSPOT_name_238 = "/gcm:Ca6sRDg-zRApBXK";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        gen.removeNodes(__DSPOT_name_238, __DSPOT_pred_239, __DSPOT_internal_252);
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1874() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        boolean o_testGeneratedTrees_mg1664_mg1874__15 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1664_mg1874__15);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1667_mg1930() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_101 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_101);
        boolean boolean_102 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        DataPredicate o_testGeneratedTrees_mg1667_mg1930__15 = __DSPOT_predicate_14.clonePredicate();
        Assert.assertEquals(-1, ((int) (((DataPredicate) (o_testGeneratedTrees_mg1667_mg1930__15)).getIndex())));
        Assert.assertNull(((DataPredicate) (o_testGeneratedTrees_mg1667_mg1930__15)).getFrontPathName());
        Assert.assertFalse(((DataPredicate) (o_testGeneratedTrees_mg1667_mg1930__15)).hasExpression());
        Assert.assertEquals("Created 6 node trees", String_101);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2361() throws DataNotFoundException {
        String __DSPOT_name_700 = "Y#@!U`+!Kt5]@p|T!|<p";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataGroupNode o_testGeneratedTrees_mg1680_mg2361__16 = gen.getGroupNode(__DSPOT_name_700);
        Assert.assertNull(o_testGeneratedTrees_mg1680_mg2361__16);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_mg2729() throws DataNotFoundException {
        String __DSPOT_name_1117 = "RKD,l[]GdtbyM9uh8<2j";
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        DataValueNode o_testGeneratedTrees_mg1659_mg2729__18 = gen.getValueNode(__DSPOT_name_1117);
        Assert.assertNull(o_testGeneratedTrees_mg1659_mg2729__18);
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666_add1959() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_99);
        int o_testGeneratedTrees_mg1666_add1959__5 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1666_add1959__5)));
        boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
        Assert.assertEquals("Created 6 node trees", String_99);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1666_add1959__5)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2137() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_450 = false;
        boolean __DSPOT_modifiedOnly_449 = true;
        String __DSPOT_newName_448 = "HZ6L`,d@wRA<.:Gw_1nf";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_add1684_mg2137__17 = gen.cloneNode(__DSPOT_newName_448, __DSPOT_modifiedOnly_449, __DSPOT_keepMeta_450);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getMetaNode());
        Assert.assertEquals("HZ6L`,d@wRA<.:Gw_1nf[4]", ((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).isModified());
        Assert.assertEquals("HZ6L`,d@wRA<.:Gw_1nf", ((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("HZ6L`,d@wRA<.:Gw_1nf", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("HZ6L`,d@wRA<.:Gw_1nf", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_mg2137__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1660_mg1991() throws DataNotFoundException {
        int __DSPOT_index_286 = -1197528776;
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_87 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_87);
        boolean boolean_88 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1660__13 = results.contains(__DSPOT_predicate_4);
        DataNode o_testGeneratedTrees_mg1660_mg1991__17 = results.getChildNode(__DSPOT_index_286);
        Assert.assertNull(o_testGeneratedTrees_mg1660_mg1991__17);
        Assert.assertEquals("Created 6 node trees", String_87);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_add2307() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2880() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        o_testGeneratedTrees_add1687__8.getHandle();
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1988_failAssert0() throws DataNotFoundException {
        try {
            int __DSPOT_index_282 = -963317113;
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg1676__12.getChildNode(__DSPOT_index_282);
            org.junit.Assert.fail("testGeneratedTrees_mg1676_mg1988 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2141() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_453 = new DataPredicate("}7hT0[e!2k?WP/q=qf@x");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_add1684_mg2141__16 = gen.contains(__DSPOT_predicate_453);
        Assert.assertFalse(o_testGeneratedTrees_add1684_mg2141__16);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2870() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        DataValueNode o_testGeneratedTrees_add1687_add2870__11 = gen.getValueNode("senderName");
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).getName());
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_add1687_add2870__11)).getHandle())).getNode())).getName());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2802() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_mg2320() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_662 = false;
        boolean __DSPOT_modifiedOnly_661 = true;
        String __DSPOT_newName_660 = "=.Olyw>`[d Q5_yYQQ::";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_add1683_mg2320__15 = gen.cloneNode(__DSPOT_newName_660, __DSPOT_modifiedOnly_661, __DSPOT_keepMeta_662);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getMetaNode());
        Assert.assertEquals("=.Olyw>`[d Q5_yYQQ::[4]", ((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).isModified());
        Assert.assertEquals("=.Olyw>`[d Q5_yYQQ::", ((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("=.Olyw>`[d Q5_yYQQ::", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).getNode())).isModified());
        Assert.assertEquals("=.Olyw>`[d Q5_yYQQ::", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1683_mg2320__15)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2876() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        o_testGeneratedTrees_add1687__8.toString();
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_add2746() throws DataNotFoundException {
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        o_testGeneratedTrees_mg1677__12.isEmpty();
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_add2404() throws DataNotFoundException {
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_133);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2255() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        boolean o_testGeneratedTrees_mg1673_mg2255__16 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1673_mg2255__16);
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1681_mg2276() throws DataNotFoundException {
        String __DSPOT_nodeName_602 = "qeQab3d>f:C4%,Ol/W8k";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_129 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_129);
        boolean boolean_130 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        int o_testGeneratedTrees_mg1681_mg2276__17 = gen.childNodes(__DSPOT_nodeName_602);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1681_mg2276__17)));
        Assert.assertEquals("Created 6 node trees", String_129);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_mg2216() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_525 = new DataPredicate("xe0!W)bfl&TZ>Pi<qetD");
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        boolean o_testGeneratedTrees_mg1675_mg2216__19 = gen.contains(__DSPOT_predicate_525);
        Assert.assertFalse(o_testGeneratedTrees_mg1675_mg2216__19);
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1660_add2115() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_87 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_87);
        boolean boolean_88 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1660__13 = results.contains(__DSPOT_predicate_4);
        Assert.assertEquals("Created 6 node trees", String_87);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_add2551() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2204() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_add1684_mg2204__14 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_add1684_mg2204__14);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1681_mg2273() throws DataNotFoundException {
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_129 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_129);
        boolean boolean_130 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        int o_testGeneratedTrees_mg1681_mg2273__16 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1681_mg2273__16)));
        Assert.assertEquals("Created 6 node trees", String_129);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_mg2244() throws DataNotFoundException {
        String __DSPOT_nodeName_557 = "rg^$.b?8Mq[Zg@S@DLF4";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_add1683_mg2244__13 = results.childNodes(__DSPOT_nodeName_557);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_add1683_mg2244__13)));
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1660_add2117() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_87 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_87);
        int o_testGeneratedTrees_mg1660_add2117__6 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1660_add2117__6)));
        boolean boolean_88 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1660__13 = results.contains(__DSPOT_predicate_4);
        Assert.assertEquals("Created 6 node trees", String_87);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1660_add2117__6)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1667_mg2032() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_336 = false;
        boolean __DSPOT_modifiedOnly_335 = false;
        String __DSPOT_newName_334 = " ?/vHAUe,^ lEY[)_ G^";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_101 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_101);
        boolean boolean_102 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        DataNode o_testGeneratedTrees_mg1667_mg2032__18 = gen.cloneNode(__DSPOT_newName_334, __DSPOT_modifiedOnly_335, __DSPOT_keepMeta_336);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1667_mg2032__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_101);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2460() throws DataNotFoundException {
        boolean __DSPOT_internal_814 = true;
        DataPredicate __DSPOT_pred_803 = new DataPredicate("`&I?;bx+<C(Nam#ZOk$_");
        String __DSPOT_name_802 = "<nM j[+g5p/RN6@DGp8 ";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        results.removeNodes(__DSPOT_name_802, __DSPOT_pred_803, __DSPOT_internal_814);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_mg2658() throws DataNotFoundException {
        int __DSPOT_index_1029 = 1880352101;
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        DataNode o_testGeneratedTrees_mg1659_mg2658__18 = results.getChildNode(__DSPOT_index_1029);
        Assert.assertNull(o_testGeneratedTrees_mg1659_mg2658__18);
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_mg2523() throws DataNotFoundException {
        boolean __DSPOT_internal_885 = false;
        DataPredicate __DSPOT_pred_884 = new DataPredicate();
        String __DSPOT_name_883 = "G-3]GYkhOdMM-,aC680o";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_883, __DSPOT_pred_884, __DSPOT_internal_885);
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1668_mg2112() throws DataNotFoundException {
        String __DSPOT_name_426 = "P}M8a6@]?8h8whMovI#I";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_103 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_103);
        boolean boolean_104 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        DataGroupNode o_testGeneratedTrees_mg1668_mg2112__17 = gen.getGroupNode(__DSPOT_name_426);
        Assert.assertNull(o_testGeneratedTrees_mg1668_mg2112__17);
        Assert.assertEquals("Created 6 node trees", String_103);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1663_mg2337_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_name_678 = "9Y@v@)kZowV3*r!]2^:m";
            String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_93 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_94 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1663__12 = results.getGroupNode(__DSPOT_name_8);
            o_testGeneratedTrees_mg1663__12.getValueNode(__DSPOT_name_678);
            org.junit.Assert.fail("testGeneratedTrees_mg1663_mg2337 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_mg2252() throws DataNotFoundException {
        int __DSPOT_index_571 = -1953075109;
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_add1683_mg2252__13 = results.getChildNode(__DSPOT_index_571);
        Assert.assertNull(o_testGeneratedTrees_add1683_mg2252__13);
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1817() throws DataNotFoundException {
        String __DSPOT_path_89 = "16qvQ}E3:oK*M=;$a4UU";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        List<DataNode> o_testGeneratedTrees_mg1664_mg1817__16 = results.getNodes(__DSPOT_path_89);
        Assert.assertTrue(o_testGeneratedTrees_mg1664_mg1817__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2305() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        boolean o_testGeneratedTrees_mg1680_mg2305__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1680_mg2305__15);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1663_mg2200() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_514 = new DataPredicate();
        String __DSPOT_name_513 = "`+5or+0F]JZNr 8m{vtc";
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_93 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_93);
        boolean boolean_94 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1663__12 = results.getGroupNode(__DSPOT_name_8);
        results.removeNodes(__DSPOT_name_513, __DSPOT_predicate_514);
        Assert.assertEquals("Created 6 node trees", String_93);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1956() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        boolean o_testGeneratedTrees_mg1676_mg1956__15 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1676_mg1956__15);
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671_mg2102() throws DataNotFoundException {
        boolean __DSPOT_internal_420 = false;
        DataPredicate __DSPOT_pred_417 = new DataPredicate("lmHZ]-=z?@B%787)K54x");
        String __DSPOT_name_416 = "w}{*r:hZ=ZTOAJLeJF|k";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        results.removeNodes(__DSPOT_name_416, __DSPOT_pred_417, __DSPOT_internal_420);
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_mg2761() throws DataNotFoundException {
        String __DSPOT_name_1141 = "]L65$h|Dw[ ,GuuNL2X`";
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        DataGroupNode o_testGeneratedTrees_mg1672_mg2761__18 = o_testGeneratedTrees_mg1672__14.getGroupNode(__DSPOT_name_1141);
        Assert.assertNull(o_testGeneratedTrees_mg1672_mg2761__18);
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2383() throws DataNotFoundException {
        boolean __DSPOT_internal_721 = true;
        DataPredicate __DSPOT_pred_717 = new DataPredicate("]<9^`U_D!xKDT-HU&;8&");
        String __DSPOT_name_716 = "GQ3FM@[4 i3j]yfq?73.";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        gen.removeNodes(__DSPOT_name_716, __DSPOT_pred_717, __DSPOT_internal_721);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670_mg1871() throws DataNotFoundException {
        boolean __DSPOT_internal_179 = false;
        DataPredicate __DSPOT_pred_167 = new DataPredicate(")B( ^qB(YasZ%ds TuK*");
        String __DSPOT_name_166 = "$hDLf,#+w{NUw]t2`oJK";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        results.removeNodes(__DSPOT_name_166, __DSPOT_pred_167, __DSPOT_internal_179);
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_mg2525() throws DataNotFoundException {
        String __DSPOT_nodeName_888 = "zQm7rs(R<qlK K<;QW4}";
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        int o_testGeneratedTrees_mg1672_mg2525__18 = results.childNodes(__DSPOT_nodeName_888);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1672_mg2525__18)));
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1682_mg2464() throws DataNotFoundException {
        String __DSPOT_path_807 = "%m&.mAw;o)m!E+q5b:pv";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_131 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_131);
        boolean boolean_132 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1682__11 = gen.updateModified();
        List<DataNode> o_testGeneratedTrees_mg1682_mg2464__15 = gen.getNodes(__DSPOT_path_807);
        Assert.assertTrue(o_testGeneratedTrees_mg1682_mg2464__15.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_131);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_mg2104() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        __DSPOT_predicate_25.reset();
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_mg2427() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_764 = new DataPredicate("$3FsBk+;.A%PzQu HU>4");
        String __DSPOT_name_763 = "JPc,]f*,qx_1TccWub}`";
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        results.removeNodes(__DSPOT_name_763, __DSPOT_predicate_764);
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2441() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_776 = new DataPredicate();
        String __DSPOT_name_774 = "}1vS*Gb{2,p2F4]y!|Tl";
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_115);
        boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
        results.removeNodes(__DSPOT_name_774, __DSPOT_predicate_776);
        Assert.assertEquals("Created 6 node trees", String_115);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2265() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_590 = new DataPredicate();
        String __DSPOT_nodeName_588 = "aWq&;+dZsl+h};G,A7>V";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        List<DataNode> o_testGeneratedTrees_mg1673_mg2265__19 = gen.getChildNodes(__DSPOT_nodeName_588, __DSPOT_predicate_590);
        Assert.assertTrue(o_testGeneratedTrees_mg1673_mg2265__19.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2264() throws DataNotFoundException {
        int __DSPOT_index_586 = 627555446;
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        DataNode o_testGeneratedTrees_mg1673_mg2264__17 = gen.getChildNode(__DSPOT_index_586);
        Assert.assertNull(o_testGeneratedTrees_mg1673_mg2264__17);
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_mg2184() throws DataNotFoundException {
        String __DSPOT_name_488 = "wM2fXs,Xbq-We!$8H_I=";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        DataValueNode o_testGeneratedTrees_mg1675_mg2184__18 = results.getValueNode(__DSPOT_name_488);
        Assert.assertNull(o_testGeneratedTrees_mg1675_mg2184__18);
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_mg2260() throws DataNotFoundException {
        String __DSPOT_name_581 = "*`*!rmsMcc:*x9ta):Mc";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_add1683_mg2260__13 = results.getGroupNode(__DSPOT_name_581);
        Assert.assertNull(o_testGeneratedTrees_add1683_mg2260__13);
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2865() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        ((DataGroupNode) (o_testGeneratedTrees_mg1659__14)).getHandle().getNode();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1667_mg2042() throws DataNotFoundException {
        int __DSPOT_index_348 = -200064587;
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_101 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_101);
        boolean boolean_102 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        DataNode o_testGeneratedTrees_mg1667_mg2042__16 = gen.getChildNode(__DSPOT_index_348);
        Assert.assertNull(o_testGeneratedTrees_mg1667_mg2042__16);
        Assert.assertEquals("Created 6 node trees", String_101);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1661_mg1789() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_57 = false;
        boolean __DSPOT_modifiedOnly_46 = false;
        String __DSPOT_newName_45 = "viVTx>DODA!L#vK5WR{o";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_89 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_89);
        boolean boolean_90 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1661__12 = results.getChildNode(__DSPOT_index_5);
        DataNode o_testGeneratedTrees_mg1661_mg1789__18 = results.cloneNode(__DSPOT_newName_45, __DSPOT_modifiedOnly_46, __DSPOT_keepMeta_57);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getMetaNode());
        Assert.assertEquals("viVTx>DODA!L#vK5WR{o[6]", ((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).isModified());
        Assert.assertEquals("viVTx>DODA!L#vK5WR{o", ((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("viVTx>DODA!L#vK5WR{o", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("viVTx>DODA!L#vK5WR{o", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1661_mg1789__18)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_89);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2651() throws DataNotFoundException {
        String __DSPOT_nodeName_1017 = "2QBZ#]{m ME4!q/5`L(T";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        int o_testGeneratedTrees_mg1677_mg2651__16 = gen.childNodes(__DSPOT_nodeName_1017);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1677_mg2651__16)));
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2853() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        o_testGeneratedTrees_add1687__8.getHandle();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_add1898() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664_add1898__12 = results.getNodes(__DSPOT_path_9);
        Assert.assertTrue(o_testGeneratedTrees_mg1664_add1898__12.isEmpty());
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertTrue(o_testGeneratedTrees_mg1664_add1898__12.isEmpty());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_mg2758() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        DataNode o_testGeneratedTrees_mg1672_mg2758__17 = o_testGeneratedTrees_mg1672__14.cloneNode();
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getMetaNode());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l[4]", ((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_mg2758__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_add2078() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_mg1676_add2078__9 = gen.getValueNode("senderName");
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).getName());
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1676_add2078__9)).getHandle())).getNode())).getName());
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1841() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        int o_testGeneratedTrees_mg1664_mg1841__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1664_mg1841__15)));
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2601_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_defaultVal_962 = "n%]M7!F5w|qM/m67_uZ>";
            String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
            o_testGeneratedTrees_mg1679__12.getString(__DSPOT_defaultVal_962);
            org.junit.Assert.fail("testGeneratedTrees_mg1679_mg2601 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1844() throws DataNotFoundException {
        String __DSPOT_nodeName_126 = "yMO!`j!MNC@I#`g*s,=^";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        int o_testGeneratedTrees_mg1664_mg1844__16 = gen.childNodes(__DSPOT_nodeName_126);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1664_mg1844__16)));
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1682_mg2453() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_796 = new DataPredicate("Xb6T$))Eauu; Sc;Oz{m");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_131 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_131);
        boolean boolean_132 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1682__11 = gen.updateModified();
        boolean o_testGeneratedTrees_mg1682_mg2453__16 = gen.contains(__DSPOT_predicate_796);
        Assert.assertFalse(o_testGeneratedTrees_mg1682_mg2453__16);
        Assert.assertEquals("Created 6 node trees", String_131);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2210() throws DataNotFoundException {
        DataValueNode __DSPOT_item_519 = new DataValueNode(new no.tellu.lib.data.MetaItemNode("zu6I[ x_Cpw[KKIRaR1J", new Object()), new Object());
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        boolean o_testGeneratedTrees_mg1680_mg2210__20 = __DSPOT_predicate_32.evaluate(__DSPOT_item_519);
        Assert.assertFalse(o_testGeneratedTrees_mg1680_mg2210__20);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_add2615() throws DataNotFoundException {
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2595() throws DataNotFoundException {
        boolean __DSPOT_internal_959 = false;
        DataPredicate __DSPOT_pred_958 = new DataPredicate("ZaQ/U0[/CHafia_[wGs]");
        String __DSPOT_name_957 = "J4w@19CgInh.}]I:/[B:";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        results.removeNodes(__DSPOT_name_957, __DSPOT_pred_958, __DSPOT_internal_959);
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_mg2413() throws DataNotFoundException {
        String __DSPOT_name_745 = "_MjnEt$Y7L^j(%?$[,`t";
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        DataGroupNode o_testGeneratedTrees_mg1662_mg2413__18 = results.getGroupNode(__DSPOT_name_745);
        Assert.assertNull(o_testGeneratedTrees_mg1662_mg2413__18);
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_add2334() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675_add2334__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        Assert.assertTrue(o_testGeneratedTrees_mg1675_add2334__14.isEmpty());
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertTrue(o_testGeneratedTrees_mg1675_add2334__14.isEmpty());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2430() throws DataNotFoundException {
        String __DSPOT_name_767 = "Gb#sRrjByv5%*Y1Ic(d,";
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_115);
        boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
        DataValueNode o_testGeneratedTrees_mg1674_mg2430__16 = results.getValueNode(__DSPOT_name_767);
        Assert.assertNull(o_testGeneratedTrees_mg1674_mg2430__16);
        Assert.assertEquals("Created 6 node trees", String_115);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_mg2756() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        o_testGeneratedTrees_mg1659__14.clearModified();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_mg2533() throws DataNotFoundException {
        boolean __DSPOT_internal_899 = true;
        DataPredicate __DSPOT_pred_897 = new DataPredicate();
        String __DSPOT_name_895 = "RC1d[Lf*2zE1[wxKZaI.";
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        gen.removeNodes(__DSPOT_name_895, __DSPOT_pred_897, __DSPOT_internal_899);
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2108() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_423 = new DataPredicate("%(=hn!t{Aox=_<%ft4Zc");
        String __DSPOT_name_422 = "-/+Q;*6-*};E9`u!Ce#(";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_422, __DSPOT_predicate_423);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2075() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_382 = new DataPredicate("(wF7S!6:zj%/4_k:(5uM");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_add1684_mg2075__16 = results.contains(__DSPOT_predicate_382);
        Assert.assertFalse(o_testGeneratedTrees_add1684_mg2075__16);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_add2860() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        o_testGeneratedTrees_mg1672__14.getHandle();
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2797() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        int o_testGeneratedTrees_mg1659_add2797__7 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1659_add2797__7)));
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1659_add2797__7)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_mg2510() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_873 = new DataPredicate();
        String __DSPOT_name_872 = "bg`--t[vzKre}#cvH@7c";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_872, __DSPOT_predicate_873);
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1682_add2519() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_131 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_131);
        boolean boolean_132 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1682__11 = gen.updateModified();
        Assert.assertEquals("Created 6 node trees", String_131);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1667_mg2091() throws DataNotFoundException {
        boolean __DSPOT_internal_408 = true;
        DataPredicate __DSPOT_pred_402 = new DataPredicate("SN*sw)`v}zN/0NJ?w/&c");
        String __DSPOT_name_401 = "0A)5f-JJZB2+%9x<5]|k";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_101 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_101);
        boolean boolean_102 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        gen.removeNodes(__DSPOT_name_401, __DSPOT_pred_402, __DSPOT_internal_408);
        Assert.assertEquals("Created 6 node trees", String_101);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_mg2409() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_741 = new DataPredicate();
        String __DSPOT_nodeName_740 = "(}2OM^+UG+r6^7J][{h ";
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        List<DataNode> o_testGeneratedTrees_mg1662_mg2409__20 = results.getChildNodes(__DSPOT_nodeName_740, __DSPOT_predicate_741);
        Assert.assertTrue(o_testGeneratedTrees_mg1662_mg2409__20.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2542_failAssert0() throws DataNotFoundException {
        try {
            DataPath __DSPOT_path_907 = new DataPath("VSV-4E<fr8@-gXl&XK;N");
            List<DataNode> __DSPOT_result_906 = Collections.<DataNode>emptyList();
            int __DSPOT_index_23 = 1897359589;
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
            o_testGeneratedTrees_mg1674__12.getNodes(__DSPOT_result_906, __DSPOT_path_907);
            org.junit.Assert.fail("testGeneratedTrees_mg1674_mg2542 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_add2610() throws DataNotFoundException {
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        int o_testGeneratedTrees_mg1679_add2610__5 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1679_add2610__5)));
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1679_add2610__5)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2190() throws DataNotFoundException {
        String __DSPOT_name_500 = "&oC<#z{Mzy8=+|CeGXE5";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_add1684_mg2190__15 = gen.getValueNode(__DSPOT_name_500);
        Assert.assertNull(o_testGeneratedTrees_add1684_mg2190__15);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1669_add2055() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_105 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_105);
        int o_testGeneratedTrees_mg1669_add2055__4 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1669_add2055__4)));
        boolean boolean_106 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1669__11 = results.updateModified();
        Assert.assertEquals("Created 6 node trees", String_105);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1669_add2055__4)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_mg2207() throws DataNotFoundException {
        String __DSPOT_nodeName_521 = "EF|u,%buboy^`qH;&N0t";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        int o_testGeneratedTrees_mg1675_mg2207__18 = gen.childNodes(__DSPOT_nodeName_521);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1675_mg2207__18)));
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg2024_failAssert0() throws DataNotFoundException {
        try {
            DataPredicate __DSPOT_predicate_326 = new DataPredicate("N,!y!oNPJ-E.u#+<3OqU");
            String __DSPOT_name_325 = "Y*_<Q;W[2+S(=MtN|3}(";
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg1676__12.removeNodes(__DSPOT_name_325, __DSPOT_predicate_326);
            org.junit.Assert.fail("testGeneratedTrees_mg1676_mg2024 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1660_add2126() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_87 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_87);
        boolean boolean_88 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1660_add2126__13 = results.contains(__DSPOT_predicate_4);
        Assert.assertFalse(o_testGeneratedTrees_mg1660_add2126__13);
        boolean o_testGeneratedTrees_mg1660__13 = results.contains(__DSPOT_predicate_4);
        Assert.assertEquals("Created 6 node trees", String_87);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertFalse(o_testGeneratedTrees_mg1660_add2126__13);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_add2084() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_119);
        boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg1676_add2084__12 = gen.getGroupNode(__DSPOT_name_26);
        Assert.assertNull(o_testGeneratedTrees_mg1676_add2084__12);
        DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
        Assert.assertEquals("Created 6 node trees", String_119);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertNull(o_testGeneratedTrees_mg1676_add2084__12);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_add2562() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        o_testGeneratedTrees_mg1662__14.isEmpty();
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2282() throws DataNotFoundException {
        DataPath __DSPOT_path_612 = new DataPath("2,OJTP_5b<&?,&1:v:z_");
        List<DataNode> __DSPOT_result_611 = Collections.<DataNode>emptyList();
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        gen.getNodes(__DSPOT_result_611, __DSPOT_path_612);
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2281() throws DataNotFoundException {
        String __DSPOT_name_609 = "fp]_{`wHUXG?mv:!>93C";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataGroupNode o_testGeneratedTrees_mg1680_mg2281__16 = results.getGroupNode(__DSPOT_name_609);
        Assert.assertNull(o_testGeneratedTrees_mg1680_mg2281__16);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_mg2764() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        DataNode o_testGeneratedTrees_mg1659_mg2764__17 = o_testGeneratedTrees_mg1659__14.cloneNode();
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getMetaNode());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W[6]", ((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).isModified());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals(",y(q2 5[gpbL[{$QV5:W", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1659_mg2764__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1661_mg1854() throws DataNotFoundException {
        String __DSPOT_path_141 = "it&{.K}Mjm5t1& yMN`s";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_89 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_89);
        boolean boolean_90 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1661__12 = results.getChildNode(__DSPOT_index_5);
        List<DataNode> o_testGeneratedTrees_mg1661_mg1854__16 = gen.getNodes(__DSPOT_path_141);
        Assert.assertTrue(o_testGeneratedTrees_mg1661_mg1854__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_89);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2534_failAssert0() throws DataNotFoundException {
        try {
            DataPredicate __DSPOT_predicate_898 = new DataPredicate("b$]&*jK4]wIpL[i&(Wdl");
            String __DSPOT_nodeName_896 = "@-tTVwH[h!Ff?>t$9[7L";
            int __DSPOT_index_23 = 1897359589;
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
            o_testGeneratedTrees_mg1674__12.getChildNodes(__DSPOT_nodeName_896, __DSPOT_predicate_898);
            org.junit.Assert.fail("testGeneratedTrees_mg1674_mg2534 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2671() throws DataNotFoundException {
        int __DSPOT_index_1043 = -1906888392;
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        DataNode o_testGeneratedTrees_mg1677_mg2671__16 = gen.getChildNode(__DSPOT_index_1043);
        Assert.assertNull(o_testGeneratedTrees_mg1677_mg2671__16);
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_mg2363() throws DataNotFoundException {
        String __DSPOT_name_701 = "z!!t=]4it0;{SOKJ(xWm";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_add1683_mg2363__13 = gen.getGroupNode(__DSPOT_name_701);
        Assert.assertNull(o_testGeneratedTrees_add1683_mg2363__13);
        Assert.assertEquals("Created 6 node trees", String_133);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2675() throws DataNotFoundException {
        String __DSPOT_path_1049 = "]yJ!3!>r1C>Ke7WB{@#A";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        List<DataNode> o_testGeneratedTrees_mg1677_mg2675__16 = gen.getNodes(__DSPOT_path_1049);
        Assert.assertTrue(o_testGeneratedTrees_mg1677_mg2675__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2433() throws DataNotFoundException {
        String __DSPOT_path_770 = "%p30y%h%PLOA_rz0Q. #";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        List<DataNode> o_testGeneratedTrees_mg1679_mg2433__16 = results.getNodes(__DSPOT_path_770);
        Assert.assertTrue(o_testGeneratedTrees_mg1679_mg2433__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2582() throws DataNotFoundException {
        String __DSPOT_path_941 = "c@9MCbMkPK}D!J_0P[TN";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        List<DataNode> o_testGeneratedTrees_mg1658_mg2582__16 = results.getNodes(__DSPOT_path_941);
        Assert.assertTrue(o_testGeneratedTrees_mg1658_mg2582__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666_mg1828() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_99);
        boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
        int o_testGeneratedTrees_mg1666_mg1828__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1666_mg1828__15)));
        Assert.assertEquals("Created 6 node trees", String_99);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2315() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        int o_testGeneratedTrees_mg1680_mg2315__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1680_mg2315__15)));
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671_mg2133() throws DataNotFoundException {
        String __DSPOT_name_444 = "!91(C!M49/u5[}P_26Y5";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        DataGroupNode o_testGeneratedTrees_mg1671_mg2133__16 = gen.getGroupNode(__DSPOT_name_444);
        Assert.assertNull(o_testGeneratedTrees_mg1671_mg2133__16);
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2234() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_551 = false;
        boolean __DSPOT_modifiedOnly_550 = true;
        String __DSPOT_newName_549 = "/_=$d_#KqEB_>y.MP=$5";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataNode o_testGeneratedTrees_mg1680_mg2234__18 = results.cloneNode(__DSPOT_newName_549, __DSPOT_modifiedOnly_550, __DSPOT_keepMeta_551);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1680_mg2234__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1671_mg2099() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_414 = new DataPredicate();
        String __DSPOT_name_413 = "hJs^EBD:@:#i*,|dx7BI";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_109 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_109);
        boolean boolean_110 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1671__12 = gen.childNodes(__DSPOT_nodeName_18);
        results.removeNodes(__DSPOT_name_413, __DSPOT_predicate_414);
        Assert.assertEquals("Created 6 node trees", String_109);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2212() throws DataNotFoundException {
        String __DSPOT_nodeName_520 = "w`f6YlYxeR|f3mBUdZo;";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        int o_testGeneratedTrees_mg1673_mg2212__17 = results.childNodes(__DSPOT_nodeName_520);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg1673_mg2212__17)));
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1866() throws DataNotFoundException {
        String __DSPOT_name_158 = "ZP#i,szdF)=3&}%hbH%0";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        DataValueNode o_testGeneratedTrees_mg1664_mg1866__16 = gen.getValueNode(__DSPOT_name_158);
        Assert.assertNull(o_testGeneratedTrees_mg1664_mg1866__16);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670_mg1962() throws DataNotFoundException {
        boolean __DSPOT_internal_263 = true;
        DataPredicate __DSPOT_pred_255 = new DataPredicate();
        String __DSPOT_name_254 = "Z84[C+#Sp88R_=&n/z@E";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        gen.removeNodes(__DSPOT_name_254, __DSPOT_pred_255, __DSPOT_internal_263);
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1868() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_161 = new DataPredicate();
        String __DSPOT_name_160 = "S9b&r5!GQi?`Oiw0F]T/";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        gen.removeNodes(__DSPOT_name_160, __DSPOT_predicate_161);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_mg2695() throws DataNotFoundException {
        boolean __DSPOT_internal_1075 = false;
        DataPredicate __DSPOT_pred_1072 = new DataPredicate();
        String __DSPOT_name_1071 = "KkftLA4)55VDw]{.2 &9";
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        results.removeNodes(__DSPOT_name_1071, __DSPOT_pred_1072, __DSPOT_internal_1075);
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666_mg1907_failAssert0() throws DataNotFoundException {
        try {
            boolean __DSPOT_defaultVal_203 = false;
            String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
            o_testGeneratedTrees_mg1666__12.getBoolean(__DSPOT_defaultVal_203);
            org.junit.Assert.fail("testGeneratedTrees_mg1666_mg1907 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2575() throws DataNotFoundException {
        int __DSPOT_index_927 = -855720637;
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        DataNode o_testGeneratedTrees_mg1658_mg2575__16 = results.getChildNode(__DSPOT_index_927);
        Assert.assertNull(o_testGeneratedTrees_mg1658_mg2575__16);
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1669_add2063() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_105 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_105);
        boolean boolean_106 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1669_add2063__11 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1669_add2063__11);
        boolean o_testGeneratedTrees_mg1669__11 = results.updateModified();
        Assert.assertEquals("Created 6 node trees", String_105);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertTrue(o_testGeneratedTrees_mg1669_add2063__11);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1668_mg2155() throws DataNotFoundException {
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_103 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_103);
        boolean boolean_104 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        boolean o_testGeneratedTrees_mg1668_mg2155__16 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1668_mg2155__16);
        Assert.assertEquals("Created 6 node trees", String_103);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2611() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_973 = false;
        boolean __DSPOT_modifiedOnly_972 = true;
        String __DSPOT_newName_971 = "tWaN]1#_/Z6V(e_`ver$";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        DataNode o_testGeneratedTrees_mg1658_mg2611__18 = gen.cloneNode(__DSPOT_newName_971, __DSPOT_modifiedOnly_972, __DSPOT_keepMeta_973);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2611__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1662_mg2477() throws DataNotFoundException {
        int __DSPOT_index_836 = -1754475622;
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_91 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_91);
        boolean boolean_92 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1662__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        DataNode o_testGeneratedTrees_mg1662_mg2477__18 = gen.getChildNode(__DSPOT_index_836);
        Assert.assertNull(o_testGeneratedTrees_mg1662_mg2477__18);
        Assert.assertEquals("Created 6 node trees", String_91);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1981_failAssert0() throws DataNotFoundException {
        try {
            boolean __DSPOT_keepMeta_276 = false;
            boolean __DSPOT_modifiedOnly_275 = true;
            String __DSPOT_newName_274 = "u:@HO_%+{nL<R8e$Z$XU";
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg1676__12.cloneNode(__DSPOT_newName_274, __DSPOT_modifiedOnly_275, __DSPOT_keepMeta_276);
            org.junit.Assert.fail("testGeneratedTrees_mg1676_mg1981 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_mg2723() throws DataNotFoundException {
        Object __DSPOT_val_1112 = new Object();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_add1687_mg2723__16 = o_testGeneratedTrees_add1687__8.equalsValue(__DSPOT_val_1112);
        Assert.assertFalse(o_testGeneratedTrees_add1687_mg2723__16);
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2790() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        o_testGeneratedTrees_add1687__8.getHandle();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2577() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_932 = new DataPredicate();
        String __DSPOT_nodeName_931 = "w9*z5l,qyAJAl |U$GDu";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        List<DataNode> o_testGeneratedTrees_mg1658_mg2577__18 = results.getChildNodes(__DSPOT_nodeName_931, __DSPOT_predicate_932);
        Assert.assertTrue(o_testGeneratedTrees_mg1658_mg2577__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1669_add2061() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_105 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_105);
        boolean boolean_106 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_mg1669_add2061__8 = gen.getValueNode("senderName");
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).getName());
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1669__11 = results.updateModified();
        Assert.assertEquals("Created 6 node trees", String_105);
        Assert.assertTrue(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).isValid());
        Assert.assertEquals("TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getString());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getMetaNode());
        Assert.assertNull(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getMetaItem());
        Assert.assertEquals("senderName=TemplateTest", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).toString());
        Assert.assertFalse(((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).isModified());
        Assert.assertEquals("senderName", ((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getName());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("senderName", ((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).isModified());
        Assert.assertEquals("senderName", ((DataNode) (((DataHandle) (((DataValueNode) (o_testGeneratedTrees_mg1669_add2061__8)).getHandle())).getNode())).getName());
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1661_mg1860() throws DataNotFoundException {
        String __DSPOT_name_150 = "yHGP}8hoa-J!Pzx|999)";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_89 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_89);
        boolean boolean_90 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1661__12 = results.getChildNode(__DSPOT_index_5);
        DataValueNode o_testGeneratedTrees_mg1661_mg1860__16 = gen.getValueNode(__DSPOT_name_150);
        Assert.assertNull(o_testGeneratedTrees_mg1661_mg1860__16);
        Assert.assertEquals("Created 6 node trees", String_89);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2130() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_add1684_mg2130__14 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_add1684_mg2130__14)));
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_mg2096() throws DataNotFoundException {
        String __DSPOT_path_409 = "TO@{^){:[Z2p$uCZw%-9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_add1684_mg2096__15 = results.getNodes(__DSPOT_path_409);
        Assert.assertTrue(o_testGeneratedTrees_add1684_mg2096__15.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1676_mg1961_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_119 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_120 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1676__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg1676__12.childNodes();
            org.junit.Assert.fail("testGeneratedTrees_mg1676_mg1961 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2811() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        o_testGeneratedTrees_mg1659__14.isValid();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2784() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        o_testGeneratedTrees_add1687__8.getHandle();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2546() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_913 = new DataPredicate(" Q@aA;4`PN SVD6SI7Q;");
        String __DSPOT_name_912 = "$iQ??%H+@uXorWb*)e4$";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        gen.removeNodes(__DSPOT_name_912, __DSPOT_predicate_913);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2813() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        o_testGeneratedTrees_mg1659__14.getMetaNode();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2545() throws DataNotFoundException {
        String __DSPOT_name_911 = "p(0/_3,|P^W2Z,2Q5iPv";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        DataValueNode o_testGeneratedTrees_mg1679_mg2545__16 = gen.getValueNode(__DSPOT_name_911);
        Assert.assertNull(o_testGeneratedTrees_mg1679_mg2545__16);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1666_mg1819() throws DataNotFoundException {
        boolean __DSPOT_internal_96 = false;
        DataPredicate __DSPOT_pred_93 = new DataPredicate();
        String __DSPOT_name_92 = "=8vR<d0e1pA]!!p]q;a7";
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_99 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_99);
        boolean boolean_100 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1666__12 = results.getValueNode(__DSPOT_name_12);
        results.removeNodes(__DSPOT_name_92, __DSPOT_pred_93, __DSPOT_internal_96);
        Assert.assertEquals("Created 6 node trees", String_99);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1664_mg1850() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_136 = new DataPredicate("9r^9e<Un((j*-vj<@X]Y");
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_95 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_95);
        boolean boolean_96 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1664__12 = results.getNodes(__DSPOT_path_9);
        boolean o_testGeneratedTrees_mg1664_mg1850__17 = gen.contains(__DSPOT_predicate_136);
        Assert.assertFalse(o_testGeneratedTrees_mg1664_mg1850__17);
        Assert.assertEquals("Created 6 node trees", String_95);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1674_mg2403() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_735 = new DataPredicate("2V4IUwH&s&#%ae|.*yUM");
        String __DSPOT_nodeName_734 = "j #[2aWeFEQeo<NQ)e+W";
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_115 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_115);
        boolean boolean_116 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1674__12 = gen.getChildNode(__DSPOT_index_23);
        List<DataNode> o_testGeneratedTrees_mg1674_mg2403__18 = results.getChildNodes(__DSPOT_nodeName_734, __DSPOT_predicate_735);
        Assert.assertTrue(o_testGeneratedTrees_mg1674_mg2403__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_115);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_add2235() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataNode o_testGeneratedTrees_add1684_add2235__9 = results.getChildNode(0);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getMetaNode());
        Assert.assertEquals("r[5]", ((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).toString());
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).isModified());
        Assert.assertEquals("r", ((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("r", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).getMetaNode());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).isModified());
        Assert.assertEquals("r", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).getName());
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_135);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getMetaNode());
        Assert.assertEquals("r[5]", ((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).toString());
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).isModified());
        Assert.assertEquals("r", ((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("r", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).getMetaNode());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).isModified());
        Assert.assertEquals("r", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_add1684_add2235__9)).getHandle())).getNode())).getName());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1684_add2236() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        int o_testGeneratedTrees_add1684__3 = results.childNodes();
        String String_135 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_135);
        boolean boolean_136 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        gen.getValueNode("senderName").getString();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_135);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1673_mg2227() throws DataNotFoundException {
        int __DSPOT_index_539 = 1034109973;
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_113 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_113);
        boolean boolean_114 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg1673__13 = gen.contains(__DSPOT_predicate_22);
        DataNode o_testGeneratedTrees_mg1673_mg2227__17 = results.getChildNode(__DSPOT_index_539);
        Assert.assertNull(o_testGeneratedTrees_mg1673_mg2227__17);
        Assert.assertEquals("Created 6 node trees", String_113);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1683_add2393() throws DataNotFoundException {
        TemplateTest.dataHandle.getNode();
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_133 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_133);
        boolean boolean_134 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_133);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1668_mg1977() throws DataNotFoundException {
        DataValueNode __DSPOT_item_269 = new DataValueNode(";x4GTC}l]qvelpPW`h79");
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_103 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_103);
        boolean boolean_104 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        boolean o_testGeneratedTrees_mg1668_mg1977__18 = __DSPOT_pred_16.evaluate(__DSPOT_item_269);
        Assert.assertFalse(o_testGeneratedTrees_mg1668_mg1977__18);
        Assert.assertEquals("Created 6 node trees", String_103);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670_mg1830() throws DataNotFoundException {
        String __DSPOT_path_108 = "?9U-1%h+1!kAF:15u&sd";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        List<DataNode> o_testGeneratedTrees_mg1670_mg1830__15 = results.getNodes(__DSPOT_path_108);
        Assert.assertTrue(o_testGeneratedTrees_mg1670_mg1830__15.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1663_mg2308_failAssert0() throws DataNotFoundException {
        try {
            boolean __DSPOT_keepMeta_650 = true;
            boolean __DSPOT_modifiedOnly_649 = true;
            String __DSPOT_newName_648 = "Jo1Ouksq %9=__2uK] f";
            String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_93 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_94 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg1663__12 = results.getGroupNode(__DSPOT_name_8);
            o_testGeneratedTrees_mg1663__12.cloneNode(__DSPOT_newName_648, __DSPOT_modifiedOnly_649, __DSPOT_keepMeta_650);
            org.junit.Assert.fail("testGeneratedTrees_mg1663_mg2308 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1668_mg2028() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_329 = new DataPredicate();
        String __DSPOT_nodeName_328 = "n7j)v@[9ZFe]3#C6HvQ{";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_103 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_103);
        boolean boolean_104 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        List<DataNode> o_testGeneratedTrees_mg1668_mg2028__19 = results.getChildNodes(__DSPOT_nodeName_328, __DSPOT_predicate_329);
        Assert.assertTrue(o_testGeneratedTrees_mg1668_mg2028__19.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_103);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_add2609() throws DataNotFoundException {
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        TemplateTest.dataHandle.getNode();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2600() throws DataNotFoundException {
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        int o_testGeneratedTrees_mg1658_mg2600__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg1658_mg2600__15)));
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1657_add2759() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_81 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_81);
        boolean boolean_82 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1657_add2759__11 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1657_add2759__11)));
        int o_testGeneratedTrees_mg1657__11 = results.childNodes();
        Assert.assertEquals("Created 6 node trees", String_81);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1657_add2759__11)));
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1658_mg2569() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_924 = true;
        boolean __DSPOT_modifiedOnly_923 = false;
        String __DSPOT_newName_922 = "1>,P:56Z0FD >RX?g`ZJ";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_83 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_83);
        boolean boolean_84 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1658__12 = results.childNodes(__DSPOT_nodeName_0);
        DataNode o_testGeneratedTrees_mg1658_mg2569__18 = results.cloneNode(__DSPOT_newName_922, __DSPOT_modifiedOnly_923, __DSPOT_keepMeta_924);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getMetaNode());
        Assert.assertEquals("1>,P:56Z0FD >RX?g`ZJ[6]", ((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).isModified());
        Assert.assertEquals("1>,P:56Z0FD >RX?g`ZJ", ((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("1>,P:56Z0FD >RX?g`ZJ", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("1>,P:56Z0FD >RX?g`ZJ", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1658_mg2569__18)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_83);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2780() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        o_testGeneratedTrees_add1687__8.isModified();
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        Assert.assertEquals("Created 6 node trees", String_141);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1675_add2326() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_117 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_117);
        int o_testGeneratedTrees_mg1675_add2326__7 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1675_add2326__7)));
        boolean boolean_118 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1675__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        Assert.assertEquals("Created 6 node trees", String_117);
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg1675_add2326__7)));
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2892() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        ((DataValueNode) (o_testGeneratedTrees_add1687__8)).getHandle().getNode().getMetaNode();
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2692() throws DataNotFoundException {
        DataPath __DSPOT_path_1065 = new DataPath("[p!A4Utb|zZLU]V5<AB.");
        List<DataNode> __DSPOT_result_1064 = Collections.<DataNode>emptyList();
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        gen.getNodes(__DSPOT_result_1064, __DSPOT_path_1065);
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1677_mg2693() throws DataNotFoundException {
        String __DSPOT_name_1068 = "umMF9!DvE.*km[ybCjCN";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_121 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_121);
        boolean boolean_122 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg1677__12 = gen.getNodes(__DSPOT_path_27);
        DataValueNode o_testGeneratedTrees_mg1677_mg2693__16 = gen.getValueNode(__DSPOT_name_1068);
        Assert.assertNull(o_testGeneratedTrees_mg1677_mg2693__16);
        Assert.assertEquals("Created 6 node trees", String_121);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_add1687_add2894() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_141 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_141);
        boolean boolean_142 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        DataValueNode o_testGeneratedTrees_add1687__8 = gen.getValueNode("senderName");
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        o_testGeneratedTrees_add1687__8.getHandle();
        Assert.assertEquals("Created 6 node trees", String_141);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2822() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        o_testGeneratedTrees_mg1659__14.getName();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_add2791() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672_add2791__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getMetaNode());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l[4]", ((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).getName());
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getMetaNode());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l[4]", ((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).isModified());
        Assert.assertEquals("chsEp#5_w)+KtmI6N*:l", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg1672_add2791__14)).getHandle())).getNode())).getName());
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1679_mg2532() throws DataNotFoundException {
        String __DSPOT_name_894 = "fD4k/M!l9.LBqOHo%[#e";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_125 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_125);
        boolean boolean_126 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg1679__12 = gen.getValueNode(__DSPOT_name_30);
        DataGroupNode o_testGeneratedTrees_mg1679_mg2532__16 = gen.getGroupNode(__DSPOT_name_894);
        Assert.assertNull(o_testGeneratedTrees_mg1679_mg2532__16);
        Assert.assertEquals("Created 6 node trees", String_125);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1659_add2828() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_3 = false;
        boolean __DSPOT_modifiedOnly_2 = true;
        String __DSPOT_newName_1 = ",y(q2 5[gpbL[{$QV5:W";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_85 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_85);
        boolean boolean_86 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1659__14 = results.cloneNode(__DSPOT_newName_1, __DSPOT_modifiedOnly_2, __DSPOT_keepMeta_3);
        o_testGeneratedTrees_mg1659__14.getHandle();
        Assert.assertEquals("Created 6 node trees", String_85);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1680_mg2338() throws DataNotFoundException {
        int __DSPOT_index_679 = 1857679689;
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_127 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_127);
        boolean boolean_128 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataNode o_testGeneratedTrees_mg1680_mg2338__16 = gen.getChildNode(__DSPOT_index_679);
        Assert.assertNull(o_testGeneratedTrees_mg1680_mg2338__16);
        Assert.assertEquals("Created 6 node trees", String_127);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1672_add2834() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_21 = false;
        boolean __DSPOT_modifiedOnly_20 = true;
        String __DSPOT_newName_19 = "chsEp#5_w)+KtmI6N*:l";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_111 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_111);
        boolean boolean_112 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg1672__14 = gen.cloneNode(__DSPOT_newName_19, __DSPOT_modifiedOnly_20, __DSPOT_keepMeta_21);
        ((DataGroupNode) (o_testGeneratedTrees_mg1672__14)).getHandle().getNode();
        Assert.assertEquals("Created 6 node trees", String_111);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1670_mg1827() throws DataNotFoundException {
        String __DSPOT_name_104 = "U!$Cz2lvLY3Pe#L360:}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_107 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_107);
        boolean boolean_108 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1670__11 = gen.childNodes();
        DataGroupNode o_testGeneratedTrees_mg1670_mg1827__15 = results.getGroupNode(__DSPOT_name_104);
        Assert.assertNull(o_testGeneratedTrees_mg1670_mg1827__15);
        Assert.assertEquals("Created 6 node trees", String_107);
        Assert.assertEquals("TemplateTest", name);
    }
}

