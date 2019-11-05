package no.tellu.findit.util;


import java.util.Collection;
import java.util.Map;
import junit.framework.TestCase;


public class RuleTemplateSubstituterTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testSubstituteRules() throws Exception {
        String s = "//# mandatory simple integer key3 = \"3\" \n" + (((((("//# mandatory simple string rule_id \n" + "//# mandatory complex asset key1 (id, name, type) \n") + "rule ${%rule_id%} \n") + "${%hurr%}asset : Asset(${test==%key3%}) \n") + "test : Hmmz(${test2==%key1.name%, type == %key1.type%}) \n") + "//! sms email \n") + "//@ $asset");
        String s2 = "rule ${%rule_id%}\n" + (("${%hurr%}asset : Asset(${test==%key3%})\n" + "test : Hmmz(${test2==%key1.name%, type == %key1.type%})\n") + "//@\n");
        TestCase.assertEquals("rule ${%rule_id%}\n${%hurr%}asset : Asset(${test==%key3%})\ntest : Hmmz(${test2==%key1.name%, type == %key1.type%})\n//@\n", s2);
        RuleTemplateSubstituter sub = new RuleTemplateSubstituter();
        TestCase.assertNull(((RuleTemplateSubstituter) (sub)).getInspectedCode());
        TestCase.assertTrue(((RuleTemplateSubstituter) (sub)).getVariables().isEmpty());
        TestCase.assertTrue(((Collection) (((RuleTemplateSubstituter) (sub)).getDisallowedActions())).isEmpty());
        TestCase.assertNull(((RuleTemplateSubstituter) (sub)).getActionAssetParameter());
        TestCase.assertNull(((RuleTemplateSubstituter) (sub)).getTemplateCode());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionZoneParameter());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionObservationParameter());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionDataParameter());
        sub.setTemplateCode(s);
        String o_testSubstituteRules__6 = sub.getInspectedCode();
        TestCase.assertEquals("rule ${%rule_id%}\n${%hurr%}asset : Asset(${test==%key3%})\ntest : Hmmz(${test2==%key1.name%, type == %key1.type%})\n//@\n", o_testSubstituteRules__6);
        Map<String, RuleTemplateSubstituterVariable> vars = sub.getVariables();
        RuleTemplateSubstituterVariable o_testSubstituteRules__9 = vars.get("key3");
        TestCase.assertEquals("{ mandatory = true, complex = false, type = integer, key = key3, fields = [], fieldValues = {}, value = , defaultValue = 3, ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__9)).toString());
        RuleTemplateSubstituterVariable o_testSubstituteRules__10 = vars.get("key1");
        TestCase.assertEquals("{ mandatory = true, complex = true, type = asset, key = key1, fields = [id, name, type], fieldValues = {}, value = , defaultValue = , ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__10)).toString());
        RuleTemplateSubstituterVariable o_testSubstituteRules__11 = vars.get("rule_id");
        TestCase.assertEquals("{ mandatory = true, complex = false, type = string, key = rule_id, fields = [], fieldValues = {}, value = , defaultValue = , ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__11)).toString());
        String o_testSubstituteRules__12 = vars.get("key1").fields.get(0);
        TestCase.assertEquals("id", o_testSubstituteRules__12);
        String o_testSubstituteRules__14 = vars.get("key1").fields.get(1);
        TestCase.assertEquals("name", o_testSubstituteRules__14);
        String o_testSubstituteRules__16 = vars.get("key1").fields.get(2);
        TestCase.assertEquals("type", o_testSubstituteRules__16);
        String o_testSubstituteRules__18 = sub.getDisallowedActions().get(0);
        TestCase.assertEquals("sms", o_testSubstituteRules__18);
        String o_testSubstituteRules__20 = sub.getDisallowedActions().get(1);
        TestCase.assertEquals("email", o_testSubstituteRules__20);
        String o_testSubstituteRules__22 = sub.getActionAssetParameter();
        TestCase.assertEquals("$asset", o_testSubstituteRules__22);
        sub.addSubstitution("rule_id", "19");
        sub.addSubstitution("key3", "16");
        sub.addSubstitution("key1.id", "2");
        sub.addSubstitution("key1.name", "Magnus");
        sub.addSubstitution("key1.type", "Person");
        String subtext = sub.substitute();
        TestCase.assertEquals("rule 19\nasset : Asset(test==16)\ntest : Hmmz(test2==Magnus, type == Person)\n//@\n", subtext);
        String String_0 = "rule 19\n" + (("asset : Asset(test==16)\n" + "test : Hmmz(test2==Magnus, type == Person)\n") + "//@\n");
        TestCase.assertEquals("rule 19\nasset : Asset(test==16)\ntest : Hmmz(test2==Magnus, type == Person)\n//@\n", String_0);
        TestCase.assertEquals("rule ${%rule_id%}\n${%hurr%}asset : Asset(${test==%key3%})\ntest : Hmmz(${test2==%key1.name%, type == %key1.type%})\n//@\n", s2);
        TestCase.assertEquals("rule ${%rule_id%}\n${%hurr%}asset : Asset(${test==%key3%})\ntest : Hmmz(${test2==%key1.name%, type == %key1.type%})\n//@\n", ((RuleTemplateSubstituter) (sub)).getInspectedCode());
        TestCase.assertFalse(((RuleTemplateSubstituter) (sub)).getVariables().isEmpty());
        TestCase.assertTrue(((no.tellu.findit.util.RuleTemplateSubstituter)sub).getDisallowedActions().contains("sms"));
        TestCase.assertTrue(((no.tellu.findit.util.RuleTemplateSubstituter)sub).getDisallowedActions().contains("email"));
        TestCase.assertEquals("$asset", ((RuleTemplateSubstituter) (sub)).getActionAssetParameter());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionZoneParameter());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionObservationParameter());
        TestCase.assertEquals("null", ((RuleTemplateSubstituter) (sub)).getActionDataParameter());
        TestCase.assertEquals("rule ${%rule_id%}\n${%hurr%}asset : Asset(${test==%key3%})\ntest : Hmmz(${test2==%key1.name%, type == %key1.type%})\n//@\n", o_testSubstituteRules__6);
        TestCase.assertEquals("{ mandatory = true, complex = false, type = integer, key = key3, fields = [], fieldValues = {key3=16}, value = 16, defaultValue = 3, ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__9)).toString());
        TestCase.assertEquals("{ mandatory = true, complex = true, type = asset, key = key1, fields = [id, name, type], fieldValues = {name=Magnus, id=2, type=Person}, value = , defaultValue = , ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__10)).toString());
        TestCase.assertEquals("{ mandatory = true, complex = false, type = string, key = rule_id, fields = [], fieldValues = {rule_id=19}, value = 19, defaultValue = , ", ((RuleTemplateSubstituterVariable) (o_testSubstituteRules__11)).toString());
        TestCase.assertEquals("id", o_testSubstituteRules__12);
        TestCase.assertEquals("name", o_testSubstituteRules__14);
        TestCase.assertEquals("type", o_testSubstituteRules__16);
        TestCase.assertEquals("sms", o_testSubstituteRules__18);
        TestCase.assertEquals("email", o_testSubstituteRules__20);
        TestCase.assertEquals("$asset", o_testSubstituteRules__22);
        TestCase.assertEquals("rule 19\nasset : Asset(test==16)\ntest : Hmmz(test2==Magnus, type == Person)\n//@\n", subtext);
    }
}

