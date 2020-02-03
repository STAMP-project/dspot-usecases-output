var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":5260,"methods":[{"el":32,"sc":5,"sl":28},{"el":35,"sc":5,"sl":33},{"el":40,"sc":5,"sl":37},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47},{"el":54,"sc":5,"sl":52},{"el":60,"sc":5,"sl":56},{"el":65,"sc":5,"sl":62},{"el":71,"sc":5,"sl":67},{"el":76,"sc":5,"sl":73},{"el":82,"sc":5,"sl":78},{"el":87,"sc":5,"sl":84}],"name":"CustomerGroupMembershipImpl","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":28}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":31}]},"test_31":{"methods":[{"sl":28}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":31}]},"test_32":{"methods":[{"sl":28}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":31}]},"test_42":{"methods":[{"sl":28}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":31}]},"test_44":{"methods":[{"sl":28}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":31}]},"test_47":{"methods":[{"sl":28}],"name":"testStar","pass":true,"statements":[{"sl":31}]},"test_56":{"methods":[{"sl":28}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":31}]},"test_59":{"methods":[{"sl":28}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":31}]},"test_67":{"methods":[{"sl":28}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":31}]},"test_71":{"methods":[{"sl":28}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":31}]},"test_80":{"methods":[{"sl":28}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":31}]},"test_9":{"methods":[{"sl":28}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]