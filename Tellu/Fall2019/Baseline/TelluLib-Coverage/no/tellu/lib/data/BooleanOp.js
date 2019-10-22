var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":96,"id":127,"methods":[{"el":19,"sc":3,"sl":15},{"el":24,"sc":3,"sl":21},{"el":32,"sc":3,"sl":28},{"el":37,"sc":3,"sl":34},{"el":43,"sc":3,"sl":41},{"el":48,"sc":3,"sl":45},{"el":54,"sc":3,"sl":52},{"el":59,"sc":3,"sl":56},{"el":74,"sc":2,"sl":74}],"name":"BooleanOp","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":15}],"name":"testGetPath","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_2":{"methods":[{"sl":15}],"name":"testPredicate","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_21":{"methods":[{"sl":15}],"name":"testRemovePredicate","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_26":{"methods":[{"sl":15}],"name":"testJsonSerializer","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_27":{"methods":[{"sl":41},{"sl":45}],"name":"testGreater","pass":true,"statements":[{"sl":42},{"sl":46},{"sl":47}]},"test_29":{"methods":[{"sl":15}],"name":"testSubscribers","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_3":{"methods":[{"sl":15},{"sl":45}],"name":"testRuleTrigger","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_5":{"methods":[{"sl":15},{"sl":74}],"name":"testCopyModel","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":74}]},"test_50":{"methods":[{"sl":15},{"sl":45}],"name":"testRuleCondition","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_51":{"methods":[{"sl":15}],"name":"testXmlSerializer","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_52":{"methods":[{"sl":15},{"sl":45}],"name":"testProcessor","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":46},{"sl":47}]},"test_58":{"methods":[{"sl":28},{"sl":34}],"name":"testNotEquals","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":35},{"sl":36}]},"test_60":{"methods":[{"sl":15},{"sl":21}],"name":"testEquals","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":22},{"sl":23}]},"test_67":{"methods":[{"sl":56}],"name":"testLess","pass":true,"statements":[{"sl":57},{"sl":58}]},"test_75":{"methods":[{"sl":15}],"name":"testAddWithMeta","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_76":{"methods":[{"sl":15}],"name":"testGetNodes","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [29, 21, 76, 5, 26, 50, 2, 52, 3, 51, 60, 19, 75], [29, 21, 76, 5, 26, 50, 2, 52, 3, 51, 60, 19, 75], [29, 21, 76, 5, 26, 50, 2, 52, 3, 51, 60, 19, 75], [29, 21, 76, 5, 26, 50, 2, 52, 3, 51, 60, 19, 75], [], [], [60], [60], [60], [], [], [], [], [58], [58], [58], [58], [], [], [58], [58], [58], [], [], [], [], [27], [27], [], [], [50, 27, 52, 3], [50, 27, 52, 3], [50, 27, 52, 3], [], [], [], [], [], [], [], [], [67], [67], [67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
