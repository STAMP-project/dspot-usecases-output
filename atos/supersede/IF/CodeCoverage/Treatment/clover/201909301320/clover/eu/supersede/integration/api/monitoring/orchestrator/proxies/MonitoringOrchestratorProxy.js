var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":185,"id":4343,"methods":[{"el":48,"sc":2,"sl":46},{"el":55,"sc":2,"sl":50},{"el":62,"sc":2,"sl":57},{"el":70,"sc":2,"sl":64},{"el":78,"sc":2,"sl":72},{"el":86,"sc":2,"sl":80},{"el":98,"sc":2,"sl":88},{"el":110,"sc":2,"sl":100},{"el":122,"sc":2,"sl":112},{"el":138,"sc":2,"sl":124},{"el":153,"sc":2,"sl":140},{"el":169,"sc":2,"sl":155},{"el":184,"sc":2,"sl":171}],"name":"MonitoringOrchestratorProxy","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":64},{"sl":72}],"name":"testCreateGetDeleteMonitorTool_add1null223_failAssert0_mg814_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_114":{"methods":[{"sl":64},{"sl":72},{"sl":80}],"name":"testCreateGetDeleteMonitorTypenull1275_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82}]},"test_172":{"methods":[{"sl":57},{"sl":64},{"sl":72}],"name":"testListAllMonitorTypes","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_19":{"methods":[{"sl":64},{"sl":72}],"name":"testCreateGetDeleteMonitorToolnull21_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_216":{"methods":[{"sl":64},{"sl":72},{"sl":80}],"name":"testCreateGetDeleteMonitorTypenull1275_failAssert0_mg1328_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82}]},"test_265":{"methods":[{"sl":57},{"sl":64},{"sl":72}],"name":"testListAllMonitorTypes_add1754","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_292":{"methods":[{"sl":64},{"sl":72}],"name":"testCreateGetDeleteMonitorTypenull1274_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_33":{"methods":[{"sl":64},{"sl":72},{"sl":80},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorTool_add1","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":121}]},"test_340":{"methods":[{"sl":64},{"sl":72},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorToolnull24_failAssert0_mg148_failAssert0null837_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114}]},"test_352":{"methods":[{"sl":64},{"sl":72},{"sl":88},{"sl":100}],"name":"testCreateGetDeleteMonitorTool_add2null228_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109}]},"test_372":{"methods":[{"sl":57},{"sl":64},{"sl":72}],"name":"testListAllMonitorTypesnull1769_failAssert0","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_374":{"methods":[{"sl":64},{"sl":72},{"sl":80},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorTool_add2","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":121}]},"test_406":{"methods":[{"sl":64},{"sl":72},{"sl":88},{"sl":100}],"name":"testCreateGetDeleteMonitorToolnull22_failAssert0_mg159_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109}]},"test_437":{"methods":[{"sl":64},{"sl":72},{"sl":80}],"name":"testCreateGetDeleteMonitorType_add1264","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":83},{"sl":84},{"sl":85}]},"test_472":{"methods":[{"sl":64},{"sl":72},{"sl":88},{"sl":100}],"name":"testCreateGetDeleteMonitorTool_add2null228_failAssert0_mg767_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109}]},"test_475":{"methods":[{"sl":64},{"sl":72},{"sl":80},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorToolnull24_failAssert0_mg148_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":121}]},"test_48":{"methods":[{"sl":57},{"sl":64},{"sl":72}],"name":"testListAllMonitorTypes_add1754_add1837","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_481":{"methods":[{"sl":64},{"sl":72}],"name":"testCreateGetDeleteMonitorToolnull21_failAssert0_mg154_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_489":{"methods":[{"sl":64},{"sl":72},{"sl":80},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorToolnull24_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":121}]},"test_495":{"methods":[{"sl":64},{"sl":72},{"sl":88},{"sl":100}],"name":"testCreateGetDeleteMonitorToolnull22_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109}]},"test_80":{"methods":[{"sl":64},{"sl":72},{"sl":80},{"sl":88},{"sl":100},{"sl":112}],"name":"testCreateGetDeleteMonitorToolnull24_failAssert0_add112_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":82},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":97},{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":109},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":121}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [48, 372, 172, 265], [], [48, 372, 172, 265], [48, 372, 172, 265], [48, 372, 172, 265], [], [], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [], [], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [495, 472, 33, 481, 216, 437, 48, 340, 374, 406, 114, 372, 489, 475, 11, 172, 19, 292, 265, 352, 80], [], [], [33, 216, 437, 374, 114, 489, 475, 80], [], [33, 216, 437, 374, 114, 489, 475, 80], [33, 437, 374], [33, 437, 374], [33, 437, 374], [], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [], [495, 472, 33, 340, 374, 406, 489, 475, 352, 80], [], [], [33, 340, 374, 489, 475, 80], [], [33, 340, 374, 489, 475, 80], [33, 374, 489, 475, 80], [33, 374, 489, 475, 80], [], [33, 374, 489, 475, 80], [], [], [33, 374, 489, 475, 80], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
