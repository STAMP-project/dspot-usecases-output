var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":209,"id":20887,"methods":[{"el":25,"sc":3,"sl":20},{"el":32,"sc":3,"sl":27},{"el":39,"sc":3,"sl":34},{"el":46,"sc":3,"sl":41},{"el":53,"sc":3,"sl":48},{"el":61,"sc":3,"sl":55},{"el":69,"sc":3,"sl":63},{"el":78,"sc":3,"sl":71},{"el":87,"sc":3,"sl":80},{"el":96,"sc":3,"sl":89},{"el":106,"sc":3,"sl":98},{"el":116,"sc":3,"sl":108},{"el":125,"sc":3,"sl":118},{"el":134,"sc":3,"sl":127},{"el":143,"sc":3,"sl":136},{"el":152,"sc":3,"sl":145},{"el":161,"sc":3,"sl":154},{"el":170,"sc":3,"sl":163},{"el":179,"sc":3,"sl":172},{"el":188,"sc":3,"sl":181},{"el":197,"sc":3,"sl":190},{"el":208,"sc":3,"sl":199}],"name":"Feature_ESTest","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1054":{"methods":[{"sl":181}],"name":"test19","pass":true,"statements":[{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_1084":{"methods":[{"sl":98}],"name":"test10","pass":true,"statements":[{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105}]},"test_1112":{"methods":[{"sl":80}],"name":"test08","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_1208":{"methods":[{"sl":154}],"name":"test16","pass":true,"statements":[{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160}]},"test_1292":{"methods":[{"sl":89}],"name":"test09","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95}]},"test_1331":{"methods":[{"sl":27}],"name":"test01","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]},"test_1502":{"methods":[{"sl":136}],"name":"test14","pass":true,"statements":[{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142}]},"test_1542":{"methods":[{"sl":41}],"name":"test03","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45}]},"test_1620":{"methods":[{"sl":20}],"name":"test00","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]},"test_1696":{"methods":[{"sl":108}],"name":"test11","pass":true,"statements":[{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115}]},"test_1781":{"methods":[{"sl":127}],"name":"test13","pass":true,"statements":[{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133}]},"test_1837":{"methods":[{"sl":199}],"name":"test21","pass":true,"statements":[{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207}]},"test_198":{"methods":[{"sl":172}],"name":"test18","pass":true,"statements":[{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178}]},"test_20":{"methods":[{"sl":34}],"name":"test02","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]},"test_2058":{"methods":[{"sl":163}],"name":"test17","pass":true,"statements":[{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169}]},"test_2184":{"methods":[{"sl":145}],"name":"test15","pass":true,"statements":[{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151}]},"test_2290":{"methods":[{"sl":71}],"name":"test07","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_376":{"methods":[{"sl":118}],"name":"test12","pass":true,"statements":[{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124}]},"test_467":{"methods":[{"sl":190}],"name":"test20","pass":true,"statements":[{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196}]},"test_620":{"methods":[{"sl":55}],"name":"test05","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60}]},"test_621":{"methods":[{"sl":63}],"name":"test06","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68}]},"test_822":{"methods":[{"sl":48}],"name":"test04","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1620], [], [1620], [1620], [1620], [], [], [1331], [], [1331], [1331], [1331], [], [], [20], [], [20], [20], [20], [], [], [1542], [], [1542], [1542], [1542], [], [], [822], [], [822], [822], [822], [], [], [620], [], [620], [620], [620], [620], [], [], [621], [], [621], [621], [621], [621], [], [], [2290], [], [2290], [2290], [2290], [2290], [2290], [], [], [1112], [], [1112], [1112], [1112], [1112], [1112], [], [], [1292], [], [1292], [1292], [1292], [1292], [1292], [], [], [1084], [], [1084], [1084], [1084], [1084], [1084], [1084], [], [], [1696], [], [1696], [1696], [1696], [1696], [1696], [1696], [], [], [376], [], [376], [376], [376], [376], [376], [], [], [1781], [], [1781], [1781], [1781], [1781], [1781], [], [], [1502], [], [1502], [1502], [1502], [1502], [1502], [], [], [2184], [], [2184], [2184], [2184], [2184], [2184], [], [], [1208], [], [1208], [1208], [1208], [1208], [1208], [], [], [2058], [], [2058], [2058], [2058], [2058], [2058], [], [], [198], [], [198], [198], [198], [198], [198], [], [], [1054], [], [1054], [1054], [1054], [1054], [1054], [], [], [467], [], [467], [467], [467], [467], [467], [], [], [1837], [], [1837], [1837], [1837], [1837], [1837], [1837], [1837], [], []]
