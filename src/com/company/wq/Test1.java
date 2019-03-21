package com.company.wq;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int a = i % 3;
            int b = i % 5;
            result(a,b,i);
        }
        /*int i=1;

        while (i<=20){

            if (i%3==0){
                if (i%5==0){
                    System.out.println("FizzBuzz");
                    i++;
                    continue;
                }
                System.out.println("Fizz");
                i++;
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/
    }

    /**
     * 逻辑代码
     */
    public static void result(int a, int b, int num){
        if (a==0){
            if (b==0){
                System.out.println("FizzBuzz");
                num++;
            }else {
                System.out.println("Fizz");
            }
        }else if (b==0){
            System.out.println("Buzz");
        }else {
            System.out.println(num);
        }

    }



}
