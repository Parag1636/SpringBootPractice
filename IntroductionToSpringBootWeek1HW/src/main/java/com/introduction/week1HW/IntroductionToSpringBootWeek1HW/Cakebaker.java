package com.introduction.week1HW.IntroductionToSpringBootWeek1HW;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cakebaker {

    private final Frosting frosting;

    private final Syrup syrup;

    public Cakebaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public String bakeCake(){
        return "Baking Cake with frosting : " + frosting.getFrostingType() +
                " and with syrup : " +  syrup.getSyrupType();
    }
}
