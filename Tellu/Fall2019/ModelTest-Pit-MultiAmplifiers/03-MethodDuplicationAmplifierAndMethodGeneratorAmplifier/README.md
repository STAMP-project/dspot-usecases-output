Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.lib.data.model.ModelTest -Dtime-out=1000 -Damplifiers=MethodDuplicationAmplifier:MethodGeneratorAmplifier
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
[INFO] Total time:  2.853 s
[INFO] Finished at: 2019-10-22T14:39:51+02:00
[INFO] ------------------------------------------------------------------------
[WARNING] You are using an old name: MethodGeneratorAmplifier.
[WARNING] You should use the new name: FastLiteralAmplifier.
[WARNING] The entry TestDataMutator will be deleted very soon.
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
[INFO] 61 new tests generated
[INFO] Run tests. (61)
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
[INFO] 61 tests selected to be amplified over 61 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
  4% |================================================ ]\[INFO] 1561 new tests generated
[WARNING] Too many tests have been generated: 1561
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_470
[ERROR] Pb(55) Duplicate local variable boolean_477
[ERROR] Pb(55) Duplicate local variable boolean_484
[ERROR] Pb(55) Duplicate local variable boolean_491
[ERROR] Pb(55) Duplicate local variable boolean_505
[ERROR] Pb(55) Duplicate local variable boolean_512
[ERROR] Pb(55) Duplicate local variable boolean_519
[ERROR] Pb(55) Duplicate local variable boolean_526
[ERROR] Pb(55) Duplicate local variable boolean_533
[ERROR] Pb(55) Duplicate local variable boolean_540
[ERROR] Pb(55) Duplicate local variable boolean_547
[ERROR] Pb(55) Duplicate local variable boolean_554
[ERROR] Pb(55) Duplicate local variable boolean_561
[ERROR] Pb(55) Duplicate local variable boolean_568
[ERROR] Pb(55) Duplicate local variable boolean_575
[ERROR] Pb(55) Duplicate local variable boolean_582
[ERROR] Pb(55) Duplicate local variable boolean_589
[ERROR] Pb(55) Duplicate local variable boolean_596
[ERROR] Pb(55) Duplicate local variable boolean_603
[ERROR] Pb(55) Duplicate local variable boolean_617
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1205
[ERROR] Pb(55) Duplicate local variable boolean_1205
[ERROR] Pb(55) Duplicate local variable boolean_1206
[ERROR] Pb(55) Duplicate local variable boolean_1209
[ERROR] Pb(55) Duplicate local variable boolean_1212
[ERROR] Pb(55) Duplicate local variable boolean_1212
[ERROR] Pb(55) Duplicate local variable boolean_1213
[ERROR] Pb(55) Duplicate local variable boolean_1216
[ERROR] Pb(55) Duplicate local variable boolean_1219
[ERROR] Pb(55) Duplicate local variable boolean_1219
[ERROR] Pb(55) Duplicate local variable boolean_1220
[ERROR] Pb(55) Duplicate local variable boolean_1223
[ERROR] Pb(55) Duplicate local variable boolean_1226
[ERROR] Pb(55) Duplicate local variable boolean_1226
[ERROR] Pb(55) Duplicate local variable boolean_1233
[ERROR] Pb(55) Duplicate local variable boolean_1240
[ERROR] Pb(55) Duplicate local variable boolean_1247
[ERROR] Pb(55) Duplicate local variable boolean_1254
[ERROR] Pb(55) Duplicate local variable boolean_1261
[ERROR] Pb(55) Duplicate local variable boolean_1268
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 87% |================================================ ]\[INFO] 5378 new tests generated
[WARNING] Too many tests have been generated: 5378
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_1870
[ERROR] Pb(55) Duplicate local variable boolean_1877
[ERROR] Pb(55) Duplicate local variable boolean_1884
[ERROR] Pb(55) Duplicate local variable boolean_1891
[ERROR] Pb(55) Duplicate local variable boolean_1898
[ERROR] Pb(55) Duplicate local variable boolean_1905
[ERROR] Pb(55) Duplicate local variable boolean_1912
[ERROR] Pb(55) Duplicate local variable boolean_1919
[ERROR] Pb(55) Duplicate local variable boolean_1926
[ERROR] Pb(55) Duplicate local variable boolean_1933
[ERROR] Pb(55) Duplicate local variable boolean_1940
[ERROR] Pb(55) Duplicate local variable boolean_1947
[ERROR] Pb(55) Duplicate local variable boolean_1954
[ERROR] Pb(55) Duplicate local variable boolean_1961
[ERROR] Pb(55) Duplicate local variable boolean_1968
[ERROR] Pb(55) Duplicate local variable boolean_1975
[ERROR] Pb(55) Duplicate local variable boolean_1982
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(55) Duplicate local variable boolean_1996
[ERROR] Pb(55) Duplicate local variable boolean_2003
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_2584
[ERROR] Pb(55) Duplicate local variable boolean_2584
[ERROR] Pb(55) Duplicate local variable boolean_2585
[ERROR] Pb(55) Duplicate local variable boolean_2588
[ERROR] Pb(55) Duplicate local variable boolean_2591
[ERROR] Pb(55) Duplicate local variable boolean_2591
[ERROR] Pb(55) Duplicate local variable boolean_2598
[ERROR] Pb(55) Duplicate local variable boolean_2605
[ERROR] Pb(55) Duplicate local variable boolean_2612
[ERROR] Pb(55) Duplicate local variable boolean_2619
[ERROR] Pb(55) Duplicate local variable boolean_2626
[ERROR] Pb(55) Duplicate local variable boolean_2640
[ERROR] Pb(55) Duplicate local variable boolean_2647
[ERROR] Pb(55) Duplicate local variable boolean_2654
[ERROR] Pb(55) Duplicate local variable boolean_2661
[ERROR] Pb(55) Duplicate local variable boolean_2668
[ERROR] Pb(55) Duplicate local variable boolean_2675
[ERROR] Pb(55) Duplicate local variable boolean_2682
[ERROR] Pb(55) Duplicate local variable boolean_2689
[ERROR] Pb(55) Duplicate local variable boolean_2696
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
[INFO] 15 new tests generated
[INFO] Run tests. (15)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3271
[ERROR] Pb(55) Duplicate local variable boolean_3275
[ERROR] Pb(55) Duplicate local variable boolean_3279
[ERROR] Pb(55) Duplicate local variable boolean_3283
[ERROR] Pb(55) Duplicate local variable boolean_3287
[ERROR] Pb(55) Duplicate local variable boolean_3291
[ERROR] Pb(55) Duplicate local variable boolean_3295
[ERROR] Pb(55) Duplicate local variable boolean_3299
[ERROR] Pb(55) Duplicate local variable boolean_3303
[ERROR] Pb(55) Duplicate local variable boolean_3307
[ERROR] Pb(55) Duplicate local variable boolean_3311
[ERROR] Pb(55) Duplicate local variable boolean_3315
[ERROR] Pb(55) Duplicate local variable boolean_3319
[ERROR] Pb(55) Duplicate local variable boolean_3323
[ERROR] Pb(55) Duplicate local variable boolean_3327
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
[INFO] 15 tests selected to be amplified over 15 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 80% |======================================== ]|[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 1)
[INFO] Amplification of testInitFromFile, (3/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 21 new tests generated
[INFO] Run tests. (21)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 21 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (63)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 21 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 21 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testInitFromFile_mg7508 kills 3 more mutants
[INFO] testInitFromFile_add7501 kills 1 more mutants
[INFO] 2 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 21 tests selected to be amplified over 21 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 47% |=============================================== ]-[INFO] 527 new tests generated
[WARNING] Too many tests have been generated: 527
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 163 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
 60% |================================================= ]-[INFO] Run instrumented tests. (588)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 2 test fail, generating try/catch/fail blocks...
