var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":2188,"methods":[{"el":22,"sc":5,"sl":21},{"el":28,"sc":5,"sl":24},{"el":32,"sc":5,"sl":30},{"el":36,"sc":5,"sl":34},{"el":40,"sc":5,"sl":38},{"el":44,"sc":5,"sl":42},{"el":48,"sc":5,"sl":46},{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":72,"sc":5,"sl":70}],"name":"UserGroup","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUser","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_170":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationsnull5224_failAssert0","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_174":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUsernull3889_failAssert0_mg3982_failAssert0","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_191":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUsernull3889_failAssert0","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_229":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGroup","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_28":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplications","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_287":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUserGroup","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_315":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetUserGroups","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_318":{"methods":[{"sl":24}],"name":"testGetApplicationWithConfigurationForAllLanguagesnull4510_failAssert0_mg4593_failAssert0","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_328":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfo","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_365":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUserGroupnull4336_failAssert0","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_368":{"methods":[{"sl":24}],"name":"testGetGeneralConfigurationsOfConfigurationByIdnull6674_failAssert0_mg6718_failAssert0","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_372":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUsernull3889_failAssert0_mg3961_failAssert0","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_374":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfiguration","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_463":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetConfigurations","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_509":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"searchApplicationsByName","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_514":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUsernull2614_failAssert0","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_589":{"methods":[{"sl":24}],"name":"testCreateUsernull2613_failAssert0","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_82":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfigurationForAllLanguages","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_83":{"methods":[{"sl":21}],"name":"testGetApplicationForUser_mg3881_failAssert0_mg3977_failAssert0","pass":true,"statements":[]},"test_96":{"methods":[{"sl":21},{"sl":24},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUser_mg2554","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [103, 509, 229, 83, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [], [], [103, 229, 514, 318, 96, 368, 589], [103, 229, 514, 318, 96, 368, 589], [103, 229, 514, 318, 96, 368, 589], [103, 229, 514, 318, 96, 368, 589], [], [], [96], [96], [], [], [103, 229, 514, 96], [103, 229, 514, 96], [], [], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [], [], [103, 229, 514, 96], [103, 229, 514, 96], [], [], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [], [], [103, 229, 514, 96], [103, 229, 514, 96], [], [], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [], [], [], [], [], [], [], [], [], [], [103, 509, 229, 463, 170, 28, 374, 514, 96, 82, 328], [103, 509, 229, 463, 170, 28, 374, 514, 96, 82, 328], [], [], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [103, 509, 229, 315, 463, 174, 170, 365, 28, 374, 514, 287, 96, 191, 82, 328, 372], [], []]