var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":27992,"methods":[{"el":19,"sc":3,"sl":14},{"el":26,"sc":3,"sl":21},{"el":33,"sc":3,"sl":28},{"el":41,"sc":3,"sl":35}],"name":"Message_ESTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1695":{"methods":[{"sl":21}],"name":"test1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]},"test_1927":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_1938":{"methods":[{"sl":28}],"name":"test2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_2130":{"methods":[{"sl":35}],"name":"test3","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1927], [], [1927], [1927], [1927], [], [], [1695], [], [1695], [1695], [1695], [], [], [1938], [], [1938], [1938], [1938], [], [], [2130], [], [2130], [2130], [2130], [2130], [], []]
