var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":100,"id":4774,"methods":[{"el":22,"sc":5,"sl":21},{"el":27,"sc":5,"sl":24},{"el":33,"sc":5,"sl":29},{"el":36,"sc":5,"sl":34},{"el":41,"sc":5,"sl":38},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48},{"el":54,"sc":5,"sl":52},{"el":58,"sc":5,"sl":56},{"el":61,"sc":5,"sl":59},{"el":66,"sc":5,"sl":63},{"el":69,"sc":5,"sl":67},{"el":73,"sc":5,"sl":71},{"el":76,"sc":5,"sl":74},{"el":80,"sc":5,"sl":78},{"el":83,"sc":5,"sl":81},{"el":87,"sc":5,"sl":85},{"el":91,"sc":5,"sl":89},{"el":95,"sc":5,"sl":93},{"el":99,"sc":5,"sl":97}],"name":"BillingDeviceSubscriptionImpl","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":21},{"sl":29}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_31":{"methods":[{"sl":21},{"sl":29}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":32}]},"test_32":{"methods":[{"sl":21},{"sl":29}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_42":{"methods":[{"sl":21},{"sl":29}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":32}]},"test_44":{"methods":[{"sl":21},{"sl":29}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":32}]},"test_47":{"methods":[{"sl":21},{"sl":29}],"name":"testStar","pass":true,"statements":[{"sl":32}]},"test_56":{"methods":[{"sl":21},{"sl":29}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":32}]},"test_59":{"methods":[{"sl":21},{"sl":29}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":32}]},"test_67":{"methods":[{"sl":21},{"sl":29}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":32}]},"test_71":{"methods":[{"sl":21},{"sl":29}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":32}]},"test_80":{"methods":[{"sl":21},{"sl":29}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":32}]},"test_9":{"methods":[{"sl":21},{"sl":29}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]