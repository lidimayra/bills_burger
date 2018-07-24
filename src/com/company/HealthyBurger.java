package com.company;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat, double basePrice, String name) {
        super("Brown Rye Breadl Roll", meat, basePrice, name);
        this.additionsMax = 6;
    }

}
