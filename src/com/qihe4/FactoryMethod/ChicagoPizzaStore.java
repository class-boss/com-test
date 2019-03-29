package com.qihe4.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
       /* if(item.equals("cheese")){
            return new NYStuleCheesePizza();
        }else if(item.equals("veggie")){
            return  new ChicagoStyleCheesePizza();
        }*/
        return null;
    }
}
