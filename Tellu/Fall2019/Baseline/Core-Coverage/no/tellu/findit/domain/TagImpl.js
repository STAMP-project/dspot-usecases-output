var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":190,"id":10102,"methods":[{"el":29,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":41,"sc":5,"sl":37},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48},{"el":65,"sc":5,"sl":53},{"el":71,"sc":5,"sl":67},{"el":75,"sc":5,"sl":73},{"el":81,"sc":5,"sl":77},{"el":85,"sc":5,"sl":83},{"el":91,"sc":5,"sl":87},{"el":95,"sc":5,"sl":93},{"el":101,"sc":5,"sl":97},{"el":108,"sc":5,"sl":104},{"el":113,"sc":5,"sl":110},{"el":116,"sc":2,"sl":114},{"el":122,"sc":5,"sl":118},{"el":126,"sc":5,"sl":124},{"el":131,"sc":5,"sl":128},{"el":135,"sc":5,"sl":133},{"el":140,"sc":5,"sl":137},{"el":144,"sc":5,"sl":142},{"el":149,"sc":5,"sl":146},{"el":154,"sc":5,"sl":151},{"el":159,"sc":5,"sl":156},{"el":164,"sc":5,"sl":161},{"el":178,"sc":5,"sl":167},{"el":187,"sc":5,"sl":180}],"name":"TagImpl","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":28}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[]},"test_31":{"methods":[{"sl":28}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[]},"test_32":{"methods":[{"sl":28}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[]},"test_42":{"methods":[{"sl":28}],"name":"testGetSessionFactory","pass":true,"statements":[]},"test_44":{"methods":[{"sl":28}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[]},"test_47":{"methods":[{"sl":28}],"name":"testStar","pass":true,"statements":[]},"test_56":{"methods":[{"sl":28}],"name":"testFindUserByUsername","pass":true,"statements":[]},"test_59":{"methods":[{"sl":28}],"name":"testTransactionIsActive","pass":true,"statements":[]},"test_67":{"methods":[{"sl":28}],"name":"testDeleteUserAccount","pass":true,"statements":[]},"test_71":{"methods":[{"sl":28}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[]},"test_80":{"methods":[{"sl":28}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[]},"test_9":{"methods":[{"sl":28}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
