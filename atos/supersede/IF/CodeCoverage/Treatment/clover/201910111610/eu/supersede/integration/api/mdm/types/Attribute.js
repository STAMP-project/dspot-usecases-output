var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3657,"methods":[{"el":10,"sc":2,"sl":8},{"el":13,"sc":2,"sl":11},{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17}],"name":"Attribute","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1355":{"methods":[{"sl":14},{"sl":17}],"name":"test5","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_184":{"methods":[{"sl":11},{"sl":17}],"name":"testGelAllEventsnull1_failAssert0","pass":true,"statements":[{"sl":12},{"sl":18}]},"test_192":{"methods":[{"sl":8}],"name":"test1","pass":true,"statements":[{"sl":9}]},"test_2072":{"methods":[{"sl":8},{"sl":11}],"name":"test2","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_2364":{"methods":[{"sl":11},{"sl":17}],"name":"testGelAllEvents","pass":true,"statements":[{"sl":12},{"sl":18}]},"test_504":{"methods":[{"sl":8},{"sl":11}],"name":"test3","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_811":{"methods":[{"sl":14},{"sl":17}],"name":"test4","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_99":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [2072, 192, 504], [2072, 192, 504], [], [184, 2364, 2072, 504], [184, 2364, 2072, 504], [], [1355, 99, 811], [1355, 99, 811], [], [184, 1355, 2364, 811], [184, 1355, 2364, 811], [], []]