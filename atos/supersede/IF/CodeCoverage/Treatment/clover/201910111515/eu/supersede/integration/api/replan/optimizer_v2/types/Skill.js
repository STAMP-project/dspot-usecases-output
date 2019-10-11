var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":6473,"methods":[{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31}],"name":"Skill","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1777":{"methods":[{"sl":27},{"sl":31}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_2085":{"methods":[{"sl":27},{"sl":31}],"name":"test2","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_2241":{"methods":[{"sl":27}],"name":"test1","pass":true,"statements":[{"sl":28}]},"test_289":{"methods":[{"sl":27},{"sl":31}],"name":"test0","pass":true,"statements":[{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [289, 1777, 2241, 2085], [289, 1777, 2241, 2085], [], [], [289, 1777, 2085], [289, 1777, 2085], [], []]
