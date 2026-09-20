import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;
    private double marks;

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter roll number: ");
        s.setRollNo(sc.nextInt());
        System.out.print("Enter name: ");
        s.setName(sc.next());
        System.out.print("Enter course: ");
        s.setCourse(sc.next());
        System.out.print("Enter marks: ");
        s.setMarks(sc.nextDouble());

        System.out.printf("Roll No %d; Name %s; Course %s; Marks %.0f\n",
                s.getRollNo(), s.getName(), s.getCourse(), s.getMarks());
        sc.close();
    }
}