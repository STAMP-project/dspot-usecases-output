var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":2309,"methods":[{"el":17,"sc":5,"sl":11}],"name":"ParameterSerializerModifier","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1460":{"methods":[{"sl":11}],"name":"test2","pass":true,"statements":[{"sl":13},{"sl":14}]},"test_593":{"methods":[{"sl":11}],"name":"test3","pass":true,"statements":[{"sl":13},{"sl":16}]},"test_745":{"methods":[{"sl":11}],"name":"test1","pass":true,"statements":[{"sl":13}]},"test_995":{"methods":[{"sl":11}],"name":"test0","pass":true,"statements":[{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [593, 745, 1460, 995], [], [593, 745, 1460, 995], [1460, 995], [], [593], [], []]
