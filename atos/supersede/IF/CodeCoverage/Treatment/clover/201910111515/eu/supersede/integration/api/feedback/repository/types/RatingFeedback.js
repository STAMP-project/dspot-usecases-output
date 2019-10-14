var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":3218,"methods":[{"el":27,"sc":5,"sl":22},{"el":30,"sc":5,"sl":29},{"el":37,"sc":5,"sl":32},{"el":41,"sc":5,"sl":39},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":57,"sc":5,"sl":55},{"el":61,"sc":5,"sl":59},{"el":65,"sc":5,"sl":63},{"el":69,"sc":5,"sl":67},{"el":73,"sc":5,"sl":71},{"el":77,"sc":5,"sl":75},{"el":82,"sc":5,"sl":79},{"el":87,"sc":5,"sl":84}],"name":"RatingFeedback","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1130":{"methods":[{"sl":29},{"sl":47},{"sl":51}],"name":"test10","pass":true,"statements":[{"sl":48},{"sl":52}]},"test_1319":{"methods":[{"sl":29},{"sl":79},{"sl":84}],"name":"test19","pass":true,"statements":[{"sl":81},{"sl":86}]},"test_1329":{"methods":[{"sl":29},{"sl":71}],"name":"test00","pass":true,"statements":[{"sl":72}]},"test_1346":{"methods":[{"sl":32},{"sl":63}],"name":"test22","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":64}]},"test_1415":{"methods":[{"sl":29},{"sl":55},{"sl":59}],"name":"test09","pass":true,"statements":[{"sl":56},{"sl":60}]},"test_1509":{"methods":[{"sl":32},{"sl":47},{"sl":63},{"sl":71}],"name":"test13","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":48},{"sl":64},{"sl":72}]},"test_1517":{"methods":[{"sl":32},{"sl":47},{"sl":63},{"sl":71}],"name":"test11","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":48},{"sl":64},{"sl":72}]},"test_1627":{"methods":[{"sl":29},{"sl":47}],"name":"test06","pass":true,"statements":[{"sl":48}]},"test_1633":{"methods":[{"sl":32},{"sl":47},{"sl":63},{"sl":71}],"name":"test12","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":48},{"sl":64},{"sl":72}]},"test_1757":{"methods":[{"sl":29},{"sl":55},{"sl":59}],"name":"test24","pass":true,"statements":[{"sl":56},{"sl":60}]},"test_1847":{"methods":[{"sl":32},{"sl":63},{"sl":71}],"name":"test20","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":64},{"sl":72}]},"test_1977":{"methods":[{"sl":32},{"sl":63},{"sl":71}],"name":"test07","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":64},{"sl":72}]},"test_2142":{"methods":[{"sl":29},{"sl":63}],"name":"test23","pass":true,"statements":[{"sl":64}]},"test_2202":{"methods":[{"sl":29},{"sl":79},{"sl":84}],"name":"test17","pass":true,"statements":[{"sl":81},{"sl":86}]},"test_2210":{"methods":[{"sl":29},{"sl":79}],"name":"test01","pass":true,"statements":[{"sl":81}]},"test_2215":{"methods":[{"sl":29},{"sl":55}],"name":"test08","pass":true,"statements":[{"sl":56}]},"test_227":{"methods":[{"sl":29},{"sl":63},{"sl":67}],"name":"test02","pass":true,"statements":[{"sl":64},{"sl":68}]},"test_259":{"methods":[{"sl":29},{"sl":79},{"sl":84}],"name":"test05","pass":true,"statements":[{"sl":81},{"sl":86}]},"test_28":{"methods":[{"sl":22},{"sl":29}],"name":"test03","pass":true,"statements":[{"sl":24}]},"test_4":{"methods":[{"sl":29},{"sl":39}],"name":"test04","pass":true,"statements":[{"sl":40}]},"test_562":{"methods":[{"sl":29},{"sl":71},{"sl":75}],"name":"test21","pass":true,"statements":[{"sl":72},{"sl":76}]},"test_568":{"methods":[{"sl":29},{"sl":79},{"sl":84}],"name":"test16","pass":true,"statements":[{"sl":81},{"sl":86}]},"test_631":{"methods":[{"sl":29},{"sl":39},{"sl":43}],"name":"test15","pass":true,"statements":[{"sl":40},{"sl":44}]},"test_765":{"methods":[{"sl":29},{"sl":43},{"sl":59},{"sl":67},{"sl":75}],"name":"testGetFeedbacksForApplicationByUser","pass":true,"statements":[{"sl":44},{"sl":60},{"sl":68},{"sl":76}]},"test_770":{"methods":[{"sl":29},{"sl":39},{"sl":43}],"name":"test14","pass":true,"statements":[{"sl":40},{"sl":44}]},"test_786":{"methods":[{"sl":29},{"sl":79},{"sl":84}],"name":"test18","pass":true,"statements":[{"sl":81},{"sl":86}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28], [], [28], [], [], [], [], [227, 770, 1329, 1319, 28, 2202, 786, 4, 2142, 2215, 765, 631, 1415, 1757, 259, 562, 1627, 2210, 568, 1130], [], [], [1633, 1346, 1977, 1517, 1509, 1847], [1633, 1346, 1977, 1517, 1509, 1847], [1633, 1346, 1977, 1517, 1509, 1847], [1633, 1346, 1977, 1517, 1509, 1847], [1633, 1346, 1977, 1517, 1509, 1847], [], [], [770, 4, 631], [770, 4, 631], [], [], [770, 765, 631], [770, 765, 631], [], [], [1633, 1517, 1509, 1627, 1130], [1633, 1517, 1509, 1627, 1130], [], [], [1130], [1130], [], [], [2215, 1415, 1757], [2215, 1415, 1757], [], [], [765, 1415, 1757], [765, 1415, 1757], [], [], [227, 1633, 2142, 1346, 1977, 1517, 1509, 1847], [227, 1633, 2142, 1346, 1977, 1517, 1509, 1847], [], [], [227, 765], [227, 765], [], [], [1633, 1329, 1977, 1517, 1509, 562, 1847], [1633, 1329, 1977, 1517, 1509, 562, 1847], [], [], [765, 562], [765, 562], [], [], [1319, 2202, 786, 259, 2210, 568], [], [1319, 2202, 786, 259, 2210, 568], [], [], [1319, 2202, 786, 259, 568], [], [1319, 2202, 786, 259, 568], [], []]