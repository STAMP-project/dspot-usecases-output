var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":6100,"methods":[{"el":33,"sc":2,"sl":31},{"el":36,"sc":2,"sl":34},{"el":39,"sc":2,"sl":37},{"el":42,"sc":2,"sl":40}],"name":"ReplanBaseObject","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":34},{"sl":40}],"name":"testGetSkillsOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_101":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_109":{"methods":[{"sl":34},{"sl":40}],"name":"testGetProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_110":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_111":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_118":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_126":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_127":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_128":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_129":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleasesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_14":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_24":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_28":{"methods":[{"sl":34},{"sl":40}],"name":"testGetPlanOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_34":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_36":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_42":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_43":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_46":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_50":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_51":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_54":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_55":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateSkillsOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_61":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_71":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_72":{"methods":[{"sl":34},{"sl":40}],"name":"testGetResourcesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_73":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_75":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_77":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_80":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_84":{"methods":[{"sl":34},{"sl":40}],"name":"testDelecteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_89":{"methods":[{"sl":34},{"sl":40}],"name":"testGetAllProjects","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_92":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateReleasesOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [128, 92, 46, 110, 51, 126, 55, 77, 61, 101], [128, 92, 46, 110, 51, 126, 55, 77, 61, 101], [], [129, 128, 50, 80, 75, 71, 14, 28, 42, 92, 24, 46, 43, 110, 72, 51, 126, 127, 55, 77, 36, 61, 84, 73, 89, 0, 54, 109, 101, 34], [129, 128, 50, 80, 75, 71, 14, 28, 42, 92, 24, 46, 43, 110, 72, 51, 126, 127, 55, 77, 36, 61, 84, 73, 89, 0, 54, 109, 101, 34], [], [118, 128, 111, 92, 46, 110, 51, 126, 55, 77, 61, 101], [118, 128, 111, 92, 46, 110, 51, 126, 55, 77, 61, 101], [], [129, 128, 50, 80, 75, 71, 14, 28, 42, 92, 24, 46, 43, 110, 72, 51, 126, 127, 55, 77, 36, 61, 84, 73, 89, 0, 54, 109, 101, 34], [129, 128, 50, 80, 75, 71, 14, 28, 42, 92, 24, 46, 43, 110, 72, 51, 126, 127, 55, 77, 36, 61, 84, 73, 89, 0, 54, 109, 101, 34], [], []]