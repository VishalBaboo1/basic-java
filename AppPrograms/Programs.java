package AppPrograms;

import java.util.Scanner;

    public class Programs{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("What is  your name:");
            String result=scanner.nextLine();
            System.out.println("My name is "+result);
            System.out.println("Enter your Age:");
            int number=scanner.nextInt();
            System.out.println("my Age is "+number);
            System.out.println("Your phone number");
            long phone=scanner.nextLong();
            System.out.println("Phone no."+phone);
            }
        }

