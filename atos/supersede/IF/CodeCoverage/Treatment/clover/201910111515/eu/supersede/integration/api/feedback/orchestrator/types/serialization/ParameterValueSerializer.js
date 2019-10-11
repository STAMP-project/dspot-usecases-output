var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":2321,"methods":[{"el":22,"sc":5,"sl":13}],"name":"ParameterValueSerializer","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1513":{"methods":[{"sl":13}],"name":"test4","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_1721":{"methods":[{"sl":13}],"name":"test1","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":18}]},"test_1882":{"methods":[{"sl":13}],"name":"test5","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_1950":{"methods":[{"sl":13}],"name":"test3","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_2114":{"methods":[{"sl":13}],"name":"test6","pass":true,"statements":[{"sl":15},{"sl":16}]},"test_429":{"methods":[{"sl":13}],"name":"test2","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":20}]},"test_865":{"methods":[{"sl":13}],"name":"test0","pass":true,"statements":[{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1721, 1513, 1950, 429, 1882, 865, 2114], [], [1721, 1513, 1950, 429, 1882, 865, 2114], [865, 2114], [1721, 1513, 1950, 429, 1882], [1721], [], [1513, 1950, 429, 1882], [], [], []]
