var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":8432,"methods":[{"el":19,"sc":3,"sl":14},{"el":27,"sc":3,"sl":21},{"el":35,"sc":3,"sl":29}],"name":"BaseModel_ESTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1525":{"methods":[{"sl":29}],"name":"test2","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34}]},"test_1560":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_1611":{"methods":[{"sl":21}],"name":"test1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1560], [], [1560], [1560], [1560], [], [], [1611], [], [1611], [1611], [1611], [1611], [], [], [1525], [], [1525], [1525], [1525], [1525], [], []]