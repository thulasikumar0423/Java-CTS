package org.Aop.aopdemo.main;

import org.Aop.aopdemo.config.AppConfig;
import org.Aop.aopdemo.service.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService service = context.getBean(PaymentService.class);
        System.out.println("--------makePayment() --------");
        service.makePayment();
    }
}
