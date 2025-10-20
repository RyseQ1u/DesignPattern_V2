package com.ryse.reationalmodel._10_Strategy.Sort;

public class BubbleSort implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(data[i].compareTo(data[j]) > 0){
                    Comparable tmp = data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        }
    }
}
