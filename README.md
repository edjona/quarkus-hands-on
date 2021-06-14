# JAX-RS
JAX-RS is nothing more than a specification, a set of interfaces and annotations offered by Java EE.

| Scope | Description | Duration |
| :--- |---|---|
| Request | @RequestScoped | A user’s interaction with a web application in a single HTTP request. |
| Session | @SessionScoped | A user’s interaction with a web application across multiple HTTP requests. |
|Application | @ApplicationScoped | A single bean instance is used for the application and shared among all injection points. The instance is created lazily, i.e. once a method is invoked upon the client proxy.|
|Dependent | @Dependent | The default scope if none is specified; it means that an object exists to serve exactly one client (bean) and has the same lifecycle as that client (bean). |
|Conversation | @ConversationScoped | A user’s interaction with a JavaServer Faces application, within explicit developer-controlled boundaries that extend the scope across multiple invocations of the JavaServer Faces lifecycle. All long-running conversations are scoped to a particular HTTP servlet session and may not cross session boundaries. |

