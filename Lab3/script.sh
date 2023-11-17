javac -d . *.java */*.java */*/*.java
jar cfm Lab3.jar META-INF/MANIFEST.mf -C . Lab3/

java -jar Lab3.jar

rm -rf Lab3


