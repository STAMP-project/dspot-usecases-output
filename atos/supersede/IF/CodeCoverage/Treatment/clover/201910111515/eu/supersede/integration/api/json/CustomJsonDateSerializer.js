var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":3431,"methods":[{"el":39,"sc":2,"sl":33}],"name":"CustomJsonDateSerializer","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1816":{"methods":[{"sl":33}],"name":"testUpdateReleasesOfProjectById","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]},"test_541":{"methods":[{"sl":33}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1816, 541], [], [], [1816, 541], [1816, 541], [1816, 541], [], [], [], []]
