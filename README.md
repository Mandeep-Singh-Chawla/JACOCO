**Steps to find Automation code coverage using JaCoCo**

1) **Prerequisite**:

a) Login to Application server with sudo user
b) Create a directory for Jacoco
c) Download or copy jacocoagent.jar and jacococli.jar from https://www.jacoco.org/jacoco/


2) **Start the Server with JaCoCo Agent:**

a) Use below command to start your application with the JaCoCo agent:
***Java -javaagent:lib/jacocoagent.jar=address=*,port=36320,destfile=jacoco-it.exec,output=tcpserver /path/to/your-web-app.war(.jar)**
b) Replace /path/to/jacocoagent.jar with the actual path to the JaCoCo agent JAR.
c) Replace /path/to/your-web-app.war(.jar) with the path of your application file.
d) This command starts your web application with the JaCoCo agent and specifies the destination file (destfile=jacoco-it.exec) where JaCoCo will store the coverage data.


**Perform Actions on the Web Application:**

Once the server is running, perform actions(run automation scripts) on your application to exercise the code you want to cover.


**Dump Coverage Data (Optional):**

a) If you want to collect the coverage data while the server is still running, you can use the below JaCoCo command to dump the coverage data:
**java -jar /path/to/jacococli.jar dump --address localhost --port 36320 --destfile jacoco-server.exec**
b) Replace /path/to/jacococli.jar with the actual path to the JaCoCo CLI JAR.
c) Adjust --address and --port if you have configured the JaCoCo agent with a different address and port.


**Generate Reports (Optional):**

a) After collecting the coverage data, you can use the below JaCoCo command to generate reports:
**java -jar /path/to/jacococli.jar report jacoco-server.exec --classfiles /path/to/your/classes --sourcefiles /path/to/your/source --html report**
b) Replace /path/to/jacococli.jar with the actual path to the JaCoCo CLI JAR.
c) Replace /path/to/your/classes with the path to your compiled classes(till /classes/com).
d) Replace /path/to/your/source with the path to your source code(till /src/main/java).

**Open html report**

a) Copy report folder to local
b) Click on index.html inside report folder


