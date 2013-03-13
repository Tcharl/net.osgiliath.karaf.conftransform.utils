# What is it?

It transforms karaf feature to pom dependencies
## How to use

Just put your karaf features in the features/in folder then run main, it will gen poms to poms/out folder
it will not generate config or non maven compliant dependencies ( karaf format!= mvn:<groupId>/<artifactId>/<version>...)
note: if you don't want to generate dependency plugin configuration, uncomment the System.setProperty("Virgo", true) line in the main 