var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":178,"id":53901,"methods":[{"el":27,"sc":3,"sl":22},{"el":34,"sc":3,"sl":29},{"el":43,"sc":3,"sl":36},{"el":50,"sc":3,"sl":45},{"el":57,"sc":3,"sl":52},{"el":65,"sc":3,"sl":59},{"el":73,"sc":3,"sl":67},{"el":83,"sc":3,"sl":75},{"el":94,"sc":3,"sl":85},{"el":103,"sc":3,"sl":96},{"el":112,"sc":3,"sl":105},{"el":121,"sc":3,"sl":114},{"el":130,"sc":3,"sl":123},{"el":139,"sc":3,"sl":132},{"el":148,"sc":3,"sl":141},{"el":157,"sc":3,"sl":150},{"el":166,"sc":3,"sl":159},{"el":177,"sc":3,"sl":168}],"name":"Plan_ESTest","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1072":{"methods":[{"sl":36}],"name":"test02","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42}]},"test_108":{"methods":[{"sl":132}],"name":"test13","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138}]},"test_1088":{"methods":[{"sl":114}],"name":"test11","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120}]},"test_1229":{"methods":[{"sl":45}],"name":"test03","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49}]},"test_1264":{"methods":[{"sl":150}],"name":"test15","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156}]},"test_1824":{"methods":[{"sl":59}],"name":"test05","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_2076":{"methods":[{"sl":29}],"name":"test01","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33}]},"test_2149":{"methods":[{"sl":141}],"name":"test14","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_2241":{"methods":[{"sl":67}],"name":"test06","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":71},{"sl":72}]},"test_2337":{"methods":[{"sl":105}],"name":"test10","pass":true,"statements":[{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_2573":{"methods":[{"sl":22}],"name":"test00","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_2609":{"methods":[{"sl":52}],"name":"test04","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56}]},"test_2789":{"methods":[{"sl":96}],"name":"test09","pass":true,"statements":[{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102}]},"test_2887":{"methods":[{"sl":123}],"name":"test12","pass":true,"statements":[{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129}]},"test_661":{"methods":[{"sl":159}],"name":"test16","pass":true,"statements":[{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165}]},"test_802":{"methods":[{"sl":85}],"name":"test08","pass":true,"statements":[{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93}]},"test_914":{"methods":[{"sl":168}],"name":"test17","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2573], [], [2573], [2573], [2573], [], [], [2076], [], [2076], [2076], [2076], [], [], [1072], [], [1072], [1072], [1072], [1072], [1072], [], [], [1229], [], [1229], [1229], [1229], [], [], [2609], [], [2609], [2609], [2609], [], [], [1824], [], [1824], [1824], [1824], [1824], [], [], [2241], [], [2241], [2241], [2241], [2241], [], [], [], [], [], [], [], [], [], [], [], [], [802], [], [802], [802], [802], [802], [802], [802], [802], [], [], [2789], [], [2789], [2789], [2789], [2789], [2789], [], [], [2337], [], [2337], [2337], [2337], [2337], [2337], [], [], [1088], [], [1088], [1088], [1088], [1088], [1088], [], [], [2887], [], [2887], [2887], [2887], [2887], [2887], [], [], [108], [], [108], [108], [108], [108], [108], [], [], [2149], [], [2149], [2149], [2149], [2149], [2149], [], [], [1264], [], [1264], [1264], [1264], [1264], [1264], [], [], [661], [], [661], [661], [661], [661], [661], [], [], [914], [], [914], [914], [914], [914], [914], [914], [914], [], []]