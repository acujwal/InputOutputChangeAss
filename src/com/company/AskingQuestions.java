package com.company;

import java.util.Scanner;

public class AskingQuestions {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print( "First temperature? \n" );
        num1 = keyboard.nextInt();

        System.out.print( "Second temperature? \n" );
        num2 = keyboard.nextInt();

        System.out.println("The max value is : " + Math.max(num1, num2));
        System.out.println( "The average value is : " + (num1+num2)/2 );
    }
}