package practice_makes_perfect;

public class OddNumbers {
    public static void main(String[] args) {
        int number = 100;
       // System.out.println("Printing odd numbers from 1 to" + number + "");
        for(int i=1;i<number;i++)
        if(i%2!=0) {
            System.out.println("This is odd number " + i);
        }

        }
    }


