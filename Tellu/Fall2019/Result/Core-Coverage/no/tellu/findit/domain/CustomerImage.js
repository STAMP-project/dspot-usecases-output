var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":5288,"methods":[{"el":25,"sc":2,"sl":21},{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31},{"el":37,"sc":2,"sl":35},{"el":41,"sc":2,"sl":39},{"el":45,"sc":2,"sl":43},{"el":49,"sc":2,"sl":47},{"el":53,"sc":2,"sl":51},{"el":57,"sc":2,"sl":55},{"el":61,"sc":2,"sl":59},{"el":65,"sc":2,"sl":63},{"el":69,"sc":2,"sl":67},{"el":73,"sc":2,"sl":71},{"el":77,"sc":2,"sl":75},{"el":82,"sc":2,"sl":79},{"el":86,"sc":2,"sl":84},{"el":91,"sc":2,"sl":88},{"el":96,"sc":2,"sl":94}],"name":"CustomerImage","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":21}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":24}]},"test_10":{"methods":[{"sl":21}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_16":{"methods":[{"sl":21}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_35":{"methods":[{"sl":21}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24}]},"test_54":{"methods":[{"sl":21}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":24}]},"test_66":{"methods":[{"sl":21}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":24}]},"test_72":{"methods":[{"sl":21}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":24}]},"test_73":{"methods":[{"sl":21}],"name":"testStar","pass":true,"statements":[{"sl":24}]},"test_75":{"methods":[{"sl":21}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":24}]},"test_77":{"methods":[{"sl":21}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":24}]},"test_85":{"methods":[{"sl":21}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":24}]},"test_94":{"methods":[{"sl":21}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
