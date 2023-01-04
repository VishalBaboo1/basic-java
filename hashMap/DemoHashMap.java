package hashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {
    public HashMap<Integer,String> book(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Newton's Law");
        map.put(3,"Matter");
        map.put(4,"Optics");
        map.put(2,"Gravity");
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        DemoHashMap obj=new DemoHashMap();
        HashMap<Integer,String>map=obj.book();
        System.out.println(map.get(3));
        Set<Integer>keys=map.keySet();
        for(Integer var:keys){
            System.out.println(map.get(var));
        }
    }

}
