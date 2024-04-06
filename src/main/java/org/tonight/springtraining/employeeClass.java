package org.tonight.springtraining;

import java.util.List;

public class employeeClass {
    String firstName;
    String lastName;
    Integer salary;
    String companyName;
    List<String> phoneNumbers;
    address companyAddress;

    public employeeClass(String firstName, String lastName, Integer salary, String companyName, List<String> phoneNumbers, address companyAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.companyName = companyName;
        this.phoneNumbers = phoneNumbers;
        this.companyAddress = companyAddress;
    }
public void display(){
    System.out.println("First name:"+ firstName +"  Last Name: "+ lastName +" Salary: "+ salary + " Company Name: " + companyName + " List Phone Numbers: " + phoneNumbers + " Company Address: " + companyAddress );
    }
    @Override
    public String toString() {
        return "employeeClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", companyAddress=" + companyAddress +
                '}';
    }
}
