public class Constructor{
    int x;
    int y;

    Constructor() {
        x = 5;
        y = 15;
    }

    void show() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.show();
    }
}
