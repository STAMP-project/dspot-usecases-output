var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":137,"id":4555,"methods":[{"el":19,"sc":5,"sl":15},{"el":25,"sc":5,"sl":21},{"el":31,"sc":5,"sl":27},{"el":35,"sc":5,"sl":33},{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":52,"sc":5,"sl":50},{"el":60,"sc":5,"sl":55},{"el":67,"sc":5,"sl":62},{"el":96,"sc":5,"sl":69},{"el":135,"sc":5,"sl":98}],"name":"AssetVariable","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_31":{"methods":[{"sl":27},{"sl":33},{"sl":40},{"sl":47},{"sl":62},{"sl":98}],"name":"testVariableSerialization","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":34},{"sl":41},{"sl":48},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":99},{"sl":101},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":134}]},"test_51":{"methods":[{"sl":15},{"sl":33},{"sl":36},{"sl":40},{"sl":43},{"sl":47},{"sl":50},{"sl":55},{"sl":69}],"name":"testVariableDeserialization","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":34},{"sl":37},{"sl":41},{"sl":44},{"sl":48},{"sl":51},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":70},{"sl":72},{"sl":76},{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":95}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [51], [51], [51], [51], [], [], [], [], [], [], [], [], [31], [31], [31], [31], [], [], [51, 31], [51, 31], [], [51], [51], [], [], [51, 31], [51, 31], [], [51], [51], [], [], [51, 31], [51, 31], [], [51], [51], [], [], [], [51], [51], [51], [51], [51], [], [], [31], [31], [31], [31], [31], [], [], [51], [51], [], [51], [], [], [], [51], [], [51], [51], [51], [], [51], [51], [51], [51], [51], [51], [51], [51], [], [], [], [], [], [51], [], [], [31], [31], [], [31], [], [31], [31], [31], [31], [31], [31], [31], [], [], [31], [31], [], [31], [31], [31], [], [], [], [], [], [], [31], [31], [31], [31], [31], [31], [31], [31], [], [], [31], [], [], []]
