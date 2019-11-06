var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":282,"id":6565,"methods":[{"el":38,"sc":5,"sl":34},{"el":41,"sc":2,"sl":39},{"el":45,"sc":2,"sl":43},{"el":48,"sc":2,"sl":46},{"el":53,"sc":5,"sl":50},{"el":57,"sc":5,"sl":54},{"el":61,"sc":2,"sl":59},{"el":64,"sc":2,"sl":62},{"el":69,"sc":5,"sl":66},{"el":73,"sc":5,"sl":70},{"el":78,"sc":5,"sl":75},{"el":82,"sc":5,"sl":80},{"el":87,"sc":5,"sl":84},{"el":91,"sc":5,"sl":88},{"el":95,"sc":2,"sl":93},{"el":98,"sc":2,"sl":96},{"el":102,"sc":2,"sl":100},{"el":105,"sc":2,"sl":103},{"el":110,"sc":5,"sl":107},{"el":113,"sc":2,"sl":111},{"el":118,"sc":5,"sl":115},{"el":121,"sc":2,"sl":119},{"el":126,"sc":5,"sl":123},{"el":129,"sc":2,"sl":127},{"el":134,"sc":5,"sl":131},{"el":137,"sc":2,"sl":135},{"el":142,"sc":5,"sl":139},{"el":145,"sc":2,"sl":143},{"el":150,"sc":5,"sl":147},{"el":153,"sc":2,"sl":151},{"el":156,"sc":2,"sl":154},{"el":159,"sc":2,"sl":157},{"el":162,"sc":2,"sl":160},{"el":165,"sc":2,"sl":163},{"el":180,"sc":2,"sl":178},{"el":183,"sc":2,"sl":181},{"el":186,"sc":2,"sl":184},{"el":189,"sc":2,"sl":187},{"el":194,"sc":5,"sl":191},{"el":198,"sc":5,"sl":195},{"el":205,"sc":5,"sl":202},{"el":209,"sc":5,"sl":207},{"el":240,"sc":5,"sl":213},{"el":261,"sc":5,"sl":242},{"el":281,"sc":5,"sl":263}],"name":"Event","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":34}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":37}]},"test_31":{"methods":[{"sl":34}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":37}]},"test_32":{"methods":[{"sl":34}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":37}]},"test_42":{"methods":[{"sl":34}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":37}]},"test_44":{"methods":[{"sl":34}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":37}]},"test_47":{"methods":[{"sl":34}],"name":"testStar","pass":true,"statements":[{"sl":37}]},"test_56":{"methods":[{"sl":34}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":37}]},"test_59":{"methods":[{"sl":34}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":37}]},"test_67":{"methods":[{"sl":34}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":37}]},"test_71":{"methods":[{"sl":34}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":37}]},"test_80":{"methods":[{"sl":34}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":37}]},"test_9":{"methods":[{"sl":34}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
