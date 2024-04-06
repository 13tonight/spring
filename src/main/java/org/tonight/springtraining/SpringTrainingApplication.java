package org.tonight.springtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tonight.springtraining.config.employeeConfig;

@SpringBootApplication
public class SpringTrainingApplication {

    public static void main(String[] args) {
       // ApplicationContext appContext = new ClassPathXmlApplicationContext("newPractice.xml");
        ApplicationContext appContext = new AnnotationConfigApplicationContext(employeeConfig.class);
        employeeClass empClass = appContext.getBean(employeeClass.class);
        empClass.display();

        employeeClassSetterType empSetter = appContext.getBean(employeeClassSetterType.class);
        empSetter.displaySetterType();
        //SpringApplication.run(SpringTrainingApplication.class, args);
    }

}
