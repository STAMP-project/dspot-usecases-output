var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":4012,"methods":[{"el":14,"sc":2,"sl":12},{"el":17,"sc":2,"sl":15}],"name":"GooglePlayMonitorConfiguration","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1124":{"methods":[{"sl":12},{"sl":15}],"name":"testUpdateMonitorConfiguration","pass":true,"statements":[{"sl":13},{"sl":16}]},"test_1414":{"methods":[{"sl":12},{"sl":15}],"name":"test1","pass":true,"statements":[{"sl":13},{"sl":16}]},"test_1581":{"methods":[{"sl":12}],"name":"test2","pass":true,"statements":[{"sl":13}]},"test_2230":{"methods":[{"sl":12},{"sl":15}],"name":"testCreateAndDeleteMonitorConfiguration","pass":true,"statements":[{"sl":13},{"sl":16}]},"test_806":{"methods":[{"sl":12}],"name":"test0","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1581, 1414, 1124, 2230, 806], [1581, 1414, 1124, 2230, 806], [], [1414, 1124, 2230], [1414, 1124, 2230], [], []]
