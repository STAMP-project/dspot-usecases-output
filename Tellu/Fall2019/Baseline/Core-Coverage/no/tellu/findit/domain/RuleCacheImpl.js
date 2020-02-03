var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":79,"id":8852,"methods":[{"el":25,"sc":5,"sl":21},{"el":28,"sc":5,"sl":26},{"el":33,"sc":5,"sl":30},{"el":38,"sc":5,"sl":35},{"el":45,"sc":5,"sl":41},{"el":48,"sc":5,"sl":46},{"el":54,"sc":5,"sl":50},{"el":57,"sc":5,"sl":55},{"el":63,"sc":5,"sl":59},{"el":67,"sc":2,"sl":65},{"el":73,"sc":5,"sl":69},{"el":78,"sc":5,"sl":75}],"name":"RuleCacheImpl","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":21}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_31":{"methods":[{"sl":21}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":24}]},"test_32":{"methods":[{"sl":21}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_42":{"methods":[{"sl":21}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":24}]},"test_44":{"methods":[{"sl":21}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_47":{"methods":[{"sl":21}],"name":"testStar","pass":true,"statements":[{"sl":24}]},"test_56":{"methods":[{"sl":21}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":24}]},"test_59":{"methods":[{"sl":21}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":24}]},"test_67":{"methods":[{"sl":21}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":24}]},"test_71":{"methods":[{"sl":21}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":24}]},"test_80":{"methods":[{"sl":21}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_9":{"methods":[{"sl":21}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 32, 59, 71, 80, 9, 44, 19, 31, 42, 47, 67], [], [], [56, 32, 59, 71, 80, 9, 44, 19, 31, 42, 47, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]