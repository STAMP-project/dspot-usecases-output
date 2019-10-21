package no.tellu.lib.data.model;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import no.tellu.lib.data.DataHandle;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.DataSerializer;
import no.tellu.lib.data.DataValueNode;
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

    @Test(timeout = 10000)
    public void testInitFromFile_add112() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_391 = (handle.totalNodes()) == 1;
        boolean boolean_392 = (handle.getFloat(null)) == 1.234F;
        DataModelHandle o_testInitFromFile_add112__16 = model.getDataHandle("/header/array");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add112__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add112__16)).getName());
        handle = model.getDataHandle("/header/array");
        boolean boolean_393 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile_add112__21 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile_add112__21);
        handle = model.getDataHandle("/person");
        boolean boolean_394 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        Assert.assertFalse(((DataModelHandle) (o_testInitFromFile_add112__16)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).hasNode());
        Assert.assertTrue(((DataModelHandle) (o_testInitFromFile_add112__16)).isValueNode());
        Assert.assertEquals("array", ((DataModelHandle) (o_testInitFromFile_add112__16)).getName());
        Assert.assertTrue(o_testInitFromFile_add112__21);
    }

    @Test(timeout = 10000)
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

    @Test(timeout = 10000)
    public void testSubscribers_add18629_add19601() throws IOException {
        System.out.println(" === testSubscribers ===");
        model.setMainSerializer(new JsonSerializer());
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getRootHandle();
        ModelTest.TestSubscriber rootSub = new ModelTest.TestSubscriber() {
            @Override
            public void onDataValueUpdate(DataHandle data) {
                super.onDataValueUpdate(data);
                data.removeDataSubscriber("/", this);
            }
        };
        handle.addDataSubscriber("/", rootSub);
        ModelTest.TestSubscriber arraySub = new ModelTest.TestSubscriber() {
            @Override
            public void onDataValueUpdate(DataHandle data) {
                super.onDataValueUpdate(data);
                data.startTransaction();
                data.startTransaction();
                data.setValue("/person[2]/phone[1]/number", "98765432");
                data.commitTransaction();
            }
        };
        handle.addDataSubscriber("/header/array", arraySub);
        ModelTest.TestSubscriber phoneSub = new ModelTest.TestSubscriber();
        handle.addDataSubscriber("/person/phone/number", phoneSub);
        ModelTest.TestSubscriber advancedSub = new ModelTest.TestSubscriber();
        handle.addDataSubscriber("/person", "phone/number", "name=Person2", advancedSub);
        handle.startTransaction(rootSub, null);
        handle.setValue("/header/length", 2.0F);
        handle.commitTransaction();
        boolean o_testSubscribers_add18629__41 = rootSub.wasCalled();
        boolean o_testSubscribers_add18629__42 = arraySub.wasCalled();
        DataHandle o_testSubscribers_add18629_add19601__47 = handle.getDataHandle("/header");
        Assert.assertFalse(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).hasNode());
        Assert.assertFalse(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).isValueNode());
        Assert.assertEquals("header", ((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).getName());
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.addNode(new DataValueNode("array", "str4"));
        header.commitTransaction();
        boolean o_testSubscribers_add18629__49 = rootSub.wasCalled();
        boolean o_testSubscribers_add18629__50 = arraySub.wasCalled();
        boolean o_testSubscribers_add18629__51 = phoneSub.wasCalled();
        boolean o_testSubscribers_add18629__52 = advancedSub.wasCalled();
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        handle.commitTransaction();
        boolean o_testSubscribers_add18629__56 = rootSub.wasCalled();
        boolean o_testSubscribers_add18629__57 = rootSub.wasCalled();
        boolean o_testSubscribers_add18629__58 = phoneSub.wasCalled();
        boolean o_testSubscribers_add18629__59 = phoneSub.wasCalled();
        boolean o_testSubscribers_add18629__60 = advancedSub.wasCalled();
        model.clearDataSubscribers();
        handle.startTransaction();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        handle.commitTransaction();
        boolean o_testSubscribers_add18629__65 = phoneSub.wasCalled();
        boolean o_testSubscribers_add18629__66 = advancedSub.wasCalled();
        boolean o_testSubscribers_add18629__67 = advancedSub.wasCalled();
        System.out.print("\n");
        Assert.assertTrue(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).hasOpenTransaction());
        Assert.assertTrue(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).isValid());
        Assert.assertTrue(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).hasNode());
        Assert.assertFalse(((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).isValueNode());
        Assert.assertEquals("header", ((DataModelHandle) (o_testSubscribers_add18629_add19601__47)).getName());
    }
}

