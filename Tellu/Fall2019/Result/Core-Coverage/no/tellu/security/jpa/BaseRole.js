var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":187,"id":16252,"methods":[{"el":29,"sc":5,"sl":29},{"el":35,"sc":5,"sl":30},{"el":41,"sc":5,"sl":37},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":58,"sc":5,"sl":55},{"el":62,"sc":5,"sl":60},{"el":83,"sc":5,"sl":81},{"el":87,"sc":5,"sl":85},{"el":93,"sc":5,"sl":90},{"el":96,"sc":5,"sl":94},{"el":100,"sc":5,"sl":98},{"el":103,"sc":5,"sl":101},{"el":108,"sc":5,"sl":106},{"el":112,"sc":5,"sl":110},{"el":117,"sc":5,"sl":114},{"el":121,"sc":5,"sl":119},{"el":126,"sc":5,"sl":123},{"el":131,"sc":5,"sl":128},{"el":136,"sc":5,"sl":133},{"el":140,"sc":5,"sl":138},{"el":145,"sc":5,"sl":142},{"el":150,"sc":5,"sl":147},{"el":155,"sc":5,"sl":152},{"el":159,"sc":5,"sl":157},{"el":164,"sc":5,"sl":161},{"el":169,"sc":5,"sl":166},{"el":178,"sc":5,"sl":171},{"el":185,"sc":5,"sl":180}],"name":"BaseRole","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":29},{"sl":37}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":40}]},"test_10":{"methods":[{"sl":29},{"sl":37}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":40}]},"test_16":{"methods":[{"sl":29},{"sl":37}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":40}]},"test_35":{"methods":[{"sl":29},{"sl":37}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":40}]},"test_54":{"methods":[{"sl":29},{"sl":37}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":40}]},"test_66":{"methods":[{"sl":29},{"sl":37}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":40}]},"test_72":{"methods":[{"sl":29},{"sl":37}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":40}]},"test_73":{"methods":[{"sl":29},{"sl":37}],"name":"testStar","pass":true,"statements":[{"sl":40}]},"test_75":{"methods":[{"sl":29},{"sl":37}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":40}]},"test_77":{"methods":[{"sl":29},{"sl":37}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":40}]},"test_85":{"methods":[{"sl":29},{"sl":37}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":40}]},"test_94":{"methods":[{"sl":29},{"sl":37}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [], [], [], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [66, 94, 54, 72, 73, 1, 75, 77, 16, 35, 10, 85], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
