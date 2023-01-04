package model;

import java.util.Objects;

public class Students {
    int rollNo;
    String name;
    String section;
    int rank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return rollNo == student.rollNo && rank == student.rank && name.equals(student.name) && section.equals(student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, section, rank);
    }

    public Students(int rollNo, String name, String section, int rank) {
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;
        this.rank = rank;
    }
    //GETTER AND SETTER


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
