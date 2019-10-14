var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":117,"id":20385,"methods":[{"el":20,"sc":3,"sl":15},{"el":27,"sc":3,"sl":22},{"el":34,"sc":3,"sl":29},{"el":41,"sc":3,"sl":36},{"el":48,"sc":3,"sl":43},{"el":57,"sc":3,"sl":50},{"el":64,"sc":3,"sl":59},{"el":71,"sc":3,"sl":66},{"el":78,"sc":3,"sl":73},{"el":85,"sc":3,"sl":80},{"el":96,"sc":3,"sl":87},{"el":103,"sc":3,"sl":98},{"el":110,"sc":3,"sl":105},{"el":116,"sc":3,"sl":112}],"name":"ModelType_ESTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1352":{"methods":[{"sl":29}],"name":"test02","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33}]},"test_1367":{"methods":[{"sl":22}],"name":"test01","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_1554":{"methods":[{"sl":105}],"name":"test12","pass":true,"statements":[{"sl":107},{"sl":108},{"sl":109}]},"test_1737":{"methods":[{"sl":59}],"name":"test06","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63}]},"test_1942":{"methods":[{"sl":66}],"name":"test07","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70}]},"test_2493":{"methods":[{"sl":98}],"name":"test11","pass":true,"statements":[{"sl":100},{"sl":101},{"sl":102}]},"test_2544":{"methods":[{"sl":15}],"name":"test00","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_2548":{"methods":[{"sl":87}],"name":"test10","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95}]},"test_2596":{"methods":[{"sl":112}],"name":"test13","pass":true,"statements":[{"sl":114},{"sl":115}]},"test_2731":{"methods":[{"sl":43}],"name":"test04","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_512":{"methods":[{"sl":36}],"name":"test03","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]},"test_528":{"methods":[{"sl":50}],"name":"test05","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56}]},"test_534":{"methods":[{"sl":73}],"name":"test08","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77}]},"test_576":{"methods":[{"sl":80}],"name":"test09","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2544], [], [2544], [2544], [2544], [], [], [1367], [], [1367], [1367], [1367], [], [], [1352], [], [1352], [1352], [1352], [], [], [512], [], [512], [512], [512], [], [], [2731], [], [2731], [2731], [2731], [], [], [528], [], [528], [528], [528], [528], [528], [], [], [1737], [], [1737], [1737], [1737], [], [], [1942], [], [1942], [1942], [1942], [], [], [534], [], [534], [534], [534], [], [], [576], [], [576], [576], [576], [], [], [2548], [], [2548], [2548], [2548], [2548], [2548], [2548], [2548], [], [], [2493], [], [2493], [2493], [2493], [], [], [1554], [], [1554], [1554], [1554], [], [], [2596], [], [2596], [2596], [], []]