# MavenSurefireFailsafeExamples

Run full build:
---
`mvn clean install`

To generate html reports:
---
`mvn surefire-report:report-only surefire-report:failsafe-report-only`

report will be generated under

_{projectDirectory}/target/site/_

To run a single test class using Surefire Plugin:
---
`mvn clean install -Dtest=com.harishkannarao.SurefireSampleExtendedUnitTest`

To run a single test method using Surefire Plugin:
---
`mvn clean install -Dtest=com.harishkannarao.SurefireSampleUnitTest#surefireSampleUnitTest1`

To run a single test class using Failsafe Plugin:
---
`mvn clean install -Dit.test=com.harishkannarao.FailsafeSampleIT`

To run a single test method using Failsafe Plugin:
---
`mvn clean install -Dit.test=com.harishkannarao.FailsafeSampleIT#failsafeSampleIntegrationTest1`

To skip tests by Surefire Plugin:
---
`mvn clean install -DskipTests`

To skip tests by Failsafe Plugin:
---
`mvn clean install -DskipITs`
