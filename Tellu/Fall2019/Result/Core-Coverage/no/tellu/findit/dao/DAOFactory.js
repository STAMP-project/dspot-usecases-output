var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":1605,"methods":[{"el":15,"sc":5,"sl":9}],"name":"DAOFactory","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":9}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_16":{"methods":[{"sl":9}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_35":{"methods":[{"sl":9}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":10},{"sl":11}]},"test_77":{"methods":[{"sl":9}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [16, 35, 10, 77], [16, 35, 10, 77], [16, 35, 10, 77], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
