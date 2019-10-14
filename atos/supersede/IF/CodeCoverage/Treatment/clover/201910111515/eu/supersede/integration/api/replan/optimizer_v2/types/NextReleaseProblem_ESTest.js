var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":157,"id":22378,"methods":[{"el":26,"sc":3,"sl":21},{"el":33,"sc":3,"sl":28},{"el":42,"sc":3,"sl":35},{"el":49,"sc":3,"sl":44},{"el":56,"sc":3,"sl":51},{"el":64,"sc":3,"sl":58},{"el":72,"sc":3,"sl":66},{"el":81,"sc":3,"sl":74},{"el":90,"sc":3,"sl":83},{"el":101,"sc":3,"sl":92},{"el":110,"sc":3,"sl":103},{"el":119,"sc":3,"sl":112},{"el":128,"sc":3,"sl":121},{"el":137,"sc":3,"sl":130},{"el":146,"sc":3,"sl":139},{"el":156,"sc":3,"sl":148}],"name":"NextReleaseProblem_ESTest","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":51}],"name":"test04","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55}]},"test_1195":{"methods":[{"sl":28}],"name":"test01","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_134":{"methods":[{"sl":58}],"name":"test05","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_143":{"methods":[{"sl":44}],"name":"test03","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48}]},"test_1589":{"methods":[{"sl":92}],"name":"test09","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100}]},"test_1612":{"methods":[{"sl":21}],"name":"test00","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25}]},"test_1724":{"methods":[{"sl":112}],"name":"test11","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118}]},"test_1734":{"methods":[{"sl":103}],"name":"test10","pass":true,"statements":[{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_1785":{"methods":[{"sl":35}],"name":"test02","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41}]},"test_1923":{"methods":[{"sl":83}],"name":"test08","pass":true,"statements":[{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89}]},"test_1932":{"methods":[{"sl":66}],"name":"test06","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_2143":{"methods":[{"sl":74}],"name":"test07","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80}]},"test_447":{"methods":[{"sl":121}],"name":"test12","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127}]},"test_457":{"methods":[{"sl":130}],"name":"test13","pass":true,"statements":[{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_888":{"methods":[{"sl":148}],"name":"test15","pass":true,"statements":[{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155}]},"test_910":{"methods":[{"sl":139}],"name":"test14","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1612], [], [1612], [1612], [1612], [], [], [1195], [], [1195], [1195], [1195], [], [], [1785], [], [1785], [1785], [1785], [1785], [1785], [], [], [143], [], [143], [143], [143], [], [], [1006], [], [1006], [1006], [1006], [], [], [134], [], [134], [134], [134], [134], [], [], [1932], [], [1932], [1932], [1932], [1932], [], [], [2143], [], [2143], [2143], [2143], [2143], [2143], [], [], [1923], [], [1923], [1923], [1923], [1923], [1923], [], [], [1589], [], [1589], [1589], [1589], [1589], [1589], [1589], [1589], [], [], [1734], [], [1734], [1734], [1734], [1734], [1734], [], [], [1724], [], [1724], [1724], [1724], [1724], [1724], [], [], [447], [], [447], [447], [447], [447], [447], [], [], [457], [], [457], [457], [457], [457], [457], [], [], [910], [], [910], [910], [910], [910], [910], [], [], [888], [], [888], [888], [888], [888], [888], [888], [], []]