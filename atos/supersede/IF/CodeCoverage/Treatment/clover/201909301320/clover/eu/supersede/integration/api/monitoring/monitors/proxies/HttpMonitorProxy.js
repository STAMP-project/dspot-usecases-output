var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":91,"id":4201,"methods":[{"el":51,"sc":2,"sl":49},{"el":58,"sc":2,"sl":53},{"el":65,"sc":2,"sl":60},{"el":71,"sc":2,"sl":67},{"el":80,"sc":2,"sl":73},{"el":89,"sc":2,"sl":82}],"name":"HttpMonitorProxy","sl":44},{"el":143,"id":4220,"methods":[{"el":107,"sc":2,"sl":105},{"el":111,"sc":2,"sl":109},{"el":116,"sc":2,"sl":113},{"el":121,"sc":2,"sl":118},{"el":127,"sc":2,"sl":123},{"el":138,"sc":2,"sl":129},{"el":142,"sc":2,"sl":140}],"name":"HttpMonitorConfigurationRequest","sl":93},{"el":165,"id":4233,"methods":[{"el":152,"sc":2,"sl":149},{"el":156,"sc":2,"sl":154},{"el":160,"sc":2,"sl":158},{"el":164,"sc":2,"sl":162}],"name":"HttpMonitorConfigurationResponse","sl":145}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_122":{"methods":[{"sl":73},{"sl":105},{"sl":118}],"name":"testUpdateMonitorConfigurationMultipart_literalMutationNumber1742_failAssert0_literalMutationString2117_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":120}]},"test_146":{"methods":[{"sl":73}],"name":"testCreateAndDeleteMonitorConfigurationMultipartnull63_failAssert0","pass":true,"statements":[{"sl":75}]},"test_179":{"methods":[{"sl":67},{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testCreateAndDeleteMonitorConfigurationMultipart_add1","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_192":{"methods":[{"sl":73}],"name":"testCreateAndDeleteMonitorConfigurationMultipartnull63_failAssert0litString549_failAssert0litString1232_failAssert0","pass":true,"statements":[{"sl":75}]},"test_248":{"methods":[{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testCreateAndDeleteMonitorConfigurationMultipartnull65_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_271":{"methods":[{"sl":60},{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testUpdateMonitorConfigurationMultipart_literalMutationNumber1742_failAssert0","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_29":{"methods":[{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testUpdateMonitorConfigurationMultipartnull1802_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_314":{"methods":[{"sl":73},{"sl":105},{"sl":118}],"name":"testCreateAndDeleteMonitorConfigurationMultipartlitString49_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":120}]},"test_339":{"methods":[{"sl":60},{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testUpdateMonitorConfigurationMultipart_add1716_add2035litNum3566_failAssert0","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_353":{"methods":[{"sl":73},{"sl":105},{"sl":118}],"name":"testCreateAndDeleteMonitorConfigurationMultipart_add1litString551_failAssert0_literalMutationString1104_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":120}]},"test_396":{"methods":[{"sl":60},{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testUpdateMonitorConfigurationMultipart_add1716","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_45":{"methods":[{"sl":60},{"sl":73},{"sl":105},{"sl":113},{"sl":118},{"sl":123},{"sl":129},{"sl":149},{"sl":154},{"sl":162}],"name":"testUpdateMonitorConfigurationMultipart_add1716_literalMutationNumber2359_failAssert0","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":115},{"sl":120},{"sl":126},{"sl":131},{"sl":151},{"sl":155}]},"test_477":{"methods":[{"sl":73}],"name":"testCreateAndDeleteMonitorConfigurationMultipartnull64_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76}]},"test_478":{"methods":[{"sl":73},{"sl":105},{"sl":118}],"name":"testCreateAndDeleteMonitorConfigurationMultipart_literalMutationString13_failAssert0","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":78},{"sl":106},{"sl":120}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [271, 396, 45, 339], [], [271, 396, 45, 339], [271, 396, 45, 339], [], [], [], [179], [], [179], [179], [], [], [146, 478, 353, 477, 192, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [146, 478, 353, 477, 192, 314, 271, 248, 29, 179, 396, 122, 45, 339], [478, 353, 477, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [478, 353, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [478, 353, 314, 271, 248, 29, 179, 396, 122, 45, 339], [478, 353, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [], [], [], [], [], [271, 248, 29, 179, 396, 45, 339], [], [271, 248, 29, 179, 396, 45, 339], [], [], [478, 353, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [478, 353, 314, 271, 248, 29, 179, 396, 122, 45, 339], [], [], [271, 248, 29, 179, 396, 45, 339], [], [], [271, 248, 29, 179, 396, 45, 339], [], [], [271, 248, 29, 179, 396, 45, 339], [], [271, 248, 29, 179, 396, 45, 339], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [271, 248, 29, 179, 396, 45, 339], [], [271, 248, 29, 179, 396, 45, 339], [], [], [271, 248, 29, 179, 396, 45, 339], [271, 248, 29, 179, 396, 45, 339], [], [], [], [], [], [], [271, 248, 29, 179, 396, 45, 339], [], [], []]