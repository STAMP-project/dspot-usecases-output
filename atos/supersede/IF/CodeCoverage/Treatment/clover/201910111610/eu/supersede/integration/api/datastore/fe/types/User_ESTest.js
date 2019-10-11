var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":218,"id":21201,"methods":[{"el":25,"sc":3,"sl":20},{"el":32,"sc":3,"sl":27},{"el":39,"sc":3,"sl":34},{"el":46,"sc":3,"sl":41},{"el":53,"sc":3,"sl":48},{"el":61,"sc":3,"sl":55},{"el":68,"sc":3,"sl":63},{"el":75,"sc":3,"sl":70},{"el":82,"sc":3,"sl":77},{"el":90,"sc":3,"sl":84},{"el":98,"sc":3,"sl":92},{"el":106,"sc":3,"sl":100},{"el":114,"sc":3,"sl":108},{"el":122,"sc":3,"sl":116},{"el":130,"sc":3,"sl":124},{"el":138,"sc":3,"sl":132},{"el":149,"sc":3,"sl":140},{"el":158,"sc":3,"sl":151},{"el":169,"sc":3,"sl":160},{"el":178,"sc":3,"sl":171},{"el":186,"sc":3,"sl":180},{"el":194,"sc":3,"sl":188},{"el":202,"sc":3,"sl":196},{"el":210,"sc":3,"sl":204},{"el":217,"sc":3,"sl":212}],"name":"User_ESTest","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1032":{"methods":[{"sl":84}],"name":"test09","pass":true,"statements":[{"sl":86},{"sl":87},{"sl":88},{"sl":89}]},"test_1252":{"methods":[{"sl":100}],"name":"test11","pass":true,"statements":[{"sl":102},{"sl":103},{"sl":104},{"sl":105}]},"test_131":{"methods":[{"sl":196}],"name":"test22","pass":true,"statements":[{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_1442":{"methods":[{"sl":188}],"name":"test21","pass":true,"statements":[{"sl":190},{"sl":191},{"sl":192},{"sl":193}]},"test_151":{"methods":[{"sl":204}],"name":"test23","pass":true,"statements":[{"sl":206},{"sl":207},{"sl":208},{"sl":209}]},"test_1518":{"methods":[{"sl":151}],"name":"test17","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157}]},"test_1592":{"methods":[{"sl":140}],"name":"test16","pass":true,"statements":[{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148}]},"test_1637":{"methods":[{"sl":212}],"name":"test24","pass":true,"statements":[{"sl":214},{"sl":215},{"sl":216}]},"test_1708":{"methods":[{"sl":55}],"name":"test05","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60}]},"test_1739":{"methods":[{"sl":132}],"name":"test15","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":137}]},"test_1934":{"methods":[{"sl":34}],"name":"test02","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]},"test_1994":{"methods":[{"sl":63}],"name":"test06","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67}]},"test_2023":{"methods":[{"sl":124}],"name":"test14","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128},{"sl":129}]},"test_2096":{"methods":[{"sl":92}],"name":"test10","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":96},{"sl":97}]},"test_2249":{"methods":[{"sl":70}],"name":"test07","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74}]},"test_232":{"methods":[{"sl":116}],"name":"test13","pass":true,"statements":[{"sl":118},{"sl":119},{"sl":120},{"sl":121}]},"test_2462":{"methods":[{"sl":160}],"name":"test18","pass":true,"statements":[{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168}]},"test_2576":{"methods":[{"sl":27}],"name":"test01","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31}]},"test_2743":{"methods":[{"sl":180}],"name":"test20","pass":true,"statements":[{"sl":182},{"sl":183},{"sl":184},{"sl":185}]},"test_2799":{"methods":[{"sl":77}],"name":"test08","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81}]},"test_325":{"methods":[{"sl":48}],"name":"test04","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52}]},"test_677":{"methods":[{"sl":108}],"name":"test12","pass":true,"statements":[{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_837":{"methods":[{"sl":20}],"name":"test00","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]},"test_968":{"methods":[{"sl":171}],"name":"test19","pass":true,"statements":[{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177}]},"test_991":{"methods":[{"sl":41}],"name":"test03","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [837], [], [837], [837], [837], [], [], [2576], [], [2576], [2576], [2576], [], [], [1934], [], [1934], [1934], [1934], [], [], [991], [], [991], [991], [991], [], [], [325], [], [325], [325], [325], [], [], [1708], [], [1708], [1708], [1708], [1708], [], [], [1994], [], [1994], [1994], [1994], [], [], [2249], [], [2249], [2249], [2249], [], [], [2799], [], [2799], [2799], [2799], [], [], [1032], [], [1032], [1032], [1032], [1032], [], [], [2096], [], [2096], [2096], [2096], [2096], [], [], [1252], [], [1252], [1252], [1252], [1252], [], [], [677], [], [677], [677], [677], [677], [], [], [232], [], [232], [232], [232], [232], [], [], [2023], [], [2023], [2023], [2023], [2023], [], [], [1739], [], [1739], [1739], [1739], [1739], [], [], [1592], [], [1592], [1592], [1592], [1592], [1592], [1592], [1592], [], [], [1518], [], [1518], [1518], [1518], [1518], [1518], [], [], [2462], [], [2462], [2462], [2462], [2462], [2462], [2462], [2462], [], [], [968], [], [968], [968], [968], [968], [968], [], [], [2743], [], [2743], [2743], [2743], [2743], [], [], [1442], [], [1442], [1442], [1442], [1442], [], [], [131], [], [131], [131], [131], [131], [], [], [151], [], [151], [151], [151], [151], [], [], [1637], [], [1637], [1637], [1637], [], []]
