var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":81,"id":6345,"methods":[{"el":42,"sc":2,"sl":38},{"el":46,"sc":2,"sl":44},{"el":49,"sc":2,"sl":47},{"el":52,"sc":2,"sl":50},{"el":55,"sc":2,"sl":53},{"el":58,"sc":2,"sl":56},{"el":61,"sc":2,"sl":59},{"el":66,"sc":2,"sl":62},{"el":69,"sc":2,"sl":67},{"el":75,"sc":2,"sl":71},{"el":79,"sc":2,"sl":77}],"name":"Feature","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_104":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg38_failAssert3null106_failAssert20","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_167":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg36_failAssert2null134_failAssert18","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_231":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlannull9_failAssert1_mg37_failAssert11","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]},"test_285":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_335":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg40_failAssert4null107_failAssert22","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_555":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg36_failAssert2","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_607":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlannull9_failAssert1","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]},"test_617":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlannull9_failAssert1_mg35_failAssert10null137_failAssert25","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]},"test_700":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlannull9_failAssert1_mg37_failAssert11null111_failAssert27","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]},"test_71":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlannull9_failAssert1_mg35_failAssert10","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]},"test_736":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg38_failAssert3","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_739":{"methods":[{"sl":38},{"sl":47},{"sl":53},{"sl":59},{"sl":62},{"sl":71}],"name":"testOptimizePlannull8_failAssert0_mg40_failAssert4","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":48},{"sl":54},{"sl":60},{"sl":63},{"sl":65},{"sl":72},{"sl":74}]},"test_781":{"methods":[{"sl":38},{"sl":44},{"sl":47},{"sl":50},{"sl":53},{"sl":56},{"sl":59},{"sl":62},{"sl":67},{"sl":71},{"sl":77}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":45},{"sl":48},{"sl":51},{"sl":54},{"sl":57},{"sl":60},{"sl":63},{"sl":65},{"sl":68},{"sl":72},{"sl":74},{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [], [607, 231, 71, 781, 617, 700], [607, 231, 71, 781, 617, 700], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [607, 231, 71, 781, 617, 700], [607, 231, 71, 781, 617, 700], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [607, 231, 71, 781, 617, 700], [607, 231, 71, 781, 617, 700], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [607, 231, 71, 781, 617, 700], [607, 231, 71, 781, 617, 700], [], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [167, 285, 736, 607, 555, 739, 231, 71, 781, 617, 700, 104, 335], [], [], [607, 231, 71, 781, 617, 700], [607, 231, 71, 781, 617, 700], [], [], []]
