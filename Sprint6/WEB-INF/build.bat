


cd "C:/Program Files/Apache Software Foundation/Tomcat 10.0/webapps/Sprint6/WEB-INF/classes"

jar -cvf ../etu1828.jar .

cd ../
copy etu1828.jar "C:/Program Files/Apache Software Foundation/Tomcat 10.0/webapps/Sprint6/WEB-INF/lib"


cd "D:/Logiciel/Tomcat/webapps/Sprint6"

jar -cvf test_frame.war .

move /Y test_frame.war "C:/Program Files/Apache Software Foundation/Tomcat 10.0/webapps"