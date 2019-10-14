var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":1960,"methods":[{"el":24,"sc":5,"sl":23},{"el":31,"sc":5,"sl":26},{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":43,"sc":5,"sl":41},{"el":47,"sc":5,"sl":45},{"el":51,"sc":5,"sl":49},{"el":55,"sc":5,"sl":53},{"el":59,"sc":5,"sl":57},{"el":63,"sc":5,"sl":61},{"el":67,"sc":5,"sl":65},{"el":71,"sc":5,"sl":69}],"name":"MonitorTool","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1161":{"methods":[{"sl":23},{"sl":33},{"sl":37}],"name":"test09","pass":true,"statements":[{"sl":34},{"sl":38}]},"test_1226":{"methods":[{"sl":23}],"name":"test5","pass":true,"statements":[]},"test_1433":{"methods":[{"sl":23},{"sl":33},{"sl":37}],"name":"test08","pass":true,"statements":[{"sl":34},{"sl":38}]},"test_1503":{"methods":[{"sl":26}],"name":"test10","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_1590":{"methods":[{"sl":23}],"name":"test37","pass":true,"statements":[]},"test_1745":{"methods":[{"sl":26}],"name":"test19","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_175":{"methods":[{"sl":23},{"sl":65}],"name":"test02","pass":true,"statements":[{"sl":66}]},"test_1768":{"methods":[{"sl":26},{"sl":49}],"name":"test10","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":50}]},"test_1881":{"methods":[{"sl":26},{"sl":41},{"sl":65}],"name":"test12","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":66}]},"test_189":{"methods":[{"sl":26},{"sl":37}],"name":"test39","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":38}]},"test_201":{"methods":[{"sl":23}],"name":"test48","pass":true,"statements":[]},"test_2024":{"methods":[{"sl":26},{"sl":41},{"sl":49},{"sl":65}],"name":"test11","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":50},{"sl":66}]},"test_2132":{"methods":[{"sl":26}],"name":"test02","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2138":{"methods":[{"sl":23}],"name":"test47","pass":true,"statements":[]},"test_214":{"methods":[{"sl":23},{"sl":41},{"sl":69}],"name":"test03","pass":true,"statements":[{"sl":42},{"sl":70}]},"test_217":{"methods":[{"sl":23}],"name":"test12","pass":true,"statements":[]},"test_2247":{"methods":[{"sl":23},{"sl":57},{"sl":61}],"name":"test14","pass":true,"statements":[{"sl":58},{"sl":62}]},"test_2265":{"methods":[{"sl":23},{"sl":41},{"sl":45}],"name":"test00","pass":true,"statements":[{"sl":42},{"sl":46}]},"test_2505":{"methods":[{"sl":23}],"name":"test24","pass":true,"statements":[]},"test_2594":{"methods":[{"sl":26}],"name":"test27","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2691":{"methods":[{"sl":26}],"name":"test49","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2712":{"methods":[{"sl":23}],"name":"test43","pass":true,"statements":[]},"test_2718":{"methods":[{"sl":23},{"sl":49}],"name":"test01","pass":true,"statements":[{"sl":50}]},"test_2746":{"methods":[{"sl":26}],"name":"test30","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2936":{"methods":[{"sl":23}],"name":"test33","pass":true,"statements":[]},"test_2948":{"methods":[{"sl":26}],"name":"test41","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30}]},"test_2959":{"methods":[{"sl":23}],"name":"test06","pass":true,"statements":[]},"test_344":{"methods":[{"sl":23},{"sl":33}],"name":"test05","pass":true,"statements":[{"sl":34}]},"test_361":{"methods":[{"sl":23}],"name":"test45","pass":true,"statements":[]},"test_429":{"methods":[{"sl":26},{"sl":41},{"sl":65}],"name":"test17","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":66}]},"test_462":{"methods":[{"sl":23},{"sl":41},{"sl":53}],"name":"test04","pass":true,"statements":[{"sl":42},{"sl":54}]},"test_465":{"methods":[{"sl":23}],"name":"test09","pass":true,"statements":[]},"test_506":{"methods":[{"sl":26},{"sl":65}],"name":"test13","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":66}]},"test_565":{"methods":[{"sl":26},{"sl":41},{"sl":57},{"sl":65}],"name":"test16","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":58},{"sl":66}]},"test_568":{"methods":[{"sl":23},{"sl":41}],"name":"test06","pass":true,"statements":[{"sl":42}]},"test_573":{"methods":[{"sl":23}],"name":"test29","pass":true,"statements":[]},"test_722":{"methods":[{"sl":23},{"sl":57}],"name":"test07","pass":true,"statements":[{"sl":58}]},"test_733":{"methods":[{"sl":23},{"sl":37}],"name":"test38","pass":true,"statements":[{"sl":38}]},"test_812":{"methods":[{"sl":26},{"sl":57}],"name":"test15","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":58}]},"test_943":{"methods":[{"sl":23}],"name":"test14","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2505, 568, 1590, 214, 361, 462, 722, 1226, 943, 201, 344, 217, 1433, 2936, 573, 733, 2247, 175, 2138, 2718, 2265, 1161, 2712, 465, 2959], [], [], [1745, 429, 1768, 2948, 2132, 2024, 2691, 2594, 812, 1881, 2746, 1503, 565, 189, 506], [1745, 429, 1768, 2948, 2132, 2024, 2691, 2594, 812, 1881, 2746, 1503, 565, 189, 506], [1745, 429, 1768, 2948, 2132, 2024, 2691, 2594, 812, 1881, 2746, 1503, 565, 189, 506], [1745, 429, 1768, 2948, 2132, 2024, 2691, 2594, 812, 1881, 2746, 1503, 565, 189, 506], [1745, 429, 1768, 2948, 2132, 2024, 2691, 2594, 812, 1881, 2746, 1503, 565, 189, 506], [], [], [344, 1433, 1161], [344, 1433, 1161], [], [], [1433, 733, 1161, 189], [1433, 733, 1161, 189], [], [], [568, 214, 429, 462, 2024, 2265, 1881, 565], [568, 214, 429, 462, 2024, 2265, 1881, 565], [], [], [2265], [2265], [], [], [1768, 2024, 2718], [1768, 2024, 2718], [], [], [462], [462], [], [], [722, 2247, 812, 565], [722, 2247, 812, 565], [], [], [2247], [2247], [], [], [429, 2024, 175, 1881, 565, 506], [429, 2024, 175, 1881, 565, 506], [], [], [214], [214], [], []]