var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":16458,"methods":[{"el":12,"sc":5,"sl":12},{"el":16,"sc":5,"sl":14},{"el":23,"sc":5,"sl":19},{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":39,"sc":5,"sl":37},{"el":52,"sc":5,"sl":45},{"el":62,"sc":5,"sl":57}],"name":"Permission","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":12},{"sl":19}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22}]},"test_31":{"methods":[{"sl":12},{"sl":19}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":22}]},"test_32":{"methods":[{"sl":12},{"sl":19}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":22}]},"test_42":{"methods":[{"sl":12},{"sl":19}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":22}]},"test_44":{"methods":[{"sl":12},{"sl":19}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22}]},"test_47":{"methods":[{"sl":12},{"sl":19}],"name":"testStar","pass":true,"statements":[{"sl":22}]},"test_56":{"methods":[{"sl":12},{"sl":19}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":22}]},"test_59":{"methods":[{"sl":12},{"sl":19}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":22}]},"test_67":{"methods":[{"sl":12},{"sl":19}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":22}]},"test_71":{"methods":[{"sl":12},{"sl":19}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":22}]},"test_80":{"methods":[{"sl":12},{"sl":19}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":22}]},"test_9":{"methods":[{"sl":12},{"sl":19}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
