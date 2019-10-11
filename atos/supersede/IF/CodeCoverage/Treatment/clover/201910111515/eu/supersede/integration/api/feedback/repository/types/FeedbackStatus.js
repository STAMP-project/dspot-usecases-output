var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3210,"methods":[{"el":9,"sc":2,"sl":7},{"el":12,"sc":2,"sl":10},{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17}],"name":"FeedbackStatus","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1396":{"methods":[{"sl":14},{"sl":17}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_1750":{"methods":[{"sl":7},{"sl":10}],"name":"test6","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_480":{"methods":[{"sl":14},{"sl":17}],"name":"test4","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_571":{"methods":[{"sl":14},{"sl":17}],"name":"test3","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_634":{"methods":[{"sl":7},{"sl":10}],"name":"test5","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_678":{"methods":[{"sl":7}],"name":"test1","pass":true,"statements":[{"sl":8}]},"test_76":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [634, 678, 1750], [634, 678, 1750], [], [634, 1750], [634, 1750], [], [], [480, 1396, 571, 76], [480, 1396, 571, 76], [], [480, 1396, 571], [480, 1396, 571], [], []]
