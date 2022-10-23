package com.syntax.class07;

import java.util.Scanner;

public class Class06_HW3_CalculatorUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        double num1 = scan.nextDouble();
        System.out.println("Please enter your second number:");
        double num2 = scan.nextDouble();
        System.out.println("Please enter the operator you want to use:");
        char operator = scan.next().charAt(0);
        double result = 0;
        boolean wrongOperator=true;
        switch (operator) {
        
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1*num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        default:
        	System.out.println("Enter valid operator");
            break;
        }
        if(!wrongOperator)
        {
        	System.out.println(result);	
        }
        
        
	}

}
