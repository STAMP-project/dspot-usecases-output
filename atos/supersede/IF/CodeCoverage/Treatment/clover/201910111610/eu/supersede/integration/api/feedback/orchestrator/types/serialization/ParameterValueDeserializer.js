var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":2315,"methods":[{"el":19,"sc":5,"sl":12}],"name":"ParameterValueDeserializer","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2190":{"methods":[{"sl":12}],"name":"test1","pass":true,"statements":[{"sl":14}]},"test_899":{"methods":[{"sl":12}],"name":"test0","pass":true,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2190, 899], [], [2190, 899], [899], [], [], [], [], []]
