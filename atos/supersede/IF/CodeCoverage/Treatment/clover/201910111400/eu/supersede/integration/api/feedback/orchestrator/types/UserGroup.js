var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":2181,"methods":[{"el":22,"sc":5,"sl":21},{"el":28,"sc":5,"sl":24},{"el":32,"sc":5,"sl":30},{"el":36,"sc":5,"sl":34},{"el":40,"sc":5,"sl":38},{"el":44,"sc":5,"sl":42},{"el":48,"sc":5,"sl":46},{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":72,"sc":5,"sl":70}],"name":"UserGroup","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_104":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUpdateDeleteConfiguration","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_107":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUserGroup","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_112":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfo","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_121":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfigurationForAllLanguages","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_123":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGroup","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_134":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetUserGroups","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_3":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"searchApplicationsByName","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_46":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfiguration","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_58":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUser","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_62":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetConfigurations","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_7":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplications","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_76":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUpdateDeleteApplication","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [], [], [76, 104, 123, 58], [76, 104, 123, 58], [76, 104, 123, 58], [76, 104, 123, 58], [], [], [], [], [], [], [76, 104, 123, 58], [76, 104, 123, 58], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [], [], [76, 104, 123, 58], [76, 104, 123, 58], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [], [], [76, 104, 123, 58], [76, 104, 123, 58], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [], [], [], [], [], [], [], [], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 58, 46], [112, 76, 3, 121, 62, 104, 7, 123, 58, 46], [], [], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [112, 76, 3, 121, 62, 104, 7, 123, 107, 58, 46, 134], [], []]
