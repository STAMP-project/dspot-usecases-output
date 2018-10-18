var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":108,"id":5887,"methods":[{"el":54,"sc":2,"sl":50},{"el":58,"sc":2,"sl":56},{"el":61,"sc":2,"sl":59},{"el":64,"sc":2,"sl":62},{"el":67,"sc":2,"sl":65},{"el":70,"sc":2,"sl":68},{"el":73,"sc":2,"sl":71},{"el":76,"sc":2,"sl":74},{"el":79,"sc":2,"sl":77},{"el":84,"sc":2,"sl":80},{"el":87,"sc":2,"sl":85},{"el":93,"sc":2,"sl":89},{"el":97,"sc":2,"sl":95},{"el":101,"sc":2,"sl":99},{"el":106,"sc":2,"sl":103}],"name":"Feature","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_127":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testGetFeaturesOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_24":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_36":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testGetFeatureByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_43":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_50":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testAddDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_54":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testAddDeleteSkillsOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_71":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testAddDeleteDependenciesOfFeatureByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_75":{"methods":[{"sl":50},{"sl":59},{"sl":65},{"sl":71},{"sl":77},{"sl":85},{"sl":95},{"sl":103}],"name":"testDeleteFeaturesOfReleaseByIdOfProjectById","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":60},{"sl":66},{"sl":72},{"sl":78},{"sl":86},{"sl":96},{"sl":105}]},"test_77":{"methods":[{"sl":50},{"sl":56},{"sl":59},{"sl":62},{"sl":65},{"sl":68},{"sl":71},{"sl":74},{"sl":77},{"sl":80},{"sl":85},{"sl":89},{"sl":95},{"sl":99},{"sl":103}],"name":"testCreateAndDeleteFeatureForProject","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":57},{"sl":60},{"sl":63},{"sl":66},{"sl":69},{"sl":72},{"sl":75},{"sl":78},{"sl":81},{"sl":83},{"sl":86},{"sl":90},{"sl":92},{"sl":96},{"sl":100},{"sl":105}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [], [77], [77], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [77], [77], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [77], [77], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [77], [77], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [77], [77], [], [77], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [], [77], [77], [], [77], [], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [], [77], [77], [], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [50, 43, 75, 71, 127, 77, 36, 54, 24], [], [], []]
