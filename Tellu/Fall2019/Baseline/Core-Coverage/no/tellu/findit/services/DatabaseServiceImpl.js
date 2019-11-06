var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":619,"id":11569,"methods":[{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":45,"sc":5,"sl":35},{"el":57,"sc":5,"sl":47},{"el":69,"sc":5,"sl":60},{"el":81,"sc":5,"sl":72},{"el":93,"sc":5,"sl":84},{"el":105,"sc":5,"sl":96},{"el":117,"sc":5,"sl":108},{"el":129,"sc":5,"sl":119},{"el":141,"sc":5,"sl":131},{"el":153,"sc":5,"sl":143},{"el":165,"sc":5,"sl":155},{"el":177,"sc":5,"sl":167},{"el":189,"sc":5,"sl":179},{"el":201,"sc":5,"sl":191},{"el":213,"sc":5,"sl":203},{"el":226,"sc":5,"sl":216},{"el":239,"sc":5,"sl":229},{"el":251,"sc":5,"sl":241},{"el":263,"sc":5,"sl":253},{"el":276,"sc":5,"sl":266},{"el":288,"sc":5,"sl":278},{"el":301,"sc":5,"sl":291},{"el":315,"sc":5,"sl":303},{"el":326,"sc":5,"sl":317},{"el":338,"sc":5,"sl":328},{"el":350,"sc":5,"sl":340},{"el":356,"sc":5,"sl":353},{"el":368,"sc":5,"sl":359},{"el":381,"sc":5,"sl":371},{"el":393,"sc":5,"sl":383},{"el":406,"sc":5,"sl":395},{"el":418,"sc":5,"sl":408},{"el":430,"sc":5,"sl":421},{"el":448,"sc":5,"sl":434},{"el":464,"sc":5,"sl":450},{"el":476,"sc":5,"sl":467},{"el":487,"sc":5,"sl":478},{"el":529,"sc":5,"sl":519},{"el":540,"sc":2,"sl":531},{"el":552,"sc":2,"sl":542},{"el":563,"sc":2,"sl":554},{"el":574,"sc":2,"sl":565},{"el":587,"sc":5,"sl":577},{"el":608,"sc":5,"sl":590},{"el":618,"sc":5,"sl":611}],"name":"DatabaseServiceImpl","sl":22},{"el":502,"id":11832,"methods":[{"el":494,"sc":9,"sl":492},{"el":500,"sc":9,"sl":496}],"name":"DatabaseServiceImpl.SaveCommand","sl":489},{"el":517,"id":11837,"methods":[{"el":509,"sc":9,"sl":507},{"el":515,"sc":9,"sl":511}],"name":"DatabaseServiceImpl.DeleteCommand","sl":504}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_29":{"methods":[{"sl":31},{"sl":241},{"sl":278}],"name":"doAddressLookupInnerZoneString","pass":true,"statements":[{"sl":32},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]},"test_3":{"methods":[{"sl":31},{"sl":241},{"sl":278}],"name":"doAddressLookup","pass":true,"statements":[{"sl":32},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]},"test_30":{"methods":[{"sl":31},{"sl":395}],"name":"testSaveAccessToken","pass":true,"statements":[{"sl":32},{"sl":397},{"sl":398},{"sl":399},{"sl":400}]},"test_35":{"methods":[{"sl":31},{"sl":278}],"name":"doInvalidAddressLookup","pass":true,"statements":[{"sl":32},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]},"test_47":{"methods":[{"sl":27},{"sl":31},{"sl":554}],"name":"testStar","pass":true,"statements":[{"sl":28},{"sl":32},{"sl":556},{"sl":557},{"sl":558},{"sl":559}]},"test_57":{"methods":[{"sl":31},{"sl":408}],"name":"testAddSensorDevice","pass":true,"statements":[{"sl":32},{"sl":410},{"sl":411},{"sl":412},{"sl":413}]},"test_70":{"methods":[{"sl":31},{"sl":241},{"sl":278}],"name":"doAddressLookupNoZoneString","pass":true,"statements":[{"sl":32},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]},"test_72":{"methods":[{"sl":31},{"sl":434}],"name":"testDeleteCustomer","pass":true,"statements":[{"sl":32},{"sl":436},{"sl":440},{"sl":441},{"sl":442},{"sl":443}]},"test_74":{"methods":[{"sl":31},{"sl":241},{"sl":278}],"name":"doAddressLookupOuterZone","pass":true,"statements":[{"sl":32},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]},"test_76":{"methods":[{"sl":31},{"sl":241},{"sl":278}],"name":"doAddressLookupInnerZone","pass":true,"statements":[{"sl":32},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":280},{"sl":281},{"sl":282},{"sl":283}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [47], [47], [], [], [3, 72, 29, 57, 30, 35, 70, 76, 74, 47], [3, 72, 29, 57, 30, 35, 70, 76, 74, 47], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3, 29, 70, 76, 74], [], [3, 29, 70, 76, 74], [3, 29, 70, 76, 74], [3, 29, 70, 76, 74], [3, 29, 70, 76, 74], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3, 29, 35, 70, 76, 74], [], [3, 29, 35, 70, 76, 74], [3, 29, 35, 70, 76, 74], [3, 29, 35, 70, 76, 74], [3, 29, 35, 70, 76, 74], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [30], [], [30], [30], [30], [30], [], [], [], [], [], [], [], [57], [], [57], [57], [57], [57], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [72], [], [72], [], [], [], [72], [72], [72], [72], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [47], [], [47], [47], [47], [47], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
