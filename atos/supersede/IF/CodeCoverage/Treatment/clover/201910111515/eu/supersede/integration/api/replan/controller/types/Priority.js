var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":6053,"methods":[{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31},{"el":39,"sc":2,"sl":35}],"name":"Priority","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1520":{"methods":[{"sl":31}],"name":"test0","pass":true,"statements":[{"sl":32}]},"test_1911":{"methods":[{"sl":35}],"name":"test1","pass":true,"statements":[{"sl":38}]},"test_992":{"methods":[{"sl":27},{"sl":31}],"name":"test0","pass":true,"statements":[{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [992], [992], [], [], [992, 1520], [992, 1520], [], [], [1911], [], [], [1911], [], []]
