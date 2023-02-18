package com.maximum;

import java.util.Scanner;

public class Float {
        public static void main(String args[])
        {
            Float object= new Float();
            System.out.println("Maximum of 3 floating number is : "+ object.compareTo());
        }
        public float compareTo(){
            Scanner scanner=new Scanner(System.in);
            //reading the numbers
            System.out.println("Enter three numbers");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            float temp;
            float largest;
            //comparing a and b and storing the largest number in a temp variable
            temp=a>b?a:b;
            //comparing the temp variable with c and storing the result in the variable
            largest=c>temp?c:temp;
            //prints the largest number
            return(largest);
        }
}
