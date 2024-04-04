package org.tonight.springtraining;

public class address {
    String city;
    String postalCode;

    public address(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
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