[INFO] 134 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 134 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testInitFromFile_mg7508_mg7803 kills 1 more mutants
[INFO] testInitFromFile_add7501_mg8102 kills 1 more mutants
[INFO] testInitFromFile_add7501_mg8100_failAssert0 kills 1 more mutants
[INFO] 3 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 134 tests selected to be amplified over 134 available tests
[INFO] Amplification of inputs...
 20% |================================================= ]|[INFO] 4549 new tests generated
[WARNING] Too many tests have been generated: 4549
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 184 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (564)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 12 test fail, generating try/catch/fail blocks...
[INFO] 182 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 182 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testInitFromFile_add7505_add7831_mg12577_failAssert0 kills 1 more mutants
[INFO] 1 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 7)
[INFO] Amplification of testInitFromMeta, (4/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 12 new tests generated
[INFO] Run tests. (12)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 12 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (36)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 12 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 12 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 12 tests selected to be amplified over 12 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  8% |============================= ]/[INFO] 208 new tests generated
[WARNING] Too many tests have been generated: 208
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 134 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
  1% |================================================= ]\[INFO] Run instrumented tests. (582)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 5 test fail, generating try/catch/fail blocks...
[INFO] 179 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 179 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 179 tests selected to be amplified over 179 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 39% |================================================ ]\[INFO] 4806 new tests generated
[WARNING] Too many tests have been generated: 4806
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 178 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]/
[INFO] Run instrumented tests. (543)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 19 test fail, generating try/catch/fail blocks...
[INFO] 197 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 197 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 7)
[INFO] Amplification of testInitFromModel, (5/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 41 new tests generated
[INFO] Run tests. (41)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 34 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (102)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 2 test fail, generating try/catch/fail blocks...
[INFO] 36 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 36 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] testInitFromModel_mg20100_failAssert0 kills 1 more mutants
[INFO] testInitFromModel_mg20102 kills 1 more mutants
[INFO] 2 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 36 tests selected to be amplified over 36 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 77% |=============================================== ]|[INFO] 2001 new tests generated
[WARNING] Too many tests have been generated: 2001
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 154 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (480)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 20 test fail, generating try/catch/fail blocks...
[INFO] 179 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 179 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 179 tests selected to be amplified over 179 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 52% |================================================ ]-[INFO] 10471 new tests generated
[WARNING] Too many tests have been generated: 10471
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(50) __DSPOT_source_12135 cannot be resolved
[ERROR] Pb(50) copy cannot be resolved
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[ERROR] Pb(50) copy cannot be resolved
[ERROR] Pb(50) js cannot be resolved
[ERROR] Pb(168) Unhandled exception type URISyntaxException
[ERROR] Pb(168) Unhandled exception type ExprParserException
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 163 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (492)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 21 test fail, generating try/catch/fail blocks...
[INFO] 183 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 183 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testMergeNodes, (6/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 27 new tests generated
[INFO] Run tests. (27)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3626
[ERROR] Pb(55) Duplicate local variable boolean_3628
[ERROR] Pb(55) Duplicate local variable boolean_3630
[ERROR] Pb(55) Duplicate local variable boolean_3632
[ERROR] Pb(55) Duplicate local variable boolean_3634
[ERROR] Pb(55) Duplicate local variable boolean_3636
[ERROR] Pb(55) Duplicate local variable boolean_3638
[ERROR] Pb(55) Duplicate local variable boolean_3640
[ERROR] Pb(55) Duplicate local variable boolean_3642
[ERROR] Pb(55) Duplicate local variable boolean_3644
[ERROR] Pb(55) Duplicate local variable boolean_3646
[ERROR] Pb(55) Duplicate local variable boolean_3648
[ERROR] Pb(55) Duplicate local variable boolean_3650
[ERROR] Pb(55) Duplicate local variable boolean_3652
[ERROR] Pb(55) Duplicate local variable boolean_3654
[ERROR] Pb(55) Duplicate local variable boolean_3656
[ERROR] Pb(55) Duplicate local variable boolean_3658
[ERROR] Pb(55) Duplicate local variable boolean_3660
[ERROR] Pb(55) Duplicate local variable boolean_3662
[ERROR] Pb(55) Duplicate local variable boolean_3664
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
[INFO] 27 tests selected to be amplified over 27 available tests
[INFO] Amplification of inputs...
100% |================================================== ]\
 77% |================================================ ]/[INFO] 367 new tests generated
