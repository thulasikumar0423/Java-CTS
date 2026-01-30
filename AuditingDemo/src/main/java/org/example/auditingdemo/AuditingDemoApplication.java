package org.example.auditingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuditingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditingDemoApplication.class, args);
    }

}
