package collection.hashMap;

import javafx.scene.effect.SepiaTone;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_2 {
    public HashMap<Double,String> heading(){
        HashMap<Double,String> list=new HashMap<>();
        list.put(1.1, "MY NAME IS VISHAL");
        list.put(1.2, "I'M FROM AGRA");
        list.put(1.3, "I COMPLETED MY DIPLOMA");
        list.put(1.4, "I'M IN BIET");
        return list;

    }

    public static void main(String[] args) {
        HashMap_2 obj=new HashMap_2();
        HashMap<Double,String> list=obj.heading();
        System.out.println(list);
        Set<Double> keys=list.keySet();
        for(Double var:keys){
            System.out.println(list.get(var));}

        }
    }

