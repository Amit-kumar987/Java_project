interface Result {
    void displayResult();
}

class Student implements Result {
    String name;
    int roll;
    int m1, m2, m3;

    Student() {
        name = "Amit";
        roll = 78;
        m1 = 98;
        m2 = 99;
        m3 = 99;
    }

    public void displayResult() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        String grade = (percentage >= 60) ? "Pass" : "Fail";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + grade);
    }
}

public class Resultsheet {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayResult();
    }
}
