package no.tellu.lib.data.model;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.DataPath;
import no.tellu.lib.data.DataSerializer;
import no.tellu.lib.data.MetaTest;
import no.tellu.lib.data.TransactionException;
import no.tellu.lib.data.serialize.JsonSerializer;
import no.tellu.lib.log.Flog;
import no.tellu.lib.log.SystemOutput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ModelTest {
    DataModel model;

    static boolean init = false;

    public static class TestSubscriber implements DataHandle.DataUpdateSubscriber {
        private static int counter = 0;

        public boolean called = false;

        public int index = -1;

        @Override
        public void onDataValueUpdate(DataHandle data) {
            System.out.println(("Subscriber called for " + (data.getName())));
            called = true;
            index = ModelTest.TestSubscriber.counter;
            (ModelTest.TestSubscriber.counter)++;
        }

        public boolean wasCalled() {
            boolean c = called;
            called = false;
            return c;
        }
    }

    public static class TestTrigger implements Trigger {
        public TriggerTarget target;

        @Override
        public void initiate(DataHandle model, TriggerTarget target) {
            this.target = target;
        }

        @Override
        public void activate(String nodePredicate) {
        }

        @Override
        public void deactivate(String nodePredicate) {
        }
    }

    public static class TestAction implements Action {
        List<String> triggers = new ArrayList<String>();

        @Override
        public void execute(DataHandle context) {
            String person = context.getString("name", "-");
            triggers.add(person);
            System.out.println((" *** Rule triggered for person " + person));
        }

        public boolean wasCalledFor(String name) {
            return triggers.contains(name);
        }

        public void clearState() {
            triggers.clear();
        }
    }

    @Before
    public void setUp() {
        if (!(ModelTest.init)) {
            Flog.addLogOutput(new SystemOutput());
            ModelTest.init = true;
        }
        model = new DataModel();
        model.addMetaNode(null, MetaTest.headerMeta());
        model.addMetaNode(null, MetaTest.personMeta());
        model.addMetaNode(null, MetaTest.readOnlyMeta());
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg6903() throws IOException, DataNotFoundException {
        DataGroupNode __DSPOT_node_8926 = new DataGroupNode();
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3018 = (handle.totalNodes()) == 1;
        boolean boolean_3019 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3020 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg6903__22 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_mg6903__22);
        handle = model.getDataHandle("/person");
        boolean boolean_3021 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg6903__29 = js.serialize(__DSPOT_node_8926);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6903__29);
        Assert.assertTrue(o_testInitFromFile_mg6903__22);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg6903_mg6945() throws IOException, DataNotFoundException {
        boolean __DSPOT_keepMeta_8954 = false;
        boolean __DSPOT_modifiedOnly_8953 = true;
        String __DSPOT_newName_8952 = "6{PRY=Z_!|;UEsNgawB9";
        DataGroupNode __DSPOT_node_8926 = new DataGroupNode();
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3018 = (handle.totalNodes()) == 1;
        boolean boolean_3019 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3020 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg6903__22 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3021 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg6903__29 = js.serialize(__DSPOT_node_8926);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6903__29);
        DataNode o_testInitFromFile_mg6903_mg6945__37 = __DSPOT_node_8926.cloneNode(__DSPOT_newName_8952, __DSPOT_modifiedOnly_8953, __DSPOT_keepMeta_8954);
        Assert.assertTrue(((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getMetaNode());
        Assert.assertEquals("6{PRY=Z_!|;UEsNgawB9[0]", ((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).isModified());
        Assert.assertEquals("6{PRY=Z_!|;UEsNgawB9", ((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).isValid());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).isValueNode());
        Assert.assertEquals("6{PRY=Z_!|;UEsNgawB9", ((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).getNode())).isModified());
        Assert.assertEquals("6{PRY=Z_!|;UEsNgawB9", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6903_mg6945__37)).getHandle())).getNode())).getName());
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6903__29);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg6903_mg6951_mg7303() throws IOException, DataNotFoundException {
        DataPath __DSPOT_obj_9260 = new DataPath("9@p$`vO!T?:c^BN<3qy_");
        DataPath __DSPOT_path_8962 = new DataPath("wu=2b{*:PgN[AWtFsO(6");
        List<DataNode> __DSPOT_result_8961 = Collections.<DataNode>emptyList();
        DataGroupNode __DSPOT_node_8926 = new DataGroupNode();
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3018 = (handle.totalNodes()) == 1;
        boolean boolean_3019 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3020 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg6903__22 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3021 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg6903__29 = js.serialize(__DSPOT_node_8926);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6903__29);
        __DSPOT_node_8926.getNodes(__DSPOT_result_8961, __DSPOT_path_8962);
        boolean o_testInitFromFile_mg6903_mg6951_mg7303__41 = __DSPOT_path_8962.equals(__DSPOT_obj_9260);
        Assert.assertFalse(o_testInitFromFile_mg6903_mg6951_mg7303__41);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6903__29);
    }

    @Test(timeout = 1000)
    public void testInitFromModel() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromModel ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataModel copy = new DataModel();
        Assert.assertNull(((DataModel) (copy)).getRootHandle());
        copy.copyMetaData(model, null);
        copy.initFromModel(model, null);
        DataHandle handle = copy.getDataHandle("/header/length");
        boolean boolean_19 = (handle.totalNodes()) == 1;
        boolean boolean_20 = (handle.getFloat(null)) == 1.234F;
        handle = copy.getDataHandle("/header/array");
        boolean boolean_21 = (handle.totalNodes()) == 3;
        boolean o_testInitFromModel__24 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromModel__24);
        handle = copy.getDataHandle("/person");
        boolean boolean_22 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(o_testInitFromModel__24);
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8118() throws IOException, DataNotFoundException {
        String __DSPOT_name_9563 = "klG$W[]lxalt^U]r!n:l";
        System.out.println(" === testInitFromModel ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataModel copy = new DataModel();
        Assert.assertNull(((DataModel) (copy)).getRootHandle());
        copy.copyMetaData(model, null);
        copy.initFromModel(model, null);
        DataHandle handle = copy.getDataHandle("/header/length");
        boolean boolean_3082 = (handle.totalNodes()) == 1;
        boolean boolean_3083 = (handle.getFloat(null)) == 1.234F;
        handle = copy.getDataHandle("/header/array");
        boolean boolean_3084 = (handle.totalNodes()) == 3;
        boolean o_testInitFromModel_mg8118__25 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromModel_mg8118__25);
        handle = copy.getDataHandle("/person");
        boolean boolean_3085 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        boolean o_testInitFromModel_mg8118__32 = copy.hasDataProvider(__DSPOT_name_9563);
        Assert.assertFalse(o_testInitFromModel_mg8118__32);
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(o_testInitFromModel_mg8118__25);
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8122_mg8434_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_instance_9920 = "j1y*8$Bty805a(vu@{sD";
            DataModel __DSPOT_source_9919 = new DataModel(new no.tellu.lib.log.Logger("+O0[2=OhDr rYiZTH#p0"));
            String __DSPOT_instance_9565 = "5w,6#E7p8 W%?,&d_wu9";
            DataModel __DSPOT_origin_9564 = new DataModel();
            System.out.println(" === testInitFromModel ===");
            JsonSerializer js = new JsonSerializer();
            js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
            model.setMainSerializer(js);
            model.setMainFile(new File("src/test/resources/data.json"));
            model.initFromFile();
            model.setMainFile(null);
            DataModel copy = new DataModel();
            copy.copyMetaData(model, null);
            copy.initFromModel(model, null);
            DataHandle handle = copy.getDataHandle("/header/length");
            boolean boolean_3098 = (handle.totalNodes()) == 1;
            boolean boolean_3099 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3100 = (handle.totalNodes()) == 3;
            boolean o_testInitFromModel_mg8122__27 = handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3101 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.initFromModel(__DSPOT_origin_9564, __DSPOT_instance_9565);
            copy.copyMetaData(__DSPOT_source_9919, __DSPOT_instance_9920);
            org.junit.Assert.fail("testInitFromModel_mg8122_mg8434 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8121_mg8234_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_instance_9653 = "FE|x#_,6Y5s6|:Y{8$!O";
            DataModel __DSPOT_source_9642 = new DataModel(new no.tellu.lib.log.Logger("8pwBSBOL4U8DH]>td}l1"), 563734112);
            System.out.println(" === testInitFromModel ===");
            JsonSerializer js = new JsonSerializer();
            js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
            model.setMainSerializer(js);
            model.setMainFile(new File("src/test/resources/data.json"));
            model.initFromFile();
            model.setMainFile(null);
            DataModel copy = new DataModel();
            copy.copyMetaData(model, null);
            copy.initFromModel(model, null);
            DataHandle handle = copy.getDataHandle("/header/length");
            boolean boolean_3094 = (handle.totalNodes()) == 1;
            boolean boolean_3095 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3096 = (handle.totalNodes()) == 3;
            boolean o_testInitFromModel_mg8121__24 = handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3097 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.initFromMeta();
            copy.copyMetaData(__DSPOT_source_9642, __DSPOT_instance_9653);
            org.junit.Assert.fail("testInitFromModel_mg8121_mg8234 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8121_mg8234_failAssert0_mg12004_failAssert0() throws IOException, DataNotFoundException {
        try {
            {
                int __DSPOT_options_14107 = 1961233591;
                String __DSPOT_instance_9653 = "FE|x#_,6Y5s6|:Y{8$!O";
                DataModel __DSPOT_source_9642 = new DataModel(new no.tellu.lib.log.Logger("8pwBSBOL4U8DH]>td}l1"), 563734112);
                System.out.println(" === testInitFromModel ===");
                JsonSerializer js = new JsonSerializer();
                js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
                model.setMainSerializer(js);
                model.setMainFile(new File("src/test/resources/data.json"));
                model.initFromFile();
                model.setMainFile(null);
                DataModel copy = new DataModel();
                copy.copyMetaData(model, null);
                copy.initFromModel(model, null);
                DataHandle handle = copy.getDataHandle("/header/length");
                boolean boolean_3094 = (handle.totalNodes()) == 1;
                boolean boolean_3095 = (handle.getFloat(null)) == 1.234F;
                handle = copy.getDataHandle("/header/array");
                boolean boolean_3096 = (handle.totalNodes()) == 3;
                boolean o_testInitFromModel_mg8121__24 = handle.getString(null).equals("str1");
                handle = copy.getDataHandle("/person");
                boolean boolean_3097 = (handle.totalNodes()) == 2;
                System.out.print("\n");
                copy.initFromMeta();
                copy.copyMetaData(__DSPOT_source_9642, __DSPOT_instance_9653);
                org.junit.Assert.fail("testInitFromModel_mg8121_mg8234 should have thrown TransactionException");
                js.setParsingOptions(__DSPOT_options_14107);
            }
            org.junit.Assert.fail("testInitFromModel_mg8121_mg8234_failAssert0_mg12004 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8117_mg8480_mg12247() throws IOException, DataNotFoundException {
        int __DSPOT_options_9976 = -1033024709;
        String __DSPOT_path_9562 = "!anQyX;.%N u)0+HOh^}";
        System.out.println(" === testInitFromModel ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataModel copy = new DataModel();
        Assert.assertNull(((DataModel) (copy)).getRootHandle());
        copy.copyMetaData(model, null);
        copy.initFromModel(model, null);
        DataHandle handle = copy.getDataHandle("/header/length");
        boolean boolean_3078 = (handle.totalNodes()) == 1;
        boolean boolean_3079 = (handle.getFloat(null)) == 1.234F;
        handle = copy.getDataHandle("/header/array");
        boolean boolean_3080 = (handle.totalNodes()) == 3;
        boolean o_testInitFromModel_mg8117__25 = handle.getString(null).equals("str1");
        handle = copy.getDataHandle("/person");
        boolean boolean_3081 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        DataModelHandle o_testInitFromModel_mg8117__32 = copy.getDataHandle(__DSPOT_path_9562);
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).hasOpenTransaction());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).isValid());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).hasNode());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).isValueNode());
        Assert.assertNull(((DataModelHandle) (o_testInitFromModel_mg8117__32)).getName());
        js.setParsingOptions(__DSPOT_options_9976);
        o_testInitFromModel_mg8117__32.startTransaction();
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromModel_mg8117__32)).hasOpenTransaction());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).isValid());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).hasNode());
        Assert.assertFalse(((DataModelHandle) (o_testInitFromModel_mg8117__32)).isValueNode());
        Assert.assertNull(((DataModelHandle) (o_testInitFromModel_mg8117__32)).getName());
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg8117_mg8493_mg11253_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_path_13069 = "^|Yu#Sp;z[:%;U%<u53j";
            String __DSPOT_path_9998 = "1v&jn_#u?A7/L40-v:Q4";
            String __DSPOT_path_9562 = "!anQyX;.%N u)0+HOh^}";
            System.out.println(" === testInitFromModel ===");
            JsonSerializer js = new JsonSerializer();
            js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
            model.setMainSerializer(js);
            model.setMainFile(new File("src/test/resources/data.json"));
            model.initFromFile();
            model.setMainFile(null);
            DataModel copy = new DataModel();
            copy.copyMetaData(model, null);
            copy.initFromModel(model, null);
            DataHandle handle = copy.getDataHandle("/header/length");
            boolean boolean_3078 = (handle.totalNodes()) == 1;
            boolean boolean_3079 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3080 = (handle.totalNodes()) == 3;
            boolean o_testInitFromModel_mg8117__25 = handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3081 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            DataModelHandle o_testInitFromModel_mg8117__32 = copy.getDataHandle(__DSPOT_path_9562);
            DataModelHandle o_testInitFromModel_mg8117_mg8493__38 = copy.getDataHandle(__DSPOT_path_9998);
            o_testInitFromModel_mg8117__32.removeValue(__DSPOT_path_13069);
            org.junit.Assert.fail("testInitFromModel_mg8117_mg8493_mg11253 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("DataHandle node is null", expected.getMessage());
        }
    }
}

