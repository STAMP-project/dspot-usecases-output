Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.lib.data.model.ModelTest -Damplifiers=ReturnValueAmplifier -Dtime-out=1000
```

## Output

[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< no.tellu.lib:tellulib >------------------------
[INFO] Building Tellu Utilities Library 3.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dspot-maven:2.2.0:amplify-unit-tests (default-cli) @ tellulib ---
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.resources/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.resources/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.resources/maven-metadata.xml (624 B at 405 B/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.resources/maven-metadata.xml (624 B at 398 B/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.expressions/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.expressions/maven-metadata.xml
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.expressions/maven-metadata.xml (586 B at 3.0 kB/s)
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.expressions/maven-metadata.xml (586 B at 3.0 kB/s)
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.runtime/maven-metadata.xml
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.runtime/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.runtime/maven-metadata.xml (612 B at 3.4 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.runtime/maven-metadata.xml (612 B at 3.2 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.osgi/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.osgi/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.osgi/maven-metadata.xml (703 B at 3.5 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.osgi/maven-metadata.xml (703 B at 3.3 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.common/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.common/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.common/maven-metadata.xml (622 B at 3.3 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.common/maven-metadata.xml (622 B at 3.3 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.jobs/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.jobs/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.jobs/maven-metadata.xml (710 B at 3.8 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.jobs/maven-metadata.xml (710 B at 3.6 kB/s)
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.registry/maven-metadata.xml
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.registry/maven-metadata.xml
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.registry/maven-metadata.xml (617 B at 3.4 kB/s)
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.registry/maven-metadata.xml (617 B at 3.3 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.preferences/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.preferences/maven-metadata.xml
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.preferences/maven-metadata.xml (587 B at 3.1 kB/s)
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.preferences/maven-metadata.xml (587 B at 2.9 kB/s)
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.contenttype/maven-metadata.xml
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.contenttype/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.contenttype/maven-metadata.xml (584 B at 3.3 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.contenttype/maven-metadata.xml (584 B at 3.2 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.app/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.app/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.equinox.app/maven-metadata.xml (581 B at 3.2 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.equinox.app/maven-metadata.xml (581 B at 3.2 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.filesystem/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.filesystem/maven-metadata.xml
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.filesystem/maven-metadata.xml (583 B at 3.3 kB/s)
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.filesystem/maven-metadata.xml (583 B at 3.3 kB/s)
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.text/maven-metadata.xml
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.text/maven-metadata.xml
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.text/maven-metadata.xml (595 B at 3.3 kB/s)
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.text/maven-metadata.xml (595 B at 3.4 kB/s)
Downloading from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.commands/maven-metadata.xml
Downloading from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.commands/maven-metadata.xml
Downloaded from snapshots: http://artifactory.tellucloud.com/artifactory/libs-snapshot/org/eclipse/platform/org.eclipse.core.commands/maven-metadata.xml (612 B at 3.1 kB/s)
Downloaded from central: http://artifactory.tellucloud.com/artifactory/libs-release/org/eclipse/platform/org.eclipse.core.commands/maven-metadata.xml (612 B at 3.0 kB/s)
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
[INFO] Total time:  2.987 s
[INFO] Finished at: 2019-10-22T10:13:10+02:00
[INFO] ------------------------------------------------------------------------
[INFO] Amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage 
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] The original test suite kill 380 / 789
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Run tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_25
[ERROR] Pb(55) Duplicate local variable boolean_25
[ERROR] Pb(55) Duplicate local variable boolean_26
[ERROR] Pb(55) Duplicate local variable boolean_8
[ERROR] Pb(55) Duplicate local variable boolean_33
[ERROR] Pb(55) Duplicate local variable boolean_0
[ERROR] Pb(55) Duplicate local variable boolean_0
[ERROR] Pb(55) Duplicate local variable boolean_1
[ERROR] Pb(55) Duplicate local variable boolean_4
[ERROR] Pb(55) Duplicate local variable boolean_23
[ERROR] Pb(55) Duplicate local variable boolean_28
[ERROR] Pb(55) Duplicate local variable boolean_28
[ERROR] Pb(55) Duplicate local variable boolean_29
[ERROR] Pb(55) Duplicate local variable boolean_28
[ERROR] Pb(55) Duplicate local variable boolean_29
[ERROR] Pb(55) Duplicate local variable boolean_30
[ERROR] Pb(55) Duplicate local variable boolean_36
[ERROR] Pb(55) Duplicate local variable boolean_36
[ERROR] Pb(55) Duplicate local variable boolean_37
[ERROR] Pb(55) Duplicate local variable boolean_36
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 4 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 4 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 4 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testInitFromModel kills 2 more mutants
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Applying Input-amplification and Assertion-amplification test by test.
[INFO] Amplification of testCopyModel, (1/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 9 new tests generated
[INFO] Run tests. (9)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_43
[ERROR] Pb(55) Duplicate local variable boolean_43
[ERROR] Pb(55) Duplicate local variable boolean_44
[ERROR] Pb(55) Duplicate local variable boolean_47
[ERROR] Pb(55) Duplicate local variable boolean_50
[ERROR] Pb(55) Duplicate local variable boolean_50
[ERROR] Pb(55) Duplicate local variable boolean_51
[ERROR] Pb(55) Duplicate local variable boolean_54
[ERROR] Pb(55) Duplicate local variable boolean_57
[ERROR] Pb(55) Duplicate local variable boolean_57
[ERROR] Pb(55) Duplicate local variable boolean_58
[ERROR] Pb(55) Duplicate local variable boolean_61
[ERROR] Pb(55) Duplicate local variable boolean_64
[ERROR] Pb(55) Duplicate local variable boolean_64
[ERROR] Pb(55) Duplicate local variable boolean_65
[ERROR] Pb(55) Duplicate local variable boolean_68
[ERROR] Pb(55) Duplicate local variable boolean_71
[ERROR] Pb(55) Duplicate local variable boolean_71
[ERROR] Pb(55) Duplicate local variable boolean_72
[ERROR] Pb(55) Duplicate local variable boolean_75
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
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
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:267)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:268)
	at eu.stamp_project.Main.run(Main.java:55)
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
[INFO] 9 tests selected to be amplified over 9 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 88% |================================================== ]|[INFO] 55 new tests generated
[INFO] Run tests. (55)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_106
[ERROR] Pb(55) Duplicate local variable boolean_106
[ERROR] Pb(55) Duplicate local variable boolean_107
[ERROR] Pb(55) Duplicate local variable boolean_110
[ERROR] Pb(55) Duplicate local variable boolean_113
[ERROR] Pb(55) Duplicate local variable boolean_113
[ERROR] Pb(55) Duplicate local variable boolean_114
[ERROR] Pb(55) Duplicate local variable boolean_117
[ERROR] Pb(55) Duplicate local variable boolean_120
[ERROR] Pb(55) Duplicate local variable boolean_120
[ERROR] Pb(55) Duplicate local variable boolean_121
[ERROR] Pb(55) Duplicate local variable boolean_124
[ERROR] Pb(55) Duplicate local variable boolean_127
[ERROR] Pb(55) Duplicate local variable boolean_127
[ERROR] Pb(55) Duplicate local variable boolean_128
[ERROR] Pb(55) Duplicate local variable boolean_131
[ERROR] Pb(55) Duplicate local variable boolean_134
[ERROR] Pb(55) Duplicate local variable boolean_134
[ERROR] Pb(55) Duplicate local variable boolean_135
[ERROR] Pb(55) Duplicate local variable boolean_138
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
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
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:267)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:268)
	at eu.stamp_project.Main.run(Main.java:55)
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
[INFO] iteration 2 / 3
[INFO] 55 tests selected to be amplified over 55 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 74% |================================================ ]/[INFO] 470 new tests generated
[WARNING] Too many tests have been generated: 470
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_491
[ERROR] Pb(55) Duplicate local variable boolean_505
[ERROR] Pb(55) Duplicate local variable boolean_519
[ERROR] Pb(55) Duplicate local variable boolean_533
[ERROR] Pb(55) Duplicate local variable boolean_540
[ERROR] Pb(55) Duplicate local variable boolean_554
[ERROR] Pb(55) Duplicate local variable boolean_561
[ERROR] Pb(55) Duplicate local variable boolean_568
[ERROR] Pb(55) Duplicate local variable boolean_575
[ERROR] Pb(55) Duplicate local variable boolean_582
[ERROR] Pb(55) Duplicate local variable boolean_589
[ERROR] Pb(55) Duplicate local variable boolean_596
[ERROR] Pb(55) Duplicate local variable boolean_603
[ERROR] Pb(55) Duplicate local variable boolean_610
[ERROR] Pb(55) Duplicate local variable boolean_617
[ERROR] Pb(55) Duplicate local variable boolean_624
[ERROR] Pb(55) Duplicate local variable boolean_631
[ERROR] Pb(55) Duplicate local variable boolean_645
[ERROR] Pb(55) Duplicate local variable boolean_666
[ERROR] Pb(55) Duplicate local variable boolean_673
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1352
[ERROR] Pb(55) Duplicate local variable boolean_1352
[ERROR] Pb(55) Duplicate local variable boolean_1353
[ERROR] Pb(55) Duplicate local variable boolean_1356
[ERROR] Pb(55) Duplicate local variable boolean_1359
[ERROR] Pb(55) Duplicate local variable boolean_1359
[ERROR] Pb(55) Duplicate local variable boolean_1360
[ERROR] Pb(55) Duplicate local variable boolean_1363
[ERROR] Pb(55) Duplicate local variable boolean_1373
[ERROR] Pb(55) Duplicate local variable boolean_1373
[ERROR] Pb(55) Duplicate local variable boolean_1374
[ERROR] Pb(55) Duplicate local variable boolean_1377
[ERROR] Pb(55) Duplicate local variable boolean_1380
[ERROR] Pb(55) Duplicate local variable boolean_1380
[ERROR] Pb(55) Duplicate local variable boolean_1381
[ERROR] Pb(55) Duplicate local variable boolean_1384
[ERROR] Pb(55) Duplicate local variable boolean_1394
[ERROR] Pb(55) Duplicate local variable boolean_1394
[ERROR] Pb(55) Duplicate local variable boolean_1395
[ERROR] Pb(55) Duplicate local variable boolean_1398
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testDataTransaction, (2/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromFile, (3/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromMeta, (4/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromModel, (5/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testMergeNodes, (6/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testPath, (7/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testProcessor, (8/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testReset, (9/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testRuleCondition, (10/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 9 new tests generated
[INFO] Run tests. (9)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1891
[ERROR] Pb(55) Duplicate local variable boolean_1891
[ERROR] Pb(55) Duplicate local variable boolean_1892
[ERROR] Pb(55) Duplicate local variable boolean_1891
[ERROR] Pb(55) Duplicate local variable boolean_1892
[ERROR] Pb(55) Duplicate local variable boolean_1893
[ERROR] Pb(55) Duplicate local variable boolean_1895
[ERROR] Pb(55) Duplicate local variable boolean_1895
[ERROR] Pb(55) Duplicate local variable boolean_1896
[ERROR] Pb(55) Duplicate local variable boolean_1895
[ERROR] Pb(55) Duplicate local variable boolean_1896
[ERROR] Pb(55) Duplicate local variable boolean_1897
[ERROR] Pb(55) Duplicate local variable boolean_1899
[ERROR] Pb(55) Duplicate local variable boolean_1899
[ERROR] Pb(55) Duplicate local variable boolean_1900
[ERROR] Pb(55) Duplicate local variable boolean_1899
[ERROR] Pb(55) Duplicate local variable boolean_1900
[ERROR] Pb(55) Duplicate local variable boolean_1901
[ERROR] Pb(55) Duplicate local variable boolean_1903
[ERROR] Pb(55) Duplicate local variable boolean_1903
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
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
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:267)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:268)
	at eu.stamp_project.Main.run(Main.java:55)
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
[INFO] 9 tests selected to be amplified over 9 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 77% |================================================== ]\[INFO] 10 new tests generated
[INFO] Run tests. (10)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1927
[ERROR] Pb(55) Duplicate local variable boolean_1927
[ERROR] Pb(55) Duplicate local variable boolean_1928
[ERROR] Pb(55) Duplicate local variable boolean_1927
[ERROR] Pb(55) Duplicate local variable boolean_1928
[ERROR] Pb(55) Duplicate local variable boolean_1929
[ERROR] Pb(55) Duplicate local variable boolean_1931
[ERROR] Pb(55) Duplicate local variable boolean_1931
[ERROR] Pb(55) Duplicate local variable boolean_1932
[ERROR] Pb(55) Duplicate local variable boolean_1931
[ERROR] Pb(55) Duplicate local variable boolean_1932
[ERROR] Pb(55) Duplicate local variable boolean_1933
[ERROR] Pb(55) Duplicate local variable boolean_1935
[ERROR] Pb(55) Duplicate local variable boolean_1935
[ERROR] Pb(55) Duplicate local variable boolean_1936
[ERROR] Pb(55) Duplicate local variable boolean_1935
[ERROR] Pb(55) Duplicate local variable boolean_1936
[ERROR] Pb(55) Duplicate local variable boolean_1937
[ERROR] Pb(55) Duplicate local variable boolean_1939
[ERROR] Pb(55) Duplicate local variable boolean_1939
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
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
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:267)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:268)
	at eu.stamp_project.Main.run(Main.java:55)
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
[INFO] iteration 2 / 3
[INFO] 10 tests selected to be amplified over 10 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 10% |======================================== ]/[INFO] 49 new tests generated
[INFO] Run tests. (49)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1967
[ERROR] Pb(55) Duplicate local variable boolean_1967
[ERROR] Pb(55) Duplicate local variable boolean_1968
[ERROR] Pb(55) Duplicate local variable boolean_1967
[ERROR] Pb(55) Duplicate local variable boolean_1968
[ERROR] Pb(55) Duplicate local variable boolean_1969
[ERROR] Pb(55) Duplicate local variable boolean_1971
[ERROR] Pb(55) Duplicate local variable boolean_1971
[ERROR] Pb(55) Duplicate local variable boolean_1972
[ERROR] Pb(55) Duplicate local variable boolean_1971
[ERROR] Pb(55) Duplicate local variable boolean_1972
[ERROR] Pb(55) Duplicate local variable boolean_1973
[ERROR] Pb(55) Duplicate local variable boolean_1975
[ERROR] Pb(55) Duplicate local variable boolean_1975
[ERROR] Pb(55) Duplicate local variable boolean_1976
[ERROR] Pb(55) Duplicate local variable boolean_1975
[ERROR] Pb(55) Duplicate local variable boolean_1976
[ERROR] Pb(55) Duplicate local variable boolean_1977
[ERROR] Pb(55) Duplicate local variable boolean_1979
[ERROR] Pb(55) Duplicate local variable boolean_1979
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
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
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:267)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:268)
	at eu.stamp_project.Main.run(Main.java:55)
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
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testRuleTrigger, (11/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 0 new tests generated
[INFO] iteration 1 / 3
[WARNING] No test could be selected to be amplified.
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testSubscribers, (12/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 2 new tests generated
[INFO] Run tests. (2)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 2 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (6)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 2 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 2 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 2 tests selected to be amplified over 2 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 50% |========================= ]/[INFO] 2 new tests generated
[INFO] Run tests. (2)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 2 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (6)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 2 tests selected to be amplified over 2 available tests
[INFO] Amplification of inputs...
 50% |================================================== ]/
[INFO] 0 new tests generated
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] elapsedTime 433591
[INFO] Amplification succeed.
[INFO] Elapsed time 434072 ms
[INFO] 
Test class that has been amplified: no.tellu.lib.data.model.ModelTest
The original test suite kills 380 mutants
The amplification results with 1 new tests
it kills 2 more mutants

[INFO] Writing report in target/dspot/output/report.txt
[INFO] DSpot amplified your test suite without errors. (no errors report will be outputted)
[INFO] The amplification ends up with 1 amplified test methods over 1 test classes.
[INFO] Print no.tellu.lib.data.model.ModelTest.java with 1 amplified test cases in target/dspot/output
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  07:26 min
[INFO] Finished at: 2019-10-22T10:20:26+02:00
[INFO] ------------------------------------------------------------------------
