\# Simple User Greeting App



A minimal Java Servlet app that greets users by name.  

Built \*\*without build tools\*\* — compiled and deployed manually.



---



\##  How It Works

1\. User enters their name in `index.html`.

2\. `GreetingServlet.java` processes the input.

3\. Response shows a personalized greeting.



---



\## ⚙️ Requirements

\- JDK 8+

\- Apache Tomcat (or any Servlet container)



---



\##  MVC



\- \*\*Model\*\*: Encapsulates business logic (`User` class ).  

\- \*\*View\*\*: Displays data only (`greeting.jsp`).  

\- \*\*Controller\*\*: Handles flow (`GreetingServlet` class).  



No framework abstractions: You directly see Servlet, request, session, and JSP EL in action.



