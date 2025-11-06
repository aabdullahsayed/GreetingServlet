\#  Simple User Greeting App



A minimal \*\*Java Servlet\*\* web application that greets users by name.  

Built \*\*without build tools (like Maven or Gradle)\*\* — compiled and deployed manually to learn the core Servlet-JSP workflow.



---



\##  How It Works



1\. User enters their name in \*\*`index.html`\*\*.  

2\. \*\*`GreetingServlet.java`\*\* receives the request and processes it.  

3\. The response is forwarded to \*\*`greeting.jsp`\*\*, which displays a personalized greeting.



---



\## ⚙️ Requirements



\- ☕ \*\*JDK 8+\*\*  

\- 🐱‍💻 \*\*Apache Tomcat\*\* (or any Servlet container)



---



\##  MVC Structure



| Layer | Description | Example File |

|--------|--------------|--------------|

| \*\*Model\*\* | Encapsulates business logic | `User.java` |

| \*\*View\*\* | Displays data only | `greeting.jsp` |

| \*\*Controller\*\* | Handles request/response flow | `GreetingServlet.java` |



This project intentionally avoids frameworks — giving you direct experience with:

\- \*\*Servlets\*\*  

\- \*\*HTTP requests \& sessions\*\*  

\- \*\*JSP Expression Language (EL)\*\*  



---



