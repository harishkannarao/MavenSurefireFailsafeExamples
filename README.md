# MavenSurefireFailsafeExamples

JDK version:
---
25 or latest

Run full build:
---

    mvn clean install

To generate html reports:
---

    mvn surefire-report:report-only surefire-report:failsafe-report-only

report will be generated under

_{projectDirectory}/target/site/_

To skip tests by Surefire Plugin and Failsafe Plugin:
---

    mvn clean install -DskipTests

To skip tests by Failsafe Plugin:
---

    mvn clean install -DskipITs

To execute tests only by Failsafe Plugin and skip tests by Surefire Plugin:
---

    mvn clean test-compile failsafe:integration-test failsafe:verify

To stop the build after first unit test failure:
---

    mvn clean test -Dsurefire.skipAfterFailureCount=1

To stop the build after first integration test failure:
---

    mvn clean test-compile failsafe:integration-test failsafe:verify -Dfailsafe.skipAfterFailureCount=1

To stop the build after first unit or integration test failure:
---

    mvn clean install -Dsurefire.skipAfterFailureCount=1 -Dfailsafe.skipAfterFailureCount=1

To run a single test class using Surefire Plugin:
---

    mvn clean install -Dsurefire.failIfNoSpecifiedTests=false -Dtest=com.harishkannarao.SurefireSampleExtendedUnitTest

To run a single test method using Surefire Plugin:
---

    mvn clean install -Dsurefire.failIfNoSpecifiedTests=false -Dtest=com.harishkannarao.SurefireSampleUnitTest#surefireSampleUnitTest1

To run a multiple test methods (comma separated) using Surefire Plugin:
---

    mvn clean install -Dtest=com.harishkannarao.SurefireSampleUnitTest#surefireSampleUnitTest1,com.harishkannarao.SurefireSampleExtendedUnitTest#surefireSampleUnitTest2 -Dsurefire.failIfNoSpecifiedTests=false

To run a single test class using Failsafe Plugin:
---

    mvn clean install -Dfailsafe.failIfNoSpecifiedTests=false -Dit.test=com.harishkannarao.FailsafeSampleIT

To run a single test method using Failsafe Plugin:
---

    mvn clean install -Dfailsafe.failIfNoSpecifiedTests=false -Dit.test=com.harishkannarao.FailsafeSampleIT#failsafeSampleIntegrationTest1

To run a multiple test methods (comma separated) using Failsafe Plugin:
---

    mvn clean install -Dfailsafe.failIfNoSpecifiedTests=false -Dit.test=com.harishkannarao.FailsafeSampleIT#failsafeSampleIntegrationTest1,com.harishkannarao.FailsafeSampleIntegrationTest.failsafeSampleIntegrationTest2