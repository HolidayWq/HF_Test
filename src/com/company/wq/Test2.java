package com.company.wq;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int a = i % 3;
            int b = i % 5;
            int unit = i % 10;
            int ten = i / 10;
            result(a,b,i,unit,ten);
        }
    }

    /**
     * 逻辑代码
     */
    public static void result(int a, int b, int num,int unit, int ten){
        if (a==0 || unit==3 || ten == 3){
            if (b==0 || unit == 5 || ten == 5){
                System.out.println("FizzBuzz");
            }else {
                System.out.println("Fizz");
            }
        }else if (b==0 || unit == 5 || ten == 5){
            System.out.println("Buzz");
        }else {

            System.out.println(num);
        }

    }



}
