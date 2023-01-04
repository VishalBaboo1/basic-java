package collection.hashMap;

import java.util.HashMap;
//TODO MAINTAIN SEQUENCE
public class DemoHashMap {
    public void demo(){
        HashMap<Integer, String> book = new HashMap<>();
        book.put(2, "JAVA");
        book.put(4, "springBoot");
        book.put(1, "SPRING");
        book.put(3, "CLOUD");
        book.put(2, "JAVA");
        System.out.println(book);
        System.out.println("Size :"+book.size());
    }

    public static void main(String[] args) {
        DemoHashMap obj=new DemoHashMap();
        obj.demo();
    }
}
