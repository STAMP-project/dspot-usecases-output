var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":55987,"methods":[{"el":20,"sc":3,"sl":14},{"el":27,"sc":3,"sl":22},{"el":35,"sc":3,"sl":29}],"name":"Skill_ESTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_193":{"methods":[{"sl":14}],"name":"test0","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_478":{"methods":[{"sl":29}],"name":"test2","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34}]},"test_61":{"methods":[{"sl":22}],"name":"test1","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [193], [], [193], [193], [193], [193], [], [], [61], [], [61], [61], [61], [], [], [478], [], [478], [478], [478], [478], [], []]
