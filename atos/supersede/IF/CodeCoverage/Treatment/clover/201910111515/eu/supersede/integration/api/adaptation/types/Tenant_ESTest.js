var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":8955,"methods":[{"el":19,"sc":3,"sl":14},{"el":26,"sc":3,"sl":21},{"el":32,"sc":3,"sl":28}],"name":"Tenant_ESTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_192":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18}]},"test_781":{"methods":[{"sl":21}],"name":"test1","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]},"test_996":{"methods":[{"sl":28}],"name":"test2","pass":true,"statements":[{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [192], [], [192], [192], [192], [], [], [781], [], [781], [781], [781], [], [], [996], [], [996], [996], [], []]