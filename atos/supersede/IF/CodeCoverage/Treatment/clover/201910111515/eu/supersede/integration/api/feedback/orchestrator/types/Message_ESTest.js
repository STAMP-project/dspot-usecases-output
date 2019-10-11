var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":13240,"methods":[{"el":19,"sc":3,"sl":14},{"el":26,"sc":3,"sl":21},{"el":33,"sc":3,"sl":28},{"el":41,"sc":3,"sl":35}],"name":"Message_ESTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_443":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_682":{"methods":[{"sl":21}],"name":"test1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]},"test_827":{"methods":[{"sl":28}],"name":"test2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_871":{"methods":[{"sl":35}],"name":"test3","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [443], [], [443], [443], [443], [], [], [682], [], [682], [682], [682], [], [], [827], [], [827], [827], [827], [], [], [871], [], [871], [871], [871], [871], [], []]
