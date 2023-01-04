package list;

import model.Students;

import java.util.ArrayList;

public class StudentList {
    public ArrayList<Students> createStudentList(){
        ArrayList<Students> StudentArrayList=new ArrayList<>();
        Students std1=new Students(1,"Vishal","EE",25);
        Students std2=new Students(5,"Ashish","ME",256);
        Students std3=new Students(10,"Akash","IT",25);
        Students std4=new Students(50,"Ashutosh","CS",256);
        StudentArrayList.add(std1);
        StudentArrayList.add(std2);
        StudentArrayList.add(std3);
        StudentArrayList.add(std4);
        return StudentArrayList;
    }

    public static void main(String[] args) {
        StudentList obj=new StudentList();
        ArrayList<Students> StudentArrayList=obj.createStudentList();
        for(int i=0;i<StudentArrayList.size();i++){
            System.out.println("Printing Student Data:"+StudentArrayList.get(i).getRollNo()+" Name:"+StudentArrayList.get(i).getName()+" Section:"+StudentArrayList.get(i).getSection()+" Rank:"+StudentArrayList.get(i).getRank());

    }
    }
}
