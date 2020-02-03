var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":5204,"methods":[{"el":18,"sc":5,"sl":14},{"el":21,"sc":5,"sl":19},{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":34,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":42,"sc":5,"sl":39},{"el":45,"sc":5,"sl":43}],"name":"CustomerBundleAccessImpl","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":14}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":17}]},"test_10":{"methods":[{"sl":14}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":17}]},"test_16":{"methods":[{"sl":14}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":17}]},"test_35":{"methods":[{"sl":14}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":17}]},"test_54":{"methods":[{"sl":14}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":17}]},"test_66":{"methods":[{"sl":14}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":17}]},"test_72":{"methods":[{"sl":14}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":17}]},"test_73":{"methods":[{"sl":14}],"name":"testStar","pass":true,"statements":[{"sl":17}]},"test_75":{"methods":[{"sl":14}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":17}]},"test_77":{"methods":[{"sl":14}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":17}]},"test_85":{"methods":[{"sl":14}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":17}]},"test_94":{"methods":[{"sl":14}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]