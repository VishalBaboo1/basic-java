package AppPrograms;

import practice_makes_perfect.SwitchOpertor;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to my calculator:please select 1:addition,2:subtraction,3:multiply,4:divide");
        int choice=scanner.nextInt();
        CalculatorUsingSwitch obj=new CalculatorUsingSwitch();
        System.out.println("enter digit first");
        int a= scanner.nextInt();
        System.out.println("enter digit second");
        int b= scanner.nextInt();
       int result=0;
       if(choice==1){
           result= scanner.nextInt();
       }

    }

    }

