var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":6175,"methods":[{"el":10,"sc":5,"sl":8},{"el":14,"sc":5,"sl":12},{"el":30,"sc":5,"sl":16}],"name":"AlgorithmType","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1050":{"methods":[{"sl":16}],"name":"test6","pass":true,"statements":[{"sl":17},{"sl":22},{"sl":23}]},"test_1221":{"methods":[{"sl":16}],"name":"test5","pass":true,"statements":[{"sl":17},{"sl":24},{"sl":25}]},"test_1253":{"methods":[{"sl":16}],"name":"test1","pass":true,"statements":[{"sl":17},{"sl":20},{"sl":21}]},"test_1641":{"methods":[{"sl":16}],"name":"test3","pass":true,"statements":[{"sl":17},{"sl":26},{"sl":27}]},"test_1673":{"methods":[{"sl":16}],"name":"test4","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_346":{"methods":[{"sl":8},{"sl":12}],"name":"test0","pass":true,"statements":[{"sl":9},{"sl":13}]},"test_385":{"methods":[{"sl":16}],"name":"test2","pass":true,"statements":[{"sl":17},{"sl":29}]},"test_785":{"methods":[{"sl":16}],"name":"test7","pass":true,"statements":[{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [346], [346], [], [], [346], [346], [], [], [1050, 385, 785, 1641, 1221, 1673, 1253], [1050, 385, 785, 1641, 1221, 1673, 1253], [1673], [1673], [1253], [1253], [1050], [1050], [1221], [1221], [1641], [1641], [], [385], [], []]
