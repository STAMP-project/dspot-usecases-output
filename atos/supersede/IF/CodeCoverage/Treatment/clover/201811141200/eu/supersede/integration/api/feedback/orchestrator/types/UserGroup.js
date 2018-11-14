var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":2188,"methods":[{"el":22,"sc":5,"sl":21},{"el":28,"sc":5,"sl":24},{"el":32,"sc":5,"sl":30},{"el":36,"sc":5,"sl":34},{"el":40,"sc":5,"sl":38},{"el":44,"sc":5,"sl":42},{"el":48,"sc":5,"sl":46},{"el":52,"sc":5,"sl":50},{"el":56,"sc":5,"sl":54},{"el":60,"sc":5,"sl":58},{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":72,"sc":5,"sl":70}],"name":"UserGroup","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":24}],"name":"testCreateUsernull4280_failAssert1083litString4388_failAssert1097","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_125":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetUserGroupsnull5404_failAssert1350","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_138":{"methods":[{"sl":21},{"sl":24},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGrouplitString4857null4893_failAssert1217","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_199":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfigurationnull4959_failAssert1239","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_206":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfiguration","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_236":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUser","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_277":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUserGroup","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_300":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationsnull4965_failAssert1241","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_347":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGrouplitString4857","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_362":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplications","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_411":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetConfigurationsnull4971_failAssert1243","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_421":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"searchApplicationsByName","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_437":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetConfigurations","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_439":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"searchApplicationsByNamenull10_failAssert9","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_443":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserlitString4256null4441_failAssert1086litString4690_failAssert1190","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_484":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetUserGroups","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_495":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfonull336_failAssert107litString389_failAssert125","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_496":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserlitString4256null4441_failAssert1086","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_542":{"methods":[{"sl":21},{"sl":24},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserlitString4256null4437_failAssert1085","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_560":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfonull336_failAssert107","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_61":{"methods":[{"sl":21},{"sl":24},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGroupnull4865_failAssert1216","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_643":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfigurationForAllLanguages","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_717":{"methods":[{"sl":21},{"sl":24},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUsernull4280_failAssert1083","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_750":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testGetApplicationWithConfigurationForAllLanguagesnull4962_failAssert1240","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_768":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfo","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_770":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserGroup","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_797":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreatePullConfigurationForUserInfonull336_failAssert107litString389_failAssert125litString491_failAssert151","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_813":{"methods":[{"sl":21},{"sl":24},{"sl":38},{"sl":46},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserlitString4256null4437_failAssert1085litString4690_failAssert1173","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":39},{"sl":47},{"sl":55},{"sl":67},{"sl":71}]},"test_814":{"methods":[{"sl":24}],"name":"testCreateUserlitString4256null4441_failAssert1086null4732_failAssert1206","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_833":{"methods":[{"sl":21},{"sl":38},{"sl":46},{"sl":54},{"sl":70}],"name":"testGetApplicationForUserGroupnull4956_failAssert1238","pass":true,"statements":[{"sl":39},{"sl":47},{"sl":55},{"sl":71}]},"test_852":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUserlitString4256","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]},"test_96":{"methods":[{"sl":21},{"sl":24},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":66},{"sl":70}],"name":"testCreateUsernull4281_failAssert1084","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":67},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [], [], [542, 61, 138, 814, 101, 813, 852, 443, 770, 96, 717, 496, 347, 236], [542, 61, 138, 814, 101, 813, 852, 443, 770, 96, 717, 496, 347, 236], [542, 61, 138, 814, 101, 813, 852, 443, 770, 96, 717, 496, 347, 236], [542, 61, 138, 814, 101, 813, 852, 443, 770, 96, 717, 496, 347, 236], [], [], [], [], [], [], [852, 443, 770, 96, 496, 347, 236], [852, 443, 770, 96, 496, 347, 236], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [], [], [852, 443, 770, 96, 496, 347, 236], [852, 443, 770, 96, 496, 347, 236], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [], [], [852, 443, 770, 96, 496, 347, 236], [852, 443, 770, 96, 496, 347, 236], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [], [], [], [], [], [], [], [], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 852, 443, 770, 96, 421, 643, 717, 496, 768, 439, 347, 206, 236], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 852, 443, 770, 96, 421, 643, 717, 496, 768, 439, 347, 206, 236], [], [], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [542, 61, 437, 797, 362, 560, 495, 300, 138, 813, 411, 199, 750, 484, 852, 125, 443, 770, 96, 421, 277, 643, 833, 717, 496, 768, 439, 347, 206, 236], [], []]
