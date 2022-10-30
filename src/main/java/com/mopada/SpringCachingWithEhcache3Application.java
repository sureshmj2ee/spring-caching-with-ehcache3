package com.mopada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCachingWithEhcache3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCachingWithEhcache3Application.class, args);
	}

}
