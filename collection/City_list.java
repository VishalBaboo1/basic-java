package collection;

import java.util.ArrayList;

public class City_list {
    public void cities() {
        ArrayList list = new ArrayList();
        list.add("Agra");
        list.add(54);
        list.add("Delhi");
        list.add("Kanpur");
        list.add("Pune");
        list.add("jhansi");
        list.add(45.3655454);
        list.add(914903196);
        for(Object var:list){
            System.out.println(var);}
            System.out.println("size of the list is :"+list.size());
            for(int i=0;i<list.size();i++){
                System.out.println("all :"+list.get(i));}
            }





    public static void main(String[] args) {
        City_list obj=new City_list();
        obj.cities();
    }
}
