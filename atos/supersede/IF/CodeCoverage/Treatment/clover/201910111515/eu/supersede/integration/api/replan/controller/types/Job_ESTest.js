var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":206,"id":21015,"methods":[{"el":27,"sc":3,"sl":21},{"el":36,"sc":3,"sl":29},{"el":43,"sc":3,"sl":38},{"el":50,"sc":3,"sl":45},{"el":57,"sc":3,"sl":52},{"el":64,"sc":3,"sl":59},{"el":71,"sc":3,"sl":66},{"el":78,"sc":3,"sl":73},{"el":87,"sc":3,"sl":80},{"el":94,"sc":3,"sl":89},{"el":104,"sc":3,"sl":96},{"el":114,"sc":3,"sl":106},{"el":123,"sc":3,"sl":116},{"el":132,"sc":3,"sl":125},{"el":141,"sc":3,"sl":134},{"el":150,"sc":3,"sl":143},{"el":159,"sc":3,"sl":152},{"el":168,"sc":3,"sl":161},{"el":177,"sc":3,"sl":170},{"el":186,"sc":3,"sl":179},{"el":195,"sc":3,"sl":188},{"el":205,"sc":3,"sl":197}],"name":"Job_ESTest","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1086":{"methods":[{"sl":89}],"name":"test09","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93}]},"test_1122":{"methods":[{"sl":116}],"name":"test12","pass":true,"statements":[{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_1246":{"methods":[{"sl":152}],"name":"test16","pass":true,"statements":[{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158}]},"test_1282":{"methods":[{"sl":188}],"name":"test20","pass":true,"statements":[{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194}]},"test_1378":{"methods":[{"sl":179}],"name":"test19","pass":true,"statements":[{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185}]},"test_1449":{"methods":[{"sl":134}],"name":"test14","pass":true,"statements":[{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140}]},"test_1458":{"methods":[{"sl":66}],"name":"test06","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70}]},"test_1713":{"methods":[{"sl":96}],"name":"test10","pass":true,"statements":[{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103}]},"test_1921":{"methods":[{"sl":45}],"name":"test03","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49}]},"test_1967":{"methods":[{"sl":73}],"name":"test07","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77}]},"test_1971":{"methods":[{"sl":21}],"name":"test00","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_1999":{"methods":[{"sl":38}],"name":"test02","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42}]},"test_2135":{"methods":[{"sl":80}],"name":"test08","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_2231":{"methods":[{"sl":161}],"name":"test17","pass":true,"statements":[{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167}]},"test_461":{"methods":[{"sl":59}],"name":"test05","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63}]},"test_534":{"methods":[{"sl":170}],"name":"test18","pass":true,"statements":[{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_570":{"methods":[{"sl":29}],"name":"test01","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35}]},"test_590":{"methods":[{"sl":143}],"name":"test15","pass":true,"statements":[{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149}]},"test_667":{"methods":[{"sl":52}],"name":"test04","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56}]},"test_696":{"methods":[{"sl":125}],"name":"test13","pass":true,"statements":[{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1971], [], [1971], [1971], [1971], [1971], [], [], [570], [], [570], [570], [570], [570], [570], [], [], [1999], [], [1999], [1999], [1999], [], [], [1921], [], [1921], [1921], [1921], [], [], [667], [], [667], [667], [667], [], [], [461], [], [461], [461], [461], [], [], [1458], [], [1458], [1458], [1458], [], [], [1967], [], [1967], [1967], [1967], [], [], [2135], [], [2135], [2135], [2135], [2135], [2135], [], [], [1086], [], [1086], [1086], [1086], [], [], [1713], [], [1713], [1713], [1713], [1713], [1713], [1713], [], [], [], [], [], [], [], [], [], [], [], [], [1122], [], [1122], [1122], [1122], [1122], [1122], [], [], [696], [], [696], [696], [696], [696], [696], [], [], [1449], [], [1449], [1449], [1449], [1449], [1449], [], [], [590], [], [590], [590], [590], [590], [590], [], [], [1246], [], [1246], [1246], [1246], [1246], [1246], [], [], [2231], [], [2231], [2231], [2231], [2231], [2231], [], [], [534], [], [534], [534], [534], [534], [534], [], [], [1378], [], [1378], [1378], [1378], [1378], [1378], [], [], [1282], [], [1282], [1282], [1282], [1282], [1282], [], [], [], [], [], [], [], [], [], [], [], []]