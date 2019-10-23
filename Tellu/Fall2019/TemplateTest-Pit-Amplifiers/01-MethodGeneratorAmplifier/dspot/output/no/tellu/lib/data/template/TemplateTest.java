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
    public void testGeneratedTrees_mg14_mg693() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_822 = true;
        boolean __DSPOT_modifiedOnly_821 = true;
        String __DSPOT_newName_820 = "!a6!=8Q!& c:K)9aeY@>";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_39 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_39);
        boolean boolean_40 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg14__11 = gen.childNodes();
        DataNode o_testGeneratedTrees_mg14_mg693__17 = gen.cloneNode(__DSPOT_newName_820, __DSPOT_modifiedOnly_821, __DSPOT_keepMeta_822);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getMetaNode());
        Assert.assertEquals("!a6!=8Q!& c:K)9aeY@>[4]", ((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).isModified());
        Assert.assertEquals("!a6!=8Q!& c:K)9aeY@>", ((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("!a6!=8Q!& c:K)9aeY@>", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("!a6!=8Q!& c:K)9aeY@>", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg14_mg693__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_39);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg243() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_221 = true;
        boolean __DSPOT_modifiedOnly_219 = false;
        String __DSPOT_newName_218 = "$PB^QAT?>YN{q48ErJ,Q";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        DataNode o_testGeneratedTrees_mg23_mg243__18 = gen.cloneNode(__DSPOT_newName_218, __DSPOT_modifiedOnly_219, __DSPOT_keepMeta_221);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getMetaNode());
        Assert.assertEquals("$PB^QAT?>YN{q48ErJ,Q[5]", ((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).isModified());
        Assert.assertEquals("$PB^QAT?>YN{q48ErJ,Q", ((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("$PB^QAT?>YN{q48ErJ,Q", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("$PB^QAT?>YN{q48ErJ,Q", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg23_mg243__18)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg489() throws DataNotFoundException {
        int __DSPOT_index_543 = 121711217;
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        DataNode o_testGeneratedTrees_mg5_mg489__16 = gen.getChildNode(__DSPOT_index_543);
        Assert.assertNull(o_testGeneratedTrees_mg5_mg489__16);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg519() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_584 = new DataPredicate();
        String __DSPOT_nodeName_582 = "[?;Ytm)DCeu_0C{UuxT4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        List<DataNode> o_testGeneratedTrees_mg26_mg519__17 = gen.getChildNodes(__DSPOT_nodeName_582, __DSPOT_predicate_584);
        Assert.assertTrue(o_testGeneratedTrees_mg26_mg519__17.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg528() throws DataNotFoundException {
        String __DSPOT_name_600 = "{WfY|n}KRY;#EivvST}!";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        DataGroupNode o_testGeneratedTrees_mg5_mg528__16 = gen.getGroupNode(__DSPOT_name_600);
        Assert.assertNull(o_testGeneratedTrees_mg5_mg528__16);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg325() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        boolean o_testGeneratedTrees_mg17_mg325__16 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg17_mg325__16);
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg320_failAssert0() throws DataNotFoundException {
        try {
            double __DSPOT_defaultVal_323 = 0.4458303854540132;
            String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
            o_testGeneratedTrees_mg23__12.getDouble(__DSPOT_defaultVal_323);
            org.junit.Assert.fail("testGeneratedTrees_mg23_mg320 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1_mg727() throws DataNotFoundException {
        String __DSPOT_path_866 = "= wxrA(AH*H9j%[.mW=M";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_13 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_13);
        boolean boolean_14 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1__11 = results.childNodes();
        List<DataNode> o_testGeneratedTrees_mg1_mg727__15 = gen.getNodes(__DSPOT_path_866);
        Assert.assertTrue(o_testGeneratedTrees_mg1_mg727__15.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_13);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg372() throws DataNotFoundException {
        String __DSPOT_name_385 = "fdnZ%N=7nS@6]I%^8X`v";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        DataGroupNode o_testGeneratedTrees_mg20_mg372__16 = results.getGroupNode(__DSPOT_name_385);
        Assert.assertNull(o_testGeneratedTrees_mg20_mg372__16);
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg18_mg654() throws DataNotFoundException {
        String __DSPOT_name_779 = "#sRrjByv5%*Y1Ic(d,v{";
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_47 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_47);
        boolean boolean_48 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg18__12 = gen.getChildNode(__DSPOT_index_23);
        DataValueNode o_testGeneratedTrees_mg18_mg654__16 = results.getValueNode(__DSPOT_name_779);
        Assert.assertNull(o_testGeneratedTrees_mg18_mg654__16);
        Assert.assertEquals("Created 6 node trees", String_47);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg175() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        boolean o_testGeneratedTrees_mg17_mg175__16 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg17_mg175__16);
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg481() throws DataNotFoundException {
        String __DSPOT_path_534 = "cU!?9vzu6I[ x_Cpw[KK";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        List<DataNode> o_testGeneratedTrees_mg26_mg481__15 = results.getNodes(__DSPOT_path_534);
        Assert.assertTrue(o_testGeneratedTrees_mg26_mg481__15.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg344() throws DataNotFoundException {
        String __DSPOT_nodeName_351 = "($<9$T4bXzesi<&g-WNb";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        int o_testGeneratedTrees_mg19_mg344__18 = results.childNodes(__DSPOT_nodeName_351);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg19_mg344__18)));
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg653() throws DataNotFoundException {
        int __DSPOT_index_763 = -1573072915;
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        DataNode o_testGeneratedTrees_mg15_mg653__16 = results.getChildNode(__DSPOT_index_763);
        Assert.assertNull(o_testGeneratedTrees_mg15_mg653__16);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg553() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_629 = false;
        boolean __DSPOT_modifiedOnly_627 = false;
        String __DSPOT_newName_625 = "ivken h`Q:$%FqIeSLTE";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        DataNode o_testGeneratedTrees_mg25_mg553__19 = results.cloneNode(__DSPOT_newName_625, __DSPOT_modifiedOnly_627, __DSPOT_keepMeta_629);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getMetaNode());
        Assert.assertEquals("ivken h`Q:$%FqIeSLTE[6]", ((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).isModified());
        Assert.assertEquals("ivken h`Q:$%FqIeSLTE", ((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("ivken h`Q:$%FqIeSLTE", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("ivken h`Q:$%FqIeSLTE", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg553__19)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg197() throws DataNotFoundException {
        int __DSPOT_index_158 = 116830369;
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        DataNode o_testGeneratedTrees_mg8_mg197__16 = gen.getChildNode(__DSPOT_index_158);
        Assert.assertNull(o_testGeneratedTrees_mg8_mg197__16);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg231() throws DataNotFoundException {
        String __DSPOT_name_203 = "S>>6Om:]zsR!qjgSF<3#";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        DataValueNode o_testGeneratedTrees_mg8_mg231__16 = gen.getValueNode(__DSPOT_name_203);
        Assert.assertNull(o_testGeneratedTrees_mg8_mg231__16);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg323() throws DataNotFoundException {
        boolean __DSPOT_internal_329 = true;
        DataPredicate __DSPOT_pred_327 = new DataPredicate();
        String __DSPOT_name_326 = "1$]n_{`I_IHk}gtiFW>G";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        results.removeNodes(__DSPOT_name_326, __DSPOT_pred_327, __DSPOT_internal_329);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg209() throws DataNotFoundException {
        String __DSPOT_nodeName_173 = "S ]x;K>tB$@7*v3E3{w[";
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        int o_testGeneratedTrees_mg4_mg209__17 = gen.childNodes(__DSPOT_nodeName_173);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg4_mg209__17)));
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg21_mg109() throws DataNotFoundException {
        String __DSPOT_nodeName_38 = "*&z*$G`c:wkJ!][,J^uy";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_53 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_53);
        boolean boolean_54 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg21__12 = gen.getNodes(__DSPOT_path_27);
        int o_testGeneratedTrees_mg21_mg109__16 = results.childNodes(__DSPOT_nodeName_38);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg21_mg109__16)));
        Assert.assertEquals("Created 6 node trees", String_53);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg290() throws DataNotFoundException {
        int __DSPOT_index_286 = -914462158;
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        DataNode o_testGeneratedTrees_mg6_mg290__18 = results.getChildNode(__DSPOT_index_286);
        Assert.assertNull(o_testGeneratedTrees_mg6_mg290__18);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg482() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_536 = new DataPredicate(".%h46! !iC)CcF+znA$Z");
        String __DSPOT_nodeName_535 = "IRaR1JHw:7h`I?]oGd[&";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        List<DataNode> o_testGeneratedTrees_mg19_mg482__20 = gen.getChildNodes(__DSPOT_nodeName_535, __DSPOT_predicate_536);
        Assert.assertTrue(o_testGeneratedTrees_mg19_mg482__20.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg472() throws DataNotFoundException {
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        int o_testGeneratedTrees_mg5_mg472__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg5_mg472__15)));
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg568() throws DataNotFoundException {
        String __DSPOT_path_648 = ">#|a:*>:U((ErQNzaj2&";
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_25);
        boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
        List<DataNode> o_testGeneratedTrees_mg7_mg568__16 = gen.getNodes(__DSPOT_path_648);
        Assert.assertTrue(o_testGeneratedTrees_mg7_mg568__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_25);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1_mg716() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_850 = new DataPredicate("TF;K^aA[n|M]WL!pi%TT");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_13 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_13);
        boolean boolean_14 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1__11 = results.childNodes();
        boolean o_testGeneratedTrees_mg1_mg716__16 = gen.contains(__DSPOT_predicate_850);
        Assert.assertFalse(o_testGeneratedTrees_mg1_mg716__16);
        Assert.assertEquals("Created 6 node trees", String_13);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg669() throws DataNotFoundException {
        String __DSPOT_name_785 = "1nv(*4Grb2{]m,=py20F";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        DataValueNode o_testGeneratedTrees_mg2_mg669__16 = results.getValueNode(__DSPOT_name_785);
        Assert.assertNull(o_testGeneratedTrees_mg2_mg669__16);
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1_mg719() throws DataNotFoundException {
        int __DSPOT_index_855 = -1045828786;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_13 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_13);
        boolean boolean_14 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1__11 = results.childNodes();
        DataNode o_testGeneratedTrees_mg1_mg719__15 = gen.getChildNode(__DSPOT_index_855);
        Assert.assertNull(o_testGeneratedTrees_mg1_mg719__15);
        Assert.assertEquals("Created 6 node trees", String_13);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg18_mg649() throws DataNotFoundException {
        DataPath __DSPOT_path_757 = new DataPath("]dwNBy:Ms[=p>Qb1b?2V");
        List<DataNode> __DSPOT_result_756 = Collections.<DataNode>emptyList();
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_47 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_47);
        boolean boolean_48 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg18__12 = gen.getChildNode(__DSPOT_index_23);
        results.getNodes(__DSPOT_result_756, __DSPOT_path_757);
        Assert.assertEquals("Created 6 node trees", String_47);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg591_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_nodeName_678 = "|*X-4nz#):y(3&F<lyKf";
            String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
            o_testGeneratedTrees_mg7__12.childNodes(__DSPOT_nodeName_678);
            org.junit.Assert.fail("testGeneratedTrees_mg7_mg591 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg453() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_493 = new DataPredicate();
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        boolean o_testGeneratedTrees_mg11_mg453__17 = gen.contains(__DSPOT_predicate_493);
        Assert.assertFalse(o_testGeneratedTrees_mg11_mg453__17);
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg368() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_380 = new DataPredicate("ma)Zp`f_]Wh$_8K%!{;g");
        String __DSPOT_nodeName_378 = "F5:6[z{Ik(wF7S!6:zj%";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        List<DataNode> o_testGeneratedTrees_mg20_mg368__18 = results.getChildNodes(__DSPOT_nodeName_378, __DSPOT_predicate_380);
        Assert.assertTrue(o_testGeneratedTrees_mg20_mg368__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg490() throws DataNotFoundException {
        String __DSPOT_name_544 = "6r`Yq@^:zAh$EhroKO.7";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        DataValueNode o_testGeneratedTrees_mg26_mg490__15 = results.getValueNode(__DSPOT_name_544);
        Assert.assertNull(o_testGeneratedTrees_mg26_mg490__15);
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg394() throws DataNotFoundException {
        int __DSPOT_index_415 = 811467088;
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataNode o_testGeneratedTrees_mg24_mg394__16 = gen.getChildNode(__DSPOT_index_415);
        Assert.assertNull(o_testGeneratedTrees_mg24_mg394__16);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg647() throws DataNotFoundException {
        String __DSPOT_name_755 = "`Wu>j,IDqqziB]*K[_TJ";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        DataValueNode o_testGeneratedTrees_mg25_mg647__17 = gen.getValueNode(__DSPOT_name_755);
        Assert.assertNull(o_testGeneratedTrees_mg25_mg647__17);
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg397() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_419 = new DataPredicate("F|k#yzb011,aR/,/%cT(");
        String __DSPOT_nodeName_418 = "7BI]Rw}{*r:hZ=ZTOAJL";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        List<DataNode> o_testGeneratedTrees_mg24_mg397__18 = gen.getChildNodes(__DSPOT_nodeName_418, __DSPOT_predicate_419);
        Assert.assertTrue(o_testGeneratedTrees_mg24_mg397__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg570_failAssert0() throws DataNotFoundException {
        try {
            DataPredicate __DSPOT_predicate_654 = new DataPredicate("LsTv2!:d9e$lX2:BB[^R");
            String __DSPOT_name_653 = "1%R13S(GMZ?1&*1vG5s7";
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg20__12.removeNodes(__DSPOT_name_653, __DSPOT_predicate_654);
            org.junit.Assert.fail("testGeneratedTrees_mg20_mg570 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg469() throws DataNotFoundException {
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        boolean o_testGeneratedTrees_mg5_mg469__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg5_mg469__15);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg630() throws DataNotFoundException {
        String __DSPOT_name_735 = "(:$J<bt8h9|<[JgaRsk}";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        DataGroupNode o_testGeneratedTrees_mg2_mg630__16 = results.getGroupNode(__DSPOT_name_735);
        Assert.assertNull(o_testGeneratedTrees_mg2_mg630__16);
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg286() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_273 = new DataPredicate();
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        boolean o_testGeneratedTrees_mg6_mg286__19 = results.contains(__DSPOT_predicate_273);
        Assert.assertFalse(o_testGeneratedTrees_mg6_mg286__19);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg134() throws DataNotFoundException {
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        int o_testGeneratedTrees_mg12_mg134__16 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg12_mg134__16)));
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg581() throws DataNotFoundException {
        boolean __DSPOT_internal_673 = true;
        DataPredicate __DSPOT_pred_669 = new DataPredicate("Za_=(n+lTbV|h.|Jj6/;");
        String __DSPOT_name_668 = "QQ::PII6>^A[1A>b:Izf";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        gen.removeNodes(__DSPOT_name_668, __DSPOT_pred_669, __DSPOT_internal_673);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg137() throws DataNotFoundException {
        String __DSPOT_nodeName_70 = "+7]6k!Ld8U4ryn<3,/?b";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        int o_testGeneratedTrees_mg12_mg137__17 = results.childNodes(__DSPOT_nodeName_70);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg12_mg137__17)));
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg575_failAssert0() throws DataNotFoundException {
        try {
            boolean __DSPOT_internal_662 = true;
            DataPredicate __DSPOT_pred_660 = new DataPredicate("]GT35i&DZ7w6;tz]*L)]");
            String __DSPOT_name_659 = "fk&zdUA}ta^p[a+9MOHI";
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg20__12.removeNodes(__DSPOT_name_659, __DSPOT_pred_660, __DSPOT_internal_662);
            org.junit.Assert.fail("testGeneratedTrees_mg20_mg575 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg363() throws DataNotFoundException {
        int __DSPOT_index_372 = -1604185582;
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        DataNode o_testGeneratedTrees_mg19_mg363__18 = results.getChildNode(__DSPOT_index_372);
        Assert.assertNull(o_testGeneratedTrees_mg19_mg363__18);
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg430() throws DataNotFoundException {
        int __DSPOT_index_465 = -241204095;
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        DataNode o_testGeneratedTrees_mg10_mg430__16 = gen.getChildNode(__DSPOT_index_465);
        Assert.assertNull(o_testGeneratedTrees_mg10_mg430__16);
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg461() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_509 = false;
        boolean __DSPOT_modifiedOnly_508 = false;
        String __DSPOT_newName_507 = "WJcvvu8(PmRfYf}^NJMq";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        DataNode o_testGeneratedTrees_mg26_mg461__17 = results.cloneNode(__DSPOT_newName_507, __DSPOT_modifiedOnly_508, __DSPOT_keepMeta_509);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getMetaNode());
        Assert.assertEquals("WJcvvu8(PmRfYf}^NJMq[6]", ((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).isModified());
        Assert.assertEquals("WJcvvu8(PmRfYf}^NJMq", ((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("WJcvvu8(PmRfYf}^NJMq", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("WJcvvu8(PmRfYf}^NJMq", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg461__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg308() throws DataNotFoundException {
        String __DSPOT_name_306 = "CFmTeGhyCnQJS`<Loz}G";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataValueNode o_testGeneratedTrees_mg24_mg308__16 = results.getValueNode(__DSPOT_name_306);
        Assert.assertNull(o_testGeneratedTrees_mg24_mg308__16);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg441() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        int o_testGeneratedTrees_mg11_mg441__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg11_mg441__15)));
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg264() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_247 = false;
        boolean __DSPOT_modifiedOnly_246 = false;
        String __DSPOT_newName_245 = "@E)[! br=.&jaX`XSWVx";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataNode o_testGeneratedTrees_mg24_mg264__18 = results.cloneNode(__DSPOT_newName_245, __DSPOT_modifiedOnly_246, __DSPOT_keepMeta_247);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getMetaNode());
        Assert.assertEquals("@E)[! br=.&jaX`XSWVx[6]", ((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).isModified());
        Assert.assertEquals("@E)[! br=.&jaX`XSWVx", ((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("@E)[! br=.&jaX`XSWVx", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("@E)[! br=.&jaX`XSWVx", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg264__18)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg225() throws DataNotFoundException {
        String __DSPOT_name_196 = "f^6j9]=|URllB^!%Y]_E";
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        DataGroupNode o_testGeneratedTrees_mg4_mg225__17 = gen.getGroupNode(__DSPOT_name_196);
        Assert.assertNull(o_testGeneratedTrees_mg4_mg225__17);
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg334() throws DataNotFoundException {
        String __DSPOT_name_337 = "o#YMTVY|Pp&%v[;&Lr&A";
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        DataGroupNode o_testGeneratedTrees_mg10_mg334__16 = results.getGroupNode(__DSPOT_name_337);
        Assert.assertNull(o_testGeneratedTrees_mg10_mg334__16);
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg253() throws DataNotFoundException {
        boolean __DSPOT_internal_238 = false;
        DataPredicate __DSPOT_pred_236 = new DataPredicate();
        String __DSPOT_name_235 = "swlSSUhwIbR]FMwAeMp&";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        gen.removeNodes(__DSPOT_name_235, __DSPOT_pred_236, __DSPOT_internal_238);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg427() throws DataNotFoundException {
        boolean __DSPOT_internal_466 = false;
        DataPredicate __DSPOT_pred_462 = new DataPredicate();
        String __DSPOT_name_461 = "[&L]p+q/>@OskRx;om6_";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        results.removeNodes(__DSPOT_name_461, __DSPOT_pred_462, __DSPOT_internal_466);
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg300() throws DataNotFoundException {
        String __DSPOT_path_296 = "Cj=]n>[?;&I(mnT.nK7w";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        List<DataNode> o_testGeneratedTrees_mg24_mg300__16 = results.getNodes(__DSPOT_path_296);
        Assert.assertTrue(o_testGeneratedTrees_mg24_mg300__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg636() throws DataNotFoundException {
        String __DSPOT_name_740 = "*UqRk7ptvG6)&A,Cxip|";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        DataGroupNode o_testGeneratedTrees_mg25_mg636__17 = gen.getGroupNode(__DSPOT_name_740);
        Assert.assertNull(o_testGeneratedTrees_mg25_mg636__17);
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg470_failAssert0() throws DataNotFoundException {
        try {
            Object __DSPOT_val_521 = new Object();
            String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
            o_testGeneratedTrees_mg10__12.equalsValue(__DSPOT_val_521);
            org.junit.Assert.fail("testGeneratedTrees_mg10_mg470 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg266() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_249 = new DataPredicate("cUT#UgA#<? kg{GqMXy_");
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        boolean o_testGeneratedTrees_mg24_mg266__17 = results.contains(__DSPOT_predicate_249);
        Assert.assertFalse(o_testGeneratedTrees_mg24_mg266__17);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg297() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_292 = new DataPredicate("T7=5zOkK&a$)LIMmqw=M");
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        boolean o_testGeneratedTrees_mg10_mg297__17 = results.contains(__DSPOT_predicate_292);
        Assert.assertFalse(o_testGeneratedTrees_mg10_mg297__17);
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg508() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_568 = false;
        boolean __DSPOT_modifiedOnly_567 = true;
        String __DSPOT_newName_566 = "hA8(Z(aR?[cHzh!p{NoC";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        DataNode o_testGeneratedTrees_mg26_mg508__17 = gen.cloneNode(__DSPOT_newName_566, __DSPOT_modifiedOnly_567, __DSPOT_keepMeta_568);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getMetaNode());
        Assert.assertEquals("hA8(Z(aR?[cHzh!p{NoC[4]", ((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).isModified());
        Assert.assertEquals("hA8(Z(aR?[cHzh!p{NoC", ((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("hA8(Z(aR?[cHzh!p{NoC", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).getNode())).isModified());
        Assert.assertEquals("hA8(Z(aR?[cHzh!p{NoC", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg26_mg508__17)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg139() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_75 = true;
        boolean __DSPOT_modifiedOnly_73 = false;
        String __DSPOT_newName_72 = "T&5+;N4Sb)kE+#PmjF|_";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        DataNode o_testGeneratedTrees_mg12_mg139__19 = results.cloneNode(__DSPOT_newName_72, __DSPOT_modifiedOnly_73, __DSPOT_keepMeta_75);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getMetaNode());
        Assert.assertEquals("T&5+;N4Sb)kE+#PmjF|_[6]", ((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).isModified());
        Assert.assertEquals("T&5+;N4Sb)kE+#PmjF|_", ((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("T&5+;N4Sb)kE+#PmjF|_", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("T&5+;N4Sb)kE+#PmjF|_", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg139__19)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg545() throws DataNotFoundException {
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_25);
        boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
        int o_testGeneratedTrees_mg7_mg545__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg7_mg545__15)));
        Assert.assertEquals("Created 6 node trees", String_25);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg416() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        int o_testGeneratedTrees_mg19_mg416__17 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg19_mg416__17)));
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg148() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_90 = new DataPredicate();
        String __DSPOT_nodeName_89 = "FZw!EI)uhDiCMs-NCPSN";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        List<DataNode> o_testGeneratedTrees_mg12_mg148__19 = results.getChildNodes(__DSPOT_nodeName_89, __DSPOT_predicate_90);
        Assert.assertTrue(o_testGeneratedTrees_mg12_mg148__19.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg390() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_408 = true;
        boolean __DSPOT_modifiedOnly_407 = false;
        String __DSPOT_newName_406 = "G0ev !-3SN*sw)`v}zN/";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        DataNode o_testGeneratedTrees_mg11_mg390__18 = results.cloneNode(__DSPOT_newName_406, __DSPOT_modifiedOnly_407, __DSPOT_keepMeta_408);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg11_mg390__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg258() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        int o_testGeneratedTrees_mg24_mg258__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg24_mg258__15)));
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg443() throws DataNotFoundException {
        DataPath __DSPOT_path_481 = new DataPath("=(1.&KgzF{f-R,!*%vs_");
        List<DataNode> __DSPOT_result_480 = Collections.<DataNode>emptyList();
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        gen.getNodes(__DSPOT_result_480, __DSPOT_path_481);
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg418() throws DataNotFoundException {
        boolean __DSPOT_internal_449 = false;
        DataPredicate __DSPOT_pred_448 = new DataPredicate("Xw[zx>weSco;ly|yz)r_");
        String __DSPOT_name_447 = "Gw_1nfNsEocWj+V2ku8d";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        gen.removeNodes(__DSPOT_name_447, __DSPOT_pred_448, __DSPOT_internal_449);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg377() throws DataNotFoundException {
        String __DSPOT_path_391 = "h+}LLuBuAr^pT%vt_F}H";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        List<DataNode> o_testGeneratedTrees_mg19_mg377__18 = results.getNodes(__DSPOT_path_391);
        Assert.assertTrue(o_testGeneratedTrees_mg19_mg377__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg741() throws DataNotFoundException {
        DataPath __DSPOT_path_890 = new DataPath("{b_{git%Dk#2(W^K.W&|");
        List<DataNode> __DSPOT_result_889 = Collections.<DataNode>emptyList();
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        gen.getNodes(__DSPOT_result_889, __DSPOT_path_890);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg136() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_68 = new DataPredicate("!ElJH!D*A3(%|?=4=uV!");
        String __DSPOT_nodeName_67 = "w]f4QDhB+ _ 2&pb?56T";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        List<DataNode> o_testGeneratedTrees_mg8_mg136__18 = results.getChildNodes(__DSPOT_nodeName_67, __DSPOT_predicate_68);
        Assert.assertTrue(o_testGeneratedTrees_mg8_mg136__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg621() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_724 = false;
        boolean __DSPOT_modifiedOnly_723 = false;
        String __DSPOT_newName_721 = "LF=w#glE&[M /iPX==JK";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        DataNode o_testGeneratedTrees_mg25_mg621__19 = gen.cloneNode(__DSPOT_newName_721, __DSPOT_modifiedOnly_723, __DSPOT_keepMeta_724);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg25_mg621__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg449() throws DataNotFoundException {
        String __DSPOT_name_490 = "e#(&QN9/*41o}!0Wn<6(";
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        DataValueNode o_testGeneratedTrees_mg10_mg449__16 = gen.getValueNode(__DSPOT_name_490);
        Assert.assertNull(o_testGeneratedTrees_mg10_mg449__16);
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg625() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_729 = new DataPredicate();
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        boolean o_testGeneratedTrees_mg25_mg625__18 = gen.contains(__DSPOT_predicate_729);
        Assert.assertFalse(o_testGeneratedTrees_mg25_mg625__18);
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg254() throws DataNotFoundException {
        DataValueNode __DSPOT_item_234 = new DataValueNode(new no.tellu.lib.data.MetaItemNode("(710U8Xh}`e!,3/H!B>(", new Object()));
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        boolean o_testGeneratedTrees_mg24_mg254__19 = __DSPOT_predicate_32.evaluate(__DSPOT_item_234);
        Assert.assertFalse(o_testGeneratedTrees_mg24_mg254__19);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg282() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        int o_testGeneratedTrees_mg10_mg282__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg10_mg282__15)));
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg383() throws DataNotFoundException {
        int __DSPOT_index_395 = 1700382466;
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        DataNode o_testGeneratedTrees_mg6_mg383__18 = gen.getChildNode(__DSPOT_index_395);
        Assert.assertNull(o_testGeneratedTrees_mg6_mg383__18);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg262() throws DataNotFoundException {
        DataValueNode __DSPOT_item_244 = new DataValueNode(new no.tellu.lib.data.MetaItemNode("@ll+JCy` CpY ;@M@eFo", new Object(), 130276600));
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        boolean o_testGeneratedTrees_mg6_mg262__21 = __DSPOT_predicate_7.evaluate(__DSPOT_item_244);
        Assert.assertFalse(o_testGeneratedTrees_mg6_mg262__21);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg201() throws DataNotFoundException {
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        int o_testGeneratedTrees_mg23_mg201__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg23_mg201__15)));
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg247() throws DataNotFoundException {
        String __DSPOT_name_226 = "=C]SG#JnI[]y <3bSwN_";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        DataValueNode o_testGeneratedTrees_mg17_mg247__17 = gen.getValueNode(__DSPOT_name_226);
        Assert.assertNull(o_testGeneratedTrees_mg17_mg247__17);
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg546() throws DataNotFoundException {
        boolean __DSPOT_internal_641 = false;
        DataPredicate __DSPOT_pred_619 = new DataPredicate("ihQSC<[>#j:%:_<cBEu#");
        String __DSPOT_name_618 = ":z_V99#8)xY#sM*xAp!N";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        gen.removeNodes(__DSPOT_name_618, __DSPOT_pred_619, __DSPOT_internal_641);
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg738() throws DataNotFoundException {
        String __DSPOT_path_882 = "aM)|G-3]GYkhOdMM-,aC";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        List<DataNode> o_testGeneratedTrees_mg2_mg738__16 = gen.getNodes(__DSPOT_path_882);
        Assert.assertTrue(o_testGeneratedTrees_mg2_mg738__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg525_failAssert0() throws DataNotFoundException {
        try {
            DataPredicate __DSPOT_predicate_596 = new DataPredicate();
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg20__12.contains(__DSPOT_predicate_596);
            org.junit.Assert.fail("testGeneratedTrees_mg20_mg525 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg110() throws DataNotFoundException {
        DataValueNode __DSPOT_item_40 = new DataValueNode(new no.tellu.lib.data.MetaItemNode("{+DN-eV8<Or;(?xw0]W#", new Object()));
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        boolean o_testGeneratedTrees_mg12_mg110__20 = __DSPOT_pred_16.evaluate(__DSPOT_item_40);
        Assert.assertFalse(o_testGeneratedTrees_mg12_mg110__20);
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg450() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_492 = new DataPredicate();
        String __DSPOT_nodeName_491 = "!$8H_I=8-[lOV9/j.?.R";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        List<DataNode> o_testGeneratedTrees_mg20_mg450__18 = gen.getChildNodes(__DSPOT_nodeName_491, __DSPOT_predicate_492);
        Assert.assertTrue(o_testGeneratedTrees_mg20_mg450__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg423() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_454 = new DataPredicate();
        String __DSPOT_name_453 = "=y!WS5wfB xJ(KJ! U$I";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        results.removeNodes(__DSPOT_name_453, __DSPOT_predicate_454);
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg404() throws DataNotFoundException {
        String __DSPOT_path_429 = "MovI#I|mK8#fwjn]5N[9";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        List<DataNode> o_testGeneratedTrees_mg24_mg404__16 = gen.getNodes(__DSPOT_path_429);
        Assert.assertTrue(o_testGeneratedTrees_mg24_mg404__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg194() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_155 = false;
        boolean __DSPOT_modifiedOnly_154 = false;
        String __DSPOT_newName_153 = "A($d%nuEff!%1UO!ZP#i";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        DataNode o_testGeneratedTrees_mg12_mg194__19 = gen.cloneNode(__DSPOT_newName_153, __DSPOT_modifiedOnly_154, __DSPOT_keepMeta_155);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getMetaNode());
        Assert.assertEquals("A($d%nuEff!%1UO!ZP#i[5]", ((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).isModified());
        Assert.assertEquals("A($d%nuEff!%1UO!ZP#i", ((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("A($d%nuEff!%1UO!ZP#i", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).getNode())).isModified());
        Assert.assertEquals("A($d%nuEff!%1UO!ZP#i", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg12_mg194__19)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg401() throws DataNotFoundException {
        String __DSPOT_name_425 = "Ce#(-%(=hn!t{Aox=_<%";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataGroupNode o_testGeneratedTrees_mg24_mg401__16 = gen.getGroupNode(__DSPOT_name_425);
        Assert.assertNull(o_testGeneratedTrees_mg24_mg401__16);
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg195() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_157 = new DataPredicate("K)Mo+)A*O^;uS9b&r5!G");
        String __DSPOT_name_156 = "zdF)=3&}%hbH%0kY^9)l";
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        results.removeNodes(__DSPOT_name_156, __DSPOT_predicate_157);
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg521_failAssert0() throws DataNotFoundException {
        try {
            boolean __DSPOT_keepMeta_591 = true;
            boolean __DSPOT_modifiedOnly_590 = true;
            String __DSPOT_newName_589 = "sl+h};G,A7>Vph6e2^qv";
            String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
            o_testGeneratedTrees_mg20__12.cloneNode(__DSPOT_newName_589, __DSPOT_modifiedOnly_590, __DSPOT_keepMeta_591);
            org.junit.Assert.fail("testGeneratedTrees_mg20_mg521 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg319() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_322 = new DataPredicate("EY[)_ G^LKbsW.7mi$GM");
        String __DSPOT_nodeName_321 = "_<Q;W[2+S(=MtN|3}(#*";
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        List<DataNode> o_testGeneratedTrees_mg10_mg319__18 = results.getChildNodes(__DSPOT_nodeName_321, __DSPOT_predicate_322);
        Assert.assertTrue(o_testGeneratedTrees_mg10_mg319__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg699() throws DataNotFoundException {
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        boolean o_testGeneratedTrees_mg15_mg699__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg15_mg699__15);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg457() throws DataNotFoundException {
        String __DSPOT_path_501 = "+]oe[OWN&oC<#z{Mzy8=";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        List<DataNode> o_testGeneratedTrees_mg20_mg457__16 = gen.getNodes(__DSPOT_path_501);
        Assert.assertTrue(o_testGeneratedTrees_mg20_mg457__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg14_mg646() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_750 = new DataPredicate("_MjnEt$Y7L^j(%?$[,`t");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_39 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_39);
        boolean boolean_40 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg14__11 = gen.childNodes();
        boolean o_testGeneratedTrees_mg14_mg646__16 = results.contains(__DSPOT_predicate_750);
        Assert.assertFalse(o_testGeneratedTrees_mg14_mg646__16);
        Assert.assertEquals("Created 6 node trees", String_39);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg386() throws DataNotFoundException {
        String __DSPOT_nodeName_400 = "x<5]|k5aw4Z#8{}YbgCZ";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        int o_testGeneratedTrees_mg11_mg386__16 = results.childNodes(__DSPOT_nodeName_400);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg11_mg386__16)));
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg167() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_116 = new DataPredicate();
        String __DSPOT_name_115 = ":qrZ;W{5uN(!P:(01(Vo";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        results.removeNodes(__DSPOT_name_115, __DSPOT_predicate_116);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg113() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        __DSPOT_predicate_4.reset();
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg19_mg424() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_457 = true;
        boolean __DSPOT_modifiedOnly_456 = true;
        String __DSPOT_newName_455 = "TqI`N>U&&o3V,[L^pmEl";
        DataPredicate __DSPOT_predicate_25 = new DataPredicate();
        String __DSPOT_nodeName_24 = "ycw,-c^.vZ(8(U^r,Jp9";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_49 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_49);
        boolean boolean_50 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg19__14 = gen.getChildNodes(__DSPOT_nodeName_24, __DSPOT_predicate_25);
        DataNode o_testGeneratedTrees_mg19_mg424__20 = gen.cloneNode(__DSPOT_newName_455, __DSPOT_modifiedOnly_456, __DSPOT_keepMeta_457);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getMetaNode());
        Assert.assertEquals("TqI`N>U&&o3V,[L^pmEl[4]", ((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).isModified());
        Assert.assertEquals("TqI`N>U&&o3V,[L^pmEl", ((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("TqI`N>U&&o3V,[L^pmEl", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).getNode())).isModified());
        Assert.assertEquals("TqI`N>U&&o3V,[L^pmEl", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg19_mg424__20)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_49);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg438() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_476 = false;
        boolean __DSPOT_modifiedOnly_475 = false;
        String __DSPOT_newName_474 = "?WP/q=qf@xV4RP-Rlv;5";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        DataNode o_testGeneratedTrees_mg20_mg438__18 = gen.cloneNode(__DSPOT_newName_474, __DSPOT_modifiedOnly_475, __DSPOT_keepMeta_476);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg20_mg438__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg127() throws DataNotFoundException {
        String __DSPOT_nodeName_61 = "&0xT!&b-W-(y_V1a;?h(";
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        int o_testGeneratedTrees_mg4_mg127__17 = results.childNodes(__DSPOT_nodeName_61);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg4_mg127__17)));
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg24_mg366() throws DataNotFoundException {
        boolean __DSPOT_keepMeta_376 = false;
        boolean __DSPOT_modifiedOnly_375 = true;
        String __DSPOT_newName_374 = ")]&FgYicpi).(9M9YkYL";
        DataPredicate __DSPOT_predicate_32 = new DataPredicate();
        String __DSPOT_name_31 = ")d4}^w[&oDAIOw? O!T}";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_59 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_59);
        boolean boolean_60 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_31, __DSPOT_predicate_32);
        DataNode o_testGeneratedTrees_mg24_mg366__18 = gen.cloneNode(__DSPOT_newName_374, __DSPOT_modifiedOnly_375, __DSPOT_keepMeta_376);
        Assert.assertTrue(((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getMetaNode());
        Assert.assertEquals(")]&FgYicpi).(9M9YkYL[4]", ((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).isModified());
        Assert.assertEquals(")]&FgYicpi).(9M9YkYL", ((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).isValueNode());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).hasOpenTransaction());
        Assert.assertEquals(")]&FgYicpi).(9M9YkYL", ((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).getNode())).isModified());
        Assert.assertEquals(")]&FgYicpi).(9M9YkYL", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testGeneratedTrees_mg24_mg366__18)).getHandle())).getNode())).getName());
        Assert.assertEquals("Created 6 node trees", String_59);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg14_mg663() throws DataNotFoundException {
        DataPath __DSPOT_path_777 = new DataPath("$=WKIMvfE{Spt.!:w]ya");
        List<DataNode> __DSPOT_result_775 = Collections.<DataNode>emptyList();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_39 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_39);
        boolean boolean_40 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg14__11 = gen.childNodes();
        results.getNodes(__DSPOT_result_775, __DSPOT_path_777);
        Assert.assertEquals("Created 6 node trees", String_39);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg589() throws DataNotFoundException {
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        int o_testGeneratedTrees_mg2_mg589__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg2_mg589__15)));
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg135() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_66 = new DataPredicate();
        String __DSPOT_nodeName_65 = "rIXp5pNO|oPq,r5>K`HN";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        List<DataNode> o_testGeneratedTrees_mg17_mg135__19 = results.getChildNodes(__DSPOT_nodeName_65, __DSPOT_predicate_66);
        Assert.assertTrue(o_testGeneratedTrees_mg17_mg135__19.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg296() throws DataNotFoundException {
        boolean __DSPOT_internal_295 = true;
        DataPredicate __DSPOT_pred_291 = new DataPredicate("#hyz2/ut *&f$qchO@nU");
        String __DSPOT_name_290 = "Vly%}?c<+m*NFg_0o2r]";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        gen.removeNodes(__DSPOT_name_290, __DSPOT_pred_291, __DSPOT_internal_295);
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg606_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_name_702 = "&)da1WGLR`6=x(Yr#r2j";
            int __DSPOT_index_5 = 1640902160;
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
            o_testGeneratedTrees_mg5__12.getValueNode(__DSPOT_name_702);
            org.junit.Assert.fail("testGeneratedTrees_mg5_mg606 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg376() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_390 = new DataPredicate();
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        boolean o_testGeneratedTrees_mg6_mg376__19 = gen.contains(__DSPOT_predicate_390);
        Assert.assertFalse(o_testGeneratedTrees_mg6_mg376__19);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg18_mg757_failAssert0() throws DataNotFoundException {
        try {
            String __DSPOT_name_909 = "<!u}K!:&h+CYgVy!-][l";
            int __DSPOT_index_23 = 1897359589;
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_47 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_48 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataNode o_testGeneratedTrees_mg18__12 = gen.getChildNode(__DSPOT_index_23);
            o_testGeneratedTrees_mg18__12.getValueNode(__DSPOT_name_909);
            org.junit.Assert.fail("testGeneratedTrees_mg18_mg757 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg18_mg682() throws DataNotFoundException {
        int __DSPOT_index_23 = 1897359589;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_47 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_47);
        boolean boolean_48 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg18__12 = gen.getChildNode(__DSPOT_index_23);
        int o_testGeneratedTrees_mg18_mg682__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg18_mg682__15)));
        Assert.assertEquals("Created 6 node trees", String_47);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg523() throws DataNotFoundException {
        String __DSPOT_name_592 = "/l[8=b-LYDSCxx!&WXDl";
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_25);
        boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
        DataGroupNode o_testGeneratedTrees_mg7_mg523__16 = results.getGroupNode(__DSPOT_name_592);
        Assert.assertNull(o_testGeneratedTrees_mg7_mg523__16);
        Assert.assertEquals("Created 6 node trees", String_25);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg13_mg269() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_253 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_37 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_37);
        boolean boolean_38 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg13__11 = results.updateModified();
        boolean o_testGeneratedTrees_mg13_mg269__16 = results.contains(__DSPOT_predicate_253);
        Assert.assertFalse(o_testGeneratedTrees_mg13_mg269__16);
        Assert.assertEquals("Created 6 node trees", String_37);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg21_mg151() throws DataNotFoundException {
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_53 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_53);
        boolean boolean_54 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg21__12 = gen.getNodes(__DSPOT_path_27);
        boolean o_testGeneratedTrees_mg21_mg151__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg21_mg151__15);
        Assert.assertEquals("Created 6 node trees", String_53);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg241() throws DataNotFoundException {
        String __DSPOT_name_227 = "qZeEg/gcm:Ca6sRDg-zR";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        DataValueNode o_testGeneratedTrees_mg12_mg241__17 = gen.getValueNode(__DSPOT_name_227);
        Assert.assertNull(o_testGeneratedTrees_mg12_mg241__17);
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg141() throws DataNotFoundException {
        String __DSPOT_path_77 = "D1iXd&W_#*uaYP&<w$N`";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        List<DataNode> o_testGeneratedTrees_mg17_mg141__17 = results.getNodes(__DSPOT_path_77);
        Assert.assertTrue(o_testGeneratedTrees_mg17_mg141__17.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg431() throws DataNotFoundException {
        int __DSPOT_index_467 = 790233132;
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        DataNode o_testGeneratedTrees_mg5_mg431__16 = results.getChildNode(__DSPOT_index_467);
        Assert.assertNull(o_testGeneratedTrees_mg5_mg431__16);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg208() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_172 = new DataPredicate();
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        boolean o_testGeneratedTrees_mg23_mg208__17 = results.contains(__DSPOT_predicate_172);
        Assert.assertFalse(o_testGeneratedTrees_mg23_mg208__17);
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg446() throws DataNotFoundException {
        int __DSPOT_index_484 = -823356444;
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        DataNode o_testGeneratedTrees_mg20_mg446__16 = gen.getChildNode(__DSPOT_index_484);
        Assert.assertNull(o_testGeneratedTrees_mg20_mg446__16);
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg720() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_857 = new DataPredicate(")U]XL}O9iR1D=,fnW]Rr");
        String __DSPOT_nodeName_856 = "&.kbpBO=TDkxVK:+S:`c";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        List<DataNode> o_testGeneratedTrees_mg15_mg720__18 = gen.getChildNodes(__DSPOT_nodeName_856, __DSPOT_predicate_857);
        Assert.assertTrue(o_testGeneratedTrees_mg15_mg720__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg18_mg758_failAssert0() throws DataNotFoundException {
        try {
            int __DSPOT_index_23 = 1897359589;
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_47 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_48 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataNode o_testGeneratedTrees_mg18__12 = gen.getChildNode(__DSPOT_index_23);
            o_testGeneratedTrees_mg18__12.updateModified();
            org.junit.Assert.fail("testGeneratedTrees_mg18_mg758 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg429() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        boolean o_testGeneratedTrees_mg20_mg429__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg20_mg429__15);
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg26_mg533() throws DataNotFoundException {
        String __DSPOT_name_603 = "LlOH0m({q956x/WBjX1$";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_63 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_63);
        boolean boolean_64 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg26__11 = gen.updateModified();
        DataGroupNode o_testGeneratedTrees_mg26_mg533__15 = gen.getGroupNode(__DSPOT_name_603);
        Assert.assertNull(o_testGeneratedTrees_mg26_mg533__15);
        Assert.assertEquals("Created 6 node trees", String_63);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg603() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_696 = new DataPredicate();
        String __DSPOT_name_695 = "g]:d>pQ#u#4>|U.0@;Uw";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        results.removeNodes(__DSPOT_name_695, __DSPOT_predicate_696);
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg21_mg119() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_51 = new DataPredicate();
        String __DSPOT_nodeName_50 = "DA!L#vK5WR{oE1L&q_{{";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_53 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_53);
        boolean boolean_54 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg21__12 = gen.getNodes(__DSPOT_path_27);
        List<DataNode> o_testGeneratedTrees_mg21_mg119__18 = results.getChildNodes(__DSPOT_nodeName_50, __DSPOT_predicate_51);
        Assert.assertTrue(o_testGeneratedTrees_mg21_mg119__18.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_53);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg468_failAssert0() throws DataNotFoundException {
        try {
            DataPredicate __DSPOT_predicate_519 = new DataPredicate("6Jncm%^0X<!OI0}2Z*:D");
            String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
            o_testGeneratedTrees_mg10__12.contains(__DSPOT_predicate_519);
            org.junit.Assert.fail("testGeneratedTrees_mg10_mg468 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1_mg742() throws DataNotFoundException {
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_13 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_13);
        boolean boolean_14 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1__11 = results.childNodes();
        boolean o_testGeneratedTrees_mg1_mg742__14 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg1_mg742__14);
        Assert.assertEquals("Created 6 node trees", String_13);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg365() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        int o_testGeneratedTrees_mg6_mg365__17 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg6_mg365__17)));
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg428() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_464 = new DataPredicate("5a.U(&bzLSgsM<P2/c-4");
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        boolean o_testGeneratedTrees_mg5_mg428__17 = results.contains(__DSPOT_predicate_464);
        Assert.assertFalse(o_testGeneratedTrees_mg5_mg428__17);
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg211() throws DataNotFoundException {
        String __DSPOT_name_177 = "*`gmH>[A}8/o#n)B( ^q";
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        DataGroupNode o_testGeneratedTrees_mg12_mg211__17 = gen.getGroupNode(__DSPOT_name_177);
        Assert.assertNull(o_testGeneratedTrees_mg12_mg211__17);
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg215() throws DataNotFoundException {
        int __DSPOT_index_180 = 802744563;
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        DataNode o_testGeneratedTrees_mg23_mg215__16 = results.getChildNode(__DSPOT_index_180);
        Assert.assertNull(o_testGeneratedTrees_mg23_mg215__16);
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg13_mg336() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_340 = new DataPredicate("vH[6v_$Ru5WDgX9`d38%");
        String __DSPOT_name_339 = "r=+(`;+@S(B7t)i*u4NJ";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_37 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_37);
        boolean boolean_38 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg13__11 = results.updateModified();
        gen.removeNodes(__DSPOT_name_339, __DSPOT_predicate_340);
        Assert.assertEquals("Created 6 node trees", String_37);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg717() throws DataNotFoundException {
        int __DSPOT_index_851 = -1161097484;
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        DataNode o_testGeneratedTrees_mg15_mg717__16 = gen.getChildNode(__DSPOT_index_851);
        Assert.assertNull(o_testGeneratedTrees_mg15_mg717__16);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg393() throws DataNotFoundException {
        boolean __DSPOT_internal_463 = false;
        DataPredicate __DSPOT_pred_412 = new DataPredicate();
        String __DSPOT_name_411 = "CZw%-9j57v[dc=WO=QzF";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        results.removeNodes(__DSPOT_name_411, __DSPOT_pred_412, __DSPOT_internal_463);
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg421() throws DataNotFoundException {
        String __DSPOT_nodeName_452 = "gCLA [,68H-;w;Q+v!cX";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        int o_testGeneratedTrees_mg5_mg421__16 = results.childNodes(__DSPOT_nodeName_452);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg5_mg421__16)));
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg21_mg128() throws DataNotFoundException {
        String __DSPOT_name_62 = "*fl<xJgehgad?HCt1H=N";
        String __DSPOT_path_27 = "AAF?5P&+YTN/#yO[*WW4";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_53 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_53);
        boolean boolean_54 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg21__12 = gen.getNodes(__DSPOT_path_27);
        DataValueNode o_testGeneratedTrees_mg21_mg128__16 = results.getValueNode(__DSPOT_name_62);
        Assert.assertNull(o_testGeneratedTrees_mg21_mg128__16);
        Assert.assertEquals("Created 6 node trees", String_53);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg432() throws DataNotFoundException {
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        int o_testGeneratedTrees_mg20_mg432__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg20_mg432__15)));
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg572() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_656 = new DataPredicate();
        String __DSPOT_nodeName_655 = "#B!yTS8}c6H9eV&5`LpC";
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        List<DataNode> o_testGeneratedTrees_mg25_mg572__19 = results.getChildNodes(__DSPOT_nodeName_655, __DSPOT_predicate_656);
        Assert.assertTrue(o_testGeneratedTrees_mg25_mg572__19.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg222() throws DataNotFoundException {
        String __DSPOT_name_190 = "cK>tr@!m3PO{$F=,gxwD";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        DataGroupNode o_testGeneratedTrees_mg8_mg222__16 = gen.getGroupNode(__DSPOT_name_190);
        Assert.assertNull(o_testGeneratedTrees_mg8_mg222__16);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg676() throws DataNotFoundException {
        boolean __DSPOT_internal_825 = true;
        DataPredicate __DSPOT_pred_798 = new DataPredicate("eF0g>9<R_pxzecH(On$Q");
        String __DSPOT_name_797 = "9p*7!V$ e`FDU`CN3ZqK";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        results.removeNodes(__DSPOT_name_797, __DSPOT_pred_798, __DSPOT_internal_825);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg4_mg255() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_4 = new DataPredicate();
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_19 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_19);
        boolean boolean_20 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg4__13 = results.contains(__DSPOT_predicate_4);
        boolean o_testGeneratedTrees_mg4_mg255__16 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg4_mg255__16);
        Assert.assertEquals("Created 6 node trees", String_19);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg501_failAssert0() throws DataNotFoundException {
        try {
            Object __DSPOT_val_559 = new Object();
            String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
            DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
            String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
            boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
            DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
            String name = gen.getValueNode("senderName").getString();
            DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
            o_testGeneratedTrees_mg10__12.setValue(__DSPOT_val_559);
            org.junit.Assert.fail("testGeneratedTrees_mg10_mg501 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg674() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_791 = new DataPredicate();
        String __DSPOT_name_790 = "VBe24*w=zoF9c%{]-(HX";
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        results.removeNodes(__DSPOT_name_790, __DSPOT_predicate_791);
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg25_mg556() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_635 = new DataPredicate();
        boolean __DSPOT_internal_35 = false;
        DataPredicate __DSPOT_pred_34 = new DataPredicate();
        String __DSPOT_name_33 = "q8xal:7%uE_&Ml%;sG#A";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_61 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_61);
        boolean boolean_62 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        gen.removeNodes(__DSPOT_name_33, __DSPOT_pred_34, __DSPOT_internal_35);
        boolean o_testGeneratedTrees_mg25_mg556__18 = results.contains(__DSPOT_predicate_635);
        Assert.assertFalse(o_testGeneratedTrees_mg25_mg556__18);
        Assert.assertEquals("Created 6 node trees", String_61);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg10_mg378() throws DataNotFoundException {
        String __DSPOT_name_12 = "h1,xavU[1Rvnj|}8wu]&";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_31 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_31);
        boolean boolean_32 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg10__12 = results.getValueNode(__DSPOT_name_12);
        int o_testGeneratedTrees_mg10_mg378__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg10_mg378__15)));
        Assert.assertEquals("Created 6 node trees", String_31);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg171() throws DataNotFoundException {
        boolean __DSPOT_internal_127 = false;
        DataPredicate __DSPOT_pred_123 = new DataPredicate();
        String __DSPOT_name_122 = "F[5qeWJi&w1WL[gZTO{/";
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        results.removeNodes(__DSPOT_name_122, __DSPOT_pred_123, __DSPOT_internal_127);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg232() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_205 = new DataPredicate();
        String __DSPOT_name_204 = "]s7@GrMJBJ{;2P#e;yT.";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        results.removeNodes(__DSPOT_name_204, __DSPOT_predicate_205);
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg532() throws DataNotFoundException {
        String __DSPOT_path_602 = "G+L,kgWS%rG!{ 75Uj=:";
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        List<DataNode> o_testGeneratedTrees_mg5_mg532__16 = gen.getNodes(__DSPOT_path_602);
        Assert.assertTrue(o_testGeneratedTrees_mg5_mg532__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg684() throws DataNotFoundException {
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        boolean o_testGeneratedTrees_mg2_mg684__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg2_mg684__15);
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg13_mg333() throws DataNotFoundException {
        String __DSPOT_name_336 = "Pj$iSH2aDj.pbZs?{yo3";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_37 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_37);
        boolean boolean_38 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg13__11 = results.updateModified();
        DataValueNode o_testGeneratedTrees_mg13_mg333__15 = gen.getValueNode(__DSPOT_name_336);
        Assert.assertNull(o_testGeneratedTrees_mg13_mg333__15);
        Assert.assertEquals("Created 6 node trees", String_37);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg1_mg731() throws DataNotFoundException {
        String __DSPOT_name_872 = "sZ* ol$g:g6:`C:AY=mE";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_13 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_13);
        boolean boolean_14 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg1__11 = results.childNodes();
        DataValueNode o_testGeneratedTrees_mg1_mg731__15 = gen.getValueNode(__DSPOT_name_872);
        Assert.assertNull(o_testGeneratedTrees_mg1_mg731__15);
        Assert.assertEquals("Created 6 node trees", String_13);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg238() throws DataNotFoundException {
        String __DSPOT_name_215 = "@H(x2>iy;hPVv>/f/5!<";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        DataGroupNode o_testGeneratedTrees_mg17_mg238__17 = gen.getGroupNode(__DSPOT_name_215);
        Assert.assertNull(o_testGeneratedTrees_mg17_mg238__17);
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg6_mg353() throws DataNotFoundException {
        boolean __DSPOT_internal_363 = false;
        DataPredicate __DSPOT_pred_361 = new DataPredicate();
        String __DSPOT_name_360 = "a-E6=hrg) &]H6Q*bglw";
        DataPredicate __DSPOT_predicate_7 = new DataPredicate("C=TU&zgYc TM1`_8;0L`");
        String __DSPOT_nodeName_6 = "+mr6#-VtX(r!Fs2l>UgI";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_23 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_23);
        boolean boolean_24 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg6__14 = results.getChildNodes(__DSPOT_nodeName_6, __DSPOT_predicate_7);
        results.removeNodes(__DSPOT_name_360, __DSPOT_pred_361, __DSPOT_internal_363);
        Assert.assertEquals("Created 6 node trees", String_23);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg681() throws DataNotFoundException {
        boolean __DSPOT_internal_809 = false;
        DataPredicate __DSPOT_pred_807 = new DataPredicate("Gp8 6)>g, xm6L;&=q[J");
        String __DSPOT_name_806 = "^;kP1|wL<nM j[+g5p/R";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        results.removeNodes(__DSPOT_name_806, __DSPOT_pred_807, __DSPOT_internal_809);
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg5_mg417() throws DataNotFoundException {
        int __DSPOT_index_5 = 1640902160;
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_21 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_21);
        boolean boolean_22 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataNode o_testGeneratedTrees_mg5__12 = results.getChildNode(__DSPOT_index_5);
        int o_testGeneratedTrees_mg5_mg417__15 = results.childNodes();
        Assert.assertEquals(6, ((int) (o_testGeneratedTrees_mg5_mg417__15)));
        Assert.assertEquals("Created 6 node trees", String_21);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg23_mg229() throws DataNotFoundException {
        String __DSPOT_name_200 = "h+bBYGG!0gGi?=}tR?SY";
        String __DSPOT_name_30 = "j-qEHp!#I]LDWP=,y4JV";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_57 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_57);
        boolean boolean_58 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataValueNode o_testGeneratedTrees_mg23__12 = gen.getValueNode(__DSPOT_name_30);
        DataValueNode o_testGeneratedTrees_mg23_mg229__16 = results.getValueNode(__DSPOT_name_200);
        Assert.assertNull(o_testGeneratedTrees_mg23_mg229__16);
        Assert.assertEquals("Created 6 node trees", String_57);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg12_mg223() throws DataNotFoundException {
        DataPath __DSPOT_path_192 = new DataPath("=dgY,;s4m>$PTOy/fW<J");
        List<DataNode> __DSPOT_result_191 = Collections.<DataNode>emptyList();
        boolean __DSPOT_internal_17 = false;
        DataPredicate __DSPOT_pred_16 = new DataPredicate("[Bob5_83OI`-k-a8(J8B");
        String __DSPOT_name_15 = ">YSe|%xHdm7#=ToX)D7x";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_35 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_35);
        boolean boolean_36 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_15, __DSPOT_pred_16, __DSPOT_internal_17);
        gen.getNodes(__DSPOT_result_191, __DSPOT_path_192);
        Assert.assertEquals("Created 6 node trees", String_35);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg14_mg718() throws DataNotFoundException {
        String __DSPOT_name_852 = "z0[|zDDSlq};6b)7b[F0";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_39 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_39);
        boolean boolean_40 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg14__11 = gen.childNodes();
        DataValueNode o_testGeneratedTrees_mg14_mg718__15 = gen.getValueNode(__DSPOT_name_852);
        Assert.assertNull(o_testGeneratedTrees_mg14_mg718__15);
        Assert.assertEquals("Created 6 node trees", String_39);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg17_mg120() throws DataNotFoundException {
        String __DSPOT_nodeName_52 = ">^r@)C1RND7C-6y}W`_*";
        DataPredicate __DSPOT_predicate_22 = new DataPredicate("+{5@T5!^MYU(dM7KJ&><");
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_45 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_45);
        boolean boolean_46 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        boolean o_testGeneratedTrees_mg17__13 = gen.contains(__DSPOT_predicate_22);
        int o_testGeneratedTrees_mg17_mg120__17 = results.childNodes(__DSPOT_nodeName_52);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg17_mg120__17)));
        Assert.assertEquals("Created 6 node trees", String_45);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg2_mg689() throws DataNotFoundException {
        String __DSPOT_nodeName_814 = "vM^?KR2O*YSMU3Pt,wrA";
        String __DSPOT_nodeName_0 = "-*k},GdhscbCS@!x*zH_";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_15 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_15);
        boolean boolean_16 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg2__12 = results.childNodes(__DSPOT_nodeName_0);
        int o_testGeneratedTrees_mg2_mg689__16 = gen.childNodes(__DSPOT_nodeName_814);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg2_mg689__16)));
        Assert.assertEquals("Created 6 node trees", String_15);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg586() throws DataNotFoundException {
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_25);
        boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
        boolean o_testGeneratedTrees_mg7_mg586__15 = gen.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg7_mg586__15);
        Assert.assertEquals("Created 6 node trees", String_25);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg15_mg703() throws DataNotFoundException {
        String __DSPOT_nodeName_18 = "[$XdYQ7-#sa<}t>?]?7g";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_41 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_41);
        boolean boolean_42 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg15__12 = gen.childNodes(__DSPOT_nodeName_18);
        int o_testGeneratedTrees_mg15_mg703__15 = gen.childNodes();
        Assert.assertEquals(5, ((int) (o_testGeneratedTrees_mg15_mg703__15)));
        Assert.assertEquals("Created 6 node trees", String_41);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg478() throws DataNotFoundException {
        String __DSPOT_path_529 = "gT`JEoA3yxe0!W)bfl&T";
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        List<DataNode> o_testGeneratedTrees_mg11_mg478__16 = gen.getNodes(__DSPOT_path_529);
        Assert.assertTrue(o_testGeneratedTrees_mg11_mg478__16.isEmpty());
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg14_mg675() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_793 = new DataPredicate();
        String __DSPOT_name_792 = "#(.+/w?KOcEK5QF sw&D";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_39 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_39);
        boolean boolean_40 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        int o_testGeneratedTrees_mg14__11 = gen.childNodes();
        results.removeNodes(__DSPOT_name_792, __DSPOT_predicate_793);
        Assert.assertEquals("Created 6 node trees", String_39);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg20_mg388() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_404 = new DataPredicate("?w/&c%+z9#i<:S4[z*)l");
        String __DSPOT_name_403 = "v3A9Bd%$(Yc4+914v7{b";
        String __DSPOT_name_26 = "lz5*yC=M]:bMoV#NG^1y";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_51 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_51);
        boolean boolean_52 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg20__12 = gen.getGroupNode(__DSPOT_name_26);
        results.removeNodes(__DSPOT_name_403, __DSPOT_predicate_404);
        Assert.assertEquals("Created 6 node trees", String_51);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg7_mg507() throws DataNotFoundException {
        String __DSPOT_nodeName_563 = "VC>o#s`XAqXgdI1tl@2X";
        String __DSPOT_name_8 = "A=SO/woO!OKS@Rl&{ha!";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_25 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_25);
        boolean boolean_26 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        DataGroupNode o_testGeneratedTrees_mg7__12 = results.getGroupNode(__DSPOT_name_8);
        int o_testGeneratedTrees_mg7_mg507__16 = results.childNodes(__DSPOT_nodeName_563);
        Assert.assertEquals(0, ((int) (o_testGeneratedTrees_mg7_mg507__16)));
        Assert.assertEquals("Created 6 node trees", String_25);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg8_mg177() throws DataNotFoundException {
        String __DSPOT_path_9 = "&Bcvg[?i!rb0/|]6^FT)";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_27 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_27);
        boolean boolean_28 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        List<DataNode> o_testGeneratedTrees_mg8__12 = results.getNodes(__DSPOT_path_9);
        boolean o_testGeneratedTrees_mg8_mg177__15 = results.updateModified();
        Assert.assertTrue(o_testGeneratedTrees_mg8_mg177__15);
        Assert.assertEquals("Created 6 node trees", String_27);
        Assert.assertEquals("TemplateTest", name);
    }

    @Test(timeout = 1000)
    public void testGeneratedTrees_mg11_mg351() throws DataNotFoundException {
        DataPredicate __DSPOT_predicate_14 = new DataPredicate();
        String __DSPOT_name_13 = "8(Dgh`l V!3a(!.#b{[I";
        DataGroupNode results = ((DataGroupNode) (TemplateTest.dataHandle.getNode()));
        String String_33 = ("Created " + (TemplateTest.SAMPLE_SIZE)) + " node trees";
        Assert.assertEquals("Created 6 node trees", String_33);
        boolean boolean_34 = (results.childNodes()) == (TemplateTest.SAMPLE_SIZE);
        DataGroupNode gen = ((DataGroupNode) (results.getChildNode(0)));
        String name = gen.getValueNode("senderName").getString();
        Assert.assertEquals("TemplateTest", name);
        results.removeNodes(__DSPOT_name_13, __DSPOT_predicate_14);
        DataPredicate o_testGeneratedTrees_mg11_mg351__15 = __DSPOT_predicate_14.clonePredicate();
        Assert.assertEquals(-1, ((int) (((DataPredicate) (o_testGeneratedTrees_mg11_mg351__15)).getIndex())));
        Assert.assertNull(((DataPredicate) (o_testGeneratedTrees_mg11_mg351__15)).getFrontPathName());
        Assert.assertFalse(((DataPredicate) (o_testGeneratedTrees_mg11_mg351__15)).hasExpression());
        Assert.assertEquals("Created 6 node trees", String_33);
        Assert.assertEquals("TemplateTest", name);
    }
}

