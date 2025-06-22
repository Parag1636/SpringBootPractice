package com.introduction.week1HW.IntroductionToSpringBootWeek1HW;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.name", havingValue = "chocolate")
public class ChocolateFrosting implements  Frosting {

    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
