# About

---

<div align="center">
  <img src="https://play-lh.googleusercontent.com/K9Jf-N8RWHDw2IZSY_vjSfIVm2X6jGN9riRIAK9nl_BgJxpYK2VQWQl-yPlCtBUTNasw=s48-rw"/>
  <h3>Java studies. Twitter clone back-end API implemented with Spring!</h1>
</div>

---

- Download and run the frontend project to see it working on [Tweteroo](https://github.com/Lucas-zz/Tweteroo-Frontend).

# Getting Started

- Have the `JDK` installed in your computer, if you don't have it or are having troubles doing that, follow the steps in this [tutorial](https://java.tutorials24x7.com/blog/how-to-install-java-17-on-windows).
- Install `VSCode` and make sure you have some extensions ready to be used, such as [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) and [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack).
- Open the application on VSCode, open the file `ApiApplication.java` and click on Run.
- Now the application should be running on `port 8080` and you can access it on our browser as `http://localhost:8080/`

---

# How it Works

> ### POST /api/auth/sign-up
>
> - #### Expected body
> ```java
> {
>   username: "bobesponja",
>   avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
> }
> ```

> ### POST /api/tweets
>
> - #### Expected body
> ```java
> {
>   username: "bobesponja",
>   tweet: "eu amo o hub"
> }
> ```

> ### GET /api/tweets
> 
> - #### Expected body
> ```java
> [
>   {
>     username: "bobesponja",
>     avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
>     tweet: "eu amo o hub"
>   }
> ]
> ```
>
> - #### Expected response
> >  The last 5 posted tweets.

> ### GET /api/tweets/USERNAME
> 
> - #### Expected body
> ```java
> [
>   {
>     username: "bobesponja",
>     avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
>     tweet: "eu amo o hub"
>   }
> ]
> ```
>
> - #### Expected response
> > All the tweets posted by the user.

---

# Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
- [Validation](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#io.validation)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#using.devtools)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql.jpa-and-spring-data)

---

# Guides

The following guides illustrate how to use some features concretely:

- [Validation](https://spring.io/guides/gs/validating-form-input/)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

---

## Author

[<img src="https://avatars.githubusercontent.com/Lucas-zz" width=150 title="Lucas-zz"><br>Lucas Azzolini Vieira](https://github.com/Lucas-zz)
