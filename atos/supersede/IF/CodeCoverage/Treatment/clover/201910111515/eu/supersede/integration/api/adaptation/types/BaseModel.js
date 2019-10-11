var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":434,"methods":[{"el":9,"sc":2,"sl":7},{"el":12,"sc":2,"sl":10}],"name":"BaseModel","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1525":{"methods":[{"sl":7},{"sl":10}],"name":"test2","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_1560":{"methods":[{"sl":7}],"name":"test0","pass":true,"statements":[{"sl":8}]},"test_1611":{"methods":[{"sl":7},{"sl":10}],"name":"test1","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_1789":{"methods":[{"sl":10}],"name":"testGetAllBaseModelsWithQueryMetadata","pass":true,"statements":[{"sl":11}]},"test_2123":{"methods":[{"sl":10}],"name":"testGetAllBaseModels","pass":true,"statements":[{"sl":11}]},"test_2260":{"methods":[{"sl":10}],"name":"testGetBaseModelsForSystem","pass":true,"statements":[{"sl":11}]},"test_284":{"methods":[{"sl":10}],"name":"getModelInstance","pass":true,"statements":[{"sl":11}]},"test_335":{"methods":[{"sl":7},{"sl":10}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_979":{"methods":[{"sl":10}],"name":"testGetAllAdaptationModels","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [1611, 335, 1525, 1560], [1611, 335, 1525, 1560], [], [2260, 979, 1789, 1611, 2123, 335, 1525, 284], [2260, 979, 1789, 1611, 2123, 335, 1525, 284], [], [], []]
