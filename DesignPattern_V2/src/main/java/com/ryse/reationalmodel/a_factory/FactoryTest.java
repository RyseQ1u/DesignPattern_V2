package com.ryse.reationalmodel.a_factory;

import com.ryse.reationalmodel.a_factory.aa_simple_factory.SimplePizzaFactory;
import com.ryse.reationalmodel.a_factory.bean.Pizza;

public class FactoryTest {
    public static void main(String[] args) {
        Pizza pizza;
        pizza = SimplePizzaFactory.CreatePizza("");
    }
}
