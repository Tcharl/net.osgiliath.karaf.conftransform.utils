# What is it?

It transforms karaf features to virgo plans

## How to use
You must have M2_REPO Environnement variable (or -DM2_REPO variable)
Just put your karaf features in the features/in folder then run main, it will gen plans to plans/out folder
If you want to generate associated pom, take a look at the pom generator module
# Limitations

It will not generate config, dependencies that are not in you local repo, or non maven compliant dependencies ( karaf format!= mvn:<groupId>/<artifactId>/<version>...)
So you will have some work to make it work, but the boilerplate work will be done. 