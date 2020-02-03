var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":112,"id":7918,"methods":[{"el":30,"sc":2,"sl":23},{"el":36,"sc":2,"sl":32},{"el":39,"sc":2,"sl":37},{"el":44,"sc":5,"sl":41},{"el":48,"sc":5,"sl":46},{"el":52,"sc":2,"sl":49},{"el":55,"sc":2,"sl":53},{"el":59,"sc":2,"sl":56},{"el":62,"sc":2,"sl":60},{"el":66,"sc":2,"sl":63},{"el":69,"sc":2,"sl":67},{"el":72,"sc":2,"sl":70},{"el":75,"sc":2,"sl":73},{"el":78,"sc":2,"sl":76},{"el":81,"sc":2,"sl":79},{"el":84,"sc":2,"sl":82},{"el":87,"sc":2,"sl":85},{"el":91,"sc":5,"sl":89},{"el":95,"sc":5,"sl":93},{"el":100,"sc":2,"sl":97},{"el":103,"sc":2,"sl":101},{"el":107,"sc":2,"sl":105},{"el":111,"sc":2,"sl":109}],"name":"PersonalUserSettings","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":23},{"sl":32}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_31":{"methods":[{"sl":23},{"sl":32}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_32":{"methods":[{"sl":23},{"sl":32}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_42":{"methods":[{"sl":23},{"sl":32}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_44":{"methods":[{"sl":23},{"sl":32}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_47":{"methods":[{"sl":23},{"sl":32}],"name":"testStar","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_56":{"methods":[{"sl":23},{"sl":32}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_59":{"methods":[{"sl":23},{"sl":32}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_67":{"methods":[{"sl":23},{"sl":32}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_71":{"methods":[{"sl":23},{"sl":32}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_80":{"methods":[{"sl":23},{"sl":32}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]},"test_9":{"methods":[{"sl":23},{"sl":32}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [], [], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [], [], [32, 71, 44, 56, 59, 80, 9, 19, 31, 42, 47, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]