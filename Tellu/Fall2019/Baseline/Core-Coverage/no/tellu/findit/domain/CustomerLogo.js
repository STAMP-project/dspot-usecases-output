var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":5816,"methods":[{"el":21,"sc":5,"sl":17},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":38,"sc":5,"sl":35},{"el":42,"sc":5,"sl":40},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":50},{"el":57,"sc":5,"sl":54},{"el":62,"sc":5,"sl":60}],"name":"CustomerLogo","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":17}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_31":{"methods":[{"sl":17}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":20}]},"test_32":{"methods":[{"sl":17}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_42":{"methods":[{"sl":17}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":20}]},"test_44":{"methods":[{"sl":17}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":20}]},"test_47":{"methods":[{"sl":17}],"name":"testStar","pass":true,"statements":[{"sl":20}]},"test_56":{"methods":[{"sl":17}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":20}]},"test_59":{"methods":[{"sl":17}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":20}]},"test_67":{"methods":[{"sl":17}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":20}]},"test_71":{"methods":[{"sl":17}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":20}]},"test_80":{"methods":[{"sl":17}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":20}]},"test_9":{"methods":[{"sl":17}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]