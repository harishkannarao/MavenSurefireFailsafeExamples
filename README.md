# MavenSurefireFailsafeExamples

Run full build (unit tests, deploy app and functional tests):
---
`mvn clean install`

To generate html reports:
---
`mvn surefire-report:report-only surefire-report:failsafe-report-only`

report will be generated under

_{projectDirectory}/target/site/_

