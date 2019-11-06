var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":17822,"methods":[{"el":13,"sc":5,"sl":9},{"el":19,"sc":5,"sl":15},{"el":25,"sc":5,"sl":21},{"el":32,"sc":5,"sl":27},{"el":40,"sc":5,"sl":34}],"name":"IpRangeTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_25":{"methods":[{"sl":21}],"name":"testNull","pass":true,"statements":[{"sl":23},{"sl":24}]},"test_27":{"methods":[{"sl":27}],"name":"testOne","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]},"test_41":{"methods":[{"sl":9}],"name":"testAll","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_45":{"methods":[{"sl":15}],"name":"testEmpty","pass":true,"statements":[{"sl":17},{"sl":18}]},"test_60":{"methods":[{"sl":34}],"name":"testTwo","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [41], [], [41], [41], [], [], [45], [], [45], [45], [], [], [25], [], [25], [25], [], [], [27], [], [27], [27], [27], [], [], [60], [], [60], [60], [60], [60], [], []]
