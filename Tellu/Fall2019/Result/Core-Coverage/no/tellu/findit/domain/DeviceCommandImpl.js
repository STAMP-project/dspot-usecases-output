var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":416,"id":6073,"methods":[{"el":55,"sc":5,"sl":51},{"el":59,"sc":5,"sl":57},{"el":64,"sc":5,"sl":61},{"el":69,"sc":5,"sl":66},{"el":105,"sc":2,"sl":71},{"el":111,"sc":2,"sl":108},{"el":116,"sc":2,"sl":113},{"el":121,"sc":2,"sl":118},{"el":126,"sc":2,"sl":123},{"el":131,"sc":2,"sl":128},{"el":136,"sc":2,"sl":133},{"el":141,"sc":2,"sl":138},{"el":146,"sc":2,"sl":143},{"el":151,"sc":2,"sl":148},{"el":157,"sc":5,"sl":153},{"el":162,"sc":2,"sl":159},{"el":168,"sc":5,"sl":164},{"el":173,"sc":2,"sl":170},{"el":178,"sc":5,"sl":175},{"el":183,"sc":5,"sl":180},{"el":188,"sc":5,"sl":185},{"el":193,"sc":5,"sl":190},{"el":198,"sc":5,"sl":195},{"el":204,"sc":5,"sl":200},{"el":209,"sc":5,"sl":206},{"el":215,"sc":5,"sl":211},{"el":220,"sc":5,"sl":217},{"el":226,"sc":5,"sl":222},{"el":231,"sc":5,"sl":228},{"el":237,"sc":5,"sl":233},{"el":242,"sc":5,"sl":239},{"el":247,"sc":5,"sl":244},{"el":252,"sc":5,"sl":249},{"el":257,"sc":5,"sl":254},{"el":262,"sc":5,"sl":259},{"el":268,"sc":5,"sl":264},{"el":273,"sc":5,"sl":270},{"el":279,"sc":5,"sl":275},{"el":284,"sc":5,"sl":281},{"el":289,"sc":5,"sl":286},{"el":294,"sc":5,"sl":291},{"el":299,"sc":5,"sl":296},{"el":304,"sc":5,"sl":301},{"el":309,"sc":5,"sl":306},{"el":314,"sc":5,"sl":311},{"el":319,"sc":5,"sl":317},{"el":326,"sc":5,"sl":322},{"el":331,"sc":5,"sl":329},{"el":338,"sc":5,"sl":334},{"el":343,"sc":5,"sl":341},{"el":350,"sc":5,"sl":346},{"el":355,"sc":5,"sl":353},{"el":362,"sc":5,"sl":358},{"el":369,"sc":5,"sl":365},{"el":375,"sc":5,"sl":371},{"el":382,"sc":5,"sl":378},{"el":388,"sc":5,"sl":384},{"el":395,"sc":5,"sl":391},{"el":401,"sc":5,"sl":397},{"el":408,"sc":5,"sl":404},{"el":414,"sc":5,"sl":410}],"name":"DeviceCommandImpl","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":51}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":54}]},"test_10":{"methods":[{"sl":51}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":54}]},"test_16":{"methods":[{"sl":51}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":54}]},"test_35":{"methods":[{"sl":51}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":54}]},"test_54":{"methods":[{"sl":51}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":54}]},"test_66":{"methods":[{"sl":51}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":54}]},"test_72":{"methods":[{"sl":51}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":54}]},"test_73":{"methods":[{"sl":51}],"name":"testStar","pass":true,"statements":[{"sl":54}]},"test_75":{"methods":[{"sl":51}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":54}]},"test_77":{"methods":[{"sl":51}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":54}]},"test_85":{"methods":[{"sl":51}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":54}]},"test_94":{"methods":[{"sl":51}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