[WARNING] Too many tests have been generated: 367
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3682
[ERROR] Pb(55) Duplicate local variable boolean_3688
[ERROR] Pb(55) Duplicate local variable boolean_3690
[ERROR] Pb(55) Duplicate local variable boolean_3692
[ERROR] Pb(55) Duplicate local variable boolean_3694
[ERROR] Pb(55) Duplicate local variable boolean_3696
[ERROR] Pb(55) Duplicate local variable boolean_3698
[ERROR] Pb(55) Duplicate local variable boolean_3700
[ERROR] Pb(55) Duplicate local variable boolean_3702
[ERROR] Pb(55) Duplicate local variable boolean_3704
[ERROR] Pb(55) Duplicate local variable boolean_3708
[ERROR] Pb(55) Duplicate local variable boolean_3710
[ERROR] Pb(55) Duplicate local variable boolean_3714
[ERROR] Pb(55) Duplicate local variable boolean_3716
[ERROR] Pb(55) Duplicate local variable boolean_3718
[ERROR] Pb(55) Duplicate local variable boolean_3726
[ERROR] Pb(55) Duplicate local variable boolean_3728
[ERROR] Pb(55) Duplicate local variable boolean_3732
[ERROR] Pb(55) Duplicate local variable boolean_3734
[ERROR] Pb(55) Duplicate local variable boolean_3736
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_3940
[ERROR] Pb(55) Duplicate local variable boolean_3942
[ERROR] Pb(55) Duplicate local variable boolean_3946
[ERROR] Pb(55) Duplicate local variable boolean_3948
[ERROR] Pb(55) Duplicate local variable boolean_3950
[ERROR] Pb(55) Duplicate local variable boolean_3952
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(55) Duplicate local variable boolean_3956
[ERROR] Pb(55) Duplicate local variable boolean_3958
[ERROR] Pb(55) Duplicate local variable boolean_3960
[ERROR] Pb(55) Duplicate local variable boolean_3962
[ERROR] Pb(55) Duplicate local variable boolean_3964
[ERROR] Pb(55) Duplicate local variable boolean_3966
[ERROR] Pb(55) Duplicate local variable boolean_3968
[ERROR] Pb(55) Duplicate local variable boolean_3970
[ERROR] Pb(55) Duplicate local variable boolean_3974
[ERROR] Pb(55) Duplicate local variable boolean_3976
[ERROR] Pb(55) Duplicate local variable boolean_3978
[ERROR] Pb(55) Duplicate local variable boolean_3980
[ERROR] Pb(55) Duplicate local variable boolean_3982
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  6% |================================================ ]|[INFO] 3020 new tests generated
[WARNING] Too many tests have been generated: 3020
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4080
[ERROR] Pb(55) Duplicate local variable boolean_4082
[ERROR] Pb(55) Duplicate local variable boolean_4084
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(55) Duplicate local variable boolean_4088
[ERROR] Pb(55) Duplicate local variable boolean_4090
[ERROR] Pb(55) Duplicate local variable boolean_4092
[ERROR] Pb(55) Duplicate local variable boolean_4094
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(55) Duplicate local variable boolean_4098
[ERROR] Pb(55) Duplicate local variable boolean_4102
[ERROR] Pb(55) Duplicate local variable boolean_4104
[ERROR] Pb(55) Duplicate local variable boolean_4106
[ERROR] Pb(55) Duplicate local variable boolean_4108
[ERROR] Pb(55) Duplicate local variable boolean_4110
[ERROR] Pb(55) Duplicate local variable boolean_4112
[ERROR] Pb(55) Duplicate local variable boolean_4114
[ERROR] Pb(55) Duplicate local variable boolean_4116
[ERROR] Pb(55) Duplicate local variable boolean_4118
[ERROR] Pb(55) Duplicate local variable boolean_4120
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4288
[ERROR] Pb(55) Duplicate local variable boolean_4292
[ERROR] Pb(55) Duplicate local variable boolean_4294
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(55) Duplicate local variable boolean_4296
[ERROR] Pb(55) Duplicate local variable boolean_4298
[ERROR] Pb(55) Duplicate local variable boolean_4300
[ERROR] Pb(55) Duplicate local variable boolean_4302
[ERROR] Pb(55) Duplicate local variable boolean_4304
[ERROR] Pb(55) Duplicate local variable boolean_4306
[ERROR] Pb(55) Duplicate local variable boolean_4308
[ERROR] Pb(55) Duplicate local variable boolean_4310
[ERROR] Pb(55) Duplicate local variable boolean_4312
[ERROR] Pb(55) Duplicate local variable boolean_4314
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<DataNode>
[ERROR] Pb(55) Duplicate local variable boolean_4316
[ERROR] Pb(55) Duplicate local variable boolean_4318
[ERROR] Pb(55) Duplicate local variable boolean_4320
[ERROR] Pb(55) Duplicate local variable boolean_4322
[ERROR] Pb(55) Duplicate local variable boolean_4324
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testPath, (7/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 9 new tests generated
[INFO] Run tests. (9)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4480
[ERROR] Pb(55) Duplicate local variable boolean_4480
[ERROR] Pb(55) Duplicate local variable boolean_4481
[ERROR] Pb(55) Duplicate local variable boolean_4483
[ERROR] Pb(55) Duplicate local variable boolean_4483
[ERROR] Pb(55) Duplicate local variable boolean_4484
[ERROR] Pb(55) Duplicate local variable boolean_4486
[ERROR] Pb(55) Duplicate local variable boolean_4486
[ERROR] Pb(55) Duplicate local variable boolean_4487
[ERROR] Pb(55) Duplicate local variable boolean_4489
[ERROR] Pb(55) Duplicate local variable boolean_4489
[ERROR] Pb(55) Duplicate local variable boolean_4490
[ERROR] Pb(55) Duplicate local variable boolean_4492
[ERROR] Pb(55) Duplicate local variable boolean_4492
[ERROR] Pb(55) Duplicate local variable boolean_4493
[ERROR] Pb(55) Duplicate local variable boolean_4495
[ERROR] Pb(55) Duplicate local variable boolean_4495
[ERROR] Pb(55) Duplicate local variable boolean_4496
[ERROR] Pb(55) Duplicate local variable boolean_4498
[ERROR] Pb(55) Duplicate local variable boolean_4498
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
 77% |====================================== ]\[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testProcessor, (8/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 24 new tests generated
[INFO] Run tests. (24)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4507
[ERROR] Pb(55) Duplicate local variable boolean_4507
[ERROR] Pb(55) Duplicate local variable boolean_4508
[ERROR] Pb(55) Duplicate local variable boolean_4507
[ERROR] Pb(55) Duplicate local variable boolean_4508
[ERROR] Pb(55) Duplicate local variable boolean_4509
[ERROR] Pb(55) Duplicate local variable boolean_4511
[ERROR] Pb(55) Duplicate local variable boolean_4511
[ERROR] Pb(55) Duplicate local variable boolean_4512
[ERROR] Pb(55) Duplicate local variable boolean_4511
[ERROR] Pb(55) Duplicate local variable boolean_4512
[ERROR] Pb(55) Duplicate local variable boolean_4513
[ERROR] Pb(55) Duplicate local variable boolean_4515
[ERROR] Pb(55) Duplicate local variable boolean_4515
[ERROR] Pb(55) Duplicate local variable boolean_4516
[ERROR] Pb(55) Duplicate local variable boolean_4515
[ERROR] Pb(55) Duplicate local variable boolean_4516
[ERROR] Pb(55) Duplicate local variable boolean_4517
[ERROR] Pb(55) Duplicate local variable boolean_4519
[ERROR] Pb(55) Duplicate local variable boolean_4519
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
[INFO] 24 tests selected to be amplified over 24 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 50% |===================================== ]|[INFO] 0 new tests generated
[INFO] iteration 2 / 3
[WARNING] No test could be selected to be amplified.
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testReset, (9/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 50 new tests generated
[INFO] Run tests. (50)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4604
[ERROR] Pb(55) Duplicate local variable boolean_4608
[ERROR] Pb(55) Duplicate local variable boolean_4612
[ERROR] Pb(55) Duplicate local variable boolean_4616
[ERROR] Pb(55) Duplicate local variable boolean_4620
[ERROR] Pb(55) Duplicate local variable boolean_4624
[ERROR] Pb(55) Duplicate local variable boolean_4628
[ERROR] Pb(55) Duplicate local variable boolean_4632
[ERROR] Pb(55) Duplicate local variable boolean_4636
[ERROR] Pb(55) Duplicate local variable boolean_4640
[ERROR] Pb(55) Duplicate local variable boolean_4644
[ERROR] Pb(55) Duplicate local variable boolean_4648
[ERROR] Pb(55) Duplicate local variable boolean_4652
[ERROR] Pb(55) Duplicate local variable boolean_4656
[ERROR] Pb(55) Duplicate local variable boolean_4660
[ERROR] Pb(55) Duplicate local variable boolean_4664
[ERROR] Pb(55) Duplicate local variable boolean_4668
[ERROR] Pb(55) Duplicate local variable boolean_4672
[ERROR] Pb(55) Duplicate local variable boolean_4676
[ERROR] Pb(55) Duplicate local variable boolean_4680
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
[INFO] 50 tests selected to be amplified over 50 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 86% |================================================ ]\[INFO] 986 new tests generated
[WARNING] Too many tests have been generated: 986
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_4808
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(55) Duplicate local variable boolean_4816
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(55) Duplicate local variable boolean_4828
[ERROR] Pb(55) Duplicate local variable boolean_4832
[ERROR] Pb(55) Duplicate local variable boolean_4836
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(55) Duplicate local variable boolean_4844
[ERROR] Pb(55) Duplicate local variable boolean_4848
[ERROR] Pb(55) Duplicate local variable boolean_4852
[ERROR] Pb(55) Duplicate local variable boolean_4856
[ERROR] Pb(55) Duplicate local variable boolean_4860
[ERROR] Pb(55) Duplicate local variable boolean_4868
[ERROR] Pb(55) Duplicate local variable boolean_4872
[ERROR] Pb(55) Duplicate local variable boolean_4876
[ERROR] Pb(55) Duplicate local variable boolean_4880
[ERROR] Pb(55) Duplicate local variable boolean_4884
[ERROR] Pb(55) Duplicate local variable boolean_4888
[ERROR] Pb(55) Duplicate local variable boolean_4892
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5280
[ERROR] Pb(55) Duplicate local variable boolean_5284
[ERROR] Pb(55) Duplicate local variable boolean_5288
[ERROR] Pb(55) Duplicate local variable boolean_5292
[ERROR] Pb(55) Duplicate local variable boolean_5300
[ERROR] Pb(55) Duplicate local variable boolean_5304
[ERROR] Pb(55) Duplicate local variable boolean_5308
[ERROR] Pb(55) Duplicate local variable boolean_5312
[ERROR] Pb(55) Duplicate local variable boolean_5316
[ERROR] Pb(55) Duplicate local variable boolean_5320
[ERROR] Pb(55) Duplicate local variable boolean_5324
[ERROR] Pb(55) Duplicate local variable boolean_5328
[ERROR] Pb(55) Duplicate local variable boolean_5332
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Action>
[ERROR] Pb(55) Duplicate local variable boolean_5336
[ERROR] Pb(55) Duplicate local variable boolean_5340
[ERROR] Pb(55) Duplicate local variable boolean_5344
[ERROR] Pb(55) Duplicate local variable boolean_5348
[ERROR] Pb(55) Duplicate local variable boolean_5352
[ERROR] Pb(55) Duplicate local variable boolean_5356
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] iteration 2 / 3
[INFO] 200 tests selected to be amplified over 200 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  0% |================================================ ]/[INFO] 4322 new tests generated
[WARNING] Too many tests have been generated: 4322
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_5604
[ERROR] Pb(55) Duplicate local variable boolean_5608
[ERROR] Pb(55) Duplicate local variable boolean_5612
[ERROR] Pb(55) Duplicate local variable boolean_5616
[ERROR] Pb(55) Duplicate local variable boolean_5620
[ERROR] Pb(55) Duplicate local variable boolean_5624
[ERROR] Pb(55) Duplicate local variable boolean_5628
[ERROR] Pb(55) Duplicate local variable boolean_5632
[ERROR] Pb(55) Duplicate local variable boolean_5636
[ERROR] Pb(55) Duplicate local variable boolean_5640
[ERROR] Pb(55) Duplicate local variable boolean_5644
[ERROR] Pb(55) Duplicate local variable boolean_5648
[ERROR] Pb(55) Duplicate local variable boolean_5652
[ERROR] Pb(55) Duplicate local variable boolean_5656
[ERROR] Pb(55) Duplicate local variable boolean_5660
[ERROR] Pb(55) Duplicate local variable boolean_5664
[ERROR] Pb(55) Duplicate local variable boolean_5668
[ERROR] Pb(55) Duplicate local variable boolean_5672
[ERROR] Pb(55) Duplicate local variable boolean_5676
[ERROR] Pb(55) Duplicate local variable boolean_5680
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6036
[ERROR] Pb(55) Duplicate local variable boolean_6040
[ERROR] Pb(55) Duplicate local variable boolean_6044
[ERROR] Pb(55) Duplicate local variable boolean_6048
[ERROR] Pb(55) Duplicate local variable boolean_6052
[ERROR] Pb(55) Duplicate local variable boolean_6056
[ERROR] Pb(55) Duplicate local variable boolean_6060
[ERROR] Pb(55) Duplicate local variable boolean_6064
[ERROR] Pb(55) Duplicate local variable boolean_6068
[ERROR] Pb(55) Duplicate local variable boolean_6072
[ERROR] Pb(17) Type mismatch: cannot convert from List<Object> to List<Trigger>
[ERROR] Pb(55) Duplicate local variable boolean_6076
[ERROR] Pb(55) Duplicate local variable boolean_6080
[ERROR] Pb(55) Duplicate local variable boolean_6084
[ERROR] Pb(55) Duplicate local variable boolean_6088
[ERROR] Pb(55) Duplicate local variable boolean_6092
[ERROR] Pb(55) Duplicate local variable boolean_6096
[ERROR] Pb(55) Duplicate local variable boolean_6100
[ERROR] Pb(55) Duplicate local variable boolean_6104
[ERROR] Pb(55) Duplicate local variable boolean_6108
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testRuleCondition, (10/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 34 new tests generated
[INFO] Run tests. (34)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6403
[ERROR] Pb(55) Duplicate local variable boolean_6403
[ERROR] Pb(55) Duplicate local variable boolean_6404
[ERROR] Pb(55) Duplicate local variable boolean_6403
[ERROR] Pb(55) Duplicate local variable boolean_6404
[ERROR] Pb(55) Duplicate local variable boolean_6405
[ERROR] Pb(55) Duplicate local variable boolean_6407
[ERROR] Pb(55) Duplicate local variable boolean_6407
[ERROR] Pb(55) Duplicate local variable boolean_6408
[ERROR] Pb(55) Duplicate local variable boolean_6407
[ERROR] Pb(55) Duplicate local variable boolean_6408
[ERROR] Pb(55) Duplicate local variable boolean_6409
[ERROR] Pb(55) Duplicate local variable boolean_6411
[ERROR] Pb(55) Duplicate local variable boolean_6411
[ERROR] Pb(55) Duplicate local variable boolean_6412
[ERROR] Pb(55) Duplicate local variable boolean_6411
[ERROR] Pb(55) Duplicate local variable boolean_6412
[ERROR] Pb(55) Duplicate local variable boolean_6413
[ERROR] Pb(55) Duplicate local variable boolean_6415
[ERROR] Pb(55) Duplicate local variable boolean_6415
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
[INFO] 34 tests selected to be amplified over 34 available tests
[INFO] Amplification of inputs...
 82% |================================================== ]|
 38% |=============================================== ]/[INFO] 68 new tests generated
