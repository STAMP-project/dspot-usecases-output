var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":684,"id":32581,"methods":[{"el":84,"sc":2,"sl":66},{"el":90,"sc":2,"sl":86},{"el":100,"sc":2,"sl":94},{"el":109,"sc":2,"sl":104},{"el":115,"sc":2,"sl":111},{"el":134,"sc":2,"sl":117},{"el":143,"sc":2,"sl":138},{"el":158,"sc":2,"sl":145},{"el":167,"sc":2,"sl":162},{"el":173,"sc":2,"sl":169},{"el":179,"sc":2,"sl":175},{"el":185,"sc":2,"sl":181},{"el":191,"sc":2,"sl":187},{"el":198,"sc":2,"sl":193},{"el":215,"sc":2,"sl":200},{"el":223,"sc":2,"sl":217},{"el":231,"sc":2,"sl":227},{"el":237,"sc":2,"sl":233},{"el":254,"sc":2,"sl":239},{"el":263,"sc":2,"sl":258},{"el":269,"sc":2,"sl":265},{"el":289,"sc":2,"sl":271},{"el":297,"sc":2,"sl":291},{"el":305,"sc":2,"sl":301},{"el":312,"sc":2,"sl":307},{"el":329,"sc":2,"sl":314},{"el":339,"sc":2,"sl":332},{"el":348,"sc":2,"sl":341},{"el":355,"sc":2,"sl":350},{"el":365,"sc":2,"sl":359},{"el":373,"sc":2,"sl":367},{"el":389,"sc":2,"sl":375},{"el":400,"sc":2,"sl":393},{"el":408,"sc":2,"sl":403},{"el":414,"sc":2,"sl":410},{"el":430,"sc":2,"sl":416},{"el":438,"sc":2,"sl":433},{"el":447,"sc":2,"sl":440},{"el":456,"sc":2,"sl":451},{"el":462,"sc":2,"sl":458},{"el":469,"sc":2,"sl":464},{"el":476,"sc":2,"sl":472},{"el":482,"sc":2,"sl":478},{"el":488,"sc":2,"sl":484},{"el":494,"sc":2,"sl":490},{"el":500,"sc":2,"sl":496},{"el":506,"sc":2,"sl":502},{"el":527,"sc":2,"sl":508},{"el":539,"sc":2,"sl":531},{"el":555,"sc":2,"sl":541},{"el":571,"sc":2,"sl":557},{"el":577,"sc":2,"sl":573},{"el":583,"sc":2,"sl":579},{"el":589,"sc":2,"sl":585},{"el":605,"sc":2,"sl":591},{"el":613,"sc":2,"sl":607},{"el":632,"sc":2,"sl":615},{"el":639,"sc":2,"sl":635},{"el":645,"sc":2,"sl":641},{"el":650,"sc":2,"sl":647},{"el":674,"sc":2,"sl":652},{"el":682,"sc":2,"sl":677}],"name":"FeedbackOrchestratorProxyTest","sl":53}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1085":{"methods":[{"sl":502}],"name":"testReorderParameterOfParameter","pass":true,"statements":[{"sl":504},{"sl":505}]},"test_11":{"methods":[{"sl":162}],"name":"testGetApplications","pass":true,"statements":[{"sl":164},{"sl":165},{"sl":166}]},"test_1182":{"methods":[{"sl":169}],"name":"testGetApplicationWithConfiguration","pass":true,"statements":[{"sl":171},{"sl":172}]},"test_119":{"methods":[{"sl":233}],"name":"testGetGeneralConfigurationOfApplicationById","pass":true,"statements":[{"sl":235},{"sl":236}]},"test_1206":{"methods":[{"sl":307}],"name":"testGetGeneralConfigurationsOfConfigurationById","pass":true,"statements":[{"sl":309},{"sl":311}]},"test_1235":{"methods":[{"sl":367}],"name":"testGetMechanismOfApplication","pass":true,"statements":[{"sl":369},{"sl":370},{"sl":371},{"sl":372}]},"test_1366":{"methods":[{"sl":410}],"name":"testGetParameter","pass":true,"statements":[{"sl":412},{"sl":413}]},"test_1406":{"methods":[{"sl":181}],"name":"testGetApplicationForUser","pass":true,"statements":[{"sl":183},{"sl":184}]},"test_1561":{"methods":[{"sl":433}],"name":"testGetUsers","pass":true,"statements":[{"sl":435},{"sl":436},{"sl":437}]},"test_171":{"methods":[{"sl":187}],"name":"testGetApplicationForUserGroup","pass":true,"statements":[{"sl":189},{"sl":190}]},"test_172":{"methods":[{"sl":440}],"name":"testCreateUser","pass":true,"statements":[{"sl":442},{"sl":443},{"sl":444},{"sl":445},{"sl":446}]},"test_1752":{"methods":[{"sl":403}],"name":"testGetParameters","pass":true,"statements":[{"sl":405},{"sl":406},{"sl":407}]},"test_1873":{"methods":[{"sl":451}],"name":"testGetUserGroups","pass":true,"statements":[{"sl":453},{"sl":454},{"sl":455}]},"test_191":{"methods":[{"sl":200},{"sl":591},{"sl":607},{"sl":615},{"sl":635},{"sl":641},{"sl":647},{"sl":652},{"sl":677}],"name":"testCreateUpdateDeleteApplication","pass":true,"statements":[{"sl":203},{"sl":204},{"sl":205},{"sl":213},{"sl":214},{"sl":592},{"sl":593},{"sl":594},{"sl":596},{"sl":597},{"sl":598},{"sl":600},{"sl":601},{"sl":602},{"sl":604},{"sl":608},{"sl":609},{"sl":610},{"sl":611},{"sl":612},{"sl":617},{"sl":618},{"sl":619},{"sl":620},{"sl":621},{"sl":622},{"sl":623},{"sl":625},{"sl":626},{"sl":628},{"sl":629},{"sl":631},{"sl":636},{"sl":637},{"sl":638},{"sl":642},{"sl":643},{"sl":644},{"sl":648},{"sl":649},{"sl":653},{"sl":654},{"sl":655},{"sl":656},{"sl":657},{"sl":659},{"sl":660},{"sl":661},{"sl":662},{"sl":663},{"sl":665},{"sl":666},{"sl":667},{"sl":668},{"sl":669},{"sl":671},{"sl":673},{"sl":678},{"sl":679},{"sl":680},{"sl":681}]},"test_2194":{"methods":[{"sl":508},{"sl":677}],"name":"testCreateUpdateDeleteParameterInMechanism","pass":true,"statements":[{"sl":510},{"sl":512},{"sl":513},{"sl":514},{"sl":515},{"sl":517},{"sl":518},{"sl":520},{"sl":521},{"sl":522},{"sl":524},{"sl":525},{"sl":678},{"sl":679},{"sl":680},{"sl":681}]},"test_2197":{"methods":[{"sl":490}],"name":"testReorderParameterOfGeneralConfiguration","pass":true,"statements":[{"sl":492},{"sl":493}]},"test_2227":{"methods":[{"sl":94}],"name":"testAuthenticate","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_2260":{"methods":[{"sl":111}],"name":"testGetAPIUser","pass":true,"statements":[{"sl":113},{"sl":114}]},"test_2280":{"methods":[{"sl":227}],"name":"testGetGeneralConfigurationOfApplication","pass":true,"statements":[{"sl":229},{"sl":230}]},"test_2301":{"methods":[{"sl":301}],"name":"testGetGeneralConfigurationsOfConfiguration","pass":true,"statements":[{"sl":303},{"sl":304}]},"test_2314":{"methods":[{"sl":464}],"name":"testCreateUserGroup","pass":true,"statements":[{"sl":466},{"sl":467},{"sl":468}]},"test_2370":{"methods":[{"sl":496}],"name":"testSwitchOrderOfParametersOfParameter","pass":true,"statements":[{"sl":498},{"sl":499}]},"test_2402":{"methods":[{"sl":478}],"name":"testReorderParameterOfMechanism","pass":true,"statements":[{"sl":480},{"sl":481}]},"test_25":{"methods":[{"sl":484}],"name":"testSwitchOrderOfParametersOfGeneralConfiguration","pass":true,"statements":[{"sl":486},{"sl":487}]},"test_2700":{"methods":[{"sl":472}],"name":"testSwitchOrderOfParametersOfMechanism","pass":true,"statements":[{"sl":474},{"sl":475}]},"test_2830":{"methods":[{"sl":359}],"name":"testGetMechanismsOfApplication","pass":true,"statements":[{"sl":361},{"sl":362},{"sl":363},{"sl":364}]},"test_397":{"methods":[{"sl":193}],"name":"searchApplicationsByName","pass":true,"statements":[{"sl":195},{"sl":196},{"sl":197}]},"test_456":{"methods":[{"sl":175}],"name":"testGetApplicationWithConfigurationForAllLanguages","pass":true,"statements":[{"sl":177},{"sl":178}]},"test_490":{"methods":[{"sl":271},{"sl":531},{"sl":541},{"sl":607},{"sl":615},{"sl":635},{"sl":641},{"sl":647},{"sl":652}],"name":"testCreateUpdateDeleteConfiguration","pass":true,"statements":[{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":282},{"sl":283},{"sl":284},{"sl":287},{"sl":532},{"sl":533},{"sl":535},{"sl":536},{"sl":538},{"sl":542},{"sl":544},{"sl":547},{"sl":549},{"sl":552},{"sl":554},{"sl":608},{"sl":609},{"sl":610},{"sl":611},{"sl":612},{"sl":617},{"sl":618},{"sl":619},{"sl":620},{"sl":621},{"sl":622},{"sl":623},{"sl":625},{"sl":626},{"sl":628},{"sl":629},{"sl":631},{"sl":636},{"sl":637},{"sl":638},{"sl":642},{"sl":643},{"sl":644},{"sl":648},{"sl":649},{"sl":653},{"sl":654},{"sl":655},{"sl":656},{"sl":657},{"sl":659},{"sl":660},{"sl":661},{"sl":662},{"sl":663},{"sl":665},{"sl":666},{"sl":667},{"sl":668},{"sl":669},{"sl":671},{"sl":673}]},"test_622":{"methods":[{"sl":265}],"name":"testGetConfiguration","pass":true,"statements":[{"sl":267},{"sl":268}]},"test_680":{"methods":[{"sl":291}],"name":"testCreatePullConfigurationForUserInfo","pass":true,"statements":[{"sl":293},{"sl":295},{"sl":296}]},"test_813":{"methods":[{"sl":258}],"name":"testGetConfigurations","pass":true,"statements":[{"sl":260},{"sl":261},{"sl":262}]},"test_831":{"methods":[{"sl":104}],"name":"testGetAPIUsers","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":108}]},"test_908":{"methods":[{"sl":239},{"sl":541},{"sl":607}],"name":"testCreateUpdateDeleteGeneralConfigurationOfApplication","pass":true,"statements":[{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":248},{"sl":249},{"sl":250},{"sl":253},{"sl":542},{"sl":544},{"sl":547},{"sl":549},{"sl":552},{"sl":554},{"sl":608},{"sl":609},{"sl":610},{"sl":611},{"sl":612}]},"test_952":{"methods":[{"sl":332}],"name":"testGetMechanismsOfConfiguration","pass":true,"statements":[{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338}]},"test_992":{"methods":[{"sl":341}],"name":"testGetMechanismOfConfiguration","pass":true,"statements":[{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2227], [], [2227], [2227], [2227], [2227], [], [], [], [], [831], [], [831], [831], [831], [], [], [2260], [], [2260], [2260], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11], [], [11], [11], [11], [], [], [1182], [], [1182], [1182], [], [], [456], [], [456], [456], [], [], [1406], [], [1406], [1406], [], [], [171], [], [171], [171], [], [], [397], [], [397], [397], [397], [], [], [191], [], [], [191], [191], [191], [], [], [], [], [], [], [], [191], [191], [], [], [], [], [], [], [], [], [], [], [], [], [2280], [], [2280], [2280], [], [], [119], [], [119], [119], [], [], [908], [], [], [908], [908], [908], [908], [], [], [908], [908], [908], [], [], [908], [], [], [], [], [813], [], [813], [813], [813], [], [], [622], [], [622], [622], [], [], [490], [], [], [490], [490], [490], [490], [490], [490], [], [], [490], [490], [490], [], [], [490], [], [], [], [680], [], [680], [], [680], [680], [], [], [], [], [2301], [], [2301], [2301], [], [], [1206], [], [1206], [], [1206], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [952], [], [952], [952], [952], [952], [952], [], [], [992], [], [992], [992], [992], [992], [992], [], [], [], [], [], [], [], [], [], [], [], [2830], [], [2830], [2830], [2830], [2830], [], [], [1235], [], [1235], [1235], [1235], [1235], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1752], [], [1752], [1752], [1752], [], [], [1366], [], [1366], [1366], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1561], [], [1561], [1561], [1561], [], [], [172], [], [172], [172], [172], [172], [172], [], [], [], [], [1873], [], [1873], [1873], [1873], [], [], [], [], [], [], [], [], [2314], [], [2314], [2314], [2314], [], [], [], [2700], [], [2700], [2700], [], [], [2402], [], [2402], [2402], [], [], [25], [], [25], [25], [], [], [2197], [], [2197], [2197], [], [], [2370], [], [2370], [2370], [], [], [1085], [], [1085], [1085], [], [], [2194], [], [2194], [], [2194], [2194], [2194], [2194], [], [2194], [2194], [], [2194], [2194], [2194], [], [2194], [2194], [], [], [], [], [], [490], [490], [490], [], [490], [490], [], [490], [], [], [908, 490], [908, 490], [], [908, 490], [], [], [908, 490], [], [908, 490], [], [], [908, 490], [], [908, 490], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [191], [191], [191], [191], [], [191], [191], [191], [], [191], [191], [191], [], [191], [], [], [191, 908, 490], [191, 908, 490], [191, 908, 490], [191, 908, 490], [191, 908, 490], [191, 908, 490], [], [], [191, 490], [], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [], [191, 490], [191, 490], [], [191, 490], [191, 490], [], [191, 490], [], [], [], [191, 490], [191, 490], [191, 490], [191, 490], [], [], [191, 490], [191, 490], [191, 490], [191, 490], [], [], [191, 490], [191, 490], [191, 490], [], [], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [], [191, 490], [191, 490], [191, 490], [191, 490], [191, 490], [], [191, 490], [], [191, 490], [], [], [], [191, 2194], [191, 2194], [191, 2194], [191, 2194], [191, 2194], [], [], []]
