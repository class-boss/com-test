package com.qihe4.FactoryMethod;

public class PizzaTestDrive {

    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza cheese = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + cheese.getName());

        Pizza veggie = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a "+ veggie.getName());

    }
}
