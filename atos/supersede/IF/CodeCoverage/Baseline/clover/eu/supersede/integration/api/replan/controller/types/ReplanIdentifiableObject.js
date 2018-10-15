var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":6114,"methods":[{"el":27,"sc":2,"sl":25},{"el":30,"sc":2,"sl":28}],"name":"ReplanIdentifiableObject","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":28}],"name":"testGetSkillsOfProjectById","pass":true,"statements":[{"sl":29}]},"test_1":{"methods":[{"sl":28}],"name":"testGetFeaturesOfProjectById","pass":true,"statements":[{"sl":29}]},"test_100":{"methods":[{"sl":25},{"sl":28}],"name":"tesDeleteResourceOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_101":{"methods":[{"sl":25}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":26}]},"test_109":{"methods":[{"sl":28}],"name":"testGetResourcesOfProjectById","pass":true,"statements":[{"sl":29}]},"test_11":{"methods":[{"sl":28}],"name":"testGetProjectById","pass":true,"statements":[{"sl":29}]},"test_116":{"methods":[{"sl":25},{"sl":28}],"name":"testGetFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_119":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_131":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteResourceOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_135":{"methods":[{"sl":25},{"sl":28}],"name":"testDeleteSkillOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_15":{"methods":[{"sl":25},{"sl":28}],"name":"testDelecteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_16":{"methods":[{"sl":25},{"sl":28}],"name":"testDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_18":{"methods":[{"sl":28}],"name":"testGetReleasesOfProjectById","pass":true,"statements":[{"sl":29}]},"test_20":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_31":{"methods":[{"sl":25},{"sl":28}],"name":"testGetReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_35":{"methods":[{"sl":25},{"sl":28}],"name":"testUpdateResourceOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_37":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_41":{"methods":[{"sl":25},{"sl":28}],"name":"testGetFeatureByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_48":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteSkillOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_5":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_51":{"methods":[{"sl":25},{"sl":28}],"name":"testAddDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_57":{"methods":[{"sl":25},{"sl":28}],"name":"testUpdateSkillsOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_58":{"methods":[{"sl":25},{"sl":28}],"name":"testGetPlanOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_59":{"methods":[{"sl":25},{"sl":28}],"name":"testDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_61":{"methods":[{"sl":25},{"sl":28}],"name":"testCreateAndDeleteProject","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_63":{"methods":[{"sl":25},{"sl":28}],"name":"testUpdateReleasesOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_65":{"methods":[{"sl":25},{"sl":28}],"name":"testDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_66":{"methods":[{"sl":25}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":26}]},"test_68":{"methods":[{"sl":28}],"name":"testGetAllProjects","pass":true,"statements":[{"sl":29}]},"test_77":{"methods":[{"sl":25},{"sl":28}],"name":"testDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_83":{"methods":[{"sl":25},{"sl":28}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_92":{"methods":[{"sl":25},{"sl":28}],"name":"testUpdateProject","pass":true,"statements":[{"sl":26},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [48, 37, 92, 61, 63, 59, 35, 66, 100, 20, 31, 83, 131, 77, 135, 5, 65, 119, 16, 58, 57, 116, 101, 51, 41, 15], [48, 37, 92, 61, 63, 59, 35, 66, 100, 20, 31, 83, 131, 77, 135, 5, 65, 119, 16, 58, 57, 116, 101, 51, 41, 15], [], [48, 37, 92, 61, 1, 63, 59, 35, 109, 100, 20, 68, 31, 83, 11, 131, 77, 135, 5, 65, 119, 16, 58, 0, 57, 116, 18, 51, 41, 15], [48, 37, 92, 61, 1, 63, 59, 35, 109, 100, 20, 68, 31, 83, 11, 131, 77, 135, 5, 65, 119, 16, 58, 0, 57, 116, 18, 51, 41, 15], [], []]