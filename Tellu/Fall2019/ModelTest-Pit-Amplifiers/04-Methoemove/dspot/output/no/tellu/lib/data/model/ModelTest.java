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
    public void testSubscribers_remove717() throws IOException {
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
        handle.startTransaction(rootSub, null);
        handle.setValue("/header/length", 2.0F);
        handle.commitTransaction();
        handle.commitTransaction();
        handle.commitTransaction();
        boolean o_testSubscribers_remove717__39 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__39);
        boolean o_testSubscribers_remove717__40 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__40);
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.addNode(new DataValueNode("array", "str4"));
        header.commitTransaction();
        boolean o_testSubscribers_remove717__47 = rootSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove717__47);
        boolean o_testSubscribers_remove717__48 = arraySub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove717__48);
        boolean o_testSubscribers_remove717__49 = phoneSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove717__49);
        boolean o_testSubscribers_remove717__50 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__50);
        handle.startTransaction();
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        boolean o_testSubscribers_remove717__54 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__54);
        boolean o_testSubscribers_remove717__55 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__55);
        boolean o_testSubscribers_remove717__56 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__56);
        boolean o_testSubscribers_remove717__57 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__57);
        boolean o_testSubscribers_remove717__58 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__58);
        model.clearDataSubscribers();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        boolean o_testSubscribers_remove717__63 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__63);
        boolean o_testSubscribers_remove717__64 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__64);
        boolean o_testSubscribers_remove717__65 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove717__65);
        System.out.print("\n");
        Assert.assertFalse(o_testSubscribers_remove717__39);
        Assert.assertFalse(o_testSubscribers_remove717__40);
        Assert.assertTrue(o_testSubscribers_remove717__47);
        Assert.assertTrue(o_testSubscribers_remove717__48);
        Assert.assertTrue(o_testSubscribers_remove717__49);
        Assert.assertFalse(o_testSubscribers_remove717__50);
        Assert.assertFalse(o_testSubscribers_remove717__54);
        Assert.assertFalse(o_testSubscribers_remove717__55);
        Assert.assertFalse(o_testSubscribers_remove717__56);
        Assert.assertFalse(o_testSubscribers_remove717__57);
        Assert.assertFalse(o_testSubscribers_remove717__58);
        Assert.assertFalse(o_testSubscribers_remove717__63);
        Assert.assertFalse(o_testSubscribers_remove717__64);
        Assert.assertFalse(o_testSubscribers_remove717__65);
    }

    @Test(timeout = 10000)
    public void testSubscribers_remove705() throws IOException {
        System.out.println(" === testSubscribers ===");
        model.setMainSerializer(new JsonSerializer());
        model.setMainFile(new File("src/test/resources/data.json"));
        model.initFromFile();
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
        handle.commitTransaction();
        handle.commitTransaction();
        boolean o_testSubscribers_remove705__39 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__39);
        boolean o_testSubscribers_remove705__40 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__40);
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.addNode(new DataValueNode("array", "str4"));
        header.commitTransaction();
        boolean o_testSubscribers_remove705__47 = rootSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove705__47);
        boolean o_testSubscribers_remove705__48 = arraySub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove705__48);
        boolean o_testSubscribers_remove705__49 = phoneSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove705__49);
        boolean o_testSubscribers_remove705__50 = advancedSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove705__50);
        handle.startTransaction();
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        boolean o_testSubscribers_remove705__54 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__54);
        boolean o_testSubscribers_remove705__55 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__55);
        boolean o_testSubscribers_remove705__56 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__56);
        boolean o_testSubscribers_remove705__57 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__57);
        boolean o_testSubscribers_remove705__58 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__58);
        model.clearDataSubscribers();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        boolean o_testSubscribers_remove705__63 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__63);
        boolean o_testSubscribers_remove705__64 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__64);
        boolean o_testSubscribers_remove705__65 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove705__65);
        System.out.print("\n");
        Assert.assertFalse(o_testSubscribers_remove705__39);
        Assert.assertFalse(o_testSubscribers_remove705__40);
        Assert.assertTrue(o_testSubscribers_remove705__47);
        Assert.assertTrue(o_testSubscribers_remove705__48);
        Assert.assertTrue(o_testSubscribers_remove705__49);
        Assert.assertTrue(o_testSubscribers_remove705__50);
        Assert.assertFalse(o_testSubscribers_remove705__54);
        Assert.assertFalse(o_testSubscribers_remove705__55);
        Assert.assertFalse(o_testSubscribers_remove705__56);
        Assert.assertFalse(o_testSubscribers_remove705__57);
        Assert.assertFalse(o_testSubscribers_remove705__58);
        Assert.assertFalse(o_testSubscribers_remove705__63);
        Assert.assertFalse(o_testSubscribers_remove705__64);
        Assert.assertFalse(o_testSubscribers_remove705__65);
    }

    @Test(timeout = 10000)
    public void testSubscribers_remove718_failAssert0() throws IOException {
        try {
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
            handle.setValue("/header/length", 2.0F);
            handle.commitTransaction();
            rootSub.wasCalled();
            arraySub.wasCalled();
            DataHandle header = handle.getDataHandle("/header");
            header.startTransaction();
            header.addNode(new DataValueNode("array", "str4"));
            header.commitTransaction();
            rootSub.wasCalled();
            arraySub.wasCalled();
            phoneSub.wasCalled();
            advancedSub.wasCalled();
            handle.startTransaction();
            handle.setValue("/person[1]/phone[1]/number", "98765432");
            handle.commitTransaction();
            rootSub.wasCalled();
            rootSub.wasCalled();
            phoneSub.wasCalled();
            phoneSub.wasCalled();
            advancedSub.wasCalled();
            model.clearDataSubscribers();
            handle.startTransaction();
            handle.setValue("/person[2]/phone[1]/number", "27491646");
            handle.commitTransaction();
            phoneSub.wasCalled();
            advancedSub.wasCalled();
            advancedSub.wasCalled();
            System.out.print("\n");
            org.junit.Assert.fail("testSubscribers_remove718 should have thrown TransactionException");
        } catch (TransactionException expected) {
            Assert.assertEquals("Attempt to change data outside transaction", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSubscribers_remove722() throws IOException {
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
        handle.commitTransaction();
        handle.commitTransaction();
        boolean o_testSubscribers_remove722__40 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__40);
        boolean o_testSubscribers_remove722__41 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__41);
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.commitTransaction();
        boolean o_testSubscribers_remove722__46 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__46);
        boolean o_testSubscribers_remove722__47 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__47);
        boolean o_testSubscribers_remove722__48 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__48);
        boolean o_testSubscribers_remove722__49 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__49);
        handle.startTransaction();
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        boolean o_testSubscribers_remove722__53 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__53);
        boolean o_testSubscribers_remove722__54 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__54);
        boolean o_testSubscribers_remove722__55 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__55);
        boolean o_testSubscribers_remove722__56 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__56);
        boolean o_testSubscribers_remove722__57 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__57);
        model.clearDataSubscribers();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        boolean o_testSubscribers_remove722__62 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__62);
        boolean o_testSubscribers_remove722__63 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__63);
        boolean o_testSubscribers_remove722__64 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove722__64);
        System.out.print("\n");
        Assert.assertFalse(o_testSubscribers_remove722__40);
        Assert.assertFalse(o_testSubscribers_remove722__41);
        Assert.assertFalse(o_testSubscribers_remove722__46);
        Assert.assertFalse(o_testSubscribers_remove722__47);
        Assert.assertFalse(o_testSubscribers_remove722__48);
        Assert.assertFalse(o_testSubscribers_remove722__49);
        Assert.assertFalse(o_testSubscribers_remove722__53);
        Assert.assertFalse(o_testSubscribers_remove722__54);
        Assert.assertFalse(o_testSubscribers_remove722__55);
        Assert.assertFalse(o_testSubscribers_remove722__56);
        Assert.assertFalse(o_testSubscribers_remove722__57);
        Assert.assertFalse(o_testSubscribers_remove722__62);
        Assert.assertFalse(o_testSubscribers_remove722__63);
        Assert.assertFalse(o_testSubscribers_remove722__64);
    }

    @Test(timeout = 10000)
    public void testSubscribers_remove701() throws IOException {
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
        handle.commitTransaction();
        handle.commitTransaction();
        boolean o_testSubscribers_remove701__39 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__39);
        boolean o_testSubscribers_remove701__40 = arraySub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__40);
        DataHandle header = handle.getDataHandle("/header");
        header.startTransaction();
        header.addNode(new DataValueNode("array", "str4"));
        header.commitTransaction();
        boolean o_testSubscribers_remove701__47 = rootSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove701__47);
        boolean o_testSubscribers_remove701__48 = arraySub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove701__48);
        boolean o_testSubscribers_remove701__49 = phoneSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove701__49);
        boolean o_testSubscribers_remove701__50 = advancedSub.wasCalled();
        Assert.assertTrue(o_testSubscribers_remove701__50);
        handle.startTransaction();
        handle.startTransaction();
        handle.setValue("/person[1]/phone[1]/number", "98765432");
        boolean o_testSubscribers_remove701__54 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__54);
        boolean o_testSubscribers_remove701__55 = rootSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__55);
        boolean o_testSubscribers_remove701__56 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__56);
        boolean o_testSubscribers_remove701__57 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__57);
        boolean o_testSubscribers_remove701__58 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__58);
        model.clearDataSubscribers();
        handle.setValue("/person[2]/phone[1]/number", "27491646");
        boolean o_testSubscribers_remove701__63 = phoneSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__63);
        boolean o_testSubscribers_remove701__64 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__64);
        boolean o_testSubscribers_remove701__65 = advancedSub.wasCalled();
        Assert.assertFalse(o_testSubscribers_remove701__65);
        System.out.print("\n");
        Assert.assertFalse(o_testSubscribers_remove701__39);
        Assert.assertFalse(o_testSubscribers_remove701__40);
        Assert.assertTrue(o_testSubscribers_remove701__47);
        Assert.assertTrue(o_testSubscribers_remove701__48);
        Assert.assertTrue(o_testSubscribers_remove701__49);
        Assert.assertTrue(o_testSubscribers_remove701__50);
        Assert.assertFalse(o_testSubscribers_remove701__54);
        Assert.assertFalse(o_testSubscribers_remove701__55);
        Assert.assertFalse(o_testSubscribers_remove701__56);
        Assert.assertFalse(o_testSubscribers_remove701__57);
        Assert.assertFalse(o_testSubscribers_remove701__58);
        Assert.assertFalse(o_testSubscribers_remove701__63);
        Assert.assertFalse(o_testSubscribers_remove701__64);
        Assert.assertFalse(o_testSubscribers_remove701__65);
    }
}

