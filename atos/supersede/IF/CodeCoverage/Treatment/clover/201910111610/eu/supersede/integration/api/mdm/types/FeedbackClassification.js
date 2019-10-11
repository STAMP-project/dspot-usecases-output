var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":3856,"methods":[{"el":10,"sc":2,"sl":8},{"el":13,"sc":2,"sl":11},{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17}],"name":"FeedbackClassification","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1488":{"methods":[{"sl":8}],"name":"test2","pass":true,"statements":[{"sl":9}]},"test_1920":{"methods":[{"sl":8},{"sl":11}],"name":"test1","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_295":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]},"test_2995":{"methods":[{"sl":8}],"name":"test3","pass":true,"statements":[{"sl":9}]},"test_466":{"methods":[{"sl":14}],"name":"test5","pass":true,"statements":[{"sl":15}]},"test_615":{"methods":[{"sl":8}],"name":"test4","pass":true,"statements":[{"sl":9}]},"test_926":{"methods":[{"sl":14},{"sl":17}],"name":"test6","pass":true,"statements":[{"sl":15},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1920, 1488, 615, 2995], [1920, 1488, 615, 2995], [], [1920], [1920], [], [466, 926, 295], [466, 926, 295], [], [926], [926], [], [], []]
