Simple User Greeting App

=========================



A minimal Java Servlet web application that greets users by name.

Built without build tools (like Maven or Gradle) — compiled and deployed manually to learn the core Servlet-JSP workflow.



------------------------------------------------------------



How It Works

-------------

1\. User enters their name in index.html

2\. GreetingServlet.java receives the request and processes it

3\. The response is forwarded to greeting.jsp, which displays a personalized greeting



------------------------------------------------------------



Requirements

-------------

\- JDK 8+

\- Apache Tomcat (or any Servlet container)



------------------------------------------------------------



MVC Structure

--------------

Model: Encapsulates business logic (User.java)

View: Displays data only (greeting.jsp)

Controller: Handles request/response flow (GreetingServlet.java)



This project intentionally avoids frameworks to give you direct experience with:

\- Servlets

\- HTTP requests and sessions

\- JSP Expression Language (EL)



------------------------------------------------------------



Run Instructions

-----------------

1\. Place the project in Tomcat’s webapps/ directory

2\. Start Tomcat (bin/startup.bat or startup.sh)

3\. Open your browser and go to:

&nbsp;  http://localhost:8080/SimpleUserGreetingApp/



------------------------------------------------------------



Next Step Ideas

----------------

\- Add session tracking (remember user name)

\- Log greetings using a file or database

\- Add CSS for better UI



------------------------------------------------------------





