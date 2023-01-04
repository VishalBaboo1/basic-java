package collection.hashSet;

import java.util.HashSet;

public class DouHashSet {
    public HashSet<Double> points() {
        HashSet<Double> decimal = new HashSet<>();
        decimal.add(56.36);
        decimal.add(96.3);
        decimal.add(65.25);
        decimal.add(65.14454);
        return decimal;
    }

    public static void main(String[] args) {
        DouHashSet obj=new DouHashSet();
        HashSet<Double> decimal=obj.points();
        for(double var:decimal){
            System.out.println(var);
        }


    }
}
