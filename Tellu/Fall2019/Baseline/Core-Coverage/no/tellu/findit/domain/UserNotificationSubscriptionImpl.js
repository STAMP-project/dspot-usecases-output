var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":249,"id":10323,"methods":[{"el":45,"sc":2,"sl":43},{"el":51,"sc":5,"sl":47},{"el":55,"sc":5,"sl":53},{"el":60,"sc":5,"sl":57},{"el":65,"sc":5,"sl":62},{"el":70,"sc":2,"sl":67},{"el":74,"sc":2,"sl":71},{"el":79,"sc":2,"sl":76},{"el":83,"sc":2,"sl":80},{"el":88,"sc":2,"sl":85},{"el":92,"sc":2,"sl":89},{"el":97,"sc":2,"sl":93},{"el":101,"sc":2,"sl":98},{"el":106,"sc":2,"sl":102},{"el":110,"sc":2,"sl":107},{"el":115,"sc":2,"sl":112},{"el":120,"sc":2,"sl":117},{"el":125,"sc":2,"sl":122},{"el":130,"sc":2,"sl":127},{"el":136,"sc":5,"sl":132},{"el":142,"sc":5,"sl":138},{"el":147,"sc":2,"sl":144},{"el":152,"sc":2,"sl":149},{"el":157,"sc":2,"sl":154},{"el":162,"sc":2,"sl":159},{"el":168,"sc":5,"sl":164},{"el":174,"sc":5,"sl":170},{"el":179,"sc":5,"sl":176},{"el":184,"sc":5,"sl":181},{"el":189,"sc":2,"sl":186},{"el":194,"sc":2,"sl":191},{"el":200,"sc":5,"sl":196},{"el":206,"sc":5,"sl":202},{"el":211,"sc":5,"sl":208},{"el":216,"sc":5,"sl":213},{"el":221,"sc":2,"sl":218},{"el":226,"sc":2,"sl":223},{"el":232,"sc":5,"sl":228},{"el":238,"sc":5,"sl":234},{"el":243,"sc":5,"sl":240},{"el":248,"sc":5,"sl":245}],"name":"UserNotificationSubscriptionImpl","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_19":{"methods":[{"sl":43},{"sl":47}],"name":"testMultipleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":50}]},"test_31":{"methods":[{"sl":43},{"sl":47}],"name":"testTransactionTwiceSameThread","pass":true,"statements":[{"sl":50}]},"test_32":{"methods":[{"sl":43},{"sl":47}],"name":"testCatchExceptionAndRollback","pass":true,"statements":[{"sl":50}]},"test_42":{"methods":[{"sl":43},{"sl":47}],"name":"testGetSessionFactory","pass":true,"statements":[{"sl":50}]},"test_44":{"methods":[{"sl":43},{"sl":47}],"name":"testSingleTransactionsMultipleJunitsOfWork","pass":true,"statements":[{"sl":50}]},"test_47":{"methods":[{"sl":43},{"sl":47}],"name":"testStar","pass":true,"statements":[{"sl":50}]},"test_56":{"methods":[{"sl":43},{"sl":47}],"name":"testFindUserByUsername","pass":true,"statements":[{"sl":50}]},"test_59":{"methods":[{"sl":43},{"sl":47}],"name":"testTransactionIsActive","pass":true,"statements":[{"sl":50}]},"test_67":{"methods":[{"sl":43},{"sl":47}],"name":"testDeleteUserAccount","pass":true,"statements":[{"sl":50}]},"test_71":{"methods":[{"sl":43},{"sl":47}],"name":"testCreateUserAccountEmptyProfile","pass":true,"statements":[{"sl":50}]},"test_80":{"methods":[{"sl":43},{"sl":47}],"name":"testCatchRuntimeExceptionAndRollback","pass":true,"statements":[{"sl":50}]},"test_9":{"methods":[{"sl":43},{"sl":47}],"name":"testDeleteUserAccountThatDoesNot","pass":true,"statements":[{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [56, 9, 32, 44, 19, 59, 31, 71, 42, 47, 80, 67], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]