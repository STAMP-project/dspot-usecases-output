var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":777,"methods":[{"el":32,"sc":2,"sl":30},{"el":36,"sc":2,"sl":34},{"el":43,"sc":5,"sl":41},{"el":50,"sc":5,"sl":48}],"name":"NotificationsCollection","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2381":{"methods":[{"sl":30},{"sl":41},{"sl":48}],"name":"test1","pass":true,"statements":[{"sl":42},{"sl":49}]},"test_2670":{"methods":[{"sl":30},{"sl":41},{"sl":48}],"name":"test0","pass":true,"statements":[{"sl":42},{"sl":49}]},"test_287":{"methods":[{"sl":34},{"sl":41}],"name":"test2","pass":true,"statements":[{"sl":35},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2670, 2381], [], [], [], [287], [287], [], [], [], [], [], [2670, 287, 2381], [2670, 287, 2381], [], [], [], [], [], [2670, 2381], [2670, 2381], [], []]
