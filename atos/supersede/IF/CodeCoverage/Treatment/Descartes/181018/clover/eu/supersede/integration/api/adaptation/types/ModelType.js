var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":578,"methods":[{"el":22,"sc":2,"sl":17},{"el":27,"sc":2,"sl":24},{"el":31,"sc":2,"sl":29},{"el":35,"sc":2,"sl":33},{"el":39,"sc":2,"sl":37},{"el":43,"sc":2,"sl":41}],"name":"ModelType","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":24},{"sl":33}],"name":"testGetAllFCModels","pass":true,"statements":[{"sl":26},{"sl":34}]},"test_103":{"methods":[{"sl":24},{"sl":33},{"sl":37}],"name":"testGetAllBaseModelsWithQueryMetadata","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":38}]},"test_125":{"methods":[{"sl":24},{"sl":33}],"name":"getModelInstance","pass":true,"statements":[{"sl":26},{"sl":34}]},"test_15":{"methods":[{"sl":17},{"sl":24},{"sl":33},{"sl":41}],"name":"testEnactAdaptationDecisionActionsForFC","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":26},{"sl":34},{"sl":42}]},"test_16":{"methods":[{"sl":24},{"sl":33}],"name":"testGetBaseModelsForSystem","pass":true,"statements":[{"sl":26},{"sl":34}]},"test_2":{"methods":[{"sl":24},{"sl":33},{"sl":37}],"name":"testGetAllBaseModels","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":38}]},"test_26":{"methods":[{"sl":24},{"sl":33},{"sl":37},{"sl":41}],"name":"testCreateGetAndDeleteAdaptationModel","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":38},{"sl":42}]},"test_4":{"methods":[{"sl":24},{"sl":33},{"sl":41}],"name":"testEnactFCGivenByString","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":42}]},"test_49":{"methods":[{"sl":24},{"sl":33},{"sl":41}],"name":"testEnactSelectedAdaptationDecisionsInFCGivenByString","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":42}]},"test_52":{"methods":[{"sl":24},{"sl":33}],"name":"testGetAllAdaptationModels","pass":true,"statements":[{"sl":26},{"sl":34}]},"test_62":{"methods":[{"sl":24},{"sl":33},{"sl":41}],"name":"testEnactAdaptationDecisionActions","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":42}]},"test_95":{"methods":[{"sl":24},{"sl":33},{"sl":37},{"sl":41}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":38},{"sl":42}]},"test_97":{"methods":[{"sl":24},{"sl":33},{"sl":37},{"sl":41}],"name":"testCreateUpdateAndDeleteAdaptationModel","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":38},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15], [15], [15], [15], [15], [], [], [4, 49, 95, 103, 97, 52, 26, 2, 62, 100, 125, 15, 16], [], [4, 49, 95, 103, 97, 52, 26, 2, 62, 100, 125, 15, 16], [], [], [], [], [], [], [4, 49, 95, 103, 97, 52, 26, 2, 62, 100, 125, 15, 16], [4, 49, 95, 103, 97, 52, 26, 2, 62, 100, 125, 15, 16], [], [], [95, 103, 97, 26, 2], [95, 103, 97, 26, 2], [], [], [4, 49, 95, 97, 26, 62, 15], [4, 49, 95, 97, 26, 62, 15], [], []]
