var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":6951,"methods":[{"el":24,"sc":5,"sl":22},{"el":29,"sc":5,"sl":26},{"el":34,"sc":5,"sl":31},{"el":39,"sc":5,"sl":36},{"el":47,"sc":5,"sl":41},{"el":51,"sc":5,"sl":49},{"el":55,"sc":5,"sl":53},{"el":59,"sc":5,"sl":57}],"name":"FailureRateTracker","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_31":{"methods":[{"sl":26},{"sl":31},{"sl":36},{"sl":41},{"sl":57}],"name":"testFailureRate","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":32},{"sl":33},{"sl":37},{"sl":38},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":58}]},"test_72":{"methods":[{"sl":26},{"sl":31},{"sl":36},{"sl":41},{"sl":49},{"sl":57}],"name":"testIsHealthy","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":32},{"sl":33},{"sl":37},{"sl":38},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":50},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [31, 72], [31, 72], [31, 72], [], [], [31, 72], [31, 72], [31, 72], [], [], [31, 72], [31, 72], [31, 72], [], [], [31, 72], [31, 72], [31, 72], [31, 72], [], [31, 72], [], [], [72], [72], [], [], [], [], [], [], [31, 72], [31, 72], [], [], []]
