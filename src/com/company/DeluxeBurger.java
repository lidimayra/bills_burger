package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String rollType, String meat, double basePrice, String name) {
        super(rollType, meat, basePrice, name);
        this.additionsMax = 2;
        this.additions = new Addition[]{new Addition("Chips", 4.5), new Addition("Drinks", 5)};
    }

    @Override
    public void add(Addition[] additions) {
        System.out.println("Extra additions not allowed for this Burger");
    }
}
