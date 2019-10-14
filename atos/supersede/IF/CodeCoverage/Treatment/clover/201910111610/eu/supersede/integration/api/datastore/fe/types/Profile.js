var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":784,"methods":[{"el":35,"sc":2,"sl":33},{"el":38,"sc":2,"sl":36},{"el":41,"sc":2,"sl":39},{"el":44,"sc":2,"sl":42},{"el":47,"sc":2,"sl":45},{"el":51,"sc":2,"sl":48}],"name":"Profile","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1254":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetProfiles","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_1277":{"methods":[{"sl":45},{"sl":48}],"name":"test3","pass":true,"statements":[{"sl":46},{"sl":50}]},"test_1415":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetUsers","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_1655":{"methods":[{"sl":45}],"name":"test2","pass":true,"statements":[{"sl":46}]},"test_1813":{"methods":[{"sl":39}],"name":"test5","pass":true,"statements":[{"sl":40}]},"test_1818":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetUser","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_1918":{"methods":[{"sl":39}],"name":"test6","pass":true,"statements":[{"sl":40}]},"test_2012":{"methods":[{"sl":39}],"name":"test1","pass":true,"statements":[{"sl":40}]},"test_2666":{"methods":[{"sl":33}],"name":"test0","pass":true,"statements":[{"sl":34}]},"test_2781":{"methods":[{"sl":45},{"sl":48}],"name":"test4","pass":true,"statements":[{"sl":46},{"sl":50}]},"test_285":{"methods":[{"sl":39},{"sl":42}],"name":"test9","pass":true,"statements":[{"sl":40},{"sl":43}]},"test_431":{"methods":[{"sl":33}],"name":"test7","pass":true,"statements":[{"sl":34}]},"test_571":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetProfile","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_705":{"methods":[{"sl":33},{"sl":36}],"name":"test8","pass":true,"statements":[{"sl":34},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [431, 2666, 705], [431, 2666, 705], [], [705, 1254, 1818, 1415, 571], [705, 1254, 1818, 1415, 571], [], [2012, 285, 1813, 1918], [2012, 285, 1813, 1918], [], [285, 1254, 1818, 1415, 571], [285, 1254, 1818, 1415, 571], [], [1277, 1655, 2781], [1277, 1655, 2781], [], [1277, 2781, 1254, 1818, 1415, 571], [], [1277, 2781, 1254, 1818, 1415, 571], [], []]