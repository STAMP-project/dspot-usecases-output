var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":3849,"methods":[{"el":8,"sc":2,"sl":6},{"el":12,"sc":2,"sl":10},{"el":16,"sc":2,"sl":14},{"el":20,"sc":2,"sl":18}],"name":"Feedback","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1156":{"methods":[{"sl":6},{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":15}]},"test_1714":{"methods":[{"sl":10},{"sl":14}],"name":"test1","pass":true,"statements":[{"sl":11},{"sl":15}]},"test_1994":{"methods":[{"sl":10},{"sl":14},{"sl":18}],"name":"test2","pass":true,"statements":[{"sl":11},{"sl":15},{"sl":19}]},"test_2157":{"methods":[{"sl":10},{"sl":14}],"name":"testRealtimeFeedbackClassification","pass":true,"statements":[{"sl":11},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [1156], [], [], [], [2157, 1714, 1994], [2157, 1714, 1994], [], [], [1156, 2157, 1714, 1994], [1156, 2157, 1714, 1994], [], [], [1994], [1994], [], []]
