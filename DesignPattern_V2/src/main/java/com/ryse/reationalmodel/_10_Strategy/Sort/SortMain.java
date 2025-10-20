package com.ryse.reationalmodel._10_Strategy.Sort;

public class SortMain {
    public static void main(String[] args) {
        String[] data={"c","d","e","a"};
        SortAndPrint sap = new SortAndPrint(data,new BubbleSort());
        sap.execute();
    }
}
