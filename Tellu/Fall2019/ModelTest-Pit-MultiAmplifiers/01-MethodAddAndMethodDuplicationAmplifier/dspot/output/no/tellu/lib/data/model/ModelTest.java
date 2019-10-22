package no.tellu.lib.data.model;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.DataSerializer;
import no.tellu.lib.data.MetaTest;
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
    public void testInitFromFile_add227() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataModelHandle o_testInitFromFile_add227__10 = model.getDataHandle("/header/length");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add227__10)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).isValueNode());
        Assert.assertEquals("length", ((DataModelHandle) (o_testInitFromFile_add227__10)).getName());
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_755 = (handle.totalNodes()) == 1;
        boolean boolean_756 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_757 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_add227__21 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_add227__21);
        handle = model.getDataHandle("/person");
        boolean boolean_758 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add227__10)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add227__10)).isValueNode());
        Assert.assertEquals("length", ((DataModelHandle) (o_testInitFromFile_add227__10)).getName());
        Assert.assertTrue(o_testInitFromFile_add227__21);
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
}

