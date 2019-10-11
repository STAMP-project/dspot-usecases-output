var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":1868,"methods":[{"el":6,"sc":2,"sl":6},{"el":10,"sc":2,"sl":8},{"el":14,"sc":2,"sl":12},{"el":18,"sc":2,"sl":16}],"name":"Message","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_443":{"methods":[{"sl":8},{"sl":12},{"sl":16}],"name":"test0","pass":true,"statements":[{"sl":9},{"sl":13},{"sl":17}]},"test_682":{"methods":[{"sl":6},{"sl":12}],"name":"test1","pass":true,"statements":[{"sl":13}]},"test_827":{"methods":[{"sl":8},{"sl":12}],"name":"test2","pass":true,"statements":[{"sl":9},{"sl":13}]},"test_871":{"methods":[{"sl":6},{"sl":12}],"name":"test3","pass":true,"statements":[{"sl":13}]},"test_928":{"methods":[{"sl":8},{"sl":12}],"name":"testCreatePullConfigurationForUserInfo","pass":true,"statements":[{"sl":9},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [871, 682], [], [827, 443, 928], [827, 443, 928], [], [], [871, 827, 443, 682, 928], [871, 827, 443, 682, 928], [], [], [443], [443], [], []]
