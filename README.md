# Spring Starter Project

An opinionated configuration for a spring boot maven project.

## Included Dependencies
* `spring-boot-starter-web` Starter for building web, including RESTful, applications using Spring MVC.
* `spring-boot-starter-security` Starter for using Spring Security
* `spring-boot-starter-actuator` Starter for using Spring Boot’s Actuator which provides 
  [production ready features](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready) 
  to help you monitor and manage your application
* Generate configuration metadata for imtems annotated with `@ConfigurationProperties`

## Included Testing Dependencies
* `spring-boot-starter-test` Starter for testing Spring Boot applications with libraries including JUnit, Hamcrest 
  and Mockito

## Plugin Configuration
* `spring-boot-maven-plugin` The [Spring Boot Maven Plugin](http://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html)
  provides Spring Boot support in Maven, allowing you to package executable jar or war archives and run an application “in-place”.
* `pitest-maven` PIT mutation testing maven plugin. 
  * `pitest.mutation.threshold` Mutation score threshold at which to fail build.
  * `pitest.coverage.threshold` Line coverage threshold at which to fail build.
