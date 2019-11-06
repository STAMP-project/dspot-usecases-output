var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":153,"id":6256,"methods":[{"el":24,"sc":5,"sl":22},{"el":28,"sc":5,"sl":26},{"el":32,"sc":5,"sl":30},{"el":37,"sc":5,"sl":34},{"el":42,"sc":5,"sl":39},{"el":46,"sc":5,"sl":44},{"el":50,"sc":5,"sl":48},{"el":54,"sc":5,"sl":52},{"el":58,"sc":5,"sl":56},{"el":62,"sc":5,"sl":60},{"el":66,"sc":5,"sl":64},{"el":71,"sc":5,"sl":68},{"el":76,"sc":5,"sl":73},{"el":82,"sc":5,"sl":78},{"el":86,"sc":5,"sl":84},{"el":90,"sc":5,"sl":88},{"el":94,"sc":5,"sl":92},{"el":98,"sc":5,"sl":96},{"el":102,"sc":5,"sl":100},{"el":106,"sc":5,"sl":104},{"el":110,"sc":5,"sl":108},{"el":114,"sc":5,"sl":112},{"el":118,"sc":5,"sl":116},{"el":130,"sc":5,"sl":128},{"el":137,"sc":5,"sl":132},{"el":147,"sc":5,"sl":139}],"name":"DomainFactory","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":44},{"sl":132}],"name":"testSaveOrUpdateAndFindByNameAndOwner","pass":true,"statements":[{"sl":45},{"sl":133},{"sl":136}]},"test_12":{"methods":[{"sl":48},{"sl":132}],"name":"testFindByNameAndOwner","pass":true,"statements":[{"sl":49},{"sl":133},{"sl":136}]},"test_16":{"methods":[{"sl":132}],"name":"testDefaultProvider","pass":true,"statements":[{"sl":133},{"sl":136}]},"test_21":{"methods":[{"sl":48},{"sl":132}],"name":"testSaveOrUpdateNoCustomer","pass":true,"statements":[{"sl":49},{"sl":133},{"sl":136}]},"test_22":{"methods":[{"sl":100},{"sl":132}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":101},{"sl":133},{"sl":136}]},"test_26":{"methods":[{"sl":48},{"sl":73},{"sl":132}],"name":"testDeleteRecordsByOwner","pass":true,"statements":[{"sl":49},{"sl":75},{"sl":133},{"sl":136}]},"test_28":{"methods":[{"sl":64},{"sl":78},{"sl":132}],"name":"testSaveOrUpdateAndFindAllBySensorDevice","pass":true,"statements":[{"sl":65},{"sl":81},{"sl":133},{"sl":136}]},"test_30":{"methods":[{"sl":34},{"sl":84},{"sl":132}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":36},{"sl":85},{"sl":133},{"sl":136}]},"test_36":{"methods":[{"sl":48},{"sl":132}],"name":"testSaveOrUpdateAndFindById","pass":true,"statements":[{"sl":49},{"sl":133},{"sl":136}]},"test_37":{"methods":[{"sl":92},{"sl":132}],"name":"testDeleteGroupsByOwner","pass":true,"statements":[{"sl":93},{"sl":133},{"sl":136}]},"test_51":{"methods":[{"sl":48},{"sl":132}],"name":"testSaveOrUpdateNoName","pass":true,"statements":[{"sl":49},{"sl":133},{"sl":136}]},"test_54":{"methods":[{"sl":100},{"sl":132}],"name":"checkIndoorLocationHierarchy","pass":true,"statements":[{"sl":101},{"sl":133},{"sl":136}]},"test_56":{"methods":[{"sl":30},{"sl":34},{"sl":39},{"sl":132}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":31},{"sl":36},{"sl":41},{"sl":133},{"sl":136}]},"test_6":{"methods":[{"sl":64},{"sl":78},{"sl":132}],"name":"testSaveNotUnique","pass":true,"statements":[{"sl":65},{"sl":81},{"sl":133},{"sl":136}]},"test_65":{"methods":[{"sl":48},{"sl":92},{"sl":132}],"name":"testClearGroup","pass":true,"statements":[{"sl":49},{"sl":93},{"sl":133},{"sl":136}]},"test_66":{"methods":[{"sl":48},{"sl":132}],"name":"testDeleteAssetsByOwner","pass":true,"statements":[{"sl":49},{"sl":133},{"sl":136}]},"test_67":{"methods":[{"sl":30},{"sl":34},{"sl":39},{"sl":132}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":31},{"sl":36},{"sl":41},{"sl":133},{"sl":136}]},"test_71":{"methods":[{"sl":30},{"sl":34},{"sl":39},{"sl":132}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":31},{"sl":36},{"sl":41},{"sl":133},{"sl":136}]},"test_78":{"methods":[{"sl":68},{"sl":132}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":70},{"sl":133},{"sl":136}]},"test_82":{"methods":[{"sl":96},{"sl":132}],"name":"testDeleteTypesByOwner","pass":true,"statements":[{"sl":97},{"sl":133},{"sl":136}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 71, 67], [56, 71, 67], [], [], [56, 71, 30, 67], [], [56, 71, 30, 67], [], [], [56, 71, 67], [], [56, 71, 67], [], [], [0], [0], [], [], [51, 26, 66, 21, 36, 12, 65], [51, 26, 66, 21, 36, 12, 65], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [6, 28], [6, 28], [], [], [78], [], [78], [], [], [26], [], [26], [], [], [6, 28], [], [], [6, 28], [], [], [30], [30], [], [], [], [], [], [], [37, 65], [37, 65], [], [], [82], [82], [], [], [54, 22], [54, 22], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 16, 37, 51, 78, 54, 82, 71, 6, 22, 26, 66, 30, 21, 36, 28, 0, 12, 65, 67], [56, 16, 37, 51, 78, 54, 82, 71, 6, 22, 26, 66, 30, 21, 36, 28, 0, 12, 65, 67], [], [], [56, 16, 37, 51, 78, 54, 82, 71, 6, 22, 26, 66, 30, 21, 36, 28, 0, 12, 65, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
