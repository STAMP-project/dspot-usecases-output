Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.lib.data.serialize.XmlTest -Dtime-out=1000 -Damplifiers=MethodGeneratorAmplifier
```

## Output

[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< no.tellu.lib:tellulib >------------------------
[INFO] Building Tellu Utilities Library 3.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dspot-maven:2.2.0:amplify-unit-tests (default-cli) @ tellulib ---
[WARNING] You gave JVM args through properties file.
[WARNING] DSpot could not recognize it: 
[WARNING] DSpot will continue because for now, it able to recognize memory options and properties.
[WARNING] However, we advise you to double check them.
[INFO] Path to runner Classes: /home/smorka/.m2/repository/eu/stamp-project/test-runner/2.1.1/test-runner-2.1.1-jar-with-dependencies.jar
[INFO] /home/smorka/.m2/repository/org/jacoco/org.jacoco.core/0.7.9/org.jacoco.core-0.7.9.jar
[INFO] /home/smorka/.m2/repository/org/ow2/asm/asm-debug-all/5.2/asm-debug-all-5.2.jar
[INFO] /home/smorka/.m2/repository/eu/stamp-project/test-runner/2.1.1/test-runner-2.1.1-jar-with-dependencies.jar
[INFO] /home/smorka/.m2/repository/org/pitest/pitest/1.2.0/pitest-1.2.0.jar
[INFO] /home/smorka/.m2/repository/org/pitest/pitest/1.2.0/pitest-1.2.0.jar
[INFO] /home/smorka/.m2/repository/org/pitest/pitest-entry/1.2.0/pitest-entry-1.2.0.jar
[INFO] /home/smorka/.m2/repository/eu/stamp-project/descartes/1.1/descartes-1.1.jar
[INFO] /home/smorka/.m2/repository/eu/stamp-project/test-runner/2.1.1/test-runner-2.1.1-jar-with-dependencies.jar
[INFO] /home/smorka/.m2/repository/eu/stamp-project/test-runner/2.1.1/test-runner-2.1.1-jar-with-dependencies.jar
[INFO] /home/smorka/.m2/repository/eu/stamp-project/test-runner/2.1.1/test-runner-2.1.1-jar-with-dependencies.jar
[INFO] Selected Maven automatic builder.
[INFO] Using /home/smorka/development/tellulib/pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn clean test -DskipTests dependency:build-classpath -Dmdep.outputFile=target/dspot/classpath
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< no.tellu.lib:tellulib >------------------------
[INFO] Building Tellu Utilities Library 3.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ tellulib ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ tellulib ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/smorka/development/tellulib/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ tellulib ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 70 source files to /home/smorka/development/tellulib/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ tellulib ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 4 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ tellulib ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 15 source files to /home/smorka/development/tellulib/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ tellulib ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-dependency-plugin:2.8:build-classpath (default-cli) @ tellulib ---
[INFO] Wrote classpath file '/home/smorka/development/tellulib/target/dspot/classpath'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.217 s
[INFO] Finished at: 2019-10-23T13:17:49+02:00
[INFO] ------------------------------------------------------------------------
[WARNING] You are using an old name: MethodGeneratorAmplifier.
[WARNING] You should use the new name: FastLiteralAmplifier.
[WARNING] The entry TestDataMutator will be deleted very soon.
[INFO] Amplification of no.tellu.lib.data.serialize.XmlTest (1 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.serialize.XmlTest (1 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage 
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] The original test suite kill 380 / 789
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Run tests. (1)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (3)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 1 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 1 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.serialize.XmlTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] Applying Input-amplification and Assertion-amplification test by test.
[INFO] Amplification of testXmlSerializer, (1/1)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 25 new tests generated
[INFO] Run tests. (25)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 23 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (69)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 23 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 23 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.serialize.XmlTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testXmlSerializer_mg2 kills 1 more mutants
[INFO] testXmlSerializer_mg8 kills 2 more mutants
[INFO] 2 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 23 tests selected to be amplified over 23 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 60% |=============================================== ]-[INFO] 683 new tests generated
[WARNING] Too many tests have been generated: 683
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 153 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (531)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 13 test fail, generating try/catch/fail blocks...
[INFO] 129 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 129 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.serialize.XmlTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testXmlSerializer_mg2_mg527 kills 2 more mutants
[INFO] testXmlSerializer_mg2_mg520 kills 1 more mutants
[INFO] 2 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 129 tests selected to be amplified over 129 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 86% |================================================ ]|[INFO] 4437 new tests generated
[WARNING] Too many tests have been generated: 4437
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 151 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (462)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 38 test fail, generating try/catch/fail blocks...
[INFO] 135 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/serialize/XmlTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 135 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.serialize.XmlTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 0 amplified test methods has been selected to be kept. (global: 4)
[INFO] elapsedTime 241083
[INFO] Amplification succeed.
[INFO] Elapsed time 242072 ms
[INFO] 
Test class that has been amplified: no.tellu.lib.data.serialize.XmlTest
The original test suite kills 380 mutants
The amplification results with 4 new tests
it kills 6 more mutants

[INFO] Writing report in target/dspot/output/report.txt
[INFO] DSpot amplified your test suite without errors. (no errors report will be outputted)
[INFO] The amplification ends up with 4 amplified test methods over 1 test classes.
[INFO] Print no.tellu.lib.data.serialize.XmlTest.java with 4 amplified test cases in target/dspot/output
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:10 min
[INFO] Finished at: 2019-10-23T13:21:53+02:00
[INFO] ------------------------------------------------------------------------
