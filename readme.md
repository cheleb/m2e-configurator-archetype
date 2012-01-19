Simple archetype to build m2e configurator.

Example of usage:

archetype:generat -DarchetypeGroupId=net.orcades.maven.archetype -DarchetypeArtifactId=m2e-configurator-archetype -DarchetypeVersion=1.0.0 -DartifactId=org.mycommunity.m2e.dummy -DgroupId=org.mycommunity.m2e.dummy -Dversion=1.0.0-SNAPSHOT -Dcategory="Dummy category" -DmojoArtifactId=maven-dummy-plugin -DmojoGroupId=org.mycorp.maven.mojo -DmojoVersion=1.0.0 -DclassPrefix=Dummy -DmojoGoal=goIt -Dname=Dummy

Note that if "version" must be maven style, it may be specified as "SNAPSHOT" but not "qualifier". Nevertheless when set to "SNAPSHOT" the OSGi/eclipse related files will use the "qualifier". 
