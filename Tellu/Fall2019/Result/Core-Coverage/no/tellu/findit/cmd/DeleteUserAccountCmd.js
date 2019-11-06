var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":843,"methods":[{"el":18,"sc":5,"sl":15},{"el":22,"sc":5,"sl":20},{"el":39,"sc":5,"sl":24}],"name":"DeleteUserAccountCmd","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_54":{"methods":[{"sl":15},{"sl":20},{"sl":24}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":33},{"sl":34}]},"test_72":{"methods":[{"sl":15},{"sl":20},{"sl":24}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [54, 72], [54, 72], [54, 72], [], [], [54, 72], [54, 72], [], [], [54, 72], [], [54, 72], [54, 72], [54, 72], [54, 72], [54], [54], [], [54], [54], [], [], [], [], [], [], []]
