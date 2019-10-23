Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtime-out=1000 -Damplifiers=MethodDuplicationAmplifier
```

## Note
This took 5 and a halv hours!

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
[INFO] Total time:  3.031 s
[INFO] Finished at: 2019-10-23T13:28:34+02:00
[INFO] ------------------------------------------------------------------------
[INFO] Amplification of no.tellu.lib.data.BooleanOpTest (4 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.BooleanOpTest (4 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage 
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] The original test suite kill 380 / 789
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Run tests. (4)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 4 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 4 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 4 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] Applying Input-amplification and Assertion-amplification test by test.
[INFO] Amplification of testEquals, (1/4)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 6 new tests generated
[INFO] Run tests. (6)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 6 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (18)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 6 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 6 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 6 tests selected to be amplified over 6 available tests
[INFO] Amplification of inputs...
 83% |================================================== ]/
 50% |========================= ]\[INFO] 42 new tests generated
[INFO] Run tests. (42)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 42 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (126)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 42 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 42 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 42 tests selected to be amplified over 42 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 54% |=============================================== ]\[INFO] 336 new tests generated
[WARNING] Too many tests have been generated: 336
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 145 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
 13% |================================================= ]-[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] Amplification of testGreater, (2/4)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 3 new tests generated
[INFO] Run tests. (3)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 3 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (9)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 3 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 3 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 3 tests selected to be amplified over 3 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 33% |================ ]/[INFO] 12 new tests generated
[INFO] Run tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 12 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (36)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 12 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 12 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 12 tests selected to be amplified over 12 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 58% |================================================== ]\[INFO] 60 new tests generated
[INFO] Run tests. (60)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 60 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (180)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 60 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 60 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] Amplification of testLess, (3/4)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 2 new tests generated
[INFO] Run tests. (2)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 2 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (6)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 2 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 2 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 2 tests selected to be amplified over 2 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
[INFO] 6 new tests generated
[INFO] Run tests. (6)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 6 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (18)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 6 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 6 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 6 tests selected to be amplified over 6 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 66% |========================================= ]|[INFO] 24 new tests generated
[INFO] Run tests. (24)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 24 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (72)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 24 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 24 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] Amplification of testNotEquals, (4/4)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 4 new tests generated
[INFO] Run tests. (4)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 4 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 4 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 4 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 4 tests selected to be amplified over 4 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 25% |========================= ]/[INFO] 20 new tests generated
[INFO] Run tests. (20)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 20 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (60)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 20 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 20 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 20 tests selected to be amplified over 20 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 80% |=============================================== ]|[INFO] 120 new tests generated
[INFO] Run tests. (120)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 120 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (360)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 120 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/BooleanOpTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 120 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.BooleanOpTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] elapsedTime 165887
[WARNING] DSpot could not obtain any amplified test method.
[WARNING] You can customize the following options: --amplifiers, --test-criterion, --iteration, --budgetizer etc, and retry with a new configuration.
[INFO] Amplification of no.tellu.lib.data.DataHandleTest (10 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.DataHandleTest (10 test(s))
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Run tests. (10)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_25
[ERROR] Pb(55) Duplicate local variable boolean_22
[ERROR] Pb(55) Duplicate local variable boolean_16
[ERROR] Pb(55) Duplicate local variable boolean_16
[ERROR] Pb(55) Duplicate local variable boolean_17
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 3 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (9)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 4 test fail, generating try/catch/fail blocks...
[INFO] 7 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 7 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testSetValue kills 3 more mutants
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Applying Input-amplification and Assertion-amplification test by test.
[INFO] Amplification of testAddNode, (1/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 8 new tests generated
[INFO] Run tests. (8)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 8 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (24)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 8 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 8 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 8 tests selected to be amplified over 8 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 87% |=========================================== ]\[INFO] 1011 new tests generated
[WARNING] Too many tests have been generated: 1011
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 185 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[WARNING] Some instrumented test failed!
[INFO] Generating assertions...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 76% |================================================ ]|[WARNING] Something bad happened during input amplification.
java.lang.OutOfMemoryError: Java heap space
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:149)
	at spoon.reflect.visitor.CtScanner.visitCtExecutableReference(CtScanner.java:408)
	at spoon.support.visitor.equals.CloneHelper$1.visitCtExecutableReference(CloneHelper.java:135)
	at spoon.support.reflect.reference.CtExecutableReferenceImpl.accept(CtExecutableReferenceImpl.java:86)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:176)
	at spoon.reflect.visitor.CtScanner.visitCtInvocation(CtScanner.java:509)
	at spoon.support.reflect.code.CtInvocationImpl.accept(CtInvocationImpl.java:55)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.support.visitor.equals.CloneHelper.tailor(CloneHelper.java:137)
	at spoon.support.visitor.clone.CloneVisitor.visitCtInvocation(CloneVisitor.java:433)
	at spoon.support.reflect.code.CtInvocationImpl.accept(CtInvocationImpl.java:55)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:49)
	at spoon.support.visitor.equals.CloneHelper.addClone(CloneHelper.java:109)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:73)
	at spoon.support.visitor.clone.CloneVisitor.visitCtInvocation(CloneVisitor.java:431)
	at spoon.support.reflect.code.CtInvocationImpl.accept(CtInvocationImpl.java:55)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:49)
	at spoon.support.visitor.equals.CloneHelper.addClone(CloneHelper.java:109)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:73)
	at spoon.support.visitor.clone.CloneVisitor.visitCtBlock(CloneVisitor.java:163)
	at spoon.support.reflect.code.CtBlockImpl.accept(CtBlockImpl.java:67)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:49)
	at spoon.support.visitor.clone.CloneVisitor.visitCtMethod(CloneVisitor.java:501)
	at spoon.support.reflect.declaration.CtMethodImpl.accept(CtMethodImpl.java:67)
	at spoon.reflect.visitor.CtScanner.scan(CtScanner.java:184)
	at spoon.support.visitor.equals.CloneHelper.clone(CloneHelper.java:49)
	at spoon.support.reflect.declaration.CtElementImpl.clone(CtElementImpl.java:570)
	at spoon.support.reflect.declaration.CtNamedElementImpl.clone(CtNamedElementImpl.java:61)

[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testChangeName, (2/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 16 new tests generated
[INFO] Run tests. (16)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 16 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (48)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 16 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 16 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 16 tests selected to be amplified over 16 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  6% |======================================== ]/[INFO] 3148 new tests generated
[WARNING] Too many tests have been generated: 3148
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 196 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
 73% |================================================ ]-[WARNING] Something bad happened during input amplification.
java.lang.OutOfMemoryError
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at java.util.concurrent.ForkJoinTask.getThrowableException(ForkJoinTask.java:598)
	at java.util.concurrent.ForkJoinTask.reportException(ForkJoinTask.java:677)
	at java.util.concurrent.ForkJoinTask.invoke(ForkJoinTask.java:735)
	at java.util.stream.ReduceOps$ReduceOp.evaluateParallel(ReduceOps.java:714)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:233)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.budget.RandomBudgetizer.inputAmplify(RandomBudgetizer.java:61)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:184)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
Caused by: java.lang.OutOfMemoryError: GC overhead limit exceeded

[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testGetPath, (3/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 11 new tests generated
 98% |================================================= ]|[INFO] Run tests. (11)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 11 test fail, generating try/catch/fail blocks...
[INFO] 11 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 11 test method(s) has been successfully amplified.
 14% |================================================= ]/[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 11 tests selected to be amplified over 11 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
  9% |======================================== ]/[INFO] 143 new tests generated
 94% |=============================================== ]/[INFO] Run tests. (143)
  7% |=============================================== ]\[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 26% |=============================================== ]/Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 143 test fail, generating try/catch/fail blocks...
[WARNING] Something bad happened during assertion amplification
java.lang.OutOfMemoryError: GC overhead limit exceeded

[INFO] iteration 2 / 3
[INFO] 143 tests selected to be amplified over 143 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
  2% |================================================ ]|[INFO] 0 new tests generated
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testGetValue, (4/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 20 new tests generated
  3% |= ]\[INFO] Run tests. (20)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 95% |=============================================== ]-Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 20 test fail, generating try/catch/fail blocks...
[INFO] 20 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 20 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
 22% |=============================================== ]/[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 20 tests selected to be amplified over 20 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 19% |=============================================== ]-[INFO] 461 new tests generated
[WARNING] Too many tests have been generated: 461
[INFO] Number of generated test reduced to 200
 75% |================================================ ]\[INFO] Run tests. (200)
 23% |================================================ ]\[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 155 test fail, generating try/catch/fail blocks...
 19% |================================================ ]\[INFO] 200 new tests with assertions generated
 85% |================================================ ]\[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 76% |================================================ ]|Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
 86% |================================================ ]|[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
 86% |================================================ ]/[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
 33% |================================================ ]-[WARNING] Something bad happened during input amplification.
java.lang.OutOfMemoryError: GC overhead limit exceeded

[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testMergeNodes, (5/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 46% |======================= ]/[INFO] 36 new tests generated
  1% |=========================================== ]\[INFO] Run tests. (36)
 83% |================================================ ]-[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 13% |================================================ ]\[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_271
[ERROR] Pb(55) Duplicate local variable boolean_271
[ERROR] Pb(55) Duplicate local variable boolean_272
[ERROR] Pb(55) Duplicate local variable boolean_277
[ERROR] Pb(55) Duplicate local variable boolean_277
[ERROR] Pb(55) Duplicate local variable boolean_278
[ERROR] Pb(55) Duplicate local variable boolean_283
[ERROR] Pb(55) Duplicate local variable boolean_283
[ERROR] Pb(55) Duplicate local variable boolean_284
[ERROR] Pb(55) Duplicate local variable boolean_289
[ERROR] Pb(55) Duplicate local variable boolean_289
[ERROR] Pb(55) Duplicate local variable boolean_290
[ERROR] Pb(55) Duplicate local variable boolean_295
[ERROR] Pb(55) Duplicate local variable boolean_295
[ERROR] Pb(55) Duplicate local variable boolean_296
[ERROR] Pb(55) Duplicate local variable boolean_301
[ERROR] Pb(55) Duplicate local variable boolean_301
[ERROR] Pb(55) Duplicate local variable boolean_302
[ERROR] Pb(55) Duplicate local variable boolean_307
[ERROR] Pb(55) Duplicate local variable boolean_307
 60% |================================================= ]|[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 56% |================================================= ]|[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[INFO] Could not generate any test with assertions
[INFO] iteration 1 / 3
[INFO] 36 tests selected to be amplified over 36 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  2% |=============================================== ]/[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testNextNode, (6/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 60% |============================== ]/[INFO] 17 new tests generated
 64% |==================================== ]/[INFO] Run tests. (17)
 52% |==================================== ]/[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
 71% |===================================== ]\Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 17 test fail, generating try/catch/fail blocks...
[INFO] 17 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 17 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 17 tests selected to be amplified over 17 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 76% |=============================================== ]/[INFO] 442 new tests generated
[WARNING] Too many tests have been generated: 442
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 158 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 50% |================================================ ]|[INFO] 5393 new tests generated
[WARNING] Too many tests have been generated: 5393
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 197 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testRemoveValue, (7/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 16 new tests generated
[INFO] Run tests. (16)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_487
[ERROR] Pb(55) Duplicate local variable boolean_490
[ERROR] Pb(55) Duplicate local variable boolean_493
[ERROR] Pb(55) Duplicate local variable boolean_496
[ERROR] Pb(55) Duplicate local variable boolean_499
[ERROR] Pb(55) Duplicate local variable boolean_502
[ERROR] Pb(55) Duplicate local variable boolean_505
[ERROR] Pb(55) Duplicate local variable boolean_508
[ERROR] Pb(55) Duplicate local variable boolean_511
[ERROR] Pb(55) Duplicate local variable boolean_514
[ERROR] Pb(55) Duplicate local variable boolean_517
[ERROR] Pb(55) Duplicate local variable boolean_520
[ERROR] Pb(55) Duplicate local variable boolean_523
[ERROR] Pb(55) Duplicate local variable boolean_526
[ERROR] Pb(55) Duplicate local variable boolean_529
[ERROR] Pb(55) Duplicate local variable boolean_532
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[INFO] Could not generate any test with assertions
[INFO] iteration 1 / 3
[INFO] 16 tests selected to be amplified over 16 available tests
[INFO] Amplification of inputs...
 81% |================================================== ]/
 25% |================================================== ]|[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testSetArray, (8/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 34 new tests generated
[INFO] Run tests. (34)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_535
[ERROR] Pb(55) Duplicate local variable boolean_538
[ERROR] Pb(55) Duplicate local variable boolean_541
[ERROR] Pb(55) Duplicate local variable boolean_544
[ERROR] Pb(55) Duplicate local variable boolean_547
[ERROR] Pb(55) Duplicate local variable boolean_550
[ERROR] Pb(55) Duplicate local variable boolean_553
[ERROR] Pb(55) Duplicate local variable boolean_556
[ERROR] Pb(55) Duplicate local variable boolean_559
[ERROR] Pb(55) Duplicate local variable boolean_562
[ERROR] Pb(55) Duplicate local variable boolean_565
[ERROR] Pb(55) Duplicate local variable boolean_568
[ERROR] Pb(55) Duplicate local variable boolean_571
[ERROR] Pb(55) Duplicate local variable boolean_574
[ERROR] Pb(55) Duplicate local variable boolean_577
[ERROR] Pb(55) Duplicate local variable boolean_580
[ERROR] Pb(55) Duplicate local variable boolean_583
[ERROR] Pb(55) Duplicate local variable boolean_586
[ERROR] Pb(55) Duplicate local variable boolean_589
[ERROR] Pb(55) Duplicate local variable boolean_592
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[INFO] Could not generate any test with assertions
[INFO] iteration 1 / 3
[INFO] 34 tests selected to be amplified over 34 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 26% |================================================== ]/[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testSetPath, (9/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 26 new tests generated
[INFO] Run tests. (26)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 26 test fail, generating try/catch/fail blocks...
[INFO] 26 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 26 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 26 tests selected to be amplified over 26 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 53% |================================================ ]-[INFO] 736 new tests generated
[WARNING] Too many tests have been generated: 736
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 181 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 12% |================================================ ]/[INFO] 5928 new tests generated
[WARNING] Too many tests have been generated: 5928
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 193 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testSetValue, (10/10)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 11 new tests generated
[INFO] Run tests. (11)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 11 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (33)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 11 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 11 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 11 tests selected to be amplified over 11 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
[INFO] 2307 new tests generated
[WARNING] Too many tests have been generated: 2307
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 191 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataHandleTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataHandleTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
 14% |================================================ ]/[WARNING] Something bad happened during input amplification.
java.lang.OutOfMemoryError
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at java.util.concurrent.ForkJoinTask.getThrowableException(ForkJoinTask.java:598)
	at java.util.concurrent.ForkJoinTask.reportException(ForkJoinTask.java:677)
	at java.util.concurrent.ForkJoinTask.invoke(ForkJoinTask.java:735)
	at java.util.stream.ReduceOps$ReduceOp.evaluateParallel(ReduceOps.java:714)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:233)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.budget.RandomBudgetizer.inputAmplify(RandomBudgetizer.java:61)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:184)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
Caused by: java.lang.OutOfMemoryError: GC overhead limit exceeded

[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] elapsedTime 17089322
 45% |================================================ ]\[INFO] Amplification of no.tellu.lib.data.DataNodeTest (11 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.DataNodeTest (11 test(s))
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
 94% |================================================ ]/Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
  1% |================================================ ]\[INFO] Run tests. (11)
  7% |================================================ ]-[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_9
[ERROR] Pb(55) Duplicate local variable boolean_11
[ERROR] Pb(55) Duplicate local variable boolean_21
[ERROR] Pb(55) Duplicate local variable boolean_2
 15% |================================================ ]-[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 7 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (21)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
 46% |======================= ]|Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[WARNING] Some instrumented test failed!
[INFO] Generating assertions...
 95% |=============================================== ]-[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] 8 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 8 test method(s) has been successfully amplified.
 82% |=============================================== ]/[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.DataNodeTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testSetValue kills 1 more mutants
[INFO] testModified kills 2 more mutants
[INFO] 2 amplified test methods has been selected to be kept. (global: 2)
[INFO] Applying Input-amplification and Assertion-amplification test by test.
[INFO] Amplification of testCloneNode, (1/11)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 19 new tests generated
 83% |=============================================== ]-[INFO] Run tests. (19)
  7% |=============================================== ]\[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_36
[ERROR] Pb(55) Duplicate local variable boolean_40
[ERROR] Pb(55) Duplicate local variable boolean_44
[ERROR] Pb(55) Duplicate local variable boolean_48
[ERROR] Pb(55) Duplicate local variable boolean_52
[ERROR] Pb(55) Duplicate local variable boolean_56
[ERROR] Pb(55) Duplicate local variable boolean_60
[ERROR] Pb(55) Duplicate local variable boolean_64
[ERROR] Pb(55) Duplicate local variable boolean_68
[ERROR] Pb(55) Duplicate local variable boolean_72
[ERROR] Pb(55) Duplicate local variable boolean_76
[ERROR] Pb(55) Duplicate local variable boolean_80
[ERROR] Pb(55) Duplicate local variable boolean_84
[ERROR] Pb(55) Duplicate local variable boolean_88
[ERROR] Pb(55) Duplicate local variable boolean_92
[ERROR] Pb(55) Duplicate local variable boolean_96
[ERROR] Pb(55) Duplicate local variable boolean_100
[ERROR] Pb(55) Duplicate local variable boolean_104
[ERROR] Pb(55) Duplicate local variable boolean_108
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[INFO] Could not generate any test with assertions
[INFO] iteration 1 / 3
[INFO] 19 tests selected to be amplified over 19 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
  5% |=============================================== ]/[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 2 amplified test methods has been selected to be kept. (global: 2)
[INFO] Amplification of testGetNodes, (2/11)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 19 new tests generated
 41% |==================== ]-[INFO] Run tests. (19)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 19 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (57)
  8% |========================================= ]|[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[WARNING] Something bad happened during assertion amplification
java.lang.RuntimeException: Forked process did not finished correctly
	at eu.stamp_project.testrunner.EntryPoint.runGivenCommandLine(EntryPoint.java:495)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:235)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:230)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:195)
	at eu.stamp_project.utils.execution.TestRunner.run(TestRunner.java:98)
	at eu.stamp_project.utils.execution.TestRunner.runGivenTestMethods(TestRunner.java:66)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:136)
	at eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.Observer.compileRunTests(Observer.java:114)
	at eu.stamp_project.dspot.assertiongenerator.assertiongenerator.methodreconstructor.Observer.getObservations(Observer.java:70)
	at eu.stamp_project.dspot.assertiongenerator.assertiongenerator.MethodReconstructor.addAssertions(MethodReconstructor.java:73)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.addAssertionsOnPassingTests(AssertionGenerator.java:145)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:130)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)

[INFO] iteration 1 / 3
[INFO] 19 tests selected to be amplified over 19 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
  5% |=============================================== ]/[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 2 amplified test methods has been selected to be kept. (global: 2)
[INFO] Amplification of testGetPath, (3/11)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
  0% | ]/[INFO] 17 new tests generated
 84% |========================================== ]|[INFO] Run tests. (17)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_205
[ERROR] Pb(55) Duplicate local variable boolean_207
[ERROR] Pb(55) Duplicate local variable boolean_211
[ERROR] Pb(55) Duplicate local variable boolean_213
[ERROR] Pb(55) Duplicate local variable boolean_217
[ERROR] Pb(55) Duplicate local variable boolean_219
[ERROR] Pb(55) Duplicate local variable boolean_223
[ERROR] Pb(55) Duplicate local variable boolean_225
[ERROR] Pb(55) Duplicate local variable boolean_229
[ERROR] Pb(55) Duplicate local variable boolean_231
[ERROR] Pb(55) Duplicate local variable boolean_235
[ERROR] Pb(55) Duplicate local variable boolean_237
[ERROR] Pb(55) Duplicate local variable boolean_241
[ERROR] Pb(55) Duplicate local variable boolean_243
[ERROR] Pb(55) Duplicate local variable boolean_247
[ERROR] Pb(55) Duplicate local variable boolean_249
[ERROR] Pb(55) Duplicate local variable boolean_253
[ERROR] Pb(55) Duplicate local variable boolean_255
[ERROR] Pb(55) Duplicate local variable boolean_259
[ERROR] Pb(55) Duplicate local variable boolean_261
 41% |========================================== ]\[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:191)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:137)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:286)
	at eu.stamp_project.dspot.DSpot._amplifyTestClass(DSpot.java:278)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot._amplifyTestClasses(DSpot.java:274)
	at eu.stamp_project.dspot.DSpot.amplifyAllTests(DSpot.java:147)
	at eu.stamp_project.Main.run(Main.java:53)
	at eu.stamp_project.DSpotMojo.execute(DSpotMojo.java:361)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:137)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:210)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:156)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:148)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:117)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:81)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:56)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:128)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:305)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:192)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:105)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:956)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:288)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:192)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
[INFO] Could not generate any test with assertions
[INFO] iteration 1 / 3
[INFO] 17 tests selected to be amplified over 17 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
  5% |=============================================== ]/[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 2 amplified test methods has been selected to be kept. (global: 2)
[INFO] Amplification of testGetValue, (4/11)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 30 new tests generated
 10% |========================================== ]|[INFO] Run tests. (30)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 30 test fail, generating try/catch/fail blocks...
[INFO] 30 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
 22% |========================================== ]/Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 30 test method(s) has been successfully amplified.
java.lang.OutOfMemoryError: GC overhead limit exceeded
 85% |========================================== ]-[WARNING] Something bad happened during selection to keep amplified tests (post-amplification).
java.lang.OutOfMemoryError: GC overhead limit exceeded

[INFO] 2 amplified test methods has been selected to be kept. (global: 2)
[INFO] Amplification of testModified, (5/11)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 19% |========= ]-[INFO] 10 new tests generated
 10% |========= ]/[INFO] Run tests. (10)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 10 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (30)
 67% |================================= ]-[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/DataNodeTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[WARNING] Some instrumented test failed!
[INFO] Generating assertions...
 23% |================================= ]-[INFO] 10 new tests with assertions generated
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  05:21 h
[INFO] Finished at: 2019-10-23T18:50:04+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] GC overhead limit exceeded -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/OutOfMemoryError
