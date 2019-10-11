var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":6439,"methods":[{"el":34,"sc":2,"sl":30},{"el":37,"sc":2,"sl":35}],"name":"PlanningSolution","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1213":{"methods":[{"sl":30},{"sl":35}],"name":"test1","pass":true,"statements":[{"sl":31},{"sl":33},{"sl":36}]},"test_1777":{"methods":[{"sl":35}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":36}]},"test_2016":{"methods":[{"sl":30}],"name":"test0","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1213, 2016], [1213, 2016], [2016], [1213, 2016], [], [1777, 1213], [1777, 1213], [], []]
