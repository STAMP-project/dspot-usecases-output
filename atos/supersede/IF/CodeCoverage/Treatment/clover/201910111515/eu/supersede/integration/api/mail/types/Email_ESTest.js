var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":230,"id":17951,"methods":[{"el":20,"sc":3,"sl":15},{"el":27,"sc":3,"sl":22},{"el":34,"sc":3,"sl":29},{"el":41,"sc":3,"sl":36},{"el":48,"sc":3,"sl":43},{"el":55,"sc":3,"sl":50},{"el":63,"sc":3,"sl":57},{"el":71,"sc":3,"sl":65},{"el":78,"sc":3,"sl":73},{"el":85,"sc":3,"sl":80},{"el":92,"sc":3,"sl":87},{"el":108,"sc":3,"sl":94},{"el":124,"sc":3,"sl":110},{"el":140,"sc":3,"sl":126},{"el":148,"sc":3,"sl":142},{"el":156,"sc":3,"sl":150},{"el":165,"sc":3,"sl":158},{"el":173,"sc":3,"sl":167},{"el":181,"sc":3,"sl":175},{"el":189,"sc":3,"sl":183},{"el":197,"sc":3,"sl":191},{"el":205,"sc":3,"sl":199},{"el":213,"sc":3,"sl":207},{"el":221,"sc":3,"sl":215},{"el":229,"sc":3,"sl":223}],"name":"Email_ESTest","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1037":{"methods":[{"sl":36}],"name":"test03","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]},"test_137":{"methods":[{"sl":207}],"name":"test22","pass":true,"statements":[{"sl":209},{"sl":210},{"sl":211},{"sl":212}]},"test_1375":{"methods":[{"sl":87}],"name":"test10","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91}]},"test_1379":{"methods":[{"sl":94}],"name":"test11","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":99},{"sl":100}]},"test_141":{"methods":[{"sl":215}],"name":"test23","pass":true,"statements":[{"sl":217},{"sl":218},{"sl":219},{"sl":220}]},"test_1563":{"methods":[{"sl":199}],"name":"test21","pass":true,"statements":[{"sl":201},{"sl":202},{"sl":203},{"sl":204}]},"test_1591":{"methods":[{"sl":65}],"name":"test07","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":69},{"sl":70}]},"test_168":{"methods":[{"sl":29}],"name":"test02","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33}]},"test_1703":{"methods":[{"sl":223}],"name":"test24","pass":true,"statements":[{"sl":225},{"sl":226},{"sl":227},{"sl":228}]},"test_176":{"methods":[{"sl":110}],"name":"test12","pass":true,"statements":[{"sl":112},{"sl":113},{"sl":115},{"sl":116}]},"test_1831":{"methods":[{"sl":150}],"name":"test15","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155}]},"test_1963":{"methods":[{"sl":158}],"name":"test16","pass":true,"statements":[{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164}]},"test_2042":{"methods":[{"sl":43}],"name":"test04","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_2180":{"methods":[{"sl":73}],"name":"test08","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77}]},"test_2201":{"methods":[{"sl":15}],"name":"test00","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19}]},"test_280":{"methods":[{"sl":57}],"name":"test06","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":62}]},"test_292":{"methods":[{"sl":142}],"name":"test14","pass":true,"statements":[{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_399":{"methods":[{"sl":183}],"name":"test19","pass":true,"statements":[{"sl":185},{"sl":186},{"sl":187},{"sl":188}]},"test_490":{"methods":[{"sl":80}],"name":"test09","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84}]},"test_563":{"methods":[{"sl":175}],"name":"test18","pass":true,"statements":[{"sl":177},{"sl":178},{"sl":179},{"sl":180}]},"test_591":{"methods":[{"sl":22}],"name":"test01","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_607":{"methods":[{"sl":126}],"name":"test13","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":131},{"sl":132}]},"test_661":{"methods":[{"sl":50}],"name":"test05","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54}]},"test_677":{"methods":[{"sl":191}],"name":"test20","pass":true,"statements":[{"sl":193},{"sl":194},{"sl":195},{"sl":196}]},"test_801":{"methods":[{"sl":167}],"name":"test17","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2201], [], [2201], [2201], [2201], [], [], [591], [], [591], [591], [591], [], [], [168], [], [168], [168], [168], [], [], [1037], [], [1037], [1037], [1037], [], [], [2042], [], [2042], [2042], [2042], [], [], [661], [], [661], [661], [661], [], [], [280], [], [280], [280], [280], [280], [], [], [1591], [], [1591], [1591], [1591], [1591], [], [], [2180], [], [2180], [2180], [2180], [], [], [490], [], [490], [490], [490], [], [], [1375], [], [1375], [1375], [1375], [], [], [1379], [], [1379], [1379], [], [1379], [1379], [], [], [], [], [], [], [], [], [], [176], [], [176], [176], [], [176], [176], [], [], [], [], [], [], [], [], [], [607], [], [607], [607], [], [607], [607], [], [], [], [], [], [], [], [], [], [292], [], [292], [292], [292], [292], [], [], [1831], [], [1831], [1831], [1831], [1831], [], [], [1963], [], [1963], [1963], [1963], [1963], [1963], [], [], [801], [], [801], [801], [801], [801], [], [], [563], [], [563], [563], [563], [563], [], [], [399], [], [399], [399], [399], [399], [], [], [677], [], [677], [677], [677], [677], [], [], [1563], [], [1563], [1563], [1563], [1563], [], [], [137], [], [137], [137], [137], [137], [], [], [141], [], [141], [141], [141], [141], [], [], [1703], [], [1703], [1703], [1703], [1703], [], []]
