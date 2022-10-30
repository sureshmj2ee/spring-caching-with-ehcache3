# spring-caching-with-ehcache3
Technology: Spring boot2 + ehcache3 + Lombok + Java 16 + Maven Example


How to test:
Download and import the project in Intellij.

1) Run SpringCachingWithEhcache3Application.java as spring boot application.

2) Open git bash and run below commands.

curl http://localhost:8080/Smith
curl http://localhost:8080/person/Smith

execute after 10 seconds below command.
curl http://localhost:8080/person/Smith
now we can see that Smith is automatically removed from cached after 10 seconds, as we have configured 10 seconds for clearing/expire cache.


we can manually evict from cache.
curl http://localhost:8080/evict/Smith
