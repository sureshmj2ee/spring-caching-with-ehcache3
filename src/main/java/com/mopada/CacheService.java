package com.mopada;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CacheService {
    Logger LOGGER = LoggerFactory.getLogger(CacheService.class);

    @CachePut(cacheNames = "cacheStore", key = "#name")
    public Person generatePerson(String name) {
        Person person = new Person(UUID.randomUUID().toString(), name, "Switzerland");
        LOGGER.info("Generated Person: {}", person);
        return person;
    }

    @Cacheable(cacheNames = "cacheStore", key = "#person.name")
    public Person fetchPerson(Person person) {
        LOGGER.info("Person request received = {}", person);
        return person;
    }

    @CacheEvict(cacheNames = "cacheStore", key = "#person.name")
    public void evictPerson(Person person) {
        LOGGER.info("evicting Person = {}", person);
    }
}
