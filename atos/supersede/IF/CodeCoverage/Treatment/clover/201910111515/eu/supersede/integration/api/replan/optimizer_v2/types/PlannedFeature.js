var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":6419,"methods":[{"el":31,"sc":2,"sl":29},{"el":34,"sc":2,"sl":32},{"el":37,"sc":2,"sl":35},{"el":40,"sc":2,"sl":38},{"el":43,"sc":2,"sl":41},{"el":46,"sc":2,"sl":44},{"el":49,"sc":2,"sl":47},{"el":52,"sc":2,"sl":50},{"el":55,"sc":2,"sl":53},{"el":58,"sc":2,"sl":56}],"name":"PlannedFeature","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1125":{"methods":[{"sl":47}],"name":"test06","pass":true,"statements":[{"sl":48}]},"test_1196":{"methods":[{"sl":35},{"sl":38}],"name":"test12","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_1450":{"methods":[{"sl":41}],"name":"test02","pass":true,"statements":[{"sl":42}]},"test_1550":{"methods":[{"sl":29},{"sl":32}],"name":"test11","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_1658":{"methods":[{"sl":47},{"sl":50}],"name":"test01","pass":true,"statements":[{"sl":48},{"sl":51}]},"test_1777":{"methods":[{"sl":32},{"sl":38},{"sl":44},{"sl":50},{"sl":56}],"name":"testOptimizePlan","pass":true,"statements":[{"sl":33},{"sl":39},{"sl":45},{"sl":51},{"sl":57}]},"test_1839":{"methods":[{"sl":29},{"sl":32}],"name":"test08","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_1841":{"methods":[{"sl":29},{"sl":32}],"name":"test10","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_1925":{"methods":[{"sl":35},{"sl":38}],"name":"test13","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_471":{"methods":[{"sl":41},{"sl":44}],"name":"test07","pass":true,"statements":[{"sl":42},{"sl":45}]},"test_472":{"methods":[{"sl":53},{"sl":56}],"name":"test04","pass":true,"statements":[{"sl":54},{"sl":57}]},"test_497":{"methods":[{"sl":29}],"name":"test00","pass":true,"statements":[{"sl":30}]},"test_629":{"methods":[{"sl":35}],"name":"test03","pass":true,"statements":[{"sl":36}]},"test_713":{"methods":[{"sl":35},{"sl":38}],"name":"test09","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_853":{"methods":[{"sl":53}],"name":"test05","pass":true,"statements":[{"sl":54}]},"test_958":{"methods":[{"sl":41},{"sl":44}],"name":"test14","pass":true,"statements":[{"sl":42},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1841, 1550, 1839, 497], [1841, 1550, 1839, 497], [], [1841, 1550, 1839, 1777], [1841, 1550, 1839, 1777], [], [1925, 713, 629, 1196], [1925, 713, 629, 1196], [], [1925, 713, 1196, 1777], [1925, 713, 1196, 1777], [], [958, 471, 1450], [958, 471, 1450], [], [958, 471, 1777], [958, 471, 1777], [], [1125, 1658], [1125, 1658], [], [1777, 1658], [1777, 1658], [], [472, 853], [472, 853], [], [472, 1777], [472, 1777], [], []]
