var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":3709,"methods":[{"el":16,"sc":2,"sl":14},{"el":19,"sc":2,"sl":17},{"el":22,"sc":2,"sl":20},{"el":25,"sc":2,"sl":23},{"el":28,"sc":2,"sl":26},{"el":31,"sc":2,"sl":29},{"el":34,"sc":2,"sl":32},{"el":37,"sc":2,"sl":35}],"name":"Condition","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1583":{"methods":[{"sl":26}],"name":"test00","pass":true,"statements":[{"sl":27}]},"test_1735":{"methods":[{"sl":26},{"sl":29}],"name":"test10","pass":true,"statements":[{"sl":27},{"sl":30}]},"test_2024":{"methods":[{"sl":26},{"sl":29}],"name":"test11","pass":true,"statements":[{"sl":27},{"sl":30}]},"test_2049":{"methods":[{"sl":32}],"name":"test04","pass":true,"statements":[{"sl":33}]},"test_2189":{"methods":[{"sl":14},{"sl":17}],"name":"test08","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_228":{"methods":[{"sl":20},{"sl":23}],"name":"test06","pass":true,"statements":[{"sl":21},{"sl":24}]},"test_269":{"methods":[{"sl":14}],"name":"test02","pass":true,"statements":[{"sl":15}]},"test_56":{"methods":[{"sl":32},{"sl":35}],"name":"test07","pass":true,"statements":[{"sl":33},{"sl":36}]},"test_578":{"methods":[{"sl":20}],"name":"test03","pass":true,"statements":[{"sl":21}]},"test_761":{"methods":[{"sl":14},{"sl":17}],"name":"test09","pass":true,"statements":[{"sl":15},{"sl":18}]},"test_825":{"methods":[{"sl":32},{"sl":35}],"name":"test01","pass":true,"statements":[{"sl":33},{"sl":36}]},"test_995":{"methods":[{"sl":20},{"sl":23}],"name":"test05","pass":true,"statements":[{"sl":21},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [761, 2189, 269], [761, 2189, 269], [], [761, 2189], [761, 2189], [], [995, 228, 578], [995, 228, 578], [], [995, 228], [995, 228], [], [2024, 1583, 1735], [2024, 1583, 1735], [], [2024, 1735], [2024, 1735], [], [825, 2049, 56], [825, 2049, 56], [], [825, 56], [825, 56], [], []]