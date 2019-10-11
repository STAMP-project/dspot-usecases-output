var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":6111,"methods":[{"el":33,"sc":2,"sl":31},{"el":36,"sc":2,"sl":34},{"el":39,"sc":2,"sl":37},{"el":42,"sc":2,"sl":40}],"name":"ReplanBaseObject","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_109":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateReleasesOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_119":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_125":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_126":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_127":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_128":{"methods":[{"sl":34},{"sl":40}],"name":"testGetProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_129":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_13":{"methods":[{"sl":34},{"sl":40}],"name":"testGetResourcesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_132":{"methods":[{"sl":34},{"sl":40}],"name":"testGetAllProjects","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_145":{"methods":[{"sl":34},{"sl":40}],"name":"testDelecteSkillsOfResourceByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_15":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_20":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateSkillsOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_27":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_33":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testUpdateProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_34":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_37":{"methods":[{"sl":37}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":38}]},"test_38":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeaturesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_41":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_42":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_43":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_44":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_50":{"methods":[{"sl":34},{"sl":40}],"name":"testGetSkillsOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_56":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteResourcesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_63":{"methods":[{"sl":34},{"sl":40}],"name":"testGetFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_66":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleasesOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_71":{"methods":[{"sl":34},{"sl":40}],"name":"testDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_73":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteSkillOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_78":{"methods":[{"sl":34},{"sl":40}],"name":"testGetPlanOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_82":{"methods":[{"sl":31},{"sl":34},{"sl":37},{"sl":40}],"name":"testAddDeleteResourceOfProjectById","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":38},{"sl":41}]},"test_94":{"methods":[{"sl":34},{"sl":40}],"name":"testAddDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]},"test_99":{"methods":[{"sl":34},{"sl":40}],"name":"testGetReleaseByIdOfProjectById","pass":true,"statements":[{"sl":35},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [41, 15, 42, 1, 82, 20, 33, 44, 73, 109], [41, 15, 42, 1, 82, 20, 33, 44, 73, 109], [], [41, 15, 99, 78, 38, 66, 42, 27, 1, 63, 82, 126, 119, 145, 20, 50, 128, 94, 33, 132, 129, 71, 56, 127, 44, 73, 109, 125, 43, 13], [41, 15, 99, 78, 38, 66, 42, 27, 1, 63, 82, 126, 119, 145, 20, 50, 128, 94, 33, 132, 129, 71, 56, 127, 44, 73, 109, 125, 43, 13], [], [41, 15, 37, 42, 1, 82, 20, 34, 33, 44, 73, 109], [41, 15, 37, 42, 1, 82, 20, 34, 33, 44, 73, 109], [], [41, 15, 99, 78, 38, 66, 42, 27, 1, 63, 82, 126, 119, 145, 20, 50, 128, 94, 33, 132, 129, 71, 56, 127, 44, 73, 109, 125, 43, 13], [41, 15, 99, 78, 38, 66, 42, 27, 1, 63, 82, 126, 119, 145, 20, 50, 128, 94, 33, 132, 129, 71, 56, 127, 44, 73, 109, 125, 43, 13], [], []]
