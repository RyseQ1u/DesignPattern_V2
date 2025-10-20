package com.ryse.reationalmodel._10_Strategy.Sort;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data,Sorter sorter){
        this.data =data;
        this.sorter= sorter;
    }
    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    public void print(){
        for (Comparable datum : data) {
            System.out.print(datum);
        }
        System.out.println();
    }
}
