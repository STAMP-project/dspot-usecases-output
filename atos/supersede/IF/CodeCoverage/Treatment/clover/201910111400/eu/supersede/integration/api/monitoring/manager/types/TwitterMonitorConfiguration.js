var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":4096,"methods":[{"el":19,"sc":2,"sl":17},{"el":22,"sc":2,"sl":20},{"el":27,"sc":2,"sl":23},{"el":30,"sc":2,"sl":28}],"name":"TwitterMonitorConfiguration","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":17},{"sl":20},{"sl":23},{"sl":28}],"name":"testCreateAndDeleteMonitorConfiguration","pass":true,"statements":[{"sl":18},{"sl":21},{"sl":24},{"sl":26},{"sl":29}]},"test_139":{"methods":[{"sl":17},{"sl":20},{"sl":23}],"name":"testCreateUpdateAndDeleteTwitterMonitorConfiguration","pass":true,"statements":[{"sl":18},{"sl":21},{"sl":24},{"sl":25}]},"test_32":{"methods":[{"sl":17},{"sl":20},{"sl":23},{"sl":28}],"name":"testUpdateMonitorConfiguration","pass":true,"statements":[{"sl":18},{"sl":21},{"sl":24},{"sl":26},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [32, 114, 139], [32, 114, 139], [], [32, 114, 139], [32, 114, 139], [], [32, 114, 139], [32, 114, 139], [139], [32, 114], [], [32, 114], [32, 114], [], [], []]