package com.maximum;

public class StringMaximum {
    String maxNum;

    void getMaximum(String One, String Two, String Three) {
        maxNum = One;    //assume numOne is initially the largest
        if (Two.compareTo(maxNum) > 0) {
            System.out.println(Two + " Num Two is greater");
        } else if (Three.compareTo(maxNum) > 0) {
            System.out.println(Three + " Num Three is greater");
        } else {
            System.out.println(maxNum + " Num One is greater");
        }
    }

    public static void main(String[] args) {

        StringMaximum testMaximum = new StringMaximum();
        testMaximum.getMaximum( "Apple", "Peach", "Banana");
    }
}
