package com.maximum;

public class IntMaximum {
    Integer maxNum;

    void getMaximumNumber(Integer numOne, Integer numTwo, Integer numThree) {
        maxNum = numOne;    //assume numOne is initially the largest
        if (numTwo.compareTo(maxNum) > 0) {
            System.out.println(numTwo + " Num Two is greater");
        } else if (numThree.compareTo(maxNum) > 0) {
            System.out.println(numThree + " Num Three is greater");
        } else {
            System.out.println(maxNum + " Num One is greater");
        }
    }

    public static void main(String[] args) {

        IntMaximum testMaximum = new IntMaximum();
        testMaximum.getMaximumNumber(16, 21, 14);
    }
}
