var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3888,"methods":[{"el":10,"sc":2,"sl":8},{"el":13,"sc":2,"sl":11},{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17}],"name":"Parameter","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_131":{"methods":[{"sl":8}],"name":"test1","pass":true,"statements":[{"sl":9}]},"test_1609":{"methods":[{"sl":14}],"name":"test3","pass":true,"statements":[{"sl":15}]},"test_1650":{"methods":[{"sl":14},{"sl":17}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_1744":{"methods":[{"sl":8},{"sl":11}],"name":"test6","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_1768":{"methods":[{"sl":14}],"name":"test4","pass":true,"statements":[{"sl":15}]},"test_36":{"methods":[{"sl":8}],"name":"test5","pass":true,"statements":[{"sl":9}]},"test_707":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [36, 131, 1744], [36, 131, 1744], [], [1744], [1744], [], [707, 1650, 1768, 1609], [707, 1650, 1768, 1609], [], [1650], [1650], [], []]
