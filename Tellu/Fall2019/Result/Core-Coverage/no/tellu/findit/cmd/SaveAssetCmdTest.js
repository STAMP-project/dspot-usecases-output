var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":16620,"methods":[{"el":27,"sc":5,"sl":19},{"el":33,"sc":5,"sl":29},{"el":39,"sc":5,"sl":35},{"el":45,"sc":5,"sl":41}],"name":"SaveAssetCmdTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_24":{"methods":[{"sl":29}],"name":"testConstructor","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_39":{"methods":[{"sl":35}],"name":"testConstructorAssetWithoutName","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_78":{"methods":[{"sl":41}],"name":"testSaveNewAssetNotAllowed","pass":true,"statements":[{"sl":43},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [24], [], [24], [24], [], [], [39], [], [39], [39], [], [], [78], [], [78], [78], [], [], []]
