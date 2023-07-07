
# se mettre dans la repertoire des classes
cd /usr/share/apache-tomcat/webapps/Sprint7/WEB-INF/classes
# construire le fichier jar
jar -cvf ../data_etu1853.jar /usr/share/apache-tomcat/webapps/Sprint7/WEB-INF/classes
# copie du jar dans le projet de test
cd ../
cp data_etu1853.jar /usr/share/apache-tomcat/webapps/Sprint7/WEB-INF/lib
