package org.tonight.springtraining;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@NoArgsConstructor
public class addressSetterType {

    String city;
    String postalCode;

    public addressSetterType(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

}
