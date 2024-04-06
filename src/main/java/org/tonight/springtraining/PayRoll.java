package org.tonight.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class PayRoll {

    @Autowired
    CppTexas cppTaxes;
//
//    public PayRoll(CppTexas cppTaxes) {
//        this.cppTaxes = cppTaxes;
//    }

    public void startingPayRoll(){
        cppTaxes.applyCppTaxes();
        System.out.println("PayRoll: " + Instant.now());
    }
}
