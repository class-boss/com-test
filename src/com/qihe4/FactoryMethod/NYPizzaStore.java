package com.qihe4.FactoryMethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza= null;
        PizzaIngredientFactory ingredientFactory =  new NYPizzaIngredientFactory();


        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        }else if(item.equals("veggie")){
            pizza =  new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style ve");

            return  new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
