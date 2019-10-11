var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":6309,"methods":[{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31}],"name":"Skill","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1231":{"methods":[{"sl":27},{"sl":31}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_1916":{"methods":[{"sl":27},{"sl":31}],"name":"test0","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_251":{"methods":[{"sl":27}],"name":"test1","pass":true,"statements":[{"sl":28}]},"test_338":{"methods":[{"sl":27},{"sl":31}],"name":"test2","pass":true,"statements":[{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1916, 338, 251, 1231], [1916, 338, 251, 1231], [], [], [1916, 338, 1231], [1916, 338, 1231], [], []]
