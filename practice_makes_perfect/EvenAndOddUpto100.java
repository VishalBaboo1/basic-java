package practice_makes_perfect;

public class EvenAndOddUpto100 {
    public static void main(String[] args) {
        int number=1000;
        System.out.println("List of even numbers from 1 to " +number+" : ");
        for(int i=1;i<=number;i++){
            if(i%2==0){    //logic to check if the number is even or not
                System.out.print(i+" ");}

        }
        int j=500;
        System.out.println();
        System.out.println("the given number are odd number:");
        for(int k=1;k<=j;k++){
            if(k%2==1){

                System.out.print(k+" ");}
        }

    }
}
