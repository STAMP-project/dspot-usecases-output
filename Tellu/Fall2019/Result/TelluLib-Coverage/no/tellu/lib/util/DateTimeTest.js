var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":9328,"methods":[{"el":13,"sc":5,"sl":10},{"el":18,"sc":5,"sl":15}],"name":"DateTimeTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_143":{"methods":[{"sl":10},{"sl":15}],"name":"testParseAndFormat","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [143], [143], [143], [], [], [143], [], [143], [], [], []]