[INFO] Run tests. (68)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6539
[ERROR] Pb(55) Duplicate local variable boolean_6539
[ERROR] Pb(55) Duplicate local variable boolean_6540
[ERROR] Pb(55) Duplicate local variable boolean_6539
[ERROR] Pb(55) Duplicate local variable boolean_6540
[ERROR] Pb(55) Duplicate local variable boolean_6541
[ERROR] Pb(55) Duplicate local variable boolean_6543
[ERROR] Pb(55) Duplicate local variable boolean_6543
[ERROR] Pb(55) Duplicate local variable boolean_6544
[ERROR] Pb(55) Duplicate local variable boolean_6543
[ERROR] Pb(55) Duplicate local variable boolean_6544
[ERROR] Pb(55) Duplicate local variable boolean_6545
[ERROR] Pb(55) Duplicate local variable boolean_6547
[ERROR] Pb(55) Duplicate local variable boolean_6547
[ERROR] Pb(55) Duplicate local variable boolean_6548
[ERROR] Pb(55) Duplicate local variable boolean_6547
[ERROR] Pb(55) Duplicate local variable boolean_6548
[ERROR] Pb(55) Duplicate local variable boolean_6549
[ERROR] Pb(55) Duplicate local variable boolean_6551
[ERROR] Pb(55) Duplicate local variable boolean_6551
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
[INFO] 68 tests selected to be amplified over 68 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
  2% |=============================================== ]-[INFO] 136 new tests generated
