mvn clean compile test -Dcucumber.options="--tags @smoke,@loginDependency"
open ./output/report.html
