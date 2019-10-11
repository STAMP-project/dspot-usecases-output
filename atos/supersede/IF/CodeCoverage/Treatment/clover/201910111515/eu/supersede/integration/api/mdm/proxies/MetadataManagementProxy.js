var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":168,"id":3574,"methods":[{"el":70,"sc":108,"sl":70},{"el":71,"sc":2,"sl":60},{"el":78,"sc":2,"sl":73},{"el":85,"sc":2,"sl":80},{"el":93,"sc":121,"sl":93},{"el":94,"sc":2,"sl":87},{"el":109,"sc":13,"sl":106},{"el":121,"sc":2,"sl":96},{"el":129,"sc":2,"sl":123},{"el":136,"sc":2,"sl":131},{"el":144,"sc":2,"sl":138},{"el":151,"sc":106,"sl":151},{"el":152,"sc":2,"sl":146},{"el":159,"sc":2,"sl":154},{"el":167,"sc":2,"sl":161}],"name":"MetadataManagementProxy","sl":53}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_180":{"methods":[{"sl":60},{"sl":70}],"name":"testRegisterRelease","pass":true,"statements":[{"sl":62},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":70}]},"test_2055":{"methods":[{"sl":73}],"name":"testGelAllReleases","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77}]},"test_2157":{"methods":[{"sl":87},{"sl":93}],"name":"testRealtimeFeedbackClassification","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":93}]},"test_42":{"methods":[{"sl":96},{"sl":106}],"name":"testSendFiles","pass":true,"statements":[{"sl":98},{"sl":100},{"sl":102},{"sl":105},{"sl":108},{"sl":112},{"sl":113},{"sl":114},{"sl":116},{"sl":118},{"sl":120}]},"test_908":{"methods":[{"sl":131}],"name":"testGelAllEvents","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [180], [], [180], [], [180], [180], [180], [180], [180], [], [180], [], [], [2055], [], [2055], [2055], [2055], [], [], [], [], [], [], [], [], [], [2157], [], [2157], [2157], [2157], [], [2157], [], [], [42], [], [42], [], [42], [], [42], [], [], [42], [42], [], [42], [], [], [], [42], [42], [42], [], [42], [], [42], [], [42], [], [], [], [], [], [], [], [], [], [], [908], [], [908], [908], [908], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
