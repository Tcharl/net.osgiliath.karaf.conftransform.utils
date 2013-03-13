# Karaf configuration transform utils

## What is it?

This is an open source set of bundles that allow to convert a karaf styled feature to a Maven pom configuration (it will generate <dependencies>, <dependencyManagement> and <properties> block)

### Example
#### Use-Case
Let's imagine you have a set of dependencies:
* <artifactId>A</artifactId><version>1_1</version>
** <artifactId>B</artifactId><version>1_2</version>
and 
* <artifactId>C</artifactId><version>1_1</version>

Your Karaf feature will look like this:
<feature name='all' version='1' resolver='(obr)' start-level='50'>
    <bundle dependencies="true">mvn:group/A/1_1</bundle>
	<bundle>mvn:group/C/1_1</bundle>
</feature>

#### Pom Gen
Passing through the net.osgiliath.maven.pom.generator plugin, you'll have an output like this:
<dependencies>
	<dependency>
		<artifactId>A</artifactId>
		<groupId>group</groupId>
		<scope>provided</scope>
	</dependency>
	<dependency>
		<artifactId>B</artifactId>
		<groupId>group</groupId>
		<scope>provided</scope>
	</dependency>
	<dependency>
		<artifactId>C</artifactId>
		<groupId>group</groupId>
		<scope>provided</scope>
	</dependency>
<dependencies>
<dependencyManagement>
	<dependency>
		<artifactId>A</artifactId>
		<groupId>group</groupId>
		<version>${A.version}</version>
	</dependency>
	<dependency>
		<artifactId>B</artifactId>
		<groupId>group</groupId>
		<version>${B.version}</version>
	</dependency>
	<dependency>
		<artifactId>C</artifactId>
		<groupId>group</groupId>
		<version>${C.version}</version>
	</dependency>
<dependencyManagement>
<properties>
<A.version>1_1</A.version>
<B.version>1_2</B.version>
<C.version>1_1</C.version>
</properties>
And if you enable the -DVirgo jvm property, it will also generate a configuration to copy these artifactto your ${virgo.path}/repository/usr folder

#### Virgo plan gen
If you've all the artifact in your local repo and launch net.osgiliath.features.to.virgoplans.m2m with the feature above (and the -DM2_REPO jvm opt), it will generate a virgo plan containing these dependencies:


Bundles that will convert karaf features to maven poms dependencies (and dependency copy-deps to <virgo>/repository/usr folder for virgo) or virgo plans
<plan:Plan xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:plan="http://www.eclipse.org/virgo/schema/plan" atomic="true" name="all" scoped="false" version="1">
  <artifact name="A" type="bundle" version="1.1"/><!-- name and version extracted from the bundle MANIFEST.MF-->
  <artifact name="B" type="bundle" version="1.2"/>
  <artifact name="C" type="bundle" version="1.1"/>
</plan:Plan>

This will also work for nested features.
