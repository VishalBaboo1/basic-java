package collection.linkedHashSet;

import model.Students;

import java.util.LinkedHashSet;
//TODO MAINTAIN INSERTION ORDER

public class Linked_HashSet {
    public LinkedHashSet<Students> student() {
        LinkedHashSet<Students> list = new LinkedHashSet<>();
        Students std1 = new Students(1, "Vishal", "EE", 25);
        Students std2 = new Students(15, "Akash", "EN", 251);
        Students std3 = new Students(10, "Vilal", "EC", 205);
        Students std4 = new Students(40, "Sachin", "IT", 2125);
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        return list;
    }

    public static void main(String[] args) {
        Linked_HashSet obj=new Linked_HashSet();
        LinkedHashSet<Students> list=obj.student();
        for(Students var : list){
            System.out.println("Name:"+var.getName()+" rollno.:"+var.getRollNo()+" Section:"+var.getSection()+" Rank:"+var.getRank());
        }
    }
}
