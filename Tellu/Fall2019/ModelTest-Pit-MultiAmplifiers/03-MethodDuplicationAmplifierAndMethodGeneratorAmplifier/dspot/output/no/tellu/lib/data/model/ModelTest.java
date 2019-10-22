package no.tellu.lib.data.model;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataNotFoundException;
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
    public void testInitFromFile_mg7508() throws IOException, DataNotFoundException {
        DataGroupNode __DSPOT_node_9525 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("DYB[)M,vy&&U>#sH+Cr[", 757954477));
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3394 = (handle.totalNodes()) == 1;
        boolean boolean_3395 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3396 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg7508__23 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_mg7508__23);
        handle = model.getDataHandle("/person");
        boolean boolean_3397 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg7508__30 = js.serialize(__DSPOT_node_9525);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg7508__30);
        Assert.assertTrue(o_testInitFromFile_mg7508__23);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_add7501() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3366 = (handle.totalNodes()) == 1;
        boolean boolean_3367 = (handle.getFloat(null)) == 1.234F;
        DataModelHandle o_testInitFromFile_add7501__16 = model.getDataHandle("/header/array");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add7501__16)).getName());
        handle = model.getDataHandle("/header/array");
        boolean boolean_3368 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_add7501__21 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_add7501__21);
        handle = model.getDataHandle("/person");
        boolean boolean_3369 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add7501__16)).getName());
        Assert.assertTrue(o_testInitFromFile_add7501__21);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg7508_mg7803() throws IOException, DataNotFoundException {
        boolean __DSPOT_keepMeta_9580 = false;
        boolean __DSPOT_modifiedOnly_9579 = false;
        String __DSPOT_newName_9578 = "ZP{Kv*EqX1&;]7[f]}&[";
        DataGroupNode __DSPOT_node_9525 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("DYB[)M,vy&&U>#sH+Cr[", 757954477));
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3394 = (handle.totalNodes()) == 1;
        boolean boolean_3395 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3396 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg7508__23 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3397 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg7508__30 = js.serialize(__DSPOT_node_9525);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg7508__30);
        DataNode o_testInitFromFile_mg7508_mg7803__38 = __DSPOT_node_9525.cloneNode(__DSPOT_newName_9578, __DSPOT_modifiedOnly_9579, __DSPOT_keepMeta_9580);
        Assert.assertTrue(((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getMetaNode());
        Assert.assertEquals("ZP{Kv*EqX1&;]7[f]}&[[0]", ((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).isModified());
        Assert.assertEquals("ZP{Kv*EqX1&;]7[f]}&[", ((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("ZP{Kv*EqX1&;]7[f]}&[", ((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).getNode())).isModified());
        Assert.assertEquals("ZP{Kv*EqX1&;]7[f]}&[", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg7508_mg7803__38)).getHandle())).getNode())).getName());
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg7508__30);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_add7501_mg8102() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3366 = (handle.totalNodes()) == 1;
        boolean boolean_3367 = (handle.getFloat(null)) == 1.234F;
        DataModelHandle o_testInitFromFile_add7501__16 = model.getDataHandle("/header/array");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add7501__16)).getName());
        handle = model.getDataHandle("/header/array");
        boolean boolean_3368 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_add7501__21 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3369 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        o_testInitFromFile_add7501__16.startTransaction();
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add7501__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add7501__16)).getName());
    }

    @Test(timeout = 1000)
    public void testInitFromFile_add7501_mg8100_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_path_9671 = "kH< 6%prh6>.9[{crQjp";
            System.out.println(" === testInitFromFile ===");
            JsonSerializer js = new JsonSerializer();
            js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
            model.setMainSerializer(js);
            model.setMainFile(new File("src/test/resources/data.json"));
            model.initFromFile();
            model.setMainFile(null);
            DataHandle handle = model.getDataHandle("/header/length");
            boolean boolean_3366 = (handle.totalNodes()) == 1;
            boolean boolean_3367 = (handle.getFloat(null)) == 1.234F;
            DataModelHandle o_testInitFromFile_add7501__16 = model.getDataHandle("/header/array");
            handle = model.getDataHandle("/header/array");
            boolean boolean_3368 = (handle.totalNodes()) == 3;
            boolean o_testInitFromFile_add7501__21 = handle.getString(null).equals("str1");
            handle = model.getDataHandle("/person");
            boolean boolean_3369 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            o_testInitFromFile_add7501__16.removeValue(__DSPOT_path_9671);
            org.junit.Assert.fail("testInitFromFile_add7501_mg8100 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("DataHandle node is DataValueNode", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromFile_add7505_add7831_mg12577_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_newName_10927 = "G.m*f[#/Gj0R%*!NCK|I";
            String __DSPOT_predicate_10926 = "IVz[9wd7d5;*4p?$CM<[";
            String __DSPOT_nodeName_10925 = "))vCjO^a-{*G;G%zK@Eh";
            System.out.println(" === testInitFromFile ===");
            JsonSerializer js = new JsonSerializer();
            js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
            model.setMainSerializer(js);
            model.setMainFile(new File("src/test/resources/data.json"));
            model.initFromFile();
            model.setMainFile(null);
            DataModelHandle o_testInitFromFile_add7505_add7831__10 = model.getDataHandle("/header/length");
            DataHandle handle = model.getDataHandle("/header/length");
            boolean boolean_3382 = (handle.totalNodes()) == 1;
            boolean boolean_3383 = (handle.getFloat(null)) == 1.234F;
            handle = model.getDataHandle("/header/array");
            boolean boolean_3384 = (handle.totalNodes()) == 3;
            boolean o_testInitFromFile_add7505__20 = handle.getString(null).equals("str1");
            DataModelHandle o_testInitFromFile_add7505__22 = model.getDataHandle("/person");
            handle = model.getDataHandle("/person");
            boolean boolean_3385 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            o_testInitFromFile_add7505_add7831__10.changeName(__DSPOT_nodeName_10925, __DSPOT_predicate_10926, __DSPOT_newName_10927);
            org.junit.Assert.fail("testInitFromFile_add7505_add7831_mg12577 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("DataHandle node is DataValueNode", expected.getMessage());
        }
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
    public void testInitFromModel_mg20100_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_instance_12136 = "dP*{Ev1*8Z-Wrf[e(3{m";
            DataModel __DSPOT_source_12135 = new DataModel();
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
            boolean boolean_3570 = (handle.totalNodes()) == 1;
            boolean boolean_3571 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3572 = (handle.totalNodes()) == 3;
            handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3573 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.copyMetaData(__DSPOT_source_12135, __DSPOT_instance_12136);
            org.junit.Assert.fail("testInitFromModel_mg20100 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg20102() throws IOException, DataNotFoundException {
        String __DSPOT_name_12138 = "f6,b|y&S)%<9JG)O]px>";
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
        boolean boolean_3578 = (handle.totalNodes()) == 1;
        boolean boolean_3579 = (handle.getFloat(null)) == 1.234F;
        handle = copy.getDataHandle("/header/array");
        boolean boolean_3580 = (handle.totalNodes()) == 3;
        boolean o_testInitFromModel_mg20102__25 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromModel_mg20102__25);
        handle = copy.getDataHandle("/person");
        boolean boolean_3581 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        boolean o_testInitFromModel_mg20102__32 = copy.hasDataProvider(__DSPOT_name_12138);
        Assert.assertFalse(o_testInitFromModel_mg20102__32);
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(o_testInitFromModel_mg20102__25);
    }
}

