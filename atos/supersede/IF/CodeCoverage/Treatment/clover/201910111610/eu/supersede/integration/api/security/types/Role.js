var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":6987,"methods":[{"el":34,"sc":2,"sl":32},{"el":38,"sc":2,"sl":36},{"el":42,"sc":2,"sl":40},{"el":46,"sc":2,"sl":44},{"el":50,"sc":2,"sl":48},{"el":54,"sc":2,"sl":52},{"el":61,"sc":2,"sl":56},{"el":70,"sc":2,"sl":63},{"el":81,"sc":2,"sl":72},{"el":90,"sc":2,"sl":83},{"el":95,"sc":2,"sl":92}],"name":"Role","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1034":{"methods":[{"sl":63}],"name":"test10","pass":true,"statements":[{"sl":64}]},"test_1142":{"methods":[{"sl":32},{"sl":36},{"sl":83}],"name":"test06","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":85},{"sl":86}]},"test_1287":{"methods":[{"sl":32},{"sl":36}],"name":"test16","pass":true,"statements":[{"sl":33},{"sl":37}]},"test_1291":{"methods":[{"sl":32},{"sl":36},{"sl":63},{"sl":72},{"sl":83},{"sl":92}],"name":"test03","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":69},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_1360":{"methods":[{"sl":72}],"name":"test04","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":80}]},"test_1400":{"methods":[{"sl":83}],"name":"test05","pass":true,"statements":[{"sl":85},{"sl":88}]},"test_1617":{"methods":[{"sl":32},{"sl":83}],"name":"test09","pass":true,"statements":[{"sl":33},{"sl":85},{"sl":86}]},"test_1651":{"methods":[{"sl":32},{"sl":36},{"sl":72},{"sl":83},{"sl":92}],"name":"test00","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":94}]},"test_169":{"methods":[{"sl":32},{"sl":36},{"sl":56},{"sl":72},{"sl":83},{"sl":92}],"name":"deleteRoleTest","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":57},{"sl":58},{"sl":59},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_1766":{"methods":[{"sl":92}],"name":"test08","pass":true,"statements":[{"sl":94}]},"test_1946":{"methods":[{"sl":40},{"sl":44}],"name":"test18","pass":true,"statements":[{"sl":41},{"sl":45}]},"test_2105":{"methods":[{"sl":56}],"name":"test12","pass":true,"statements":[{"sl":57},{"sl":58}]},"test_2189":{"methods":[{"sl":48},{"sl":56}],"name":"test13","pass":true,"statements":[{"sl":49},{"sl":57},{"sl":58},{"sl":59}]},"test_2284":{"methods":[{"sl":63}],"name":"test19","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66},{"sl":69}]},"test_2338":{"methods":[{"sl":32},{"sl":36},{"sl":40},{"sl":48},{"sl":56},{"sl":72},{"sl":83},{"sl":92}],"name":"addRoleTest","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":49},{"sl":57},{"sl":58},{"sl":59},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_2481":{"methods":[{"sl":36},{"sl":72},{"sl":92}],"name":"authenticateUserTest","pass":true,"statements":[{"sl":37},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":94}]},"test_2520":{"methods":[{"sl":32},{"sl":36},{"sl":56},{"sl":72},{"sl":83},{"sl":92}],"name":"addUserTest","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":57},{"sl":58},{"sl":59},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_2555":{"methods":[{"sl":56}],"name":"test11","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59}]},"test_2636":{"methods":[{"sl":32},{"sl":36}],"name":"test15","pass":true,"statements":[{"sl":33},{"sl":37}]},"test_2732":{"methods":[{"sl":36},{"sl":72},{"sl":92}],"name":"getAllRolesForUserTest","pass":true,"statements":[{"sl":37},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":94}]},"test_2795":{"methods":[{"sl":72}],"name":"deleteUserTest","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":80}]},"test_2963":{"methods":[{"sl":40}],"name":"test17","pass":true,"statements":[{"sl":41}]},"test_301":{"methods":[{"sl":32},{"sl":36},{"sl":56},{"sl":72},{"sl":83},{"sl":92}],"name":"getAllUsersForRoleTest","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":57},{"sl":58},{"sl":59},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_315":{"methods":[{"sl":32},{"sl":36},{"sl":63},{"sl":72},{"sl":83},{"sl":92}],"name":"updateUserTest","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":64},{"sl":65},{"sl":66},{"sl":69},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":85},{"sl":86},{"sl":94}]},"test_316":{"methods":[{"sl":48},{"sl":52}],"name":"test14","pass":true,"statements":[{"sl":49},{"sl":53}]},"test_337":{"methods":[{"sl":48}],"name":"test02","pass":true,"statements":[{"sl":49}]},"test_348":{"methods":[{"sl":32}],"name":"test07","pass":true,"statements":[{"sl":33}]},"test_767":{"methods":[{"sl":40}],"name":"test01","pass":true,"statements":[{"sl":41}]},"test_878":{"methods":[{"sl":36},{"sl":72},{"sl":92}],"name":"test14","pass":true,"statements":[{"sl":37},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":94}]},"test_904":{"methods":[{"sl":36},{"sl":72},{"sl":92}],"name":"getUserTest","pass":true,"statements":[{"sl":37},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":94}]},"test_965":{"methods":[{"sl":36},{"sl":92}],"name":"test20","pass":true,"statements":[{"sl":37},{"sl":94}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1291, 301, 348, 2636, 169, 1287, 2338, 315, 1617, 2520, 1651, 1142], [1291, 301, 348, 2636, 169, 1287, 2338, 315, 1617, 2520, 1651, 1142], [], [], [904, 1291, 2481, 301, 2636, 169, 1287, 878, 965, 2338, 315, 2520, 2732, 1651, 1142], [904, 1291, 2481, 301, 2636, 169, 1287, 878, 965, 2338, 315, 2520, 2732, 1651, 1142], [], [], [1946, 767, 2963, 2338], [1946, 767, 2963, 2338], [], [], [1946], [1946], [], [], [2189, 337, 2338, 316], [2189, 337, 2338, 316], [], [], [316], [316], [], [], [2555, 301, 2189, 169, 2105, 2338, 2520], [2555, 301, 2189, 169, 2105, 2338, 2520], [2555, 301, 2189, 169, 2105, 2338, 2520], [2555, 301, 2189, 169, 2338, 2520], [], [], [], [1291, 1034, 315, 2284], [1291, 1034, 315, 2284], [1291, 315, 2284], [1291, 315, 2284], [1291], [], [1291, 315, 2284], [], [], [904, 1291, 2481, 301, 2795, 169, 878, 2338, 315, 2520, 2732, 1651, 1360], [904, 1291, 2481, 301, 2795, 169, 878, 2338, 315, 2520, 2732, 1651, 1360], [904, 1291, 2481, 301, 2795, 169, 878, 2338, 315, 2520, 2732, 1651, 1360], [904, 1291, 2481, 301, 2795, 169, 878, 2338, 315, 2520, 2732, 1651, 1360], [904, 1291, 2481, 301, 169, 878, 2338, 315, 2520, 2732, 1651], [904, 1291, 2481, 301, 169, 878, 2338, 315, 2520, 2732, 1651], [904, 1291, 2481, 301, 169, 878, 2338, 315, 2520, 2732, 1651], [], [904, 1291, 2481, 301, 2795, 169, 878, 2338, 315, 2520, 2732, 1360], [], [], [1291, 301, 169, 1400, 2338, 315, 1617, 2520, 1651, 1142], [], [1291, 301, 169, 1400, 2338, 315, 1617, 2520, 1651, 1142], [1291, 301, 169, 2338, 315, 1617, 2520, 1651, 1142], [], [1400], [], [], [], [904, 1291, 2481, 301, 169, 878, 965, 1766, 2338, 315, 2520, 2732, 1651], [], [904, 1291, 2481, 301, 169, 878, 965, 1766, 2338, 315, 2520, 2732, 1651], [], [], []]
