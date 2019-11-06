var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1414,"methods":[{"el":22,"sc":5,"sl":11},{"el":26,"sc":5,"sl":24},{"el":41,"sc":5,"sl":29}],"name":"SaveAssetCmd","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_24":{"methods":[{"sl":11}],"name":"testConstructor","pass":true,"statements":[{"sl":12},{"sl":15},{"sl":18},{"sl":21}]},"test_39":{"methods":[{"sl":11}],"name":"testConstructorAssetWithoutName","pass":true,"statements":[{"sl":12},{"sl":15},{"sl":16}]},"test_78":{"methods":[{"sl":11}],"name":"testSaveNewAssetNotAllowed","pass":true,"statements":[{"sl":12},{"sl":15},{"sl":18},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [24, 39, 78], [24, 39, 78], [], [], [24, 39, 78], [39], [], [24, 78], [78], [], [24], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
