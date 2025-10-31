package com.ryse.designpattern._23_Interpreter.Interpreter;

public class Context {
    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人", "儿童"};
 private  Expression cityPersonExp;
    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPersonExp = new AndExpresion(city, person);
    }
    public void freeRide(String info) {
        boolean ok = cityPersonExp.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }

}
