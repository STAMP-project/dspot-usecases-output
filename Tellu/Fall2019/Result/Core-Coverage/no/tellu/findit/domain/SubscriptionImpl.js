var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":336,"id":9858,"methods":[{"el":47,"sc":5,"sl":45},{"el":53,"sc":5,"sl":49},{"el":57,"sc":5,"sl":55},{"el":62,"sc":5,"sl":59},{"el":67,"sc":5,"sl":64},{"el":73,"sc":5,"sl":69},{"el":78,"sc":5,"sl":75},{"el":83,"sc":5,"sl":80},{"el":88,"sc":5,"sl":85},{"el":93,"sc":5,"sl":90},{"el":98,"sc":5,"sl":95},{"el":103,"sc":5,"sl":100},{"el":108,"sc":5,"sl":105},{"el":113,"sc":5,"sl":110},{"el":118,"sc":5,"sl":115},{"el":123,"sc":5,"sl":120},{"el":128,"sc":5,"sl":125},{"el":133,"sc":5,"sl":130},{"el":138,"sc":5,"sl":135},{"el":145,"sc":5,"sl":142},{"el":150,"sc":5,"sl":147},{"el":155,"sc":2,"sl":152},{"el":160,"sc":5,"sl":157},{"el":165,"sc":5,"sl":162},{"el":170,"sc":5,"sl":167},{"el":175,"sc":5,"sl":172},{"el":180,"sc":5,"sl":177},{"el":185,"sc":5,"sl":182},{"el":190,"sc":5,"sl":187},{"el":195,"sc":5,"sl":192},{"el":199,"sc":5,"sl":197},{"el":205,"sc":5,"sl":201},{"el":211,"sc":5,"sl":207},{"el":216,"sc":5,"sl":213},{"el":221,"sc":5,"sl":218},{"el":226,"sc":5,"sl":223},{"el":230,"sc":5,"sl":228},{"el":236,"sc":5,"sl":232},{"el":242,"sc":5,"sl":238},{"el":247,"sc":5,"sl":244},{"el":252,"sc":5,"sl":249},{"el":257,"sc":5,"sl":254},{"el":261,"sc":5,"sl":259},{"el":267,"sc":5,"sl":263},{"el":273,"sc":5,"sl":269},{"el":278,"sc":5,"sl":275},{"el":282,"sc":5,"sl":280},{"el":288,"sc":5,"sl":284},{"el":294,"sc":5,"sl":290},{"el":300,"sc":5,"sl":296},{"el":306,"sc":5,"sl":302},{"el":310,"sc":5,"sl":308},{"el":314,"sc":5,"sl":312},{"el":319,"sc":5,"sl":316},{"el":324,"sc":5,"sl":321},{"el":335,"sc":5,"sl":329}],"name":"SubscriptionImpl","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":45},{"sl":49}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":52}]},"test_10":{"methods":[{"sl":45},{"sl":49}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":52}]},"test_16":{"methods":[{"sl":45},{"sl":49}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":52}]},"test_35":{"methods":[{"sl":45},{"sl":49}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":52}]},"test_54":{"methods":[{"sl":45},{"sl":49}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":52}]},"test_66":{"methods":[{"sl":45},{"sl":49}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":52}]},"test_72":{"methods":[{"sl":45},{"sl":49}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":52}]},"test_73":{"methods":[{"sl":45},{"sl":49}],"name":"testStar","pass":true,"statements":[{"sl":52}]},"test_75":{"methods":[{"sl":45},{"sl":49}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":52}]},"test_77":{"methods":[{"sl":45},{"sl":49}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":52}]},"test_85":{"methods":[{"sl":45},{"sl":49}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":52}]},"test_94":{"methods":[{"sl":45},{"sl":49}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [66, 16, 94, 54, 35, 72, 10, 85, 75, 73, 77, 1], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
