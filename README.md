# spring-caching-with-ehcache3
spring-boot-caching-with-ehcache3

Spring Boot2, Java 16, Lombok, ehcache3


How to test:
1) SpringCachingWithEhcache3Application.java as spring boot application.

2) Open git bash and run below commands.

curl http://localhost:8080/Smith
curl http://localhost:8080/person/Smith

execute after 5 seconds below command.
curl http://localhost:8080/person/Smith
now we can see that Smith is automatically removed from cached after 5 seconds, as we have configured 5 seconds for clearing cache.


we can manually evict from cache.
curl http://localhost:8080/evict/Smith
