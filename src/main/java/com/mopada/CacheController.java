package com.mopada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @GetMapping("/{name}")
    public Person generatePerson(@PathVariable(value = "name") String value) {
        return cacheService.generatePerson(value);
    }

    @GetMapping("/person/{name}")
    public String getPerson(@PathVariable(value = "name") String name) {
        Person person = new Person("",
                name,
                "");

        return cacheService.fetchPerson(person)
                .toString();
    }

    @GetMapping("/evict/{name}")
    public String evictPerson(@PathVariable(value = "name") String name) {
        Person person = new Person("",
                name,
                "");

        cacheService.evictPerson(person);
        return person.toString();
    }
}
