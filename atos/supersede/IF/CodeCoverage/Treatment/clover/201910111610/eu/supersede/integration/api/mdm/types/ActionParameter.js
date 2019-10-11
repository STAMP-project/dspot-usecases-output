var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":3645,"methods":[{"el":11,"sc":2,"sl":9},{"el":14,"sc":2,"sl":12},{"el":17,"sc":2,"sl":15},{"el":20,"sc":2,"sl":18}],"name":"ActionParameter","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1833":{"methods":[{"sl":9},{"sl":12}],"name":"test3","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_2097":{"methods":[{"sl":9},{"sl":12}],"name":"test4","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_2198":{"methods":[{"sl":15}],"name":"test1","pass":true,"statements":[{"sl":16}]},"test_2602":{"methods":[{"sl":9}],"name":"test2","pass":true,"statements":[{"sl":10}]},"test_637":{"methods":[{"sl":15},{"sl":18}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [2602, 1833, 2097], [2602, 1833, 2097], [], [1833, 2097], [1833, 2097], [], [2198, 637], [2198, 637], [], [637], [637], [], [], [], []]
