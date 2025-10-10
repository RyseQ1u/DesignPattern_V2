package com.ryse.reationalmodel.a_factory.aa_simple_factory;

import com.ryse.reationalmodel.a_factory.bean.CheesePizza;
import com.ryse.reationalmodel.a_factory.bean.GreekPizza;
import com.ryse.reationalmodel.a_factory.bean.PepperPizza;
import com.ryse.reationalmodel.a_factory.bean.Pizza;

public class SimplePizzaFactory {
    public static Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

}
