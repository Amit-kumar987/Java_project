package exam;

import student.Student;

public class Result extends Student {
    int m1, m2, m3;

    public Result(int roll, String name, int m1, int m2, int m3) {
        super(roll, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        int total = m1 + m2 + m3;
        double percent = total / 3.0;

        System.out.println("------ MARK SHEET ------");
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Marks 3 : " + m3);
        System.out.println("Total   : " + total);
        System.out.println("Percent : " + percent + "%");
    }
}