[INFO] Run tests. (136)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_6811
[ERROR] Pb(55) Duplicate local variable boolean_6815
[ERROR] Pb(55) Duplicate local variable boolean_6819
[ERROR] Pb(55) Duplicate local variable boolean_6823
[ERROR] Pb(55) Duplicate local variable boolean_6827
[ERROR] Pb(55) Duplicate local variable boolean_6831
[ERROR] Pb(55) Duplicate local variable boolean_6835
[ERROR] Pb(55) Duplicate local variable boolean_6839
[ERROR] Pb(55) Duplicate local variable boolean_6843
[ERROR] Pb(55) Duplicate local variable boolean_6847
[ERROR] Pb(55) Duplicate local variable boolean_6851
[ERROR] Pb(55) Duplicate local variable boolean_6855
[ERROR] Pb(55) Duplicate local variable boolean_6859
[ERROR] Pb(55) Duplicate local variable boolean_6863
[ERROR] Pb(55) Duplicate local variable boolean_6867
[ERROR] Pb(55) Duplicate local variable boolean_6871
[ERROR] Pb(55) Duplicate local variable boolean_6875
[ERROR] Pb(55) Duplicate local variable boolean_6879
[ERROR] Pb(55) Duplicate local variable boolean_6883
[ERROR] Pb(55) Duplicate local variable boolean_6887
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7211
[ERROR] Pb(55) Duplicate local variable boolean_7211
[ERROR] Pb(55) Duplicate local variable boolean_7212
[ERROR] Pb(55) Duplicate local variable boolean_7211
[ERROR] Pb(55) Duplicate local variable boolean_7212
[ERROR] Pb(55) Duplicate local variable boolean_7213
[ERROR] Pb(55) Duplicate local variable boolean_7215
[ERROR] Pb(55) Duplicate local variable boolean_7215
[ERROR] Pb(55) Duplicate local variable boolean_7216
[ERROR] Pb(55) Duplicate local variable boolean_7215
[ERROR] Pb(55) Duplicate local variable boolean_7216
[ERROR] Pb(55) Duplicate local variable boolean_7217
[ERROR] Pb(55) Duplicate local variable boolean_7219
[ERROR] Pb(55) Duplicate local variable boolean_7219
[ERROR] Pb(55) Duplicate local variable boolean_7220
[ERROR] Pb(55) Duplicate local variable boolean_7219
[ERROR] Pb(55) Duplicate local variable boolean_7220
[ERROR] Pb(55) Duplicate local variable boolean_7221
[ERROR] Pb(55) Duplicate local variable boolean_7223
[ERROR] Pb(55) Duplicate local variable boolean_7223
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
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testRuleTrigger, (11/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 26 new tests generated
[INFO] Run tests. (26)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7356
[ERROR] Pb(55) Duplicate local variable boolean_7359
[ERROR] Pb(55) Duplicate local variable boolean_7362
[ERROR] Pb(55) Duplicate local variable boolean_7365
[ERROR] Pb(55) Duplicate local variable boolean_7368
[ERROR] Pb(55) Duplicate local variable boolean_7371
[ERROR] Pb(55) Duplicate local variable boolean_7374
[ERROR] Pb(55) Duplicate local variable boolean_7377
[ERROR] Pb(55) Duplicate local variable boolean_7380
[ERROR] Pb(55) Duplicate local variable boolean_7383
[ERROR] Pb(55) Duplicate local variable boolean_7386
[ERROR] Pb(55) Duplicate local variable boolean_7389
[ERROR] Pb(55) Duplicate local variable boolean_7392
[ERROR] Pb(55) Duplicate local variable boolean_7395
[ERROR] Pb(55) Duplicate local variable boolean_7398
[ERROR] Pb(55) Duplicate local variable boolean_7401
[ERROR] Pb(55) Duplicate local variable boolean_7404
[ERROR] Pb(55) Duplicate local variable boolean_7407
[ERROR] Pb(55) Duplicate local variable boolean_7410
[ERROR] Pb(55) Duplicate local variable boolean_7413
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
[INFO] 26 tests selected to be amplified over 26 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 42% |================================================ ]\[INFO] 104 new tests generated
[INFO] Run tests. (104)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7434
[ERROR] Pb(55) Duplicate local variable boolean_7437
[ERROR] Pb(55) Duplicate local variable boolean_7440
[ERROR] Pb(55) Duplicate local variable boolean_7443
[ERROR] Pb(55) Duplicate local variable boolean_7446
[ERROR] Pb(55) Duplicate local variable boolean_7449
[ERROR] Pb(55) Duplicate local variable boolean_7452
[ERROR] Pb(55) Duplicate local variable boolean_7455
[ERROR] Pb(55) Duplicate local variable boolean_7458
[ERROR] Pb(55) Duplicate local variable boolean_7461
[ERROR] Pb(55) Duplicate local variable boolean_7464
[ERROR] Pb(55) Duplicate local variable boolean_7467
[ERROR] Pb(55) Duplicate local variable boolean_7470
[ERROR] Pb(55) Duplicate local variable boolean_7473
[ERROR] Pb(55) Duplicate local variable boolean_7476
[ERROR] Pb(55) Duplicate local variable boolean_7479
[ERROR] Pb(55) Duplicate local variable boolean_7482
[ERROR] Pb(55) Duplicate local variable boolean_7485
[ERROR] Pb(55) Duplicate local variable boolean_7488
[ERROR] Pb(55) Duplicate local variable boolean_7491
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7734
[ERROR] Pb(55) Duplicate local variable boolean_7737
[ERROR] Pb(55) Duplicate local variable boolean_7740
[ERROR] Pb(55) Duplicate local variable boolean_7743
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
[INFO] 104 tests selected to be amplified over 104 available tests
[INFO] Amplification of inputs...
100% |================================================== ]|
 62% |=========================================== ]/[INFO] 416 new tests generated
