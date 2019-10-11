var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":6111,"methods":[{"el":33,"sc":2,"sl":31},{"el":36,"sc":2,"sl":34},{"el":39,"sc":2,"sl":37},{"el":42,"sc":2,"sl":40}],"name":"ReplanBaseObject","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1117":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleasesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1122":{"methods":[{"sl":31}],"name":"test12","pass":true,"statements":[{"sl":32}]},"test_1188":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1231":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_126":{"methods":[{"sl":37}],"name":"test0","pass":true,"statements":[{"sl":38}]},"test_1283":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1383":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1408":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1470":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1518":{"methods":[{"sl":34},{"sl":40}],"name":"testGetProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_154":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_155":{"methods":[{"sl":34},{"sl":40}],"name":"testGetPlanOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1677":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_1691":{"methods":[{"sl":31},{"sl":34}],"name":"test5","pass":true,"statements":[{"sl":32},{"sl":35}]},"test_1777":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_1816":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateReleasesOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_1827":{"methods":[{"sl":34},{"sl":40}],"name":"testGetAllProjects","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1832":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_1840":{"methods":[{"sl":31}],"name":"test00","pass":true,"statements":[{"sl":32}]},"test_1848":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_185":{"methods":[{"sl":31}],"name":"test0","pass":true,"statements":[{"sl":32}]},"test_2083":{"methods":[{"sl":34},{"sl":40}],"name":"testGetSkillsOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_2106":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_2139":{"methods":[{"sl":31},{"sl":34}],"name":"test3","pass":true,"statements":[{"sl":32},{"sl":35}]},"test_2226":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_331":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_365":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_394":{"methods":[{"sl":34},{"sl":40}],"name":"testGetResourcesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_402":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_427":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_481":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_516":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_541":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_6":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateSkillsOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_660":{"methods":[{"sl":37},{"sl":40}],"name":"test1","pass":true,"statements":[{"sl":38},{"sl":41}]},"test_726":{"methods":[{"sl":34},{"sl":40}],"name":"testDelecteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_727":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_735":{"methods":[{"sl":37}],"name":"test2","pass":true,"statements":[{"sl":38}]},"test_772":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_784":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_991":{"methods":[{"sl":37},{"sl":40}],"name":"test4","pass":true,"statements":[{"sl":38},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [481, 427, 331, 6, 1816, 541, 1691, 1122, 1840, 185, 1848, 1677, 516, 2139, 727], [481, 427, 331, 6, 1816, 541, 1691, 1122, 1840, 185, 1848, 1677, 516, 2139, 727], [], [481, 427, 784, 331, 6, 2083, 1816, 1827, 394, 541, 1691, 2106, 1470, 1283, 1117, 1383, 772, 1848, 365, 155, 1677, 516, 1408, 1832, 2226, 2139, 726, 1518, 154, 402, 727, 1188], [481, 427, 784, 331, 6, 2083, 1816, 1827, 394, 541, 1691, 2106, 1470, 1283, 1117, 1383, 772, 1848, 365, 155, 1677, 516, 1408, 1832, 2226, 2139, 726, 1518, 154, 402, 727, 1188], [], [991, 481, 427, 331, 6, 1816, 541, 735, 126, 1231, 1848, 1677, 516, 660, 1777, 727], [991, 481, 427, 331, 6, 1816, 541, 735, 126, 1231, 1848, 1677, 516, 660, 1777, 727], [], [991, 481, 427, 784, 331, 6, 2083, 1816, 1827, 394, 541, 2106, 1470, 1283, 1117, 1383, 772, 1848, 365, 155, 1677, 516, 660, 1408, 1832, 2226, 726, 1518, 154, 402, 727, 1188], [991, 481, 427, 784, 331, 6, 2083, 1816, 1827, 394, 541, 2106, 1470, 1283, 1117, 1383, 772, 1848, 365, 155, 1677, 516, 660, 1408, 1832, 2226, 726, 1518, 154, 402, 727, 1188], [], []]
