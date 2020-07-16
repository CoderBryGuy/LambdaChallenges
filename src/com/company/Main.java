package com.company;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {

        new Thread(()->{

            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts
                 ) {
                System.out.println(part);
            }
        }).start();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts
                ) {
                    System.out.println(part);
                }
            }
        };

    Runnable runnable1 = ()-> {

            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts
            ) {
                System.out.println(part);
            }
    };

      Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if(i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        System.out.println(lambdaFunction.apply("1234567890"));

        Scanner sc = new Scanner(System.in);
        String s;

//        do {
//
//          System.out.println("Enter string: ");
//          s = sc.nextLine();
//
//          System.out.println("Every second character: " + lambdaMethod(lambdaFunction, s));
//
//        }while (!s.equalsIgnoreCase("q"));

//        Supplier<String> iLoveJava = ()-> "I love Java!";


        Supplier<String> iLoveJava = ()->{
          return "I love Java!";
        };

        String supplierResult = iLoveJava.get();

        System.out.println(supplierResult);

  }

  public static String lambdaMethod(Function<String, String> lambdaFunction, String source){
        return lambdaFunction.apply(source);
  }


}
