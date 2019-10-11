var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3888,"methods":[{"el":10,"sc":2,"sl":8},{"el":13,"sc":2,"sl":11},{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17}],"name":"Parameter","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_183":{"methods":[{"sl":8},{"sl":11}],"name":"test6","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_1929":{"methods":[{"sl":8}],"name":"test5","pass":true,"statements":[{"sl":9}]},"test_2191":{"methods":[{"sl":14},{"sl":17}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_228":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]},"test_292":{"methods":[{"sl":8}],"name":"test1","pass":true,"statements":[{"sl":9}]},"test_48":{"methods":[{"sl":14}],"name":"test4","pass":true,"statements":[{"sl":15}]},"test_533":{"methods":[{"sl":14}],"name":"test3","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [183, 292, 1929], [183, 292, 1929], [], [183], [183], [], [48, 228, 533, 2191], [48, 228, 533, 2191], [], [2191], [2191], [], []]
