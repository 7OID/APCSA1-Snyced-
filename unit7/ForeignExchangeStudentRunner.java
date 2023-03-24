package unit7;

import java.util.ArrayList;
import java.util.List;

public class ForeignExchangeStudentRunner {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student("John Smith", "12345", 10, 3.5);
        ForeignExchangeStudent s2 = new ForeignExchangeStudent("Maria Rodriguez", "67890", 11, 3.2, "Spain", "Spanish");
        Student s3 = new Student("Michael Johnson", "13579", 12, 3.8);
        ForeignExchangeStudent s4 = new ForeignExchangeStudent("Sophie Lee", "24680", 9, 2.9, "South Korea", "Korean");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student student : students) {
            System.out.println(student.toString() + " - GPA: " + student.getGpa() + " - Honors: " + student.hasHonors());
        }
    }
}