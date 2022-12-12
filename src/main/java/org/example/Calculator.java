package org.example;
import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class Calculator {

    public void simpleCalculation(String oper){

        double num1 = Double.parseDouble(String.valueOf(oper.charAt(0)));
        double num2 = Double.parseDouble(String.valueOf(oper.charAt(2)));
        String cal = String.valueOf(oper.charAt(1));

        double result;

        switch (cal) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case"-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case "/":
                if(num2 == 0){
                    System.out.println("The divisor cannot be 0");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                }
        }
    }

    public void multiCalculation(String oper) {

        double num1 = Double.parseDouble(String.valueOf(oper.charAt(0)));
        double num2 = Double.parseDouble(String.valueOf(oper.charAt(2)));
        double num3 = Double.parseDouble(String.valueOf(oper.charAt(4)));

        String cal1 = String.valueOf(oper.charAt(1));
        String cal2 = String.valueOf(oper.charAt(3));

        double result;
        double result1;






//        if(cal1.equals("*") || cal1.equals("/")) {
//            switch(cal1){
//                case "*":
//                    result1 = num1 * num2;
//                    System.out.println(num1 + " * " + num2 + " = " + result1);
//                    break;
//                case "/":
//                    if(num2 == 0){
//                        System.out.println("The Division Number Can Not Be 0.");
//                    }else{
//                        result1 = num1 / num2;
//                        System.out.println(num1 + " / " + num2 + " = " + result1);
//                    }
//
//            }
//
//
//        }



    }
}
