package com.bizongo.data.neo4j;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.bizongo.data.neo4j.repository")
public class SampleNeo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleNeo4jApplication.class, args);
    }
}
