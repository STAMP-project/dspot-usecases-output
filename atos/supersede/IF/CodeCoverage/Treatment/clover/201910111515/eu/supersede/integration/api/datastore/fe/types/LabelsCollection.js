var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":742,"methods":[{"el":31,"sc":2,"sl":29},{"el":35,"sc":2,"sl":33},{"el":42,"sc":5,"sl":40},{"el":49,"sc":5,"sl":47}],"name":"LabelsCollection","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_179":{"methods":[{"sl":29},{"sl":40}],"name":"test1","pass":true,"statements":[{"sl":41}]},"test_2034":{"methods":[{"sl":29},{"sl":47}],"name":"test0","pass":true,"statements":[{"sl":48}]},"test_650":{"methods":[{"sl":33},{"sl":40}],"name":"test2","pass":true,"statements":[{"sl":34},{"sl":41}]},"test_847":{"methods":[{"sl":33},{"sl":40}],"name":"test3","pass":true,"statements":[{"sl":34},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [179, 2034], [], [], [], [650, 847], [650, 847], [], [], [], [], [], [179, 650, 847], [179, 650, 847], [], [], [], [], [], [2034], [2034], [], []]
