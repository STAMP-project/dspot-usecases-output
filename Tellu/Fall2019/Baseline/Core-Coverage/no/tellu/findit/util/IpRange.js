var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":15069,"methods":[{"el":25,"sc":5,"sl":23},{"el":34,"sc":5,"sl":32},{"el":43,"sc":5,"sl":41},{"el":47,"sc":5,"sl":45}],"name":"IpRange","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_25":{"methods":[{"sl":32},{"sl":41},{"sl":45}],"name":"testNull","pass":true,"statements":[{"sl":33},{"sl":42},{"sl":46}]},"test_27":{"methods":[{"sl":32},{"sl":41},{"sl":45}],"name":"testOne","pass":true,"statements":[{"sl":33},{"sl":42},{"sl":46}]},"test_41":{"methods":[{"sl":23},{"sl":45}],"name":"testAll","pass":true,"statements":[{"sl":24},{"sl":46}]},"test_45":{"methods":[{"sl":32},{"sl":41},{"sl":45}],"name":"testEmpty","pass":true,"statements":[{"sl":33},{"sl":42},{"sl":46}]},"test_60":{"methods":[{"sl":32},{"sl":41},{"sl":45}],"name":"testTwo","pass":true,"statements":[{"sl":33},{"sl":42},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [41], [41], [], [], [], [], [], [], [], [60, 25, 27, 45], [60, 25, 27, 45], [], [], [], [], [], [], [], [60, 25, 27, 45], [60, 25, 27, 45], [], [], [41, 60, 25, 27, 45], [41, 60, 25, 27, 45], [], [], []]
