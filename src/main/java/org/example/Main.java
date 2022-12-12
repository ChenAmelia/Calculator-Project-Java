package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String oper = scanner.nextLine();

        String oper = "1*2+3";

        System.out.println("The length is " + oper.length());

        System.out.println("First: "  + oper.charAt(0));
        System.out.println("Second: " + oper.charAt(1));
        System.out.println("Third: " + oper.charAt(2));

//        double prac1 = 2;
//        double prac2 = 3;
//        double results = prac1 * prac2;
//        System.out.println(results);



        Calculator calculator = new Calculator();
//        calculator.simpleCalculation(oper);

        calculator.multiCalculation(oper);





//        ArrayList<String> operation = new ArrayList<>();
//        ArrayList<String> number = new ArrayList<>();
//
//        for(int i = 0; i < oper.length(); i++){
//            if(i % 2 == 0){
//                number.add(String.valueOf(oper.charAt(i)));
//            } else {
//                operation.add(String.valueOf(oper.charAt(i)));
//            }
//        }
//
//        System.out.println(operation);
//        System.out.println(number);



//        double num1 = Double.parseDouble(String.valueOf(oper.charAt(0)));
//        double num2 = Double.parseDouble(String.valueOf(oper.charAt(2)));
//        String cal = String.valueOf(oper.charAt(1));
//
//        double result;
//
//        switch (cal) {
//            case "+":
//                result = num1 + num2;
//                System.out.println(num1 + " + " + num2 + " = " + result);
//                break;
//
//            case"-":
//                result = num1 - num2;
//                System.out.println(num1 + " - " + num2 + " = " + result);
//                break;
//
//            case " * ":
//                result = num1 * num2;
//                System.out.println(num1 + " * " + num2 + " = " + result);
//                break;
//
//            case " / ":
//                result = num1 / num2;
//                System.out.println(num1 + " / " + num2 + " = " + result);
//                break;
//
//        }

    }
}