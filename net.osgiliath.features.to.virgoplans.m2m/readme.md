.h1 What is it?
It transforms karaf features to virgo plans
.h2 How to use
Just put your karaf features in the features/in folder then run main, it will gen plans to plans/out folder
If you want to generate associated pom, take a look at the pom generator module
.h2 limitations
It will not generate config, dependencies that are not in you local repo, or non maven compliant dependencies ( karaf format!= mvn:<groupId>/<artifactId>/<version>...)
So you will have some work to make it work, but the boilerplate work will be done. 