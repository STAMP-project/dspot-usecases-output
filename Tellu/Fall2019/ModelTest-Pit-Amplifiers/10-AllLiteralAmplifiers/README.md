Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.lib.data.model.ModelTest -Damplifiers=AllLiteralAmplifiers -Dtime-out=1000
```

## Note
Please enjoy. This took forever!

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
[INFO] Total time:  2.989 s
[INFO] Finished at: 2019-10-22T10:30:22+02:00
[INFO] ------------------------------------------------------------------------
[INFO] Amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage 
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] The original test suite kill 379 / 789
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
[INFO] 138 new tests generated
[INFO] Run tests. (138)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_43
[ERROR] Pb(55) Duplicate local variable boolean_50
[ERROR] Pb(55) Duplicate local variable boolean_57
[ERROR] Pb(55) Duplicate local variable boolean_64
[ERROR] Pb(55) Duplicate local variable boolean_71
[ERROR] Pb(55) Duplicate local variable boolean_78
[ERROR] Pb(55) Duplicate local variable boolean_85
[ERROR] Pb(55) Duplicate local variable boolean_92
[ERROR] Pb(55) Duplicate local variable boolean_99
[ERROR] Pb(55) Duplicate local variable boolean_106
[ERROR] Pb(55) Duplicate local variable boolean_113
[ERROR] Pb(55) Duplicate local variable boolean_120
[ERROR] Pb(55) Duplicate local variable boolean_127
[ERROR] Pb(55) Duplicate local variable boolean_134
[ERROR] Pb(55) Duplicate local variable boolean_141
[ERROR] Pb(55) Duplicate local variable boolean_148
[ERROR] Pb(55) Duplicate local variable boolean_155
[ERROR] Pb(55) Duplicate local variable boolean_162
[ERROR] Pb(55) Duplicate local variable boolean_169
[ERROR] Pb(55) Duplicate local variable boolean_176
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_743
[ERROR] Pb(55) Duplicate local variable boolean_743
[ERROR] Pb(55) Duplicate local variable boolean_744
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, null, String)
[ERROR] Pb(55) Duplicate local variable boolean_747
[ERROR] Pb(55) Duplicate local variable boolean_750
[ERROR] Pb(55) Duplicate local variable boolean_750
[ERROR] Pb(55) Duplicate local variable boolean_751
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, null, String)
[ERROR] Pb(55) Duplicate local variable boolean_754
[ERROR] Pb(55) Duplicate local variable boolean_757
[ERROR] Pb(55) Duplicate local variable boolean_757
[ERROR] Pb(55) Duplicate local variable boolean_758
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, null, String)
[ERROR] Pb(55) Duplicate local variable boolean_761
[ERROR] Pb(55) Duplicate local variable boolean_764
[ERROR] Pb(55) Duplicate local variable boolean_764
[ERROR] Pb(55) Duplicate local variable boolean_765
[ERROR] Pb(55) Duplicate local variable boolean_768
[ERROR] Pb(55) Duplicate local variable boolean_771
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
[INFO] 138 tests selected to be amplified over 138 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 62% |================================================ ]-[INFO] 11310 new tests generated
[WARNING] Too many tests have been generated: 11310
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1009
[ERROR] Pb(55) Duplicate local variable boolean_1016
[ERROR] Pb(55) Duplicate local variable boolean_1023
[ERROR] Pb(55) Duplicate local variable boolean_1037
[ERROR] Pb(55) Duplicate local variable boolean_1044
[ERROR] Pb(55) Duplicate local variable boolean_1051
[ERROR] Pb(55) Duplicate local variable boolean_1058
[ERROR] Pb(55) Duplicate local variable boolean_1065
[ERROR] Pb(55) Duplicate local variable boolean_1072
[ERROR] Pb(55) Duplicate local variable boolean_1079
[ERROR] Pb(55) Duplicate local variable boolean_1086
[ERROR] Pb(55) Duplicate local variable boolean_1093
[ERROR] Pb(55) Duplicate local variable boolean_1100
[ERROR] Pb(55) Duplicate local variable boolean_1107
[ERROR] Pb(55) Duplicate local variable boolean_1114
[ERROR] Pb(55) Duplicate local variable boolean_1121
[ERROR] Pb(55) Duplicate local variable boolean_1128
[ERROR] Pb(55) Duplicate local variable boolean_1135
[ERROR] Pb(55) Duplicate local variable boolean_1142
[ERROR] Pb(55) Duplicate local variable boolean_1149
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1723
[ERROR] Pb(55) Duplicate local variable boolean_1723
[ERROR] Pb(55) Duplicate local variable boolean_1724
[ERROR] Pb(55) Duplicate local variable boolean_1730
[ERROR] Pb(55) Duplicate local variable boolean_1737
[ERROR] Pb(55) Duplicate local variable boolean_1744
[ERROR] Pb(55) Duplicate local variable boolean_1751
[ERROR] Pb(55) Duplicate local variable boolean_1758
[ERROR] Pb(55) Duplicate local variable boolean_1765
[ERROR] Pb(55) Duplicate local variable boolean_1772
[ERROR] Pb(55) Duplicate local variable boolean_1779
[ERROR] Pb(55) Duplicate local variable boolean_1786
[ERROR] Pb(55) Duplicate local variable boolean_1793
[ERROR] Pb(55) Duplicate local variable boolean_1800
[ERROR] Pb(55) Duplicate local variable boolean_1807
[ERROR] Pb(55) Duplicate local variable boolean_1814
[ERROR] Pb(55) Duplicate local variable boolean_1821
[ERROR] Pb(55) Duplicate local variable boolean_1828
[ERROR] Pb(55) Duplicate local variable boolean_1835
[ERROR] Pb(55) Duplicate local variable boolean_1842
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 40% |================================================ ]/[INFO] 12038 new tests generated
[WARNING] Too many tests have been generated: 12038
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_2409
[ERROR] Pb(55) Duplicate local variable boolean_2416
[ERROR] Pb(55) Duplicate local variable boolean_2423
[ERROR] Pb(55) Duplicate local variable boolean_2430
[ERROR] Pb(55) Duplicate local variable boolean_2437
[ERROR] Pb(55) Duplicate local variable boolean_2444
[ERROR] Pb(55) Duplicate local variable boolean_2451
[ERROR] Pb(55) Duplicate local variable boolean_2458
[ERROR] Pb(55) Duplicate local variable boolean_2465
[ERROR] Pb(55) Duplicate local variable boolean_2472
[ERROR] Pb(55) Duplicate local variable boolean_2479
[ERROR] Pb(55) Duplicate local variable boolean_2486
[ERROR] Pb(55) Duplicate local variable boolean_2493
[ERROR] Pb(55) Duplicate local variable boolean_2500
[ERROR] Pb(55) Duplicate local variable boolean_2507
[ERROR] Pb(55) Duplicate local variable boolean_2514
[ERROR] Pb(55) Duplicate local variable boolean_2521
[ERROR] Pb(55) Duplicate local variable boolean_2535
[ERROR] Pb(55) Duplicate local variable boolean_2542
[ERROR] Pb(55) Duplicate local variable boolean_2549
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3123
[ERROR] Pb(55) Duplicate local variable boolean_3123
[ERROR] Pb(55) Duplicate local variable boolean_3124
[ERROR] Pb(55) Duplicate local variable boolean_3130
[ERROR] Pb(55) Duplicate local variable boolean_3137
[ERROR] Pb(55) Duplicate local variable boolean_3144
[ERROR] Pb(55) Duplicate local variable boolean_3151
[ERROR] Pb(55) Duplicate local variable boolean_3158
[ERROR] Pb(55) Duplicate local variable boolean_3165
[ERROR] Pb(55) Duplicate local variable boolean_3172
[ERROR] Pb(55) Duplicate local variable boolean_3179
[ERROR] Pb(55) Duplicate local variable boolean_3186
[ERROR] Pb(55) Duplicate local variable boolean_3193
[ERROR] Pb(55) Duplicate local variable boolean_3200
[ERROR] Pb(55) Duplicate local variable boolean_3207
[ERROR] Pb(55) Duplicate local variable boolean_3214
[ERROR] Pb(55) Duplicate local variable boolean_3221
[ERROR] Pb(55) Duplicate local variable boolean_3228
[ERROR] Pb(55) Duplicate local variable boolean_3235
[ERROR] Pb(55) Duplicate local variable boolean_3242
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
[INFO] 138 new tests generated
[INFO] Run tests. (138)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3810
[ERROR] Pb(55) Duplicate local variable boolean_3814
[ERROR] Pb(55) Duplicate local variable boolean_3818
[ERROR] Pb(55) Duplicate local variable boolean_3822
[ERROR] Pb(55) Duplicate local variable boolean_3826
[ERROR] Pb(55) Duplicate local variable boolean_3830
[ERROR] Pb(55) Duplicate local variable boolean_3834
[ERROR] Pb(55) Duplicate local variable boolean_3838
[ERROR] Pb(55) Duplicate local variable boolean_3842
[ERROR] Pb(55) Duplicate local variable boolean_3846
[ERROR] Pb(55) Duplicate local variable boolean_3850
[ERROR] Pb(55) Duplicate local variable boolean_3854
[ERROR] Pb(55) Duplicate local variable boolean_3858
[ERROR] Pb(55) Duplicate local variable boolean_3862
[ERROR] Pb(55) Duplicate local variable boolean_3866
[ERROR] Pb(55) Duplicate local variable boolean_3870
[ERROR] Pb(55) Duplicate local variable boolean_3874
[ERROR] Pb(55) Duplicate local variable boolean_3878
[ERROR] Pb(55) Duplicate local variable boolean_3882
[ERROR] Pb(55) Duplicate local variable boolean_3886
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4346
[ERROR] Pb(55) Duplicate local variable boolean_4350
[ERROR] Pb(55) Duplicate local variable boolean_4354
[ERROR] Pb(55) Duplicate local variable boolean_4358
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 34 test fail, generating try/catch/fail blocks...
[INFO] 34 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 34 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 34 tests selected to be amplified over 34 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 11% |=============================================== ]|[INFO] 4973 new tests generated
[WARNING] Too many tests have been generated: 4973
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 196 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
  3% |================================================= ]-[INFO] 23155 new tests generated
[WARNING] Too many tests have been generated: 23155
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 199 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromFile, (3/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 60 new tests generated
[INFO] Run tests. (60)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 31 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]\
[INFO] Run instrumented tests. (93)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 29 test fail, generating try/catch/fail blocks...
[INFO] 60 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 60 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 60 tests selected to be amplified over 60 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  5% |================================================ ]\[INFO] 3202 new tests generated
[WARNING] Too many tests have been generated: 3202
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 63 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (192)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 131 test fail, generating try/catch/fail blocks...
[INFO] 136 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 136 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 136 tests selected to be amplified over 136 available tests
[INFO] Amplification of inputs...
  0% |================================================= ]/[INFO] 6712 new tests generated
[WARNING] Too many tests have been generated: 6712
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 197 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromMeta, (4/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 50 new tests generated
[INFO] Run tests. (50)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 29 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (87)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 21 test fail, generating try/catch/fail blocks...
[INFO] 50 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 50 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 50 tests selected to be amplified over 50 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 86% |================================================ ]\[INFO] 2500 new tests generated
[WARNING] Too many tests have been generated: 2500
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 85 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (270)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 105 test fail, generating try/catch/fail blocks...
[INFO] 110 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 110 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 110 tests selected to be amplified over 110 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
  2% |================================================ ]\[INFO] 4832 new tests generated
[WARNING] Too many tests have been generated: 4832
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 197 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromModel, (5/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 68 new tests generated
[INFO] Run tests. (68)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 36 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (108)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 32 test fail, generating try/catch/fail blocks...
[INFO] 68 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 68 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 68 tests selected to be amplified over 68 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 11% |=============================================== ]|[INFO] 3946 new tests generated
[WARNING] Too many tests have been generated: 3946
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 78 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (243)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 118 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 87% |================================================ ]\[INFO] 9237 new tests generated
[WARNING] Too many tests have been generated: 9237
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 57 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (171)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 143 test fail, generating try/catch/fail blocks...
[INFO] 200 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 200 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testMergeNodes, (6/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 68 new tests generated
[INFO] Run tests. (68)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5073
[ERROR] Pb(55) Duplicate local variable boolean_5075
[ERROR] Pb(55) Duplicate local variable boolean_5077
[ERROR] Pb(55) Duplicate local variable boolean_5079
[ERROR] Pb(55) Duplicate local variable boolean_5081
[ERROR] Pb(55) Duplicate local variable boolean_5083
[ERROR] Pb(55) Duplicate local variable boolean_5085
[ERROR] Pb(55) Duplicate local variable boolean_5087
[ERROR] Pb(55) Duplicate local variable boolean_5089
[ERROR] Pb(55) Duplicate local variable boolean_5091
[ERROR] Pb(55) Duplicate local variable boolean_5093
[ERROR] Pb(55) Duplicate local variable boolean_5095
[ERROR] Pb(55) Duplicate local variable boolean_5097
[ERROR] Pb(55) Duplicate local variable boolean_5099
[ERROR] Pb(55) Duplicate local variable boolean_5101
[ERROR] Pb(55) Duplicate local variable boolean_5103
[ERROR] Pb(55) Duplicate local variable boolean_5105
[ERROR] Pb(55) Duplicate local variable boolean_5107
[ERROR] Pb(55) Duplicate local variable boolean_5109
[ERROR] Pb(55) Duplicate local variable boolean_5111
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
[INFO] 68 tests selected to be amplified over 68 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  2% |=============================================== ]-[INFO] 2159 new tests generated
[WARNING] Too many tests have been generated: 2159
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5211
[ERROR] Pb(55) Duplicate local variable boolean_5213
[ERROR] Pb(55) Duplicate local variable boolean_5215
[ERROR] Pb(55) Duplicate local variable boolean_5217
[ERROR] Pb(55) Duplicate local variable boolean_5219
[ERROR] Pb(55) Duplicate local variable boolean_5221
[ERROR] Pb(55) Duplicate local variable boolean_5223
[ERROR] Pb(55) Duplicate local variable boolean_5225
[ERROR] Pb(55) Duplicate local variable boolean_5227
[ERROR] Pb(55) Duplicate local variable boolean_5229
[ERROR] Pb(55) Duplicate local variable boolean_5231
[ERROR] Pb(55) Duplicate local variable boolean_5235
[ERROR] Pb(55) Duplicate local variable boolean_5237
[ERROR] Pb(55) Duplicate local variable boolean_5241
[ERROR] Pb(55) Duplicate local variable boolean_5243
[ERROR] Pb(55) Duplicate local variable boolean_5245
[ERROR] Pb(55) Duplicate local variable boolean_5247
[ERROR] Pb(55) Duplicate local variable boolean_5249
[ERROR] Pb(55) Duplicate local variable boolean_5251
[ERROR] Pb(55) Duplicate local variable boolean_5253
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5419
[ERROR] Pb(55) Duplicate local variable boolean_5421
[ERROR] Pb(55) Duplicate local variable boolean_5423
[ERROR] Pb(55) Duplicate local variable boolean_5425
[ERROR] Pb(55) Duplicate local variable boolean_5427
[ERROR] Pb(55) Duplicate local variable boolean_5429
[ERROR] Pb(55) Duplicate local variable boolean_5431
[ERROR] Pb(55) Duplicate local variable boolean_5433
[ERROR] Pb(55) Duplicate local variable boolean_5435
[ERROR] Pb(55) Duplicate local variable boolean_5437
[ERROR] Pb(55) Duplicate local variable boolean_5439
[ERROR] Pb(55) Duplicate local variable boolean_5441
[ERROR] Pb(55) Duplicate local variable boolean_5443
[ERROR] Pb(55) Duplicate local variable boolean_5445
[ERROR] Pb(55) Duplicate local variable boolean_5447
[ERROR] Pb(55) Duplicate local variable boolean_5449
[ERROR] Pb(55) Duplicate local variable boolean_5451
[ERROR] Pb(55) Duplicate local variable boolean_5453
[ERROR] Pb(55) Duplicate local variable boolean_5455
[ERROR] Pb(55) Duplicate local variable boolean_5457
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 87% |================================================ ]\[INFO] 4092 new tests generated
[WARNING] Too many tests have been generated: 4092
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5609
[ERROR] Pb(55) Duplicate local variable boolean_5611
[ERROR] Pb(55) Duplicate local variable boolean_5613
[ERROR] Pb(55) Duplicate local variable boolean_5615
[ERROR] Pb(55) Duplicate local variable boolean_5617
[ERROR] Pb(55) Duplicate local variable boolean_5619
[ERROR] Pb(55) Duplicate local variable boolean_5621
[ERROR] Pb(55) Duplicate local variable boolean_5623
[ERROR] Pb(55) Duplicate local variable boolean_5625
[ERROR] Pb(55) Duplicate local variable boolean_5627
[ERROR] Pb(55) Duplicate local variable boolean_5629
[ERROR] Pb(55) Duplicate local variable boolean_5631
[ERROR] Pb(55) Duplicate local variable boolean_5633
[ERROR] Pb(55) Duplicate local variable boolean_5635
[ERROR] Pb(55) Duplicate local variable boolean_5637
[ERROR] Pb(55) Duplicate local variable boolean_5639
[ERROR] Pb(55) Duplicate local variable boolean_5641
[ERROR] Pb(55) Duplicate local variable boolean_5643
[ERROR] Pb(55) Duplicate local variable boolean_5645
[ERROR] Pb(55) Duplicate local variable boolean_5647
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5815
[ERROR] Pb(55) Duplicate local variable boolean_5817
[ERROR] Pb(55) Duplicate local variable boolean_5819
[ERROR] Pb(55) Duplicate local variable boolean_5821
[ERROR] Pb(55) Duplicate local variable boolean_5823
[ERROR] Pb(55) Duplicate local variable boolean_5825
[ERROR] Pb(55) Duplicate local variable boolean_5827
[ERROR] Pb(55) Duplicate local variable boolean_5829
[ERROR] Pb(55) Duplicate local variable boolean_5831
[ERROR] Pb(55) Duplicate local variable boolean_5833
[ERROR] Pb(55) Duplicate local variable boolean_5835
[ERROR] Pb(55) Duplicate local variable boolean_5837
[ERROR] Pb(55) Duplicate local variable boolean_5839
[ERROR] Pb(55) Duplicate local variable boolean_5841
[ERROR] Pb(55) Duplicate local variable boolean_5843
[ERROR] Pb(55) Duplicate local variable boolean_5845
[ERROR] Pb(55) Duplicate local variable boolean_5847
[ERROR] Pb(55) Duplicate local variable boolean_5849
[ERROR] Pb(55) Duplicate local variable boolean_5851
[ERROR] Pb(55) Duplicate local variable boolean_5853
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testPath, (7/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 37 new tests generated
[INFO] Run tests. (37)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6009
[ERROR] Pb(55) Duplicate local variable boolean_6009
[ERROR] Pb(55) Duplicate local variable boolean_6010
[ERROR] Pb(55) Duplicate local variable boolean_6012
[ERROR] Pb(55) Duplicate local variable boolean_6012
[ERROR] Pb(55) Duplicate local variable boolean_6013
[ERROR] Pb(55) Duplicate local variable boolean_6015
[ERROR] Pb(55) Duplicate local variable boolean_6015
[ERROR] Pb(55) Duplicate local variable boolean_6016
[ERROR] Pb(55) Duplicate local variable boolean_6018
[ERROR] Pb(55) Duplicate local variable boolean_6018
[ERROR] Pb(55) Duplicate local variable boolean_6019
[ERROR] Pb(55) Duplicate local variable boolean_6021
[ERROR] Pb(55) Duplicate local variable boolean_6021
[ERROR] Pb(55) Duplicate local variable boolean_6022
[ERROR] Pb(55) Duplicate local variable boolean_6024
[ERROR] Pb(55) Duplicate local variable boolean_6024
[ERROR] Pb(55) Duplicate local variable boolean_6025
[ERROR] Pb(55) Duplicate local variable boolean_6027
[ERROR] Pb(55) Duplicate local variable boolean_6027
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
[INFO] 37 tests selected to be amplified over 37 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 75% |=============================================== ]|[INFO] 538 new tests generated
[WARNING] Too many tests have been generated: 538
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6120
[ERROR] Pb(55) Duplicate local variable boolean_6123
[ERROR] Pb(55) Duplicate local variable boolean_6129
[ERROR] Pb(55) Duplicate local variable boolean_6135
[ERROR] Pb(55) Duplicate local variable boolean_6138
[ERROR] Pb(55) Duplicate local variable boolean_6141
[ERROR] Pb(55) Duplicate local variable boolean_6147
[ERROR] Pb(55) Duplicate local variable boolean_6150
[ERROR] Pb(55) Duplicate local variable boolean_6153
[ERROR] Pb(55) Duplicate local variable boolean_6159
[ERROR] Pb(55) Duplicate local variable boolean_6162
[ERROR] Pb(55) Duplicate local variable boolean_6165
[ERROR] Pb(55) Duplicate local variable boolean_6168
[ERROR] Pb(55) Duplicate local variable boolean_6177
[ERROR] Pb(55) Duplicate local variable boolean_6180
[ERROR] Pb(55) Duplicate local variable boolean_6183
[ERROR] Pb(55) Duplicate local variable boolean_6186
[ERROR] Pb(55) Duplicate local variable boolean_6189
[ERROR] Pb(55) Duplicate local variable boolean_6192
[ERROR] Pb(55) Duplicate local variable boolean_6195
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6510
[ERROR] Pb(55) Duplicate local variable boolean_6510
[ERROR] Pb(55) Duplicate local variable boolean_6511
[ERROR] Pb(55) Duplicate local variable boolean_6513
[ERROR] Pb(55) Duplicate local variable boolean_6513
[ERROR] Pb(55) Duplicate local variable boolean_6514
[ERROR] Pb(55) Duplicate local variable boolean_6516
[ERROR] Pb(55) Duplicate local variable boolean_6516
[ERROR] Pb(55) Duplicate local variable boolean_6517
[ERROR] Pb(55) Duplicate local variable boolean_6519
[ERROR] Pb(55) Duplicate local variable boolean_6519
[ERROR] Pb(55) Duplicate local variable boolean_6520
[ERROR] Pb(55) Duplicate local variable boolean_6522
[ERROR] Pb(55) Duplicate local variable boolean_6522
[ERROR] Pb(55) Duplicate local variable boolean_6523
[ERROR] Pb(55) Duplicate local variable boolean_6525
[ERROR] Pb(55) Duplicate local variable boolean_6525
[ERROR] Pb(55) Duplicate local variable boolean_6526
[ERROR] Pb(55) Duplicate local variable boolean_6531
[ERROR] Pb(55) Duplicate local variable boolean_6531
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 50% |================================================ ]|[INFO] 1557 new tests generated
[WARNING] Too many tests have been generated: 1557
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6720
[ERROR] Pb(55) Duplicate local variable boolean_6723
[ERROR] Pb(55) Duplicate local variable boolean_6726
[ERROR] Pb(55) Duplicate local variable boolean_6729
[ERROR] Pb(55) Duplicate local variable boolean_6732
[ERROR] Pb(55) Duplicate local variable boolean_6735
[ERROR] Pb(55) Duplicate local variable boolean_6738
[ERROR] Pb(55) Duplicate local variable boolean_6741
[ERROR] Pb(55) Duplicate local variable boolean_6744
[ERROR] Pb(55) Duplicate local variable boolean_6747
[ERROR] Pb(55) Duplicate local variable boolean_6750
[ERROR] Pb(55) Duplicate local variable boolean_6753
[ERROR] Pb(55) Duplicate local variable boolean_6756
[ERROR] Pb(55) Duplicate local variable boolean_6759
[ERROR] Pb(55) Duplicate local variable boolean_6762
[ERROR] Pb(55) Duplicate local variable boolean_6765
[ERROR] Pb(55) Duplicate local variable boolean_6768
[ERROR] Pb(55) Duplicate local variable boolean_6771
[ERROR] Pb(55) Duplicate local variable boolean_6774
[ERROR] Pb(55) Duplicate local variable boolean_6777
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7047
[ERROR] Pb(55) Duplicate local variable boolean_7047
[ERROR] Pb(55) Duplicate local variable boolean_7048
[ERROR] Pb(55) Duplicate local variable boolean_7050
[ERROR] Pb(55) Duplicate local variable boolean_7050
[ERROR] Pb(55) Duplicate local variable boolean_7051
[ERROR] Pb(55) Duplicate local variable boolean_7053
[ERROR] Pb(55) Duplicate local variable boolean_7053
[ERROR] Pb(55) Duplicate local variable boolean_7054
[ERROR] Pb(55) Duplicate local variable boolean_7056
[ERROR] Pb(55) Duplicate local variable boolean_7056
[ERROR] Pb(55) Duplicate local variable boolean_7057
[ERROR] Pb(55) Duplicate local variable boolean_7062
[ERROR] Pb(55) Duplicate local variable boolean_7062
[ERROR] Pb(55) Duplicate local variable boolean_7063
[ERROR] Pb(55) Duplicate local variable boolean_7068
[ERROR] Pb(55) Duplicate local variable boolean_7068
[ERROR] Pb(55) Duplicate local variable boolean_7069
[ERROR] Pb(55) Duplicate local variable boolean_7071
[ERROR] Pb(55) Duplicate local variable boolean_7071
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testProcessor, (8/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 110 new tests generated
[INFO] Run tests. (110)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7320
[ERROR] Pb(55) Duplicate local variable boolean_7324
[ERROR] Pb(55) Duplicate local variable boolean_7328
[ERROR] Pb(55) Duplicate local variable boolean_7332
[ERROR] Pb(55) Duplicate local variable boolean_7336
[ERROR] Pb(55) Duplicate local variable boolean_7340
[ERROR] Pb(55) Duplicate local variable boolean_7344
[ERROR] Pb(55) Duplicate local variable boolean_7348
[ERROR] Pb(55) Duplicate local variable boolean_7352
[ERROR] Pb(55) Duplicate local variable boolean_7356
[ERROR] Pb(55) Duplicate local variable boolean_7360
[ERROR] Pb(55) Duplicate local variable boolean_7364
[ERROR] Pb(55) Duplicate local variable boolean_7368
[ERROR] Pb(55) Duplicate local variable boolean_7372
[ERROR] Pb(55) Duplicate local variable boolean_7376
[ERROR] Pb(55) Duplicate local variable boolean_7380
[ERROR] Pb(55) Duplicate local variable boolean_7384
[ERROR] Pb(55) Duplicate local variable boolean_7388
[ERROR] Pb(55) Duplicate local variable boolean_7392
[ERROR] Pb(55) Duplicate local variable boolean_7396
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7720
[ERROR] Pb(55) Duplicate local variable boolean_7720
[ERROR] Pb(55) Duplicate local variable boolean_7721
[ERROR] Pb(55) Duplicate local variable boolean_7720
[ERROR] Pb(55) Duplicate local variable boolean_7721
[ERROR] Pb(55) Duplicate local variable boolean_7722
[ERROR] Pb(55) Duplicate local variable boolean_7724
[ERROR] Pb(55) Duplicate local variable boolean_7724
[ERROR] Pb(55) Duplicate local variable boolean_7725
[ERROR] Pb(55) Duplicate local variable boolean_7724
[ERROR] Pb(55) Duplicate local variable boolean_7725
[ERROR] Pb(55) Duplicate local variable boolean_7726
[ERROR] Pb(55) Duplicate local variable boolean_7728
[ERROR] Pb(55) Duplicate local variable boolean_7728
[ERROR] Pb(55) Duplicate local variable boolean_7729
[ERROR] Pb(55) Duplicate local variable boolean_7728
[ERROR] Pb(55) Duplicate local variable boolean_7729
[ERROR] Pb(55) Duplicate local variable boolean_7730
[ERROR] Pb(55) Duplicate local variable boolean_7732
[ERROR] Pb(55) Duplicate local variable boolean_7732
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
[INFO] 110 tests selected to be amplified over 110 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 61% |================================================ ]|[INFO] 6799 new tests generated
[WARNING] Too many tests have been generated: 6799
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7760
[ERROR] Pb(55) Duplicate local variable boolean_7764
[ERROR] Pb(55) Duplicate local variable boolean_7768
[ERROR] Pb(55) Duplicate local variable boolean_7772
[ERROR] Pb(55) Duplicate local variable boolean_7776
[ERROR] Pb(55) Duplicate local variable boolean_7780
[ERROR] Pb(55) Duplicate local variable boolean_7784
[ERROR] Pb(55) Duplicate local variable boolean_7788
[ERROR] Pb(55) Duplicate local variable boolean_7792
[ERROR] Pb(55) Duplicate local variable boolean_7796
[ERROR] Pb(55) Duplicate local variable boolean_7800
[ERROR] Pb(55) Duplicate local variable boolean_7804
[ERROR] Pb(55) Duplicate local variable boolean_7808
[ERROR] Pb(55) Duplicate local variable boolean_7812
[ERROR] Pb(55) Duplicate local variable boolean_7816
[ERROR] Pb(55) Duplicate local variable boolean_7820
[ERROR] Pb(55) Duplicate local variable boolean_7824
[ERROR] Pb(55) Duplicate local variable boolean_7828
[ERROR] Pb(55) Duplicate local variable boolean_7832
[ERROR] Pb(55) Duplicate local variable boolean_7836
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_8164
[ERROR] Pb(55) Duplicate local variable boolean_8164
[ERROR] Pb(55) Duplicate local variable boolean_8168
[ERROR] Pb(55) Duplicate local variable boolean_8172
[ERROR] Pb(55) Duplicate local variable boolean_8176
[ERROR] Pb(55) Duplicate local variable boolean_8180
[ERROR] Pb(55) Duplicate local variable boolean_8184
[ERROR] Pb(55) Duplicate local variable boolean_8188
[ERROR] Pb(55) Duplicate local variable boolean_8192
[ERROR] Pb(55) Duplicate local variable boolean_8196
[ERROR] Pb(55) Duplicate local variable boolean_8200
[ERROR] Pb(55) Duplicate local variable boolean_8204
[ERROR] Pb(55) Duplicate local variable boolean_8208
[ERROR] Pb(55) Duplicate local variable boolean_8212
[ERROR] Pb(55) Duplicate local variable boolean_8216
[ERROR] Pb(55) Duplicate local variable boolean_8220
[ERROR] Pb(55) Duplicate local variable boolean_8224
[ERROR] Pb(55) Duplicate local variable boolean_8228
[ERROR] Pb(55) Duplicate local variable boolean_8232
[ERROR] Pb(55) Duplicate local variable boolean_8236
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 12% |================================================ ]/[INFO] 8718 new tests generated
[WARNING] Too many tests have been generated: 8718
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_8560
[ERROR] Pb(55) Duplicate local variable boolean_8564
[ERROR] Pb(55) Duplicate local variable boolean_8568
[ERROR] Pb(55) Duplicate local variable boolean_8572
[ERROR] Pb(55) Duplicate local variable boolean_8576
[ERROR] Pb(55) Duplicate local variable boolean_8580
[ERROR] Pb(55) Duplicate local variable boolean_8584
[ERROR] Pb(55) Duplicate local variable boolean_8588
[ERROR] Pb(55) Duplicate local variable boolean_8592
[ERROR] Pb(55) Duplicate local variable boolean_8596
[ERROR] Pb(55) Duplicate local variable boolean_8600
[ERROR] Pb(55) Duplicate local variable boolean_8604
[ERROR] Pb(55) Duplicate local variable boolean_8608
[ERROR] Pb(55) Duplicate local variable boolean_8616
[ERROR] Pb(55) Duplicate local variable boolean_8620
[ERROR] Pb(55) Duplicate local variable boolean_8624
[ERROR] Pb(55) Duplicate local variable boolean_8628
[ERROR] Pb(55) Duplicate local variable boolean_8632
[ERROR] Pb(55) Duplicate local variable boolean_8636
[ERROR] Pb(55) Duplicate local variable boolean_8640
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_8968
[ERROR] Pb(55) Duplicate local variable boolean_8968
[ERROR] Pb(55) Duplicate local variable boolean_8969
[ERROR] Pb(55) Duplicate local variable boolean_8972
[ERROR] Pb(55) Duplicate local variable boolean_8976
[ERROR] Pb(55) Duplicate local variable boolean_8980
[ERROR] Pb(55) Duplicate local variable boolean_8984
[ERROR] Pb(55) Duplicate local variable boolean_8988
[ERROR] Pb(55) Duplicate local variable boolean_8992
[ERROR] Pb(55) Duplicate local variable boolean_8996
[ERROR] Pb(55) Duplicate local variable boolean_9000
[ERROR] Pb(55) Duplicate local variable boolean_9004
[ERROR] Pb(55) Duplicate local variable boolean_9008
[ERROR] Pb(55) Duplicate local variable boolean_9012
[ERROR] Pb(55) Duplicate local variable boolean_9016
[ERROR] Pb(55) Duplicate local variable boolean_9020
[ERROR] Pb(55) Duplicate local variable boolean_9024
[ERROR] Pb(55) Duplicate local variable boolean_9028
[ERROR] Pb(55) Duplicate local variable boolean_9032
[ERROR] Pb(55) Duplicate local variable boolean_9036
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testReset, (9/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 104 new tests generated
[INFO] Run tests. (104)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_9361
[ERROR] Pb(55) Duplicate local variable boolean_9365
[ERROR] Pb(55) Duplicate local variable boolean_9369
[ERROR] Pb(55) Duplicate local variable boolean_9373
[ERROR] Pb(55) Duplicate local variable boolean_9377
[ERROR] Pb(55) Duplicate local variable boolean_9381
[ERROR] Pb(55) Duplicate local variable boolean_9385
[ERROR] Pb(55) Duplicate local variable boolean_9389
[ERROR] Pb(55) Duplicate local variable boolean_9393
[ERROR] Pb(55) Duplicate local variable boolean_9397
[ERROR] Pb(55) Duplicate local variable boolean_9401
[ERROR] Pb(55) Duplicate local variable boolean_9405
[ERROR] Pb(55) Duplicate local variable boolean_9409
[ERROR] Pb(55) Duplicate local variable boolean_9413
[ERROR] Pb(55) Duplicate local variable boolean_9417
[ERROR] Pb(55) Duplicate local variable boolean_9421
[ERROR] Pb(55) Duplicate local variable boolean_9425
[ERROR] Pb(55) Duplicate local variable boolean_9429
[ERROR] Pb(55) Duplicate local variable boolean_9433
[ERROR] Pb(55) Duplicate local variable boolean_9437
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_9761
[ERROR] Pb(55) Duplicate local variable boolean_9765
[ERROR] Pb(55) Duplicate local variable boolean_9769
[ERROR] Pb(55) Duplicate local variable boolean_9773
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
[INFO] 104 tests selected to be amplified over 104 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  2% |================================================ ]\[INFO] 5403 new tests generated
[WARNING] Too many tests have been generated: 5403
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_9777
[ERROR] Pb(55) Duplicate local variable boolean_9781
[ERROR] Pb(55) Duplicate local variable boolean_9785
[ERROR] Pb(55) Duplicate local variable boolean_9789
[ERROR] Pb(55) Duplicate local variable boolean_9793
[ERROR] Pb(55) Duplicate local variable boolean_9797
[ERROR] Pb(55) Duplicate local variable boolean_9805
[ERROR] Pb(55) Duplicate local variable boolean_9809
[ERROR] Pb(55) Duplicate local variable boolean_9813
[ERROR] Pb(55) Duplicate local variable boolean_9817
[ERROR] Pb(55) Duplicate local variable boolean_9821
[ERROR] Pb(55) Duplicate local variable boolean_9825
[ERROR] Pb(55) Duplicate local variable boolean_9829
[ERROR] Pb(55) Duplicate local variable boolean_9833
[ERROR] Pb(55) Duplicate local variable boolean_9837
[ERROR] Pb(55) Duplicate local variable boolean_9841
[ERROR] Pb(55) Duplicate local variable boolean_9845
[ERROR] Pb(55) Duplicate local variable boolean_9849
[ERROR] Pb(55) Duplicate local variable boolean_9853
[ERROR] Pb(55) Duplicate local variable boolean_9857
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_10197
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, null, String)
[ERROR] Pb(55) Duplicate local variable boolean_10201
[ERROR] Pb(55) Duplicate local variable boolean_10205
[ERROR] Pb(55) Duplicate local variable boolean_10209
[ERROR] Pb(55) Duplicate local variable boolean_10213
[ERROR] Pb(55) Duplicate local variable boolean_10217
[ERROR] Pb(55) Duplicate local variable boolean_10221
[ERROR] Pb(55) Duplicate local variable boolean_10225
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, String, null)
[ERROR] Pb(55) Duplicate local variable boolean_10229
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, String, null)
[ERROR] Pb(55) Duplicate local variable boolean_10233
[ERROR] Pb(55) Duplicate local variable boolean_10237
[ERROR] Pb(55) Duplicate local variable boolean_10241
[ERROR] Pb(55) Duplicate local variable boolean_10245
[ERROR] Pb(55) Duplicate local variable boolean_10249
[ERROR] Pb(55) Duplicate local variable boolean_10253
[ERROR] Pb(55) Duplicate local variable boolean_10257
[ERROR] Pb(55) Duplicate local variable boolean_10261
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  3% |================================================ ]-[INFO] 7220 new tests generated
[WARNING] Too many tests have been generated: 7220
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_10577
[ERROR] Pb(55) Duplicate local variable boolean_10581
[ERROR] Pb(55) Duplicate local variable boolean_10585
[ERROR] Pb(55) Duplicate local variable boolean_10589
[ERROR] Pb(55) Duplicate local variable boolean_10593
[ERROR] Pb(55) Duplicate local variable boolean_10597
[ERROR] Pb(55) Duplicate local variable boolean_10601
[ERROR] Pb(55) Duplicate local variable boolean_10605
[ERROR] Pb(55) Duplicate local variable boolean_10609
[ERROR] Pb(55) Duplicate local variable boolean_10613
[ERROR] Pb(55) Duplicate local variable boolean_10617
[ERROR] Pb(55) Duplicate local variable boolean_10621
[ERROR] Pb(55) Duplicate local variable boolean_10625
[ERROR] Pb(55) Duplicate local variable boolean_10633
[ERROR] Pb(55) Duplicate local variable boolean_10637
[ERROR] Pb(55) Duplicate local variable boolean_10641
[ERROR] Pb(55) Duplicate local variable boolean_10645
[ERROR] Pb(55) Duplicate local variable boolean_10649
[ERROR] Pb(55) Duplicate local variable boolean_10653
[ERROR] Pb(55) Duplicate local variable boolean_10657
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_10993
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, String, null)
[ERROR] Pb(55) Duplicate local variable boolean_10997
[ERROR] Pb(55) Duplicate local variable boolean_11001
[ERROR] Pb(55) Duplicate local variable boolean_11005
[ERROR] Pb(55) Duplicate local variable boolean_11009
[ERROR] Pb(55) Duplicate local variable boolean_11013
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, String, String, null)
[ERROR] Pb(55) Duplicate local variable boolean_11017
[ERROR] Pb(55) Duplicate local variable boolean_11021
[ERROR] Pb(55) Duplicate local variable boolean_11025
[ERROR] Pb(115) The method copyFromModel(DataModelHandle, String, DataHandle.DataUpdateSubscriber, DataHandle.TransactionCommitCallback) in the type DataModel is not applicable for the arguments (DataModelHandle, null, String, null)
[ERROR] Pb(55) Duplicate local variable boolean_11029
[ERROR] Pb(55) Duplicate local variable boolean_11033
[ERROR] Pb(55) Duplicate local variable boolean_11037
[ERROR] Pb(55) Duplicate local variable boolean_11041
[ERROR] Pb(55) Duplicate local variable boolean_11045
[ERROR] Pb(55) Duplicate local variable boolean_11049
[ERROR] Pb(55) Duplicate local variable boolean_11053
[ERROR] Pb(55) Duplicate local variable boolean_11057
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testRuleCondition, (10/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 163 new tests generated
[INFO] Run tests. (163)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_11376
[ERROR] Pb(55) Duplicate local variable boolean_11380
[ERROR] Pb(55) Duplicate local variable boolean_11384
[ERROR] Pb(55) Duplicate local variable boolean_11388
[ERROR] Pb(55) Duplicate local variable boolean_11392
[ERROR] Pb(55) Duplicate local variable boolean_11396
[ERROR] Pb(55) Duplicate local variable boolean_11400
[ERROR] Pb(55) Duplicate local variable boolean_11404
[ERROR] Pb(55) Duplicate local variable boolean_11408
[ERROR] Pb(55) Duplicate local variable boolean_11412
[ERROR] Pb(55) Duplicate local variable boolean_11416
[ERROR] Pb(55) Duplicate local variable boolean_11420
[ERROR] Pb(55) Duplicate local variable boolean_11424
[ERROR] Pb(55) Duplicate local variable boolean_11428
[ERROR] Pb(55) Duplicate local variable boolean_11432
[ERROR] Pb(55) Duplicate local variable boolean_11436
[ERROR] Pb(55) Duplicate local variable boolean_11440
[ERROR] Pb(55) Duplicate local variable boolean_11444
[ERROR] Pb(55) Duplicate local variable boolean_11448
[ERROR] Pb(55) Duplicate local variable boolean_11452
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_11776
[ERROR] Pb(55) Duplicate local variable boolean_11776
[ERROR] Pb(55) Duplicate local variable boolean_11777
[ERROR] Pb(55) Duplicate local variable boolean_11776
[ERROR] Pb(55) Duplicate local variable boolean_11777
[ERROR] Pb(55) Duplicate local variable boolean_11778
[ERROR] Pb(55) Duplicate local variable boolean_11780
[ERROR] Pb(55) Duplicate local variable boolean_11780
[ERROR] Pb(55) Duplicate local variable boolean_11781
[ERROR] Pb(55) Duplicate local variable boolean_11780
[ERROR] Pb(55) Duplicate local variable boolean_11781
[ERROR] Pb(55) Duplicate local variable boolean_11782
[ERROR] Pb(55) Duplicate local variable boolean_11784
[ERROR] Pb(55) Duplicate local variable boolean_11784
[ERROR] Pb(55) Duplicate local variable boolean_11785
[ERROR] Pb(55) Duplicate local variable boolean_11784
[ERROR] Pb(55) Duplicate local variable boolean_11785
[ERROR] Pb(55) Duplicate local variable boolean_11786
[ERROR] Pb(55) Duplicate local variable boolean_11788
[ERROR] Pb(55) Duplicate local variable boolean_11788
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
[INFO] 163 tests selected to be amplified over 163 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
  3% |================================================ ]/[INFO] 14380 new tests generated
[WARNING] Too many tests have been generated: 14380
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_12028
[ERROR] Pb(55) Duplicate local variable boolean_12032
[ERROR] Pb(55) Duplicate local variable boolean_12036
[ERROR] Pb(55) Duplicate local variable boolean_12040
[ERROR] Pb(55) Duplicate local variable boolean_12044
[ERROR] Pb(55) Duplicate local variable boolean_12048
[ERROR] Pb(55) Duplicate local variable boolean_12052
[ERROR] Pb(55) Duplicate local variable boolean_12056
[ERROR] Pb(55) Duplicate local variable boolean_12060
[ERROR] Pb(55) Duplicate local variable boolean_12064
[ERROR] Pb(55) Duplicate local variable boolean_12068
[ERROR] Pb(55) Duplicate local variable boolean_12072
[ERROR] Pb(55) Duplicate local variable boolean_12076
[ERROR] Pb(55) Duplicate local variable boolean_12084
[ERROR] Pb(55) Duplicate local variable boolean_12088
[ERROR] Pb(55) Duplicate local variable boolean_12092
[ERROR] Pb(55) Duplicate local variable boolean_12096
[ERROR] Pb(55) Duplicate local variable boolean_12100
[ERROR] Pb(55) Duplicate local variable boolean_12104
[ERROR] Pb(55) Duplicate local variable boolean_12108
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_12432
[ERROR] Pb(55) Duplicate local variable boolean_12432
[ERROR] Pb(55) Duplicate local variable boolean_12436
[ERROR] Pb(55) Duplicate local variable boolean_12440
[ERROR] Pb(55) Duplicate local variable boolean_12444
[ERROR] Pb(55) Duplicate local variable boolean_12448
[ERROR] Pb(55) Duplicate local variable boolean_12452
[ERROR] Pb(55) Duplicate local variable boolean_12456
[ERROR] Pb(55) Duplicate local variable boolean_12460
[ERROR] Pb(55) Duplicate local variable boolean_12464
[ERROR] Pb(55) Duplicate local variable boolean_12468
[ERROR] Pb(55) Duplicate local variable boolean_12472
[ERROR] Pb(55) Duplicate local variable boolean_12476
[ERROR] Pb(55) Duplicate local variable boolean_12480
[ERROR] Pb(55) Duplicate local variable boolean_12484
[ERROR] Pb(55) Duplicate local variable boolean_12488
[ERROR] Pb(55) Duplicate local variable boolean_12492
[ERROR] Pb(55) Duplicate local variable boolean_12496
[ERROR] Pb(55) Duplicate local variable boolean_12500
[ERROR] Pb(55) Duplicate local variable boolean_12504
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 50% |================================================ ]|[INFO] 12639 new tests generated
[WARNING] Too many tests have been generated: 12639
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_12828
[ERROR] Pb(55) Duplicate local variable boolean_12832
[ERROR] Pb(55) Duplicate local variable boolean_12836
[ERROR] Pb(55) Duplicate local variable boolean_12840
[ERROR] Pb(55) Duplicate local variable boolean_12844
[ERROR] Pb(55) Duplicate local variable boolean_12848
[ERROR] Pb(55) Duplicate local variable boolean_12852
[ERROR] Pb(55) Duplicate local variable boolean_12856
[ERROR] Pb(55) Duplicate local variable boolean_12860
[ERROR] Pb(55) Duplicate local variable boolean_12864
[ERROR] Pb(55) Duplicate local variable boolean_12868
[ERROR] Pb(55) Duplicate local variable boolean_12872
[ERROR] Pb(55) Duplicate local variable boolean_12876
[ERROR] Pb(55) Duplicate local variable boolean_12880
[ERROR] Pb(55) Duplicate local variable boolean_12884
[ERROR] Pb(55) Duplicate local variable boolean_12888
[ERROR] Pb(55) Duplicate local variable boolean_12892
[ERROR] Pb(55) Duplicate local variable boolean_12896
[ERROR] Pb(55) Duplicate local variable boolean_12900
[ERROR] Pb(55) Duplicate local variable boolean_12904
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_13236
[ERROR] Pb(55) Duplicate local variable boolean_13236
[ERROR] Pb(55) Duplicate local variable boolean_13237
[ERROR] Pb(55) Duplicate local variable boolean_13240
[ERROR] Pb(55) Duplicate local variable boolean_13244
[ERROR] Pb(55) Duplicate local variable boolean_13248
[ERROR] Pb(55) Duplicate local variable boolean_13252
[ERROR] Pb(55) Duplicate local variable boolean_13256
[ERROR] Pb(55) Duplicate local variable boolean_13260
[ERROR] Pb(55) Duplicate local variable boolean_13264
[ERROR] Pb(55) Duplicate local variable boolean_13268
[ERROR] Pb(55) Duplicate local variable boolean_13272
[ERROR] Pb(55) Duplicate local variable boolean_13276
[ERROR] Pb(55) Duplicate local variable boolean_13280
[ERROR] Pb(55) Duplicate local variable boolean_13284
[ERROR] Pb(55) Duplicate local variable boolean_13288
[ERROR] Pb(55) Duplicate local variable boolean_13292
[ERROR] Pb(115) The method addRule(String, String, String, String, List<String>, List<Trigger>, List<Action>) in the type DataModel is not applicable for the arguments (String, String, null, null, List<String>, String, List<Action>)
[ERROR] Pb(55) Duplicate local variable boolean_13300
[ERROR] Pb(55) Duplicate local variable boolean_13304
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testRuleTrigger, (11/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 125 new tests generated
[INFO] Run tests. (125)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_13629
[ERROR] Pb(55) Duplicate local variable boolean_13632
[ERROR] Pb(55) Duplicate local variable boolean_13635
[ERROR] Pb(55) Duplicate local variable boolean_13638
[ERROR] Pb(55) Duplicate local variable boolean_13641
[ERROR] Pb(55) Duplicate local variable boolean_13644
[ERROR] Pb(55) Duplicate local variable boolean_13647
[ERROR] Pb(55) Duplicate local variable boolean_13650
[ERROR] Pb(55) Duplicate local variable boolean_13653
[ERROR] Pb(55) Duplicate local variable boolean_13656
[ERROR] Pb(55) Duplicate local variable boolean_13659
[ERROR] Pb(55) Duplicate local variable boolean_13662
[ERROR] Pb(55) Duplicate local variable boolean_13665
[ERROR] Pb(55) Duplicate local variable boolean_13668
[ERROR] Pb(55) Duplicate local variable boolean_13671
[ERROR] Pb(55) Duplicate local variable boolean_13674
[ERROR] Pb(55) Duplicate local variable boolean_13677
[ERROR] Pb(55) Duplicate local variable boolean_13680
[ERROR] Pb(55) Duplicate local variable boolean_13683
[ERROR] Pb(55) Duplicate local variable boolean_13686
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_13929
[ERROR] Pb(55) Duplicate local variable boolean_13932
[ERROR] Pb(55) Duplicate local variable boolean_13935
[ERROR] Pb(55) Duplicate local variable boolean_13938
[ERROR] Pb(55) Duplicate local variable boolean_13941
[ERROR] Pb(55) Duplicate local variable boolean_13944
[ERROR] Pb(55) Duplicate local variable boolean_13947
[ERROR] Pb(55) Duplicate local variable boolean_13950
[ERROR] Pb(55) Duplicate local variable boolean_13953
[ERROR] Pb(55) Duplicate local variable boolean_13956
[ERROR] Pb(55) Duplicate local variable boolean_13959
[ERROR] Pb(55) Duplicate local variable boolean_13962
[ERROR] Pb(55) Duplicate local variable boolean_13965
[ERROR] Pb(55) Duplicate local variable boolean_13968
[ERROR] Pb(55) Duplicate local variable boolean_13971
[ERROR] Pb(55) Duplicate local variable boolean_13974
[ERROR] Pb(55) Duplicate local variable boolean_13977
[ERROR] Pb(55) Duplicate local variable boolean_13980
[ERROR] Pb(55) Duplicate local variable boolean_13983
[ERROR] Pb(55) Duplicate local variable boolean_13986
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
[INFO] 125 tests selected to be amplified over 125 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 77% |================================================ ]/[INFO] 7241 new tests generated
[WARNING] Too many tests have been generated: 7241
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_14010
[ERROR] Pb(55) Duplicate local variable boolean_14013
[ERROR] Pb(55) Duplicate local variable boolean_14016
[ERROR] Pb(55) Duplicate local variable boolean_14019
[ERROR] Pb(55) Duplicate local variable boolean_14022
[ERROR] Pb(55) Duplicate local variable boolean_14025
[ERROR] Pb(55) Duplicate local variable boolean_14028
[ERROR] Pb(55) Duplicate local variable boolean_14031
[ERROR] Pb(55) Duplicate local variable boolean_14034
[ERROR] Pb(55) Duplicate local variable boolean_14037
[ERROR] Pb(55) Duplicate local variable boolean_14040
[ERROR] Pb(55) Duplicate local variable boolean_14043
[ERROR] Pb(55) Duplicate local variable boolean_14046
[ERROR] Pb(55) Duplicate local variable boolean_14049
[ERROR] Pb(55) Duplicate local variable boolean_14052
[ERROR] Pb(55) Duplicate local variable boolean_14055
[ERROR] Pb(55) Duplicate local variable boolean_14058
[ERROR] Pb(55) Duplicate local variable boolean_14061
[ERROR] Pb(55) Duplicate local variable boolean_14064
[ERROR] Pb(55) Duplicate local variable boolean_14070
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_14322
[ERROR] Pb(55) Duplicate local variable boolean_14325
[ERROR] Pb(55) Duplicate local variable boolean_14328
[ERROR] Pb(55) Duplicate local variable boolean_14331
[ERROR] Pb(55) Duplicate local variable boolean_14334
[ERROR] Pb(55) Duplicate local variable boolean_14337
[ERROR] Pb(55) Duplicate local variable boolean_14340
[ERROR] Pb(55) Duplicate local variable boolean_14343
[ERROR] Pb(55) Duplicate local variable boolean_14346
[ERROR] Pb(55) Duplicate local variable boolean_14349
[ERROR] Pb(55) Duplicate local variable boolean_14352
[ERROR] Pb(55) Duplicate local variable boolean_14355
[ERROR] Pb(55) Duplicate local variable boolean_14358
[ERROR] Pb(55) Duplicate local variable boolean_14361
[ERROR] Pb(55) Duplicate local variable boolean_14364
[ERROR] Pb(55) Duplicate local variable boolean_14367
[ERROR] Pb(55) Duplicate local variable boolean_14370
[ERROR] Pb(55) Duplicate local variable boolean_14373
[ERROR] Pb(55) Duplicate local variable boolean_14376
[ERROR] Pb(55) Duplicate local variable boolean_14379
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 12% |================================================ ]/[INFO] 7857 new tests generated
[WARNING] Too many tests have been generated: 7857
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_14604
[ERROR] Pb(55) Duplicate local variable boolean_14607
[ERROR] Pb(55) Duplicate local variable boolean_14610
[ERROR] Pb(55) Duplicate local variable boolean_14613
[ERROR] Pb(55) Duplicate local variable boolean_14616
[ERROR] Pb(55) Duplicate local variable boolean_14619
[ERROR] Pb(55) Duplicate local variable boolean_14622
[ERROR] Pb(55) Duplicate local variable boolean_14628
[ERROR] Pb(55) Duplicate local variable boolean_14631
[ERROR] Pb(55) Duplicate local variable boolean_14634
[ERROR] Pb(55) Duplicate local variable boolean_14637
[ERROR] Pb(55) Duplicate local variable boolean_14640
[ERROR] Pb(55) Duplicate local variable boolean_14643
[ERROR] Pb(55) Duplicate local variable boolean_14646
[ERROR] Pb(55) Duplicate local variable boolean_14649
[ERROR] Pb(55) Duplicate local variable boolean_14652
[ERROR] Pb(55) Duplicate local variable boolean_14655
[ERROR] Pb(55) Duplicate local variable boolean_14658
[ERROR] Pb(55) Duplicate local variable boolean_14661
[ERROR] Pb(55) Duplicate local variable boolean_14667
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_14916
[ERROR] Pb(55) Duplicate local variable boolean_14919
[ERROR] Pb(55) Duplicate local variable boolean_14922
[ERROR] Pb(55) Duplicate local variable boolean_14925
[ERROR] Pb(55) Duplicate local variable boolean_14928
[ERROR] Pb(55) Duplicate local variable boolean_14931
[ERROR] Pb(55) Duplicate local variable boolean_14934
[ERROR] Pb(55) Duplicate local variable boolean_14937
[ERROR] Pb(55) Duplicate local variable boolean_14940
[ERROR] Pb(55) Duplicate local variable boolean_14943
[ERROR] Pb(55) Duplicate local variable boolean_14946
[ERROR] Pb(55) Duplicate local variable boolean_14949
[ERROR] Pb(55) Duplicate local variable boolean_14952
[ERROR] Pb(55) Duplicate local variable boolean_14955
[ERROR] Pb(55) Duplicate local variable boolean_14958
[ERROR] Pb(55) Duplicate local variable boolean_14961
[ERROR] Pb(55) Duplicate local variable boolean_14964
[ERROR] Pb(55) Duplicate local variable boolean_14967
[ERROR] Pb(55) Duplicate local variable boolean_14970
[ERROR] Pb(55) Duplicate local variable boolean_14973
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testSubscribers, (12/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 159 new tests generated
[INFO] Run tests. (159)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 137 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (411)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 22 test fail, generating try/catch/fail blocks...
[INFO] 159 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 159 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testSubscriberslitString169315_failAssert0 kills 1 more mutants
[INFO] 1 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 159 tests selected to be amplified over 159 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 11% |================================================ ]\[INFO] 13739 new tests generated
[WARNING] Too many tests have been generated: 13739
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 149 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (456)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 48 test fail, generating try/catch/fail blocks...
[INFO] 47 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 47 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 47 tests selected to be amplified over 47 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 87% |=============================================== ]/[INFO] 3356 new tests generated
[WARNING] Too many tests have been generated: 3356
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 188 test fail, generating try/catch/fail blocks...
[INFO] 199 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 199 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 2)
[INFO] elapsedTime 5527503
[INFO] Amplification succeed.
[INFO] Elapsed time 5528421 ms
[INFO] 
Test class that has been amplified: no.tellu.lib.data.model.ModelTest
The original test suite kills 379 mutants
The amplification results with 2 new tests
it kills 3 more mutants

[INFO] Writing report in target/dspot/output/report.txt
[INFO] DSpot amplified your test suite without errors. (no errors report will be outputted)
[INFO] The amplification ends up with 2 amplified test methods over 1 test classes.
[INFO] Print no.tellu.lib.data.model.ModelTest.java with 2 amplified test cases in target/dspot/output
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:32 h
[INFO] Finished at: 2019-10-22T12:02:33+02:00
[INFO] ------------------------------------------------------------------------
