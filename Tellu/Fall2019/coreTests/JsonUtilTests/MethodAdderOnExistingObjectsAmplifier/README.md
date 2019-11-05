Runnning default Amplifier

```shell
mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dtest=no.tellu.findit.util.JsonUtilTest -Dtime-out=1000 -Damplifiers=MethodAdderOnExistingObjectsAmplifier
```

## Output

[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< no.tellu.cloud:core >-------------------------
[INFO] Building TelluCloud Library - Core 3.14-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dspot-maven:2.2.0:amplify-unit-tests (default-cli) @ core ---
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
[INFO] Using /home/smorka/development/core/pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn clean test -DskipTests dependency:build-classpath -Dmdep.outputFile=target/dspot/classpath
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< no.tellu.cloud:core >-------------------------
[INFO] Building TelluCloud Library - Core 3.14-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ core ---
[INFO] Deleting /home/smorka/development/core/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ core ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ core ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 359 source files to /home/smorka/development/core/target/classes
[WARNING] /home/smorka/development/core/src/main/java/no/tellu/findit/dao/hibernate/TagDAOHibernate.java: /home/smorka/development/core/src/main/java/no/tellu/findit/dao/hibernate/TagDAOHibernate.java uses unchecked or unsafe operations.
[WARNING] /home/smorka/development/core/src/main/java/no/tellu/findit/dao/hibernate/TagDAOHibernate.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ core ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 7 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ core ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 30 source files to /home/smorka/development/core/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.15:test (default-test) @ core ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-dependency-plugin:2.8:build-classpath (default-cli) @ core ---
[INFO] Wrote classpath file '/home/smorka/development/core/target/dspot/classpath'.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.990 s
[INFO] Finished at: 2019-11-04T12:25:40+01:00
[INFO] ------------------------------------------------------------------------
[INFO] Amplification of no.tellu.findit.util.JsonUtilTest (1 test(s))
[INFO] Assertion amplification of no.tellu.findit.util.JsonUtilTest (1 test(s))
[INFO] Cache 'frameworkCache' created in EhcacheManager.
[INFO] Using /home/smorka/development/core/.dspot_pom.xml to run maven.
[INFO] Using /usr/share/maven/ for maven home
[INFO] run maven: /usr/share/maven//bin/mvn org.pitest:pitest-maven:mutationCoverage 
[WARN] Maven will be executed in interactive mode, but no input stream has been configured for this MavenInvoker instance.
[INFO] The original test suite kill 244 / 1857
[INFO] Compiling with -proceedOnError -encoding UTF-8 -cp /home/smorka/development/core/target/dspot/tmp_test_sources:/home/smorka/.m2/repository/no/tellu/lib/tellulib/3.0/tellulib-3.0.jar:/home/smorka/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/home/smorka/.m2/repository/no/tellu/expression-filter/1.0/expression-filter-1.0.jar:/home/smorka/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/smorka/.m2/repository/no/tellu/cloud/common/2.3.1/common-2.3.1.jar:/home/smorka/.m2/repository/org/jdom/jdom/1.1/jdom-1.1.jar:/home/smorka/.m2/repository/no/tellu/sf/sf-hibernate/4.11-TELLULIB-2.0.0.211/sf-hibernate-4.11-TELLULIB-2.0.0.211.jar:/home/smorka/.m2/repository/org/hibernate/hibernate-core/3.3.1.GA/hibernate-core-3.3.1.GA.jar:/home/smorka/.m2/repository/antlr/antlr/2.7.6/antlr-2.7.6.jar:/home/smorka/.m2/repository/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar:/home/smorka/.m2/repository/javax/transaction/jta/1.1/jta-1.1.jar:/home/smorka/.m2/repository/org/hibernate/ejb3-persistence/1.0.2.GA/ejb3-persistence-1.0.2.GA.jar:/home/smorka/.m2/repository/org/hibernate/hibernate-annotations/3.4.0.GA/hibernate-annotations-3.4.0.GA.jar:/home/smorka/.m2/repository/org/hibernate/hibernate-commons-annotations/3.1.0.GA/hibernate-commons-annotations-3.1.0.GA.jar:/home/smorka/.m2/repository/javassist/javassist/3.11.0.GA/javassist-3.11.0.GA.jar:/home/smorka/.m2/repository/javax/mail/mail/1.4/mail-1.4.jar:/home/smorka/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar:/home/smorka/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/home/smorka/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/home/smorka/.m2/repository/commons-net/commons-net/3.6/commons-net-3.6.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:/home/smorka/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:/home/smorka/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/smorka/.m2/repository/net/sf/json-lib/json-lib/2.4/json-lib-2.4-jdk15.jar:/home/smorka/.m2/repository/commons-beanutils/commons-beanutils/1.8.0/commons-beanutils-1.8.0.jar:/home/smorka/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:/home/smorka/.m2/repository/commons-lang/commons-lang/2.5/commons-lang-2.5.jar:/home/smorka/.m2/repository/net/sf/ezmorph/ezmorph/1.0.6/ezmorph-1.0.6.jar:/home/smorka/.m2/repository/com/vividsolutions/jts/1.13/jts-1.13.jar:/home/smorka/.m2/repository/xerces/xercesImpl/2.11.0.SP5/xercesImpl-2.11.0.SP5.jar:/home/smorka/.m2/repository/joda-time/joda-time/2.9.9/joda-time-2.9.9.jar:/home/smorka/.m2/repository/no/tellu/lib/mapping/2.0.0.211/mapping-2.0.0.211.jar:/home/smorka/.m2/repository/jcs/jcs/1.3/jcs-1.3.jar:/home/smorka/.m2/repository/commons-configuration/commons-configuration/1.4/commons-configuration-1.4.jar:/home/smorka/.m2/repository/commons-logging/commons-logging-api/1.0.4/commons-logging-api-1.0.4.jar:/home/smorka/.m2/repository/commons-digester/commons-digester/1.8/commons-digester-1.8.jar:/home/smorka/.m2/repository/commons-beanutils/commons-beanutils-core/1.7.0/commons-beanutils-core-1.7.0.jar:/home/smorka/.m2/repository/commons-jxpath/commons-jxpath/1.2/commons-jxpath-1.2.jar:/home/smorka/.m2/repository/xerces/xerces/1.2.3/xerces-1.2.3.jar:/home/smorka/.m2/repository/ant/ant-optional/1.5.1/ant-optional-1.5.1.jar:/home/smorka/.m2/repository/commons-dbcp/commons-dbcp/1.2.2/commons-dbcp-1.2.2.jar:/home/smorka/.m2/repository/commons-pool/commons-pool/1.3/commons-pool-1.3.jar:/home/smorka/.m2/repository/concurrent/concurrent/1.0/concurrent-1.0.jar:/home/smorka/.m2/repository/mysql/mysql-connector-java/3.0.10/mysql-connector-java-3.0.10.jar:/home/smorka/.m2/repository/javax/sql/jdbc-stdext/2.0/jdbc-stdext-2.0.jar:/home/smorka/.m2/repository/log4j/log4j/1.2.12/log4j-1.2.12.jar:/home/smorka/.m2/repository/tomcat/tomcat-util/3.2.1/tomcat-util-3.2.1.jar:/home/smorka/.m2/repository/velocity/velocity/1.5/velocity-1.5.jar:/home/smorka/.m2/repository/oro/oro/2.0.8/oro-2.0.8.jar:/home/smorka/.m2/repository/xmlrpc/xmlrpc/2.0/xmlrpc-2.0.jar:/home/smorka/.m2/repository/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar:/home/smorka/.m2/repository/berkeleydb/berkeleydb/1.5.1/berkeleydb-1.5.1.jar:/home/smorka/.m2/repository/com/datastax/cassandra/cassandra-driver-core/3.5.0/cassandra-driver-core-3.5.0.jar:/home/smorka/.m2/repository/com/google/guava/guava/19.0/guava-19.0.jar:/home/smorka/.m2/repository/io/dropwizard/metrics/metrics-core/3.2.2/metrics-core-3.2.2.jar:/home/smorka/.m2/repository/com/github/jnr/jnr-ffi/2.1.7/jnr-ffi-2.1.7.jar:/home/smorka/.m2/repository/com/github/jnr/jffi/1.2.16/jffi-1.2.16.jar:/home/smorka/.m2/repository/com/github/jnr/jffi/1.2.16/jffi-1.2.16-native.jar:/home/smorka/.m2/repository/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar:/home/smorka/.m2/repository/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.jar:/home/smorka/.m2/repository/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar:/home/smorka/.m2/repository/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar:/home/smorka/.m2/repository/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar:/home/smorka/.m2/repository/com/github/jnr/jnr-x86asm/1.0.2/jnr-x86asm-1.0.2.jar:/home/smorka/.m2/repository/com/github/jnr/jnr-posix/3.0.44/jnr-posix-3.0.44.jar:/home/smorka/.m2/repository/com/github/jnr/jnr-constants/0.9.9/jnr-constants-0.9.9.jar:/home/smorka/.m2/repository/io/netty/netty-all/4.1.17.Final/netty-all-4.1.17.Final.jar:/home/smorka/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:/home/smorka/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:/home/smorka/.m2/repository/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar:/home/smorka/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/home/smorka/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.25/jcl-over-slf4j-1.7.25.jar:/home/smorka/.m2/repository/io/prometheus/simpleclient/0.3.0/simpleclient-0.3.0.jar:/home/smorka/.m2/repository/org/easymock/easymock/3.5.1/easymock-3.5.1.jar:/home/smorka/.m2/repository/org/objenesis/objenesis/2.6/objenesis-2.6.jar:/home/smorka/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/smorka/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/smorka/.m2/repository/org/hsqldb/hsqldb/2.4.0/hsqldb-2.4.0.jar:/home/smorka/development/core/target/classes/:/home/smorka/development/core/target/test-classes/:/home/smorka/development/core/target/dspot/dependencies/: -d /home/smorka/development/core/target/test-classes -1.8 -preserveAllLocals -noExit -enableJavadoc -proc:none /home/smorka/development/core/target/dspot/tmp_test_sources/no/tellu/findit/util/JsonUtilTest.java
[WARNING] Something bad happened when DSpot tried to execute the tests before starting the amplification.
java.lang.RuntimeException: Forked process did not finished correctly
	at eu.stamp_project.testrunner.EntryPoint.runGivenCommandLine(EntryPoint.java:495)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:235)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:230)
	at eu.stamp_project.testrunner.EntryPoint.runTests(EntryPoint.java:195)
	at eu.stamp_project.utils.execution.TestRunner.run(TestRunner.java:98)
	at eu.stamp_project.utils.execution.TestRunner.runGivenTestMethods(TestRunner.java:66)
	at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:136)
	at eu.stamp_project.utils.compilation.TestCompiler.compileRunAndDiscardUncompilableAndFailingTestMethods(TestCompiler.java:60)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:98)
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

[INFO] elapsedTime 1012037
[WARNING] DSpot could not obtain any amplified test method.
[WARNING] You can customize the following options: --amplifiers, --test-criterion, --iteration, --budgetizer etc, and retry with a new configuration.
[INFO] Amplification succeed.
[INFO] Elapsed time 1012933 ms
java.lang.NullPointerException
	at eu.stamp_project.utils.report.output.selector.TestSelectorReportImpl.lambda$output$0(TestSelectorReportImpl.java:35)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)
	at java.util.HashMap$KeySpliterator.forEachRemaining(HashMap.java:1556)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
	at eu.stamp_project.utils.report.output.selector.TestSelectorReportImpl.output(TestSelectorReportImpl.java:36)
	at eu.stamp_project.utils.report.GlobalReport.output(GlobalReport.java:35)
	at eu.stamp_project.Main.run(Main.java:61)
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
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  17:04 min
[INFO] Finished at: 2019-11-04T12:42:37+01:00
[INFO] ------------------------------------------------------------------------
