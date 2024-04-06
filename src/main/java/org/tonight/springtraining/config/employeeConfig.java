package org.tonight.springtraining.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.tonight.springtraining.address;
import org.tonight.springtraining.addressSetterType;
import org.tonight.springtraining.employeeClass;
import org.tonight.springtraining.employeeClassSetterType;

import java.util.Collections;

@Configuration
@PropertySource("application.properties")
public class employeeConfig {

    @Value("${emp.firstName}")
    private String firstName;
    @Value("${emp.lastName}")
    private String lastname;
    @Value("${emp.salary}")
    private Integer salary;


    @Bean
    public employeeClass getEmpClass(){
        employeeClass employeeClass = new employeeClass(firstName,lastname, salary, "CHEMTEX", Collections.singletonList("924856928746,98745691847,98745614065"),getAddress());
        return employeeClass;
    }

    @Bean
    public address getAddress(){
        address addClass = new address("Beaumont","77705");
        return addClass;
    }

    @Bean
    public employeeClassSetterType getSetterType(){
        employeeClassSetterType empSetter = new employeeClassSetterType();
        empSetter.setFirstName("skfskf");
        empSetter.setLastName("ashfb");
        empSetter.setSalary(87345);
        empSetter.setCompanyName("consultancy");
        empSetter.setPhoneNumbers(Collections.singletonList("253412538,127354187356,91827360074"));
        empSetter.setCompanyAddress(getAddressSetter());
        return empSetter;
    }

    @Bean
    public addressSetterType getAddressSetter(){
        addressSetterType addSet = new addressSetterType();
        addSet.setCity("houston");
        addSet.setPostalCode("689797");
        return addSet;
    }
}
