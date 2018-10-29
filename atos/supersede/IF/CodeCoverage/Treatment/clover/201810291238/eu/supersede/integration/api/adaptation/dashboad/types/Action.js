var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":0,"methods":[{"el":16,"sc":2,"sl":16},{"el":20,"sc":2,"sl":18},{"el":24,"sc":2,"sl":22},{"el":28,"sc":2,"sl":26},{"el":32,"sc":2,"sl":30},{"el":36,"sc":2,"sl":34},{"el":40,"sc":2,"sl":38},{"el":44,"sc":2,"sl":42},{"el":48,"sc":2,"sl":46},{"el":52,"sc":2,"sl":50},{"el":56,"sc":2,"sl":54},{"el":60,"sc":2,"sl":58},{"el":64,"sc":2,"sl":62}],"name":"Action","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_113":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testAddAdaptation","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_116":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testResetDashboard","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_125":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testAddEnactment","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_128":{"methods":[{"sl":16},{"sl":22},{"sl":30},{"sl":38},{"sl":46},{"sl":54}],"name":"testGetEnactment","pass":true,"statements":[{"sl":23},{"sl":31},{"sl":39},{"sl":47},{"sl":55}]},"test_2":{"methods":[{"sl":16},{"sl":22},{"sl":30},{"sl":38},{"sl":46},{"sl":54}],"name":"testGetAllAdaptations","pass":true,"statements":[{"sl":23},{"sl":31},{"sl":39},{"sl":47},{"sl":55}]},"test_34":{"methods":[{"sl":16},{"sl":22},{"sl":30},{"sl":38},{"sl":46},{"sl":54}],"name":"testGetAllEnactments","pass":true,"statements":[{"sl":23},{"sl":31},{"sl":39},{"sl":47},{"sl":55}]},"test_37":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testEnactAdaptationDecisionActionsForFC","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_42":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testGetAdaptation","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_54":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testEnactSelectedAdaptationDecisionsInFCGivenByString","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_55":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testEnactFCGivenByString","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]},"test_81":{"methods":[{"sl":16},{"sl":18},{"sl":22},{"sl":26},{"sl":30},{"sl":34},{"sl":38},{"sl":42},{"sl":46},{"sl":50},{"sl":54},{"sl":58}],"name":"testEnactAdaptationDecisionActions","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27},{"sl":31},{"sl":35},{"sl":39},{"sl":43},{"sl":47},{"sl":51},{"sl":55},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [128, 113, 37, 42, 116, 81, 125, 55, 2, 34, 54], [], [], [113, 37, 42, 116, 81, 125, 55, 54], [113, 37, 42, 116, 81, 125, 55, 54], [], [], [], [], [], []]