[WARNING] Too many tests have been generated: 416
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_7746
[ERROR] Pb(55) Duplicate local variable boolean_7749
[ERROR] Pb(55) Duplicate local variable boolean_7761
[ERROR] Pb(55) Duplicate local variable boolean_7764
[ERROR] Pb(55) Duplicate local variable boolean_7770
[ERROR] Pb(55) Duplicate local variable boolean_7773
[ERROR] Pb(55) Duplicate local variable boolean_7776
[ERROR] Pb(55) Duplicate local variable boolean_7785
[ERROR] Pb(55) Duplicate local variable boolean_7794
[ERROR] Pb(55) Duplicate local variable boolean_7800
[ERROR] Pb(55) Duplicate local variable boolean_7806
[ERROR] Pb(55) Duplicate local variable boolean_7809
[ERROR] Pb(55) Duplicate local variable boolean_7815
[ERROR] Pb(55) Duplicate local variable boolean_7818
[ERROR] Pb(55) Duplicate local variable boolean_7824
[ERROR] Pb(55) Duplicate local variable boolean_7830
[ERROR] Pb(55) Duplicate local variable boolean_7836
[ERROR] Pb(55) Duplicate local variable boolean_7848
[ERROR] Pb(55) Duplicate local variable boolean_7854
[ERROR] Pb(55) Duplicate local variable boolean_7857
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_8163
[ERROR] Pb(55) Duplicate local variable boolean_8166
[ERROR] Pb(55) Duplicate local variable boolean_8169
[ERROR] Pb(55) Duplicate local variable boolean_8172
[ERROR] Pb(55) Duplicate local variable boolean_8175
[ERROR] Pb(55) Duplicate local variable boolean_8178
[ERROR] Pb(55) Duplicate local variable boolean_8181
[ERROR] Pb(55) Duplicate local variable boolean_8184
[ERROR] Pb(55) Duplicate local variable boolean_8187
[ERROR] Pb(55) Duplicate local variable boolean_8190
[ERROR] Pb(55) Duplicate local variable boolean_8193
[ERROR] Pb(55) Duplicate local variable boolean_8196
[ERROR] Pb(55) Duplicate local variable boolean_8199
[ERROR] Pb(55) Duplicate local variable boolean_8202
[ERROR] Pb(55) Duplicate local variable boolean_8205
[ERROR] Pb(55) Duplicate local variable boolean_8208
[ERROR] Pb(55) Duplicate local variable boolean_8211
[ERROR] Pb(55) Duplicate local variable boolean_8214
[ERROR] Pb(55) Duplicate local variable boolean_8217
[ERROR] Pb(55) Duplicate local variable boolean_8220
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 1 test fail, generating try/catch/fail blocks...
[INFO] Could not generate any test with assertions
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] Amplification of testSubscribers, (12/12)
[INFO] iteration 0 / 3
[INFO] 1 tests selected to be amplified over 1 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
[INFO] 46 new tests generated
[INFO] Run tests. (46)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 46 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]-
[INFO] Run instrumented tests. (138)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 46 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 46 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 1 / 3
[INFO] 46 tests selected to be amplified over 46 available tests
[INFO] Amplification of inputs...
100% |================================================== ]-
 43% |=============================================== ]|[INFO] 2310 new tests generated
