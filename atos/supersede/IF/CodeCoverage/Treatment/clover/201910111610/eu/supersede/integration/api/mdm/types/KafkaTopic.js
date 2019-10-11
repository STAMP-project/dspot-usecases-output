var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":3880,"methods":[{"el":11,"sc":2,"sl":9},{"el":15,"sc":2,"sl":13}],"name":"KafkaTopic","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2148":{"methods":[{"sl":9}],"name":"test0","pass":true,"statements":[{"sl":10}]},"test_2204":{"methods":[{"sl":9},{"sl":13}],"name":"test2","pass":true,"statements":[{"sl":10},{"sl":14}]},"test_350":{"methods":[{"sl":13}],"name":"testRegisterRelease","pass":true,"statements":[{"sl":14}]},"test_352":{"methods":[{"sl":9},{"sl":13}],"name":"test1","pass":true,"statements":[{"sl":10},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [352, 2204, 2148], [352, 2204, 2148], [], [], [352, 350, 2204], [352, 350, 2204], [], [], []]
