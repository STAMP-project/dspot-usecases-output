var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":109,"id":16635,"methods":[{"el":16,"sc":5,"sl":12},{"el":21,"sc":5,"sl":18},{"el":32,"sc":5,"sl":23},{"el":46,"sc":5,"sl":34},{"el":55,"sc":5,"sl":48},{"el":64,"sc":5,"sl":57}],"name":"CommandHandlerImplTest","sl":9},{"el":87,"id":16670,"methods":[{"el":85,"sc":9,"sl":82}],"name":"CommandHandlerImplTest.ThrowRuntimeExceptionCmd","sl":81},{"el":95,"id":16672,"methods":[{"el":93,"sc":9,"sl":90}],"name":"CommandHandlerImplTest.ThrowExceptionCmd","sl":89},{"el":107,"id":16674,"methods":[{"el":101,"sc":9,"sl":100},{"el":105,"sc":9,"sl":103}],"name":"CommandHandlerImplTest.DoNothingCmd","sl":97}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":57},{"sl":90}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":63},{"sl":92}]},"test_16":{"methods":[{"sl":34},{"sl":100},{"sl":103}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44}]},"test_35":{"methods":[{"sl":23},{"sl":100},{"sl":103}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_77":{"methods":[{"sl":48},{"sl":82}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":54},{"sl":84}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [35], [35], [35], [], [35], [35], [35], [35], [35], [], [], [16], [16], [16], [], [16], [16], [16], [16], [16], [16], [16], [], [], [], [77], [77], [77], [77], [], [], [77], [], [], [10], [10], [10], [10], [], [], [10], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [77], [], [77], [], [], [], [], [], [10], [], [10], [], [], [], [], [], [], [], [16, 35], [], [], [16, 35], [], [], [], [], [], []]