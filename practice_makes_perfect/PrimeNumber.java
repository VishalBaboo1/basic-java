package practice_makes_perfect;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=32;
        boolean flag=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                flag=false;
                break;
            }}
            if(flag){
                System.out.println("Prime number" +number);}
                else{
                    System.out.println("not a prime number" +number);}
        }
    }

