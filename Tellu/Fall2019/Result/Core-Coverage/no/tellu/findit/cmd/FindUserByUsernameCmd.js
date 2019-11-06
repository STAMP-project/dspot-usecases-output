var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":1233,"methods":[{"el":17,"sc":5,"sl":12},{"el":20,"sc":5,"sl":18},{"el":24,"sc":5,"sl":22},{"el":38,"sc":5,"sl":26}],"name":"FindUserByUsernameCmd","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_85":{"methods":[{"sl":12},{"sl":22},{"sl":26}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":23},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [85], [85], [85], [], [], [], [], [], [], [], [85], [85], [], [], [85], [], [85], [85], [85], [85], [], [85], [], [], [], [], [], [], []]
