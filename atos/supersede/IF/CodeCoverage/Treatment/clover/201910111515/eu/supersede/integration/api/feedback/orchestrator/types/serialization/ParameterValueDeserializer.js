var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":2315,"methods":[{"el":19,"sc":5,"sl":12}],"name":"ParameterValueDeserializer","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1065":{"methods":[{"sl":12}],"name":"test0","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_40":{"methods":[{"sl":12}],"name":"test1","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [40, 1065], [], [40, 1065], [1065], [], [], [], [], []]
