var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":3601,"methods":[{"el":23,"sc":5,"sl":21},{"el":29,"sc":2,"sl":25},{"el":33,"sc":5,"sl":31},{"el":38,"sc":5,"sl":35},{"el":42,"sc":5,"sl":40},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":49},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":66,"sc":5,"sl":62},{"el":70,"sc":5,"sl":68},{"el":76,"sc":5,"sl":72},{"el":80,"sc":5,"sl":78},{"el":84,"sc":5,"sl":82},{"el":88,"sc":5,"sl":86},{"el":94,"sc":5,"sl":90},{"el":98,"sc":5,"sl":96}],"name":"AssetDeviceLinkImpl","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":21},{"sl":25}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_10":{"methods":[{"sl":21},{"sl":25}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_16":{"methods":[{"sl":21},{"sl":25}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_35":{"methods":[{"sl":21},{"sl":25}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_54":{"methods":[{"sl":21},{"sl":25}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_66":{"methods":[{"sl":21},{"sl":25}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_72":{"methods":[{"sl":21},{"sl":25}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_73":{"methods":[{"sl":21},{"sl":25}],"name":"testStar","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_75":{"methods":[{"sl":21},{"sl":25}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_77":{"methods":[{"sl":21},{"sl":25}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_85":{"methods":[{"sl":21},{"sl":25}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":22},{"sl":28}]},"test_94":{"methods":[{"sl":21},{"sl":25}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":22},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 94, 54, 72, 73, 1, 16, 35, 10, 85, 75, 77], [66, 94, 54, 72, 73, 1, 16, 35, 10, 85, 75, 77], [], [], [66, 94, 54, 72, 73, 1, 16, 35, 10, 85, 75, 77], [], [], [66, 94, 54, 72, 73, 1, 16, 35, 10, 85, 75, 77], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
