package com.company;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double basePrice;
    protected Addition[] additions;
    protected int additionsMax;

    public Hamburger(String rollType, String meat, double basePrice, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
        this.additionsMax = 4;
    }

    public void printPrice() {
        System.out.printf("Price: $%.2f%n", this.calculateTotalPrice());
    }

    public void add(Addition[] additions) {
        if (additionsAllowed(additions.length)) {
            for (int i = 0; i < additions.length; i++) {
                System.out.printf("Adding %s... $%.2f%n", additions[i].getName(), additions[i].getPrice());
            }

            setAdditions(additions);
        } else {
            System.out.printf("Up to %d additions allowed!\n", additionsMax);
        }
    }

    public double calculateTotalPrice() {
        double price = basePrice;
        Addition[] additions = this.additions;

        if (additions != null) {
            for (int i = 0; i < additions.length; i++) {
                price += additions[i].getPrice();
            }
        }

        return price;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    private void setAdditions(Addition[] additions) {
        this.additions = additions;
    }

    private boolean additionsAllowed(int additionsLength) {
        return additionsMax >= additionsLength;
    }

    public String getName() {
        return name;
    }
}
