var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":9340,"methods":[{"el":20,"sc":5,"sl":8},{"el":34,"sc":5,"sl":22}],"name":"FailureRateTrackerTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_246":{"methods":[{"sl":22}],"name":"testIsHealthy","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":31},{"sl":33}]},"test_299":{"methods":[{"sl":8}],"name":"testFailureRate","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12},{"sl":13},{"sl":15},{"sl":16},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [299], [], [299], [299], [299], [299], [], [299], [299], [299], [], [299], [], [], [246], [], [246], [246], [246], [246], [], [246], [246], [246], [], [246], [], []]
