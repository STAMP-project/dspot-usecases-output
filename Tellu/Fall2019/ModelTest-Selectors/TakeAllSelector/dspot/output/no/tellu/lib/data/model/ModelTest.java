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
    public void testInitFromMeta() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromMeta ===");
        model.initFromMeta();
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_15 = (handle.totalNodes()) == 1;
        boolean boolean_16 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_17 = (handle.totalNodes()) == 2;
        boolean o_testInitFromMeta__13 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromMeta__13);
        handle = model.getDataHandle("/person/name");
        boolean boolean_18 = (handle.totalNodes()) == 0;
        System.out.print("\n");
        Assert.assertTrue(o_testInitFromMeta__13);
    }

    @Test(timeout = 10000)
    public void testInitFromFile() throws IOException, DataNotFoundException {
        System.out.println(" === testInitFromFile ===");
        JsonSerializer js = new JsonSerializer();
        js.setMetaOptions(((DataSerializer.METAFLAG_INCLUDE_REF) | (DataSerializer.METAFLAG_MISSING_CREATE)));
        model.setMainSerializer(js);
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
        model.setMainFile(null);
        DataHandle handle = model.getDataHandle("/header/length");
        boolean boolean_11 = (handle.totalNodes()) == 1;
        boolean boolean_12 = (handle.getFloat(null)) == 1.234F;
        handle = model.getDataHandle("/header/array");
        boolean boolean_13 = (handle.totalNodes()) == 3;
        boolean o_testInitFromFile__20 = handle.getString(null).equals("str1");
        Assert.assertTrue(o_testInitFromFile__20);
        handle = model.getDataHandle("/person");
        boolean boolean_14 = (handle.totalNodes()) == 2;
        System.out.print("\n");
        Assert.assertTrue(o_testInitFromFile__20);
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
    public void testSubscribers() throws IOException {
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
        boolean o_testSubscribers__40 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__40);
        boolean o_testSubscribers__41 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers__41);
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.addNode(new DataValueNode("array", "str4"));
        header.commitTransaction();
        boolean o_testSubscribers__48 = rootSub.wasCalled();
        Assert.assertTrue(o_testSubscribers__48);
        boolean o_testSubscribers__49 = arraySub.wasCalled();
        Assert.assertTrue(o_testSubscribers__49);
        boolean o_testSubscribers__50 = phoneSub.wasCalled();
        Assert.assertTrue(o_testSubscribers__50);
        boolean o_testSubscribers__51 = advancedSub.wasCalled();
        Assert.assertTrue(o_testSubscribers__51);
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        handle.commitTransaction();
        boolean o_testSubscribers__55 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__55);
        boolean o_testSubscribers__56 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__56);
        boolean o_testSubscribers__57 = phoneSub.wasCalled();
        Assert.assertTrue(o_testSubscribers__57);
        boolean o_testSubscribers__58 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__58);
        boolean o_testSubscribers__59 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__59);
        model.clearDataSubscribers();
        handle.startTransaction();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        handle.commitTransaction();
        boolean o_testSubscribers__64 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__64);
        boolean o_testSubscribers__65 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__65);
        boolean o_testSubscribers__66 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers__66);
        System.out.print("\n");
        Assert.assertFalse(o_testSubscribers__40);
        Assert.assertFalse(o_testSubscribers__41);
        Assert.assertTrue(o_testSubscribers__48);
        Assert.assertTrue(o_testSubscribers__49);
        Assert.assertTrue(o_testSubscribers__50);
        Assert.assertTrue(o_testSubscribers__51);
        Assert.assertFalse(o_testSubscribers__55);
        Assert.assertFalse(o_testSubscribers__56);
        Assert.assertTrue(o_testSubscribers__57);
        Assert.assertFalse(o_testSubscribers__58);
        Assert.assertFalse(o_testSubscribers__59);
        Assert.assertFalse(o_testSubscribers__64);
        Assert.assertFalse(o_testSubscribers__65);
        Assert.assertFalse(o_testSubscribers__66);
    }
}

