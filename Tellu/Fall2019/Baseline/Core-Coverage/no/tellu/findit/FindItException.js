var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":0,"methods":[{"el":15,"sc":5,"sl":13},{"el":19,"sc":5,"sl":17},{"el":23,"sc":5,"sl":21},{"el":27,"sc":5,"sl":25}],"name":"FindItException","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_75":{"methods":[{"sl":21}],"name":"testCircularPositionedByError","pass":true,"statements":[{"sl":22}]},"test_77":{"methods":[{"sl":21}],"name":"testSetPositionNotAllowedWhenPositionByOther","pass":true,"statements":[{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [77, 75], [77, 75], [], [], [], [], [], [], []]
