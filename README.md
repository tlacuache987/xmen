# xmen

Hello.

This is a test about deploying CXF REST services using Tomcat 7 + Java 8 + Spring 4.2.1 

This REST application solves the Mutant / No-mutant Magneto x-men problem...

Requirements:

1. Java 8
2. Tomcat 7
3. Maven 3.x
3. Lombok library (www.projectlombok.org) (only if you want to import the maven project into your favorite IDE)

Installation:
1. clone this repo.
2. get inside xmen folder
3. open a terminal and compile using command: mvn clean install
4. the above instruction will compile de parent project, this is a multi module maven project.
5. get inside xmen-mutant-ws-server
6. launch the application using command: mvn jetty:run
7. once jetty starts, open a browser on: http://localhost:8081/xmen-mutant-ws-server , here are the instructions to use de API.

If you want to import this project on any IDE, you MUST need to install de Lombok library on your environment,
follow the instructions on (www.projectlombok.org). You need to get the jar and install it like a eclipse, Netbeans or IDEA plugin, this library helps in generate getters, setters, constructors, hash code and many others methods using @Annotations.
If you dont know this library, I invite you to meet this.

Happy programming.
