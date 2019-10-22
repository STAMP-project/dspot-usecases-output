var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":744,"id":8263,"methods":[{"el":60,"sc":2,"sl":48},{"el":79,"sc":2,"sl":62},{"el":88,"sc":2,"sl":81},{"el":96,"sc":2,"sl":90},{"el":110,"sc":2,"sl":98},{"el":122,"sc":2,"sl":112},{"el":131,"sc":2,"sl":124},{"el":170,"sc":2,"sl":133},{"el":261,"sc":2,"sl":172},{"el":294,"sc":2,"sl":263},{"el":340,"sc":2,"sl":296},{"el":364,"sc":2,"sl":342},{"el":383,"sc":2,"sl":366},{"el":494,"sc":2,"sl":385},{"el":566,"sc":2,"sl":496},{"el":628,"sc":2,"sl":568},{"el":658,"sc":2,"sl":630},{"el":689,"sc":2,"sl":660},{"el":713,"sc":2,"sl":691},{"el":727,"sc":2,"sl":715},{"el":743,"sc":2,"sl":729}],"name":"MetaTest","sl":29},{"el":46,"id":8263,"methods":[{"el":34,"sc":3,"sl":34},{"el":45,"sc":3,"sl":36}],"name":"MetaTest.PostalCodeValidator","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":172}],"name":"testReadOnly","pass":true,"statements":[{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":179},{"sl":180},{"sl":181},{"sl":183},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":200},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":209},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":216},{"sl":218},{"sl":219},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":236},{"sl":238},{"sl":240},{"sl":241},{"sl":242},{"sl":244},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":258},{"sl":260}]},"test_12":{"methods":[{"sl":263}],"name":"testUnknownNode","pass":true,"statements":[{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":271},{"sl":272},{"sl":273},{"sl":275},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":291},{"sl":293}]},"test_20":{"methods":[{"sl":34},{"sl":36}],"name":"testMetaParser","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44}]},"test_24":{"methods":[{"sl":630}],"name":"testSetPath","pass":true,"statements":[{"sl":632},{"sl":633},{"sl":636},{"sl":637},{"sl":638},{"sl":639},{"sl":642},{"sl":643},{"sl":644},{"sl":645},{"sl":646},{"sl":647},{"sl":648},{"sl":649},{"sl":650},{"sl":651},{"sl":652},{"sl":654},{"sl":655},{"sl":656},{"sl":657}]},"test_28":{"methods":[{"sl":568}],"name":"testMergeNodes","pass":true,"statements":[{"sl":570},{"sl":571},{"sl":573},{"sl":574},{"sl":575},{"sl":576},{"sl":577},{"sl":578},{"sl":581},{"sl":582},{"sl":583},{"sl":584},{"sl":585},{"sl":586},{"sl":588},{"sl":590},{"sl":591},{"sl":592},{"sl":593},{"sl":594},{"sl":595},{"sl":597},{"sl":598},{"sl":599},{"sl":600},{"sl":601},{"sl":602},{"sl":603},{"sl":604},{"sl":605},{"sl":609},{"sl":610},{"sl":611},{"sl":612},{"sl":613},{"sl":614},{"sl":615},{"sl":616},{"sl":617},{"sl":620},{"sl":621},{"sl":622},{"sl":623},{"sl":624},{"sl":625},{"sl":626},{"sl":627}]},"test_30":{"methods":[{"sl":691}],"name":"testJsonWithMeta","pass":true,"statements":[{"sl":693},{"sl":694},{"sl":695},{"sl":696},{"sl":697},{"sl":698},{"sl":700},{"sl":701},{"sl":702},{"sl":705},{"sl":706},{"sl":707},{"sl":710},{"sl":711},{"sl":712}]},"test_36":{"methods":[{"sl":660}],"name":"testSetMeta","pass":true,"statements":[{"sl":662},{"sl":663},{"sl":665},{"sl":666},{"sl":667},{"sl":669},{"sl":671},{"sl":673},{"sl":674},{"sl":675},{"sl":676},{"sl":677},{"sl":678},{"sl":679},{"sl":680},{"sl":684},{"sl":685},{"sl":686},{"sl":687},{"sl":688}]},"test_45":{"methods":[{"sl":133}],"name":"testCardinality","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":157},{"sl":158},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":168},{"sl":169}]},"test_46":{"methods":[{"sl":34},{"sl":48},{"sl":62},{"sl":81}],"name":"testReset","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":59},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87}]},"test_49":{"methods":[{"sl":296}],"name":"testDataType","pass":true,"statements":[{"sl":298},{"sl":299},{"sl":302},{"sl":303},{"sl":304},{"sl":306},{"sl":308},{"sl":309},{"sl":312},{"sl":313},{"sl":314},{"sl":318},{"sl":319},{"sl":322},{"sl":323},{"sl":324},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":336},{"sl":338},{"sl":339}]},"test_5":{"methods":[{"sl":34},{"sl":48},{"sl":62},{"sl":81}],"name":"testCopyModel","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":59},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87}]},"test_54":{"methods":[{"sl":112}],"name":"testTypeFromDefault","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121}]},"test_6":{"methods":[{"sl":98}],"name":"testTypeParsing","pass":true,"statements":[{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_61":{"methods":[{"sl":729}],"name":"testJsonStrict","pass":true,"statements":[{"sl":731},{"sl":732},{"sl":733},{"sl":734},{"sl":735},{"sl":737},{"sl":739},{"sl":740},{"sl":741},{"sl":742}]},"test_64":{"methods":[{"sl":36},{"sl":342}],"name":"testValidation","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":351},{"sl":352},{"sl":353},{"sl":354},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363}]},"test_65":{"methods":[{"sl":496}],"name":"testSetValues","pass":true,"statements":[{"sl":498},{"sl":499},{"sl":500},{"sl":501},{"sl":504},{"sl":505},{"sl":506},{"sl":507},{"sl":508},{"sl":511},{"sl":512},{"sl":513},{"sl":514},{"sl":515},{"sl":516},{"sl":517},{"sl":518},{"sl":519},{"sl":520},{"sl":523},{"sl":524},{"sl":525},{"sl":527},{"sl":529},{"sl":530},{"sl":533},{"sl":534},{"sl":535},{"sl":536},{"sl":538},{"sl":540},{"sl":541},{"sl":544},{"sl":545},{"sl":546},{"sl":547},{"sl":549},{"sl":551},{"sl":552},{"sl":555},{"sl":556},{"sl":557},{"sl":558},{"sl":562},{"sl":563},{"sl":564},{"sl":565}]},"test_68":{"methods":[{"sl":715}],"name":"testInvalidWithMeta","pass":true,"statements":[{"sl":717},{"sl":718},{"sl":719},{"sl":720},{"sl":721},{"sl":723},{"sl":724},{"sl":725},{"sl":726}]},"test_69":{"methods":[{"sl":124}],"name":"testCreateFromMeta","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130}]},"test_7":{"methods":[{"sl":366}],"name":"testValueConstructor","pass":true,"statements":[{"sl":368},{"sl":369},{"sl":370},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":378},{"sl":380},{"sl":382}]},"test_75":{"methods":[{"sl":385}],"name":"testAddWithMeta","pass":true,"statements":[{"sl":387},{"sl":388},{"sl":389},{"sl":392},{"sl":393},{"sl":394},{"sl":395},{"sl":397},{"sl":399},{"sl":400},{"sl":403},{"sl":404},{"sl":405},{"sl":407},{"sl":409},{"sl":410},{"sl":413},{"sl":414},{"sl":415},{"sl":417},{"sl":419},{"sl":420},{"sl":423},{"sl":424},{"sl":425},{"sl":426},{"sl":428},{"sl":430},{"sl":431},{"sl":434},{"sl":435},{"sl":436},{"sl":437},{"sl":441},{"sl":442},{"sl":445},{"sl":446},{"sl":447},{"sl":449},{"sl":451},{"sl":452},{"sl":453},{"sl":455},{"sl":457},{"sl":458},{"sl":459},{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":464},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":474},{"sl":476},{"sl":478},{"sl":479},{"sl":480},{"sl":481},{"sl":482},{"sl":486},{"sl":487},{"sl":488},{"sl":489},{"sl":490},{"sl":491},{"sl":492},{"sl":493}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [46, 20, 5], [], [64, 20], [64, 20], [64, 20], [64, 20], [64, 20], [64, 20], [], [], [64, 20], [], [], [], [46, 5], [46, 5], [46, 5], [], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [], [46, 5], [], [], [46, 5], [46, 5], [46, 5], [], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [], [], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [46, 5], [], [], [], [], [], [], [], [], [], [], [6], [], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [], [], [54], [], [54], [54], [54], [54], [54], [54], [54], [54], [], [], [69], [], [69], [69], [69], [69], [69], [], [], [45], [], [45], [45], [45], [], [45], [45], [45], [45], [45], [45], [45], [45], [], [45], [45], [45], [45], [45], [45], [45], [], [45], [45], [45], [], [45], [], [45], [45], [45], [45], [45], [], [45], [45], [], [], [0], [], [0], [0], [0], [0], [], [0], [0], [0], [], [0], [], [0], [0], [0], [0], [0], [], [], [], [0], [0], [0], [0], [0], [0], [], [0], [], [0], [0], [], [0], [0], [0], [], [0], [], [0], [0], [0], [0], [], [0], [], [0], [0], [], [0], [0], [0], [0], [0], [0], [], [], [], [0], [0], [0], [0], [0], [], [0], [], [0], [], [0], [0], [0], [], [0], [], [0], [0], [0], [0], [], [], [], [0], [0], [0], [0], [], [0], [], [0], [], [], [12], [], [12], [12], [12], [12], [12], [], [12], [12], [12], [], [12], [], [12], [12], [12], [12], [12], [], [], [], [12], [12], [12], [12], [12], [], [12], [], [12], [], [], [49], [], [49], [49], [], [], [49], [49], [49], [], [49], [], [49], [49], [], [], [49], [49], [49], [], [], [], [49], [49], [], [], [49], [49], [49], [], [49], [], [49], [49], [49], [49], [49], [49], [49], [], [49], [], [49], [49], [], [], [64], [], [64], [64], [64], [64], [64], [], [], [64], [64], [64], [64], [], [], [64], [64], [64], [64], [64], [64], [64], [], [], [7], [], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [], [7], [], [7], [], [], [75], [], [75], [75], [75], [], [], [75], [75], [75], [75], [], [75], [], [75], [75], [], [], [75], [75], [75], [], [75], [], [75], [75], [], [], [75], [75], [75], [], [75], [], [75], [75], [], [], [75], [75], [75], [75], [], [75], [], [75], [75], [], [], [75], [75], [75], [75], [], [], [], [75], [75], [], [], [75], [75], [75], [], [75], [], [75], [75], [75], [], [75], [], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [75], [], [75], [], [75], [75], [75], [75], [75], [], [], [], [75], [75], [75], [75], [75], [75], [75], [75], [], [], [65], [], [65], [65], [65], [65], [], [], [65], [65], [65], [65], [65], [], [], [65], [65], [65], [65], [65], [65], [65], [65], [65], [65], [], [], [65], [65], [65], [], [65], [], [65], [65], [], [], [65], [65], [65], [65], [], [65], [], [65], [65], [], [], [65], [65], [65], [65], [], [65], [], [65], [65], [], [], [65], [65], [65], [65], [], [], [], [65], [65], [65], [65], [], [], [28], [], [28], [28], [], [28], [28], [28], [28], [28], [28], [], [], [28], [28], [28], [28], [28], [28], [], [28], [], [28], [28], [28], [28], [28], [28], [], [28], [28], [28], [28], [28], [28], [28], [28], [28], [], [], [], [28], [28], [28], [28], [28], [28], [28], [28], [28], [], [], [28], [28], [28], [28], [28], [28], [28], [28], [], [], [24], [], [24], [24], [], [], [24], [24], [24], [24], [], [], [24], [24], [24], [24], [24], [24], [24], [24], [24], [24], [24], [], [24], [24], [24], [24], [], [], [36], [], [36], [36], [], [36], [36], [36], [], [36], [], [36], [], [36], [36], [36], [36], [36], [36], [36], [36], [], [], [], [36], [36], [36], [36], [36], [], [], [30], [], [30], [30], [30], [30], [30], [30], [], [30], [30], [30], [], [], [30], [30], [30], [], [], [30], [30], [30], [], [], [68], [], [68], [68], [68], [68], [68], [], [68], [68], [68], [68], [], [], [61], [], [61], [61], [61], [61], [61], [], [61], [], [61], [61], [61], [61], [], []]
