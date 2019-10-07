var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":189,"id":11640,"methods":[{"el":32,"sc":5,"sl":29},{"el":52,"sc":5,"sl":34},{"el":62,"sc":5,"sl":54},{"el":74,"sc":5,"sl":64},{"el":87,"sc":5,"sl":76},{"el":100,"sc":5,"sl":89},{"el":117,"sc":5,"sl":102},{"el":135,"sc":5,"sl":119},{"el":153,"sc":5,"sl":137},{"el":171,"sc":5,"sl":155},{"el":188,"sc":5,"sl":173}],"name":"DecisionMakingSystemProxyTest_Ampl2","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":137},{"sl":173}],"name":"testNotifyAlert_add1null94_failAssert0_mg317_failAssert0","pass":true,"statements":[{"sl":139},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":151},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_14":{"methods":[{"sl":34},{"sl":173}],"name":"testNotifyAlert_add1","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_237":{"methods":[{"sl":102},{"sl":173}],"name":"testNotifyAlertnull11_failAssert0_mg57_failAssert0","pass":true,"statements":[{"sl":104},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":115},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_274":{"methods":[{"sl":76},{"sl":173}],"name":"testNotifyAlert_add1null94_failAssert0","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":85},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_311":{"methods":[{"sl":119},{"sl":173}],"name":"testNotifyAlert_add1null94_failAssert0_mg280_failAssert0","pass":true,"statements":[{"sl":121},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":133},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_370":{"methods":[{"sl":64},{"sl":173}],"name":"testNotifyAlertnull11_failAssert0","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":72},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_39":{"methods":[{"sl":54},{"sl":173}],"name":"testNotifyAlert_add2","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_587":{"methods":[{"sl":89},{"sl":173}],"name":"testNotifyAlert_add2null100_failAssert0","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":98},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_84":{"methods":[{"sl":155},{"sl":173}],"name":"testNotifyAlert_add2null100_failAssert0_mg288_failAssert0","pass":true,"statements":[{"sl":157},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [14], [], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [14], [], [], [39], [], [39], [39], [39], [39], [39], [39], [], [], [370], [], [370], [370], [370], [370], [], [], [370], [], [], [], [274], [], [274], [274], [274], [274], [274], [], [], [274], [], [], [], [587], [], [587], [587], [587], [587], [587], [], [], [587], [], [], [], [237], [], [237], [], [237], [237], [237], [237], [], [], [], [], [], [237], [], [], [], [311], [], [311], [], [311], [311], [311], [311], [311], [], [], [], [], [], [311], [], [], [], [102], [], [102], [], [102], [102], [102], [102], [102], [], [], [], [], [], [102], [], [], [], [84], [], [84], [], [84], [84], [84], [84], [84], [], [], [], [], [], [84], [], [], [], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [14, 39, 587, 274, 84, 237, 102, 370, 311], [], [], []]
