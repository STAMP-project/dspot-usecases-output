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
    public void testInitFromFile_mg14589() throws IOException, DataNotFoundException {
        DataGroupNode __DSPOT_node_19443 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("5uF]8.g (/dtm?]:wdpB", 70340520, true, true));
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3213 = (handle.totalNodes()) == 1;
        boolean boolean_3214 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3215 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg14589__23 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_mg14589__23);
        handle = model.getDataHandle("/person");
        boolean boolean_3216 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg14589__30 = js.serialize(__DSPOT_node_19443);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg14589__30);
        Assert.assertTrue(o_testInitFromFile_mg14589__23);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg14589_mg14735() throws IOException, DataNotFoundException {
        boolean __DSPOT_keepMeta_19568 = false;
        boolean __DSPOT_modifiedOnly_19567 = true;
        String __DSPOT_newName_19566 = "rD)gFE}&ezn( @/1ao1L";
        DataGroupNode __DSPOT_node_19443 = new DataGroupNode(new no.tellu.lib.data.MetaGroupNode("5uF]8.g (/dtm?]:wdpB", 70340520, true, true));
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_3213 = (handle.totalNodes()) == 1;
        boolean boolean_3214 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_3215 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_mg14589__23 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3216 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg14589__30 = js.serialize(__DSPOT_node_19443);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg14589__30);
        DataNode o_testInitFromFile_mg14589_mg14735__38 = __DSPOT_node_19443.cloneNode(__DSPOT_newName_19566, __DSPOT_modifiedOnly_19567, __DSPOT_keepMeta_19568);
        Assert.assertTrue(((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getMetaNode());
        Assert.assertFalse(((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).isModified());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg14589_mg14735__38)).getHandle())).getNode())).isModified());
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg14589__30);
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
    public void testInitFromModel_mg19469() throws IOException, DataNotFoundException {
        String __DSPOT_name_24193 = "((&BGaHna8KR|-9eNqbT";
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
        boolean boolean_3369 = (handle.totalNodes()) == 1;
        boolean boolean_3370 = (handle.getFloat(null)) == 1.234F;
        handle = copy.getDataHandle("/header/array");
        boolean boolean_3371 = (handle.totalNodes()) == 3;
        boolean o_testInitFromModel_mg19469__25 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromModel_mg19469__25);
        handle = copy.getDataHandle("/person");
        boolean boolean_3372 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        boolean o_testInitFromModel_mg19469__32 = copy.hasDataProvider(__DSPOT_name_24193);
        Assert.assertFalse(o_testInitFromModel_mg19469__32);
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(o_testInitFromModel_mg19469__25);
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg19467_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_instance_24191 = "&o8i/%HydXl|&GOJT/H1";
            DataModel __DSPOT_source_24190 = new DataModel();
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
            boolean boolean_3361 = (handle.totalNodes()) == 1;
            boolean boolean_3362 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3363 = (handle.totalNodes()) == 3;
            handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3364 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.copyMetaData(__DSPOT_source_24190, __DSPOT_instance_24191);
            org.junit.Assert.fail("testInitFromModel_mg19467 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg19474_mg21216_mg29579_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_path_37463 = "8<]$*Lpu{s`!Z[l/s8=j";
            String __DSPOT_path_26454 = "/!h(VVkSJp3BPMX%5b2O";
            File __DSPOT_file_24197 = new File("%hUJ Z]oSY<E7JH58O1i");
            String __DSPOT_instanceName_24196 = "a8 0R)!.w|MR@<}1xbNM";
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
            boolean boolean_3389 = (handle.totalNodes()) == 1;
            boolean boolean_3390 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3391 = (handle.totalNodes()) == 3;
            boolean o_testInitFromModel_mg19474__27 = handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3392 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.mergeFromFile(__DSPOT_instanceName_24196, __DSPOT_file_24197);
            DataModelHandle o_testInitFromModel_mg19474_mg21216__38 = copy.getDataHandle(__DSPOT_path_26454);
            o_testInitFromModel_mg19474_mg21216__38.removeValue(__DSPOT_path_37463);
            org.junit.Assert.fail("testInitFromModel_mg19474_mg21216_mg29579 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("DataHandle node is null", expected.getMessage());
        }
    }
}

