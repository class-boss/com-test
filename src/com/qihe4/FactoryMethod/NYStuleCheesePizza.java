package com.qihe4.FactoryMethod;

public class NYStuleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYStuleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
