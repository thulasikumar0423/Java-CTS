package org.Aop.aopdemo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.Aop.aopdemo")
@EnableAspectJAutoProxy
public class AppConfig {
}
