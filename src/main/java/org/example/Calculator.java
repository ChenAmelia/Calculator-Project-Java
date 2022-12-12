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

        if(cal1.equals("*") || cal1.equals("/") && cal2.equals("+") || cal2.equals("-")) {

            switch(cal1){
                case "*":
                    result1 = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result1);
                    if(cal2.equals("+")){
                        result = result1 + num3;
                        System.out.println(result1 + " + " + num3 + " = " + result);
                    } else if (cal2.equals("-")) {
                        result = result1 - num2;
                        System.out.println(result1 + " - " + num3 + " = " + result);
                    }
                    break;

                case "/":
                    result1 = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result1);
                    if(cal2.equals("+")){
                        result = result1 + num3;
                        System.out.println(result1 + " + " + num3 + " = " + result);
                    } else if (cal2.equals("-")) {
                        result = result1 - num2;
                        System.out.println(result1 + " - " + num3 + " = " + result);
                    } else {
                        System.out.println("ERROR");
                    }
            }
        }

        else if(cal2.equals("*") || cal2.equals("/") && cal1.equals("+") || cal1.equals("-")) {

            switch(cal2){
                case "*":
                    result1 = num2 * num3;
                    System.out.println(num2 + " * " + num3 + " = " + result1);

                    if(cal1.equals("+")){
                        result = result1 + num1;
                        System.out.println(result1 + " + " + num1 + " = " + result);
                    } else if (cal1.equals("-")) {
                        result = result1 - num1;
                        System.out.println(result1 + " - " + num1 + " = " + result);
                    }
                    break;

                case "/":
                    result1 = num2 / num3;
                    System.out.println(num2 + " / " + num3 + " = " + result1);
                    if(cal1.equals("+")){
                        result = result1 + num1;
                        System.out.println(result1 + " + " + num1 + " = " + result);
                    } else if (cal1.equals("-")) {
                        result = result1 - num1;
                        System.out.println(result1 + " - " + num1 + " = " + result);
                    } else {
                        System.out.println("ERROR");
                    }
            }

        }
        else{
            switch(cal1){
                case "+":
                    result1 = num1 + num2;
                    switch (cal2) {
                        case "+":
                            result = result1 + num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "-":
                            result = result1 - num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "*":
                            result = result1 * num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "/":
                            result = result1 / num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                    }
                    break;
                case "-":
                    result1 = num1 - num2;
                    switch (cal2) {
                        case "+":
                            result = result1 + num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "-":
                            result = result1 - num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "*":
                            result = result1 * num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "/":
                            result = result1 / num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                    }
                    break;
                case "*":
                    result1 = num1 * num2;
                    switch (cal2) {
                        case "+":
                            result = result1 + num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "-":
                            result = result1 - num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "*":
                            result = result1 * num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "/":
                            result = result1 / num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                    }
                    break;
                case "/":
                    result1 = num1 / num2;
                    switch (cal2) {
                        case "+":
                            result = result1 + num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "-":
                            result = result1 - num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "*":
                            result = result1 * num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                        case "/":
                            result = result1 / num3;
                            System.out.println(num1 + cal1 + num2 + cal2 + num3 + " = " + result);
                            break;
                    }
                    break;
            }


        }


    }
}
