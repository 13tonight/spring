package org.tonight.springtraining;

public class address {
    String city;
    String postalCode;

    public address(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        return "address{" +
                "city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
