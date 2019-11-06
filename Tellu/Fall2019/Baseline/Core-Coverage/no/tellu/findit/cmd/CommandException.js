var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":668,"methods":[{"el":9,"sc":5,"sl":7},{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"CommandException","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_32":{"methods":[{"sl":7},{"sl":19}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":8},{"sl":20}]},"test_5":{"methods":[{"sl":15}],"name":"testSaveNewAssetNotAllowed","pass":true,"statements":[{"sl":16}]},"test_80":{"methods":[{"sl":19}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [32], [32], [], [], [], [], [], [], [5], [5], [], [], [32, 80], [32, 80], [], [], []]
