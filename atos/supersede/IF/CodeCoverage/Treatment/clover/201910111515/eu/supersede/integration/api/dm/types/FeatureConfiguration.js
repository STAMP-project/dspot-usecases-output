var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":1116,"methods":[{"el":7,"sc":2,"sl":6},{"el":11,"sc":2,"sl":9},{"el":15,"sc":2,"sl":13},{"el":19,"sc":2,"sl":17}],"name":"FeatureConfiguration","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1059":{"methods":[{"sl":9},{"sl":13}],"name":"test0","pass":true,"statements":[{"sl":10},{"sl":14}]},"test_1185":{"methods":[{"sl":6},{"sl":13},{"sl":17}],"name":"test1","pass":true,"statements":[{"sl":14},{"sl":18}]},"test_1830":{"methods":[{"sl":9},{"sl":13},{"sl":17}],"name":"test3","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18}]},"test_2182":{"methods":[{"sl":9},{"sl":13},{"sl":17}],"name":"test2","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [1185], [], [], [1059, 2182, 1830], [1059, 2182, 1830], [], [], [1059, 2182, 1830, 1185], [1059, 2182, 1830, 1185], [], [], [2182, 1830, 1185], [2182, 1830, 1185], [], [], []]
