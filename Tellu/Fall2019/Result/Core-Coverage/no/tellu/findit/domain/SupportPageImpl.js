var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":84,"id":10054,"methods":[{"el":21,"sc":5,"sl":17},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":57,"sc":5,"sl":55},{"el":61,"sc":5,"sl":59},{"el":65,"sc":5,"sl":63},{"el":70,"sc":5,"sl":67},{"el":74,"sc":5,"sl":72},{"el":79,"sc":5,"sl":76},{"el":83,"sc":5,"sl":81}],"name":"SupportPageImpl","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":17}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":20}]},"test_10":{"methods":[{"sl":17}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_16":{"methods":[{"sl":17}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_35":{"methods":[{"sl":17}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_54":{"methods":[{"sl":17}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":20}]},"test_66":{"methods":[{"sl":17}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":20}]},"test_72":{"methods":[{"sl":17}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":20}]},"test_73":{"methods":[{"sl":17}],"name":"testStar","pass":true,"statements":[{"sl":20}]},"test_75":{"methods":[{"sl":17}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":20}]},"test_77":{"methods":[{"sl":17}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_85":{"methods":[{"sl":17}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":20}]},"test_94":{"methods":[{"sl":17}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
