package org.tonight.springtraining;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@ToString
@NoArgsConstructor
public class employeeClassSetterType {
    String firstName;
    String lastName;
    Integer salary;
    String companyName;
    List<String> phoneNumbers;
    addressSetterType companyAddress;


    public employeeClassSetterType(String firstName, String lastName, Integer salary, String companyName, List<String> phoneNumbers, addressSetterType companyAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.companyName = companyName;
        this.phoneNumbers = phoneNumbers;
        this.companyAddress = companyAddress;
    }

    public void displaySetterType(){
        System.out.println("First name:"+ firstName +"  Last Name: "+ lastName +" Salary: "+ salary + " Company Name: " + companyName + " List Phone Numbers: " + phoneNumbers + " Company Address: " + companyAddress );
    }
}
