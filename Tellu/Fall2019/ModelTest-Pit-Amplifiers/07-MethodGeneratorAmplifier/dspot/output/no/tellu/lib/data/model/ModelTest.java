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
    public void testInitFromFile_mg6760() throws IOException, DataNotFoundException {
        DataGroupNode __DSPOT_node_8708 = new DataGroupNode("/8/vEr/Gk3(.O/#|FEEK");
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
        boolean o_testInitFromFile_mg6760__22 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_mg6760__22);
        handle = model.getDataHandle("/person");
        boolean boolean_3021 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg6760__29 = js.serialize(__DSPOT_node_8708);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6760__29);
        Assert.assertTrue(o_testInitFromFile_mg6760__22);
    }

    @Test(timeout = 1000)
    public void testInitFromFile_mg6760_mg6802() throws IOException, DataNotFoundException {
        boolean __DSPOT_keepMeta_8736 = false;
        boolean __DSPOT_modifiedOnly_8735 = true;
        String __DSPOT_newName_8734 = "OG=z.*93}[,Yc!B.f#ky";
        DataGroupNode __DSPOT_node_8708 = new DataGroupNode("/8/vEr/Gk3(.O/#|FEEK");
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
        boolean o_testInitFromFile_mg6760__22 = handle.getString(null).equals("str1");
        handle = model.getDataHandle("/person");
        boolean boolean_3021 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        String o_testInitFromFile_mg6760__29 = js.serialize(__DSPOT_node_8708);
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6760__29);
        DataNode o_testInitFromFile_mg6760_mg6802__37 = __DSPOT_node_8708.cloneNode(__DSPOT_newName_8734, __DSPOT_modifiedOnly_8735, __DSPOT_keepMeta_8736);
        Assert.assertTrue(((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).isValid());
        Assert.assertNull(((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getMetaNode());
        Assert.assertEquals("OG=z.*93}[,Yc!B.f#ky[0]", ((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).toString());
        Assert.assertFalse(((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).isModified());
        Assert.assertEquals("OG=z.*93}[,Yc!B.f#ky", ((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getName());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).isValid());
        Assert.assertTrue(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).hasNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).isValueNode());
        Assert.assertFalse(((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).hasOpenTransaction());
        Assert.assertEquals("OG=z.*93}[,Yc!B.f#ky", ((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).getName());
        Assert.assertTrue(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).getNode())).isValid());
        Assert.assertNull(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).getNode())).getMetaNode());
        Assert.assertFalse(((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).getNode())).isModified());
        Assert.assertEquals("OG=z.*93}[,Yc!B.f#ky", ((DataNode) (((DataHandle) (((DataGroupNode) (o_testInitFromFile_mg6760_mg6802__37)).getHandle())).getNode())).getName());
        Assert.assertEquals("{\n\n}", o_testInitFromFile_mg6760__29);
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
    public void testInitFromModel_mg7983() throws IOException, DataNotFoundException {
        String __DSPOT_name_9345 = "qCzf^`hZ$tmF%K-&h|,s";
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
        boolean o_testInitFromModel_mg7983__25 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromModel_mg7983__25);
        handle = copy.getDataHandle("/person");
        boolean boolean_3085 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        boolean o_testInitFromModel_mg7983__32 = copy.hasDataProvider(__DSPOT_name_9345);
        Assert.assertFalse(o_testInitFromModel_mg7983__32);
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValid());
        Assert.assertTrue(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).hasNode());
        Assert.assertFalse(((DataModelHandle) (((DataModel) (copy)).getRootHandle())).isValueNode());
        Assert.assertEquals("", ((DataModelHandle) (((DataModel) (copy)).getRootHandle())).getName());
        Assert.assertTrue(o_testInitFromModel_mg7983__25);
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg7981_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_instance_9343 = "ahqKh<@,}r#EKe0Pz*_>";
            DataModel __DSPOT_source_9342 = new DataModel(new no.tellu.lib.log.Logger("hX%&:JU:3#=;Rx></z6/"));
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
            boolean boolean_3074 = (handle.totalNodes()) == 1;
            boolean boolean_3075 = (handle.getFloat(null)) == 1.234F;
            handle = copy.getDataHandle("/header/array");
            boolean boolean_3076 = (handle.totalNodes()) == 3;
            handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3077 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            copy.copyMetaData(__DSPOT_source_9342, __DSPOT_instance_9343);
            org.junit.Assert.fail("testInitFromModel_mg7981 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Can\'t copyMetaData to initialized DataModel", expected.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testInitFromModel_mg7982_mg8554_mg9591_failAssert0() throws IOException, DataNotFoundException {
        try {
            String __DSPOT_path_10778 = " a!b1;(nQ6y^5:25YEnL";
            File __DSPOT_file_10053 = new File("lE>Q3RoUeN8cGA`Lh{NU", "O[q{/-?3v<jw>iRvBSnI");
            String __DSPOT_instanceName_10052 = "T@c!q?tAr?!&TFSx}$KJ";
            String __DSPOT_path_9344 = "8Uew|Kg:(B_RXpR)[3fs";
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
            boolean o_testInitFromModel_mg7982__25 = handle.getString(null).equals("str1");
            handle = copy.getDataHandle("/person");
            boolean boolean_3081 = (handle.totalNodes()) == 2;
            System.out.print("\n");
            DataModelHandle o_testInitFromModel_mg7982__32 = copy.getDataHandle(__DSPOT_path_9344);
            copy.setInstanceFile(__DSPOT_instanceName_10052, __DSPOT_file_10053);
            o_testInitFromModel_mg7982__32.removeValue(__DSPOT_path_10778);
            org.junit.Assert.fail("testInitFromModel_mg7982_mg8554_mg9591 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("DataHandle node is null", expected.getMessage());
        }
    }
}