[WARNING] Too many tests have been generated: 2310
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 193 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 85 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 85 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] iteration 2 / 3
[INFO] 85 tests selected to be amplified over 85 available tests
[INFO] Amplification of inputs...
100% |================================================== ]/
 11% |================================================ ]-[INFO] 4395 new tests generated
[WARNING] Too many tests have been generated: 4395
[INFO] Number of generated test reduced to 200
[INFO] Run tests. (200)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] 196 test pass, generating assertion...
[INFO] Add observations points in passing tests.
[INFO] Instrumentation...
100% |================================================== ]|
[INFO] Run instrumented tests. (600)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Generating assertions...
[INFO] 84 new tests with assertions generated
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
[INFO] Assertion amplification: 84 test method(s) has been successfully amplified.
[INFO] Using /home/smorka/development/tellulib/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage -DtargetTests=no.tellu.lib.data.model.ModelTest
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] 789 mutants has been generated (789)
[INFO] 0 amplified test methods has been selected to be kept.
[INFO] 1 amplified test methods has been selected to be kept. (global: 9)
[INFO] elapsedTime 1864211
[INFO] Amplification succeed.
[INFO] Elapsed time 1865367 ms
[INFO] 
Test class that has been amplified: no.tellu.lib.data.model.ModelTest
The original test suite kills 380 mutants
The amplification results with 9 new tests
it kills 12 more mutants

[INFO] Writing report in target/dspot/output/report.txt
[INFO] DSpot amplified your test suite without errors. (no errors report will be outputted)
[INFO] The amplification ends up with 9 amplified test methods over 1 test classes.
[INFO] Print no.tellu.lib.data.model.ModelTest.java with 9 amplified test cases in target/dspot/output
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  31:12 min
[INFO] Finished at: 2019-10-22T15:10:58+02:00
[INFO] ------------------------------------------------------------------------
