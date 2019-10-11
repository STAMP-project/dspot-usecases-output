var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":605,"methods":[{"el":11,"sc":2,"sl":9},{"el":17,"sc":2,"sl":13},{"el":21,"sc":2,"sl":19}],"name":"Tenant","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1256":{"methods":[{"sl":13}],"name":"test0","pass":true,"statements":[{"sl":16}]},"test_1726":{"methods":[{"sl":9}],"name":"testResetDashboard","pass":true,"statements":[{"sl":10}]},"test_195":{"methods":[{"sl":19}],"name":"test11","pass":true,"statements":[{"sl":20}]},"test_2364":{"methods":[{"sl":13}],"name":"testGelAllEvents","pass":true,"statements":[{"sl":16}]},"test_2566":{"methods":[{"sl":19}],"name":"test1","pass":true,"statements":[{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1726], [1726], [], [], [2364, 1256], [], [], [2364, 1256], [], [], [195, 2566], [195, 2566], [], [], []]
