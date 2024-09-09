mvn archetype:generate -DgroupId=com.jovisco -DartifactId=simple-one -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# generate Maven wrapper - with version
mvn -N io.takari:maven:wrapper -Dmaven=3.9.8

