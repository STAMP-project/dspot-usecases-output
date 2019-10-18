Running DSpot on the tellucloud project, using default JacocoCoverageSelector. 

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.lib.data.model.ModelTest -Dtest-criterion=JacocoCoverageSelector
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
[INFO] Deleting /home/smorka/development/tellulib/target
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
[INFO] Total time:  3.483 s
[INFO] Finished at: 2019-10-18T15:41:26+02:00
[INFO] ------------------------------------------------------------------------
[INFO] Amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Assertion amplification of no.tellu.lib.data.model.ModelTest (12 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
Loading /home/smorka/development/tellulib/target/dspot/TestResult.ser
Loading /home/smorka/development/tellulib/target/dspot/Coverage.ser
Loading /home/smorka/development/tellulib/target/dspot/CoveragePerTest.ser
[INFO] Run tests. (2)
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[ERROR] Error(s) during compilation:
[ERROR] Pb(55) Duplicate local variable boolean_8
[ERROR] Pb(55) Duplicate local variable boolean_0
[ERROR] Pb(55) Duplicate local variable boolean_0
[ERROR] Pb(55) Duplicate local variable boolean_1
[ERROR] Pb(55) Duplicate local variable boolean_4
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/tellulib/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/development/tellulib/target/classes/:/home/smorka/development/tellulib/target/test-classes/:/home/smorka/development/tellulib/target/dspot/dependencies/: -d /home/smorka/development/tellulib/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/tellulib/target/dspot/tmp_test_sources/no/tellu/lib/data/model/ModelTest.java
[WARNING] Error when executing tests before Assertion Amplification:
eu.stamp_project.dspot.AmplificationException: Every test methods are uncompilable
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:161)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:131)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertPassingAndFailingTests(AssertionGenerator.java:119)
	at eu.stamp_project.dspot.assertiongenerator.AssertionGenerator.assertionAmplification(AssertionGenerator.java:74)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:219)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:114)
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
[INFO] 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] elapsedTime 6653
[WARNING] DSpot could not obtain any amplified test method.
[WARNING] You can customize the following options: --amplifiers, --test-criterion, --iteration, --budgetizer etc, and retry with a new configuration.
Loading /home/smorka/development/tellulib/target/dspot/Coverage.ser
[INFO] Amplification succeed.
[INFO] Elapsed time 7977 ms
[INFO] 
Initial instruction coverage: 317 / 22392
1.42%
Amplification results with 0 amplified tests.
Amplified instruction coverage: 317 / 22392
1.42%

[INFO] Writing report in target/dspot/output/report.txt
[INFO] DSpot amplified your test suite without errors. (no errors report will be outputted)
[INFO] The amplification ends up with 0 amplified test methods over 0 test classes.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  16.252 s
[INFO] Finished at: 2019-10-18T15:41:36+02:00
[INFO] ------------------------------------------------------------------------
