package com.ryse.designpattern._23_Interpreter.Interpreter;

public class AndExpresion implements  Expression {
    private Expression city = null;
    private Expression person = null;

    public AndExpresion(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public String toString() {
        return "AndExpresion{" +
                "city=" + city +
                ", person=" + person +
                '}';
    }

    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
