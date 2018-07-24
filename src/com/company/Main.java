package com.company;

public class Main {

    public static void main(String[] args) {
        Addition lettuce = new Addition("lettuce", 0.75);
        Addition tomato = new Addition("tomato", 1);
        Addition carrot = new Addition("carrot", 1);
        Addition pickles = new Addition("pickles", 1.4);
        Addition onion = new Addition("onion", 0.8);
        Addition cheese = new Addition("cheese", 1.2);

        Hamburger hamburger = new Hamburger("Bun", "Mushroom", 20, "Mushroom Burger");
        System.out.println(hamburger.getName());
        System.out.println();
        hamburger.printPrice();
        hamburger.add(new Addition[]{ lettuce, tomato, carrot, pickles });
        hamburger.printPrice();

        System.out.println("----------------------------------------------------");

        Hamburger healthyBurger = new HealthyBurger("Falafel", 22, "Falafel Burger");
        System.out.println(healthyBurger.getName());
        System.out.println();
        healthyBurger.printPrice();
        healthyBurger.add(new Addition[]{ lettuce, tomato, carrot, pickles, onion, cheese });
        healthyBurger.printPrice();

        System.out.println("----------------------------------------------------");

        Hamburger deluxeBurger = new DeluxeBurger("French roll","Cauliflower", 19, "Couliflower Burger");
        System.out.println(deluxeBurger.getName());
        System.out.println();
        deluxeBurger.printPrice();
        deluxeBurger.add(new Addition[]{tomato});
        deluxeBurger.printPrice();
    }
}
