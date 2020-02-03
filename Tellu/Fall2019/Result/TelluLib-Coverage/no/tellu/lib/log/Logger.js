var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":494,"id":6666,"methods":[{"el":60,"sc":2,"sl":58},{"el":67,"sc":2,"sl":65},{"el":87,"sc":2,"sl":82},{"el":97,"sc":2,"sl":92},{"el":110,"sc":2,"sl":108},{"el":117,"sc":2,"sl":115},{"el":127,"sc":2,"sl":125},{"el":135,"sc":2,"sl":133},{"el":142,"sc":2,"sl":140},{"el":158,"sc":2,"sl":152},{"el":170,"sc":2,"sl":166},{"el":180,"sc":2,"sl":178},{"el":187,"sc":2,"sl":185},{"el":195,"sc":2,"sl":193},{"el":202,"sc":2,"sl":200},{"el":209,"sc":2,"sl":207},{"el":216,"sc":2,"sl":214},{"el":223,"sc":2,"sl":221},{"el":241,"sc":2,"sl":228},{"el":257,"sc":2,"sl":252},{"el":275,"sc":2,"sl":269},{"el":295,"sc":2,"sl":288},{"el":311,"sc":2,"sl":306},{"el":331,"sc":2,"sl":324},{"el":343,"sc":2,"sl":338},{"el":365,"sc":2,"sl":355},{"el":377,"sc":2,"sl":372},{"el":399,"sc":2,"sl":389},{"el":411,"sc":2,"sl":406},{"el":424,"sc":2,"sl":419},{"el":446,"sc":2,"sl":436},{"el":458,"sc":2,"sl":453},{"el":471,"sc":2,"sl":466},{"el":493,"sc":2,"sl":483}],"name":"Logger","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_105":{"methods":[{"sl":372}],"name":"testInitFromFile_mg6903_mg6945","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_112":{"methods":[{"sl":372}],"name":"testInitFromFile_mg7508_mg7803","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_113":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testRuleTrigger","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_117":{"methods":[{"sl":372},{"sl":453}],"name":"testInitFromModel_mg20100_failAssert0","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_122":{"methods":[{"sl":372}],"name":"testInitFromModel_mg8118","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_125":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testCopyModel","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_126":{"methods":[{"sl":372}],"name":"testInitFromFile_add7501","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_137":{"methods":[{"sl":200},{"sl":355},{"sl":372},{"sl":389}],"name":"testReset","pass":true,"statements":[{"sl":201},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_144":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":453}],"name":"testDataTransaction","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_147":{"methods":[{"sl":372}],"name":"testInitFromFile_mg6903_mg6951_mg7303","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_167":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testProcessor","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_178":{"methods":[{"sl":372}],"name":"testInitFromFile_add7505_add7831_mg12577_failAssert0","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_193":{"methods":[{"sl":58},{"sl":372},{"sl":453}],"name":"testInitFromModel_mg8121_mg8234_failAssert0","pass":true,"statements":[{"sl":59},{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_201":{"methods":[{"sl":372}],"name":"testInitFromModel_mg20102","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_208":{"methods":[{"sl":372}],"name":"testInitFromFile_add53394","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_209":{"methods":[{"sl":372}],"name":"testInitFromMeta","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_211":{"methods":[{"sl":372}],"name":"testInitFromFile","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_229":{"methods":[{"sl":372}],"name":"testInitFromModel","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_235":{"methods":[{"sl":372}],"name":"testInitFromFile_mg6903","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_238":{"methods":[{"sl":338},{"sl":372}],"name":"testInitFromModel_mg8117_mg8480_mg12247","pass":true,"statements":[{"sl":339},{"sl":340},{"sl":341},{"sl":373},{"sl":374},{"sl":375}]},"test_244":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372}],"name":"testSubscribers","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375}]},"test_266":{"methods":[{"sl":58},{"sl":372},{"sl":453}],"name":"testInitFromModel_mg8122_mg8434_failAssert0","pass":true,"statements":[{"sl":59},{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_273":{"methods":[{"sl":372}],"name":"testInitFromModel_mg8117_mg8493_mg11253_failAssert0","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_276":{"methods":[{"sl":372}],"name":"testInitFromFile_add7501_mg8100_failAssert0","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_305":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372}],"name":"testMergeNodes","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375}]},"test_40":{"methods":[{"sl":372}],"name":"testInitFromModel2","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_44":{"methods":[{"sl":200},{"sl":338},{"sl":355},{"sl":372},{"sl":389}],"name":"testRuleCondition","pass":true,"statements":[{"sl":201},{"sl":339},{"sl":340},{"sl":341},{"sl":356},{"sl":357},{"sl":358},{"sl":361},{"sl":362},{"sl":363},{"sl":373},{"sl":374},{"sl":375},{"sl":390},{"sl":391},{"sl":392},{"sl":395},{"sl":396},{"sl":397}]},"test_54":{"methods":[{"sl":372}],"name":"testPath","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]},"test_59":{"methods":[{"sl":338},{"sl":372}],"name":"testInitFromFile_add7501_mg8102","pass":true,"statements":[{"sl":339},{"sl":340},{"sl":341},{"sl":373},{"sl":374},{"sl":375}]},"test_8":{"methods":[{"sl":58},{"sl":372},{"sl":453}],"name":"testInitFromModel_mg8121_mg8234_failAssert0_mg12004_failAssert0","pass":true,"statements":[{"sl":59},{"sl":373},{"sl":374},{"sl":375},{"sl":454},{"sl":455},{"sl":456}]},"test_83":{"methods":[{"sl":372}],"name":"testInitFromFile_mg7508","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [266, 193, 8], [266, 193, 8], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [144, 125, 44, 238, 305, 244, 113, 167, 59], [144, 125, 44, 238, 305, 244, 113, 167, 59], [144, 125, 44, 238, 305, 244, 113, 167, 59], [144, 125, 44, 238, 305, 244, 113, 167, 59], [], [], [], [], [], [], [], [], [], [], [], [], [], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [], [], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [144, 137, 125, 44, 305, 244, 113, 167], [], [], [], [], [], [], [], [], [208, 229, 144, 137, 266, 211, 112, 209, 125, 83, 117, 126, 44, 201, 193, 40, 238, 305, 244, 54, 8, 113, 122, 276, 235, 167, 105, 59, 178, 147, 273], [208, 229, 144, 137, 266, 211, 112, 209, 125, 83, 117, 126, 44, 201, 193, 40, 238, 305, 244, 54, 8, 113, 122, 276, 235, 167, 105, 59, 178, 147, 273], [208, 229, 144, 137, 266, 211, 112, 209, 125, 83, 117, 126, 44, 201, 193, 40, 238, 305, 244, 54, 8, 113, 122, 276, 235, 167, 105, 59, 178, 147, 273], [208, 229, 144, 137, 266, 211, 112, 209, 125, 83, 117, 126, 44, 201, 193, 40, 238, 305, 244, 54, 8, 113, 122, 276, 235, 167, 105, 59, 178, 147, 273], [], [], [], [], [], [], [], [], [], [], [], [], [], [137, 125, 44, 113, 167], [137, 125, 44, 113, 167], [137, 125, 44, 113, 167], [137, 125, 44, 113, 167], [], [], [137, 125, 44, 113, 167], [137, 125, 44, 113, 167], [137, 125, 44, 113, 167], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [144, 266, 117, 193, 8], [144, 266, 117, 193, 8], [144, 266, 117, 193, 8], [144, 266, 117, 193, 8], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]