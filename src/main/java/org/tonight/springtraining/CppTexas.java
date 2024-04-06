package org.tonight.springtraining;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class CppTexas {

    public void applyCppTaxes(){
        System.out.println("Cpp Taxes: " + Instant.now());
    }
}
