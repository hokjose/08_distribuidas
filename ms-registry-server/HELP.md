# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.3/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.5.3/reference/actuator/index.html)
* [Spring Cache Abstraction](https://docs.spring.io/spring-boot/3.5.3/reference/io/caching.html)
* [Config Client](https://docs.spring.io/spring-cloud-config/reference/client.html)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/reference/spring-cloud-netflix.html#spring-cloud-eureka-server)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/reference/spring-cloud-commons/loadbalancer.html)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/reference/spring-cloud-commons/application-context-services.html)
* [Apache Freemarker](https://docs.spring.io/spring-boot/3.5.3/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)
* [CycloneDX SBOM support](https://docs.spring.io/spring-boot/3.5.3/reference/actuator/endpoints.html#actuator.endpoints.sbom)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.3/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

