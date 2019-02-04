* Commit: https://github.com/xwiki/xwiki-commons/commit/1df3a1816b0766737bd67140376381ac64577fa4
* Command line: `mvn dspot:amplify-unit-tests` with config:

```
        <plugin>
          <groupId>eu.stamp-project</groupId>
          <artifactId>dspot-maven</artifactId>
          <version>1.2.1</version>
          <configuration>
            <clean>true</clean>
            <descartes>true</descartes>
            <verbose>true</verbose>
            <withComment>true</withComment>
            <generateNewTestClass>true</generateNewTestClass>
            <pathToProperties>./dspot.properties</pathToProperties>
            <amplifiers>
              <!-- Uncomment the amplifier to use or pass them on the command line using -Damplifiers=... -->
              <!--amplifier>StringLiteralAmplifier</amplifier-->
              <!--amplifier>NumberLiteralAmplifier</amplifier-->
              <!--amplifier>CharLiteralAmplifier</amplifier-->
              <!--amplifier>BooleanLiteralAmplifier</amplifier-->
              <amplifier>AllLiteralAmplifiers</amplifier>
              <amplifier>MethodAdd</amplifier>
              <amplifier>MethodRemove</amplifier>
              <amplifier>MethodGeneratorAmplifier</amplifier>
              <amplifier>ReturnValueAmplifier</amplifier>
              <amplifier>ReplacementAmplifier</amplifier>
              <amplifier>NullifierAmplifier</amplifier>
            </amplifiers>
          </configuration>
        </plugin>
```

* DSpot version: 1.2.1
* Code coverage: from 30.817% to 32.04% 
* Mutation score (descartes): unchanged from 33% to 33%
* Session test time: 3 hour
