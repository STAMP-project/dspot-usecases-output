var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":178,"id":5152,"methods":[{"el":59,"sc":2,"sl":53},{"el":63,"sc":2,"sl":61},{"el":67,"sc":2,"sl":65},{"el":75,"sc":2,"sl":69},{"el":83,"sc":2,"sl":77},{"el":92,"sc":2,"sl":88},{"el":119,"sc":2,"sl":97},{"el":128,"sc":2,"sl":124},{"el":161,"sc":2,"sl":133},{"el":176,"sc":2,"sl":173}],"name":"TopicSubscriber","sl":15},{"el":171,"id":5212,"methods":[{"el":170,"sc":3,"sl":164}],"name":"TopicSubscriber.TextMessageListener","sl":163}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_68":{"methods":[{"sl":65},{"sl":97}],"name":"testPublishTextMessage","pass":true,"statements":[{"sl":66},{"sl":99},{"sl":100},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":113},{"sl":114}]},"test_75":{"methods":[{"sl":65},{"sl":97}],"name":"testPublishAlertMessage","pass":true,"statements":[{"sl":66},{"sl":99},{"sl":100},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":113},{"sl":114}]},"test_87":{"methods":[{"sl":53},{"sl":65},{"sl":97}],"name":"testPublishAdaptionAlertMessage","pass":true,"statements":[{"sl":55},{"sl":66},{"sl":99},{"sl":100},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":113},{"sl":114}]},"test_88":{"methods":[{"sl":53},{"sl":65},{"sl":97}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":66},{"sl":99},{"sl":100},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":113},{"sl":114}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [87, 88], [], [87, 88], [88], [88], [88], [], [], [], [], [], [], [75, 87, 88, 68], [75, 87, 88, 68], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 87, 88, 68], [], [75, 87, 88, 68], [75, 87, 88, 68], [], [], [], [], [75, 87, 88, 68], [75, 87, 88, 68], [], [75, 87, 88, 68], [], [75, 87, 88, 68], [], [], [75, 87, 88, 68], [75, 87, 88, 68], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]