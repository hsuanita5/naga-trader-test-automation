# NagaTrader Test Automation Project

This repo serves as a test suite for Naga Trader web application. Uses Selenium webdriver and Cucumber BDD approach.

*Prerequisites:*
- java jdk-8
- maven 3.5.4

Clone this repo and from project root run tests (project with multiple runner classes and with tag):

`mvn clean compile test -P<ENVIRONMENT> -DsuiteXmlFile=<RUNNERNAME>.xml -Dcucumber.options="--tags @<TAGNAME>"`

To run all tests in default environment (when runner does not contain tags), use:

`mvn clean compile test -DsuiteXmlFile=<RUNNERNAME>.xml`

To run tests in specific environment (when runner contains tags):

`mvn clean compile test -P<ENVIRONMENT> -DsuiteXmlFile=<nameOfRunnerThatContainsTags>.xml -Dcucumber.options="--tags @<TAGNAME>`

Maven commands listed above suite current test/configuration and it based on tests, it will be expanded.

After test execution, find test results report in /output/report.html
