var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":84,"id":10054,"methods":[{"el":21,"sc":5,"sl":17},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":57,"sc":5,"sl":55},{"el":61,"sc":5,"sl":59},{"el":65,"sc":5,"sl":63},{"el":70,"sc":5,"sl":67},{"el":74,"sc":5,"sl":72},{"el":79,"sc":5,"sl":76},{"el":83,"sc":5,"sl":81}],"name":"SupportPageImpl","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":17}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_31":{"methods":[{"sl":17}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":20}]},"test_32":{"methods":[{"sl":17}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_42":{"methods":[{"sl":17}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":20}]},"test_44":{"methods":[{"sl":17}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_47":{"methods":[{"sl":17}],"name":"testStar","pass":true,"statements":[{"sl":20}]},"test_56":{"methods":[{"sl":17}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":20}]},"test_59":{"methods":[{"sl":17}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":20}]},"test_67":{"methods":[{"sl":17}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":20}]},"test_71":{"methods":[{"sl":17}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":20}]},"test_80":{"methods":[{"sl":17}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_9":{"methods":[{"sl":17}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]