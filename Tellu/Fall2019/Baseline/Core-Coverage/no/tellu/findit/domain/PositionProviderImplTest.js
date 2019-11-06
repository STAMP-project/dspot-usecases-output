var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":17393,"methods":[{"el":23,"sc":5,"sl":17},{"el":28,"sc":5,"sl":25},{"el":35,"sc":5,"sl":30},{"el":42,"sc":5,"sl":37},{"el":49,"sc":5,"sl":44},{"el":56,"sc":5,"sl":51},{"el":65,"sc":5,"sl":58},{"el":78,"sc":5,"sl":67}],"name":"PositionProviderImplTest","sl":13},{"el":82,"id":17428,"methods":[],"name":"PositionProviderImplTest.MyPositionProvider","sl":80}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":58}],"name":"testGetPositionFromOtherProvider","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_24":{"methods":[{"sl":30}],"name":"testGetPositionNullWhenOwnProvider","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]},"test_4":{"methods":[{"sl":44}],"name":"testSetPositionAllowed","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48}]},"test_49":{"methods":[{"sl":37}],"name":"testGetPositionNotNullWhenOwnProvider","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41}]},"test_75":{"methods":[{"sl":67}],"name":"testCircularPositionedByError","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":72},{"sl":75},{"sl":77}]},"test_77":{"methods":[{"sl":51}],"name":"testSetPositionNotAllowedWhenPositionByOther","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [24], [], [24], [24], [24], [], [], [49], [], [49], [49], [49], [], [], [4], [], [4], [4], [4], [], [], [77], [], [77], [77], [77], [], [], [11], [], [11], [11], [11], [11], [11], [], [], [75], [], [75], [75], [], [75], [], [], [75], [], [75], [], [], [], [], [], []]
