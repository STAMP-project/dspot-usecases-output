var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":91,"id":702,"methods":[{"el":36,"sc":2,"sl":34},{"el":40,"sc":2,"sl":38},{"el":44,"sc":2,"sl":42},{"el":48,"sc":2,"sl":46},{"el":52,"sc":2,"sl":50},{"el":56,"sc":2,"sl":54},{"el":60,"sc":2,"sl":58},{"el":64,"sc":2,"sl":62},{"el":68,"sc":2,"sl":66},{"el":72,"sc":2,"sl":70},{"el":76,"sc":2,"sl":74},{"el":80,"sc":2,"sl":78},{"el":84,"sc":2,"sl":82},{"el":88,"sc":2,"sl":86}],"name":"MonitoringParams","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1001":{"methods":[{"sl":34},{"sl":46},{"sl":50}],"name":"test16","pass":true,"statements":[{"sl":35},{"sl":47},{"sl":51}]},"test_1169":{"methods":[{"sl":34},{"sl":38},{"sl":42}],"name":"test17","pass":true,"statements":[{"sl":35},{"sl":39},{"sl":43}]},"test_1297":{"methods":[{"sl":34},{"sl":62}],"name":"test07","pass":true,"statements":[{"sl":35},{"sl":63}]},"test_1371":{"methods":[{"sl":34},{"sl":46}],"name":"test01","pass":true,"statements":[{"sl":35},{"sl":47}]},"test_1378":{"methods":[{"sl":34},{"sl":62},{"sl":66}],"name":"test14","pass":true,"statements":[{"sl":35},{"sl":63},{"sl":67}]},"test_1480":{"methods":[{"sl":34},{"sl":54}],"name":"test05","pass":true,"statements":[{"sl":35},{"sl":55}]},"test_1525":{"methods":[{"sl":34},{"sl":38},{"sl":42}],"name":"test18","pass":true,"statements":[{"sl":35},{"sl":39},{"sl":43}]},"test_153":{"methods":[{"sl":34},{"sl":78},{"sl":86}],"name":"test10","pass":true,"statements":[{"sl":35},{"sl":79},{"sl":87}]},"test_1925":{"methods":[{"sl":34},{"sl":46},{"sl":50}],"name":"test02","pass":true,"statements":[{"sl":35},{"sl":47},{"sl":51}]},"test_2156":{"methods":[{"sl":34},{"sl":70}],"name":"test04","pass":true,"statements":[{"sl":35},{"sl":71}]},"test_2165":{"methods":[{"sl":34},{"sl":62},{"sl":66}],"name":"test00","pass":true,"statements":[{"sl":35},{"sl":63},{"sl":67}]},"test_2176":{"methods":[{"sl":34},{"sl":70},{"sl":74}],"name":"test03","pass":true,"statements":[{"sl":35},{"sl":71},{"sl":75}]},"test_2487":{"methods":[{"sl":34},{"sl":78},{"sl":82}],"name":"test11","pass":true,"statements":[{"sl":35},{"sl":79},{"sl":83}]},"test_482":{"methods":[{"sl":34},{"sl":78}],"name":"test08","pass":true,"statements":[{"sl":35},{"sl":79}]},"test_542":{"methods":[{"sl":34},{"sl":38}],"name":"test06","pass":true,"statements":[{"sl":35},{"sl":39}]},"test_692":{"methods":[{"sl":34},{"sl":54},{"sl":58}],"name":"test13","pass":true,"statements":[{"sl":35},{"sl":55},{"sl":59}]},"test_711":{"methods":[{"sl":34},{"sl":54},{"sl":58}],"name":"test12","pass":true,"statements":[{"sl":35},{"sl":55},{"sl":59}]},"test_787":{"methods":[{"sl":34},{"sl":82},{"sl":86}],"name":"test09","pass":true,"statements":[{"sl":35},{"sl":83},{"sl":87}]},"test_957":{"methods":[{"sl":34},{"sl":70},{"sl":74}],"name":"test15","pass":true,"statements":[{"sl":35},{"sl":71},{"sl":75}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1297, 153, 2156, 957, 542, 2176, 1001, 482, 711, 1371, 1169, 2165, 1480, 787, 1378, 692, 1525, 1925, 2487], [1297, 153, 2156, 957, 542, 2176, 1001, 482, 711, 1371, 1169, 2165, 1480, 787, 1378, 692, 1525, 1925, 2487], [], [], [542, 1169, 1525], [542, 1169, 1525], [], [], [1169, 1525], [1169, 1525], [], [], [1001, 1371, 1925], [1001, 1371, 1925], [], [], [1001, 1925], [1001, 1925], [], [], [711, 1480, 692], [711, 1480, 692], [], [], [711, 692], [711, 692], [], [], [1297, 2165, 1378], [1297, 2165, 1378], [], [], [2165, 1378], [2165, 1378], [], [], [2156, 957, 2176], [2156, 957, 2176], [], [], [957, 2176], [957, 2176], [], [], [153, 482, 2487], [153, 482, 2487], [], [], [787, 2487], [787, 2487], [], [], [153, 787], [153, 787], [], [], [], []]