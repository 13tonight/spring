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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(address companyAddress) {
        this.companyAddress = companyAddress;
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
