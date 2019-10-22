var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":494,"id":6666,"methods":[{"el":60,"sc":2,"sl":58},{"el":67,"sc":2,"sl":65},{"el":87,"sc":2,"sl":82},{"el":97,"sc":2,"sl":92},{"el":110,"sc":2,"sl":108},{"el":117,"sc":2,"sl":115},{"el":127,"sc":2,"sl":125},{"el":135,"sc":2,"sl":133},{"el":142,"sc":2,"sl":140},{"el":158,"sc":2,"sl":152},{"el":170,"sc":2,"sl":166},{"el":180,"sc":2,"sl":178},{"el":187,"sc":2,"sl":185},{"el":195,"sc":2,"sl":193},{"el":202,"sc":2,"sl":200},{"el":209,"sc":2,"sl":207},{"el":216,"sc":2,"sl":214},{"el":223,"sc":2,"sl":221},{"el":241,"sc":2,"sl":228},{"el":257,"sc":2,"sl":252},{"el":275,"sc":2,"sl":269},{"el":295,"sc":2,"sl":288},{"el":311,"sc":2,"sl":306},{"el":331,"sc":2,"sl":324},{"el":343,"sc":2,"sl":338},{"el":365,"sc":2,"sl":355},{"el":377,"sc":2,"sl":372},{"el":399,"sc":2,"sl":389},{"el":411,"sc":2,"sl":406},{"el":424,"sc":2,"sl":419},{"el":446,"sc":2,"sl":436},{"el":458,"sc":2,"sl":453},{"el":471,"sc":2,"sl":466},{"el":493,"sc":2,"sl":483}],"name":"Logger","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":372}],"name":"testInitFromModel","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_23":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372}],"name":"testMergeNodes","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375}]},"test_29":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372}],"name":"testSubscribers","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375}]},"test_3":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testRuleTrigger","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_32":{"methods":[{"sl":372}],"name":"testInitFromMeta","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_33":{"methods":[{"sl":372}],"name":"testInitFromFile","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_34":{"methods":[{"sl":372}],"name":"testPath","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_43":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":453}],"name":"testDataTransaction","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_46":{"methods":[{"sl":200},{"sl":355},{"sl":372},{"sl":389}],"name":"testReset","pass":true,"statements":[{"sl":201},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_5":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testCopyModel","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_50":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testRuleCondition","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_52":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testProcessor","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 52, 3, 29, 5, 43, 23], [50, 52, 3, 29, 5, 43, 23], [50, 52, 3, 29, 5, 43, 23], [50, 52, 3, 29, 5, 43, 23], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [], [], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [50, 52, 3, 29, 5, 43, 23, 46], [], [], [], [], [], [], [], [], [50, 52, 3, 29, 33, 34, 5, 32, 43, 11, 23, 46], [50, 52, 3, 29, 33, 34, 5, 32, 43, 11, 23, 46], [50, 52, 3, 29, 33, 34, 5, 32, 43, 11, 23, 46], [50, 52, 3, 29, 33, 34, 5, 32, 43, 11, 23, 46], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 52, 3, 5, 46], [50, 52, 3, 5, 46], [50, 52, 3, 5, 46], [50, 52, 3, 5, 46], [], [], [50, 52, 3, 5, 46], [50, 52, 3, 5, 46], [50, 52, 3, 5, 46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [43], [43], [43], [43], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
