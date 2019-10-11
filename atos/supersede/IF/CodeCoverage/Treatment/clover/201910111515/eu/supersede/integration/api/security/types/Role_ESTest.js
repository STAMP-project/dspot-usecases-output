var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":235,"id":23021,"methods":[{"el":34,"sc":3,"sl":19},{"el":41,"sc":3,"sl":36},{"el":48,"sc":3,"sl":43},{"el":59,"sc":3,"sl":50},{"el":67,"sc":3,"sl":61},{"el":75,"sc":3,"sl":69},{"el":83,"sc":3,"sl":77},{"el":90,"sc":3,"sl":85},{"el":105,"sc":3,"sl":92},{"el":117,"sc":3,"sl":107},{"el":131,"sc":3,"sl":119},{"el":151,"sc":3,"sl":133},{"el":166,"sc":3,"sl":153},{"el":175,"sc":3,"sl":168},{"el":183,"sc":3,"sl":177},{"el":191,"sc":3,"sl":185},{"el":199,"sc":3,"sl":193},{"el":212,"sc":3,"sl":201},{"el":220,"sc":3,"sl":214},{"el":227,"sc":3,"sl":222},{"el":234,"sc":3,"sl":229}],"name":"Role_ESTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1075":{"methods":[{"sl":92}],"name":"test08","pass":true,"statements":[{"sl":94},{"sl":96},{"sl":97}]},"test_1389":{"methods":[{"sl":119}],"name":"test10","pass":true,"statements":[{"sl":122},{"sl":123}]},"test_1485":{"methods":[{"sl":77}],"name":"test06","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":82}]},"test_1578":{"methods":[{"sl":19}],"name":"test00","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":26}]},"test_1635":{"methods":[{"sl":107}],"name":"test09","pass":true,"statements":[{"sl":109},{"sl":111},{"sl":112}]},"test_1716":{"methods":[{"sl":50}],"name":"test03","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58}]},"test_1805":{"methods":[{"sl":229}],"name":"test20","pass":true,"statements":[{"sl":231},{"sl":232},{"sl":233}]},"test_2117":{"methods":[{"sl":43}],"name":"test02","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_2161":{"methods":[{"sl":85}],"name":"test07","pass":true,"statements":[{"sl":87},{"sl":88},{"sl":89}]},"test_2228":{"methods":[{"sl":177}],"name":"test14","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":182}]},"test_2236":{"methods":[{"sl":214}],"name":"test18","pass":true,"statements":[{"sl":216},{"sl":217},{"sl":218},{"sl":219}]},"test_268":{"methods":[{"sl":153}],"name":"test12","pass":true,"statements":[{"sl":155},{"sl":157},{"sl":158}]},"test_312":{"methods":[{"sl":185}],"name":"test15","pass":true,"statements":[{"sl":187},{"sl":188},{"sl":189},{"sl":190}]},"test_355":{"methods":[{"sl":36}],"name":"test01","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]},"test_369":{"methods":[{"sl":193}],"name":"test16","pass":true,"statements":[{"sl":195},{"sl":196},{"sl":197},{"sl":198}]},"test_413":{"methods":[{"sl":168}],"name":"test13","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174}]},"test_425":{"methods":[{"sl":222}],"name":"test19","pass":true,"statements":[{"sl":224},{"sl":225},{"sl":226}]},"test_567":{"methods":[{"sl":69}],"name":"test05","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74}]},"test_672":{"methods":[{"sl":133}],"name":"test11","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":142},{"sl":143}]},"test_857":{"methods":[{"sl":201}],"name":"test17","pass":true,"statements":[{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211}]},"test_903":{"methods":[{"sl":61}],"name":"test04","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1578], [], [1578], [1578], [1578], [], [1578], [1578], [], [], [], [], [], [], [], [], [], [355], [], [355], [355], [355], [], [], [2117], [], [2117], [2117], [2117], [], [], [1716], [], [1716], [1716], [1716], [1716], [1716], [1716], [1716], [], [], [903], [], [903], [903], [903], [903], [], [], [567], [], [567], [567], [567], [567], [], [], [1485], [], [1485], [1485], [1485], [1485], [], [], [2161], [], [2161], [2161], [2161], [], [], [1075], [], [1075], [], [1075], [1075], [], [], [], [], [], [], [], [], [], [1635], [], [1635], [], [1635], [1635], [], [], [], [], [], [], [1389], [], [], [1389], [1389], [], [], [], [], [], [], [], [], [], [672], [], [672], [672], [672], [672], [672], [672], [], [672], [672], [], [], [], [], [], [], [], [], [], [268], [], [268], [], [268], [268], [], [], [], [], [], [], [], [], [], [413], [], [413], [413], [413], [413], [413], [], [], [2228], [], [2228], [2228], [2228], [2228], [], [], [312], [], [312], [312], [312], [312], [], [], [369], [], [369], [369], [369], [369], [], [], [857], [], [857], [857], [857], [857], [857], [857], [857], [857], [857], [], [], [2236], [], [2236], [2236], [2236], [2236], [], [], [425], [], [425], [425], [425], [], [], [1805], [], [1805], [1805], [1805], [], []]
