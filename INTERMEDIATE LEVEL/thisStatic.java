class Demo {
    static int count = 0;
    int number;

    Demo(int number) {
        this.number = number;
        count++;
    }

    void show() {
        System.out.println("Object Number: " + this.number);
        System.out.println("Total Objects: " + count);
    }
}

public class thisStatic{
    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);

        d1.show();
        d2.show();
    }
}
