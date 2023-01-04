package array;

public class AdvancedForLoop {
    public static void main(String[] args) {
        String City[]={"AGRA","ETAWAH","KANPUR","PUNE","GOA","KERALA","TUNDLA","ETAH"};

        for(String var:City){
            System.out.println("These are good cities " +var);}
        System.out.println("given marks of subjects");
        int i[]={12,30,50,60,72,56,12,36,23,25,54,85,99,};
        for(int marks:i){
            System.out.println("Marks "+marks +" out of 100");}
    }
}