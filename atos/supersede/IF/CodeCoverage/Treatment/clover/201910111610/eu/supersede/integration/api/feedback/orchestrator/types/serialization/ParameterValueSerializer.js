var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":2321,"methods":[{"el":22,"sc":5,"sl":13}],"name":"ParameterValueSerializer","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2002":{"methods":[{"sl":13}],"name":"test1","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":18}]},"test_2055":{"methods":[{"sl":13}],"name":"test5","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_2230":{"methods":[{"sl":13}],"name":"test6","pass":true,"statements":[{"sl":15},{"sl":16}]},"test_2595":{"methods":[{"sl":13}],"name":"test3","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_2678":{"methods":[{"sl":13}],"name":"test0","pass":true,"statements":[{"sl":15},{"sl":16}]},"test_474":{"methods":[{"sl":13}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_75":{"methods":[{"sl":13}],"name":"test4","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [474, 2230, 75, 2055, 2678, 2595, 2002], [], [474, 2230, 75, 2055, 2678, 2595, 2002], [2230, 2678], [474, 75, 2055, 2595, 2002], [2002], [], [474, 75, 2055, 2595], [], [], []]
