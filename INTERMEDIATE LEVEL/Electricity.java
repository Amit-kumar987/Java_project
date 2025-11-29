class Customer {
    int units;

    Customer() {
        units = 150;
    }
}

class Bill extends Customer {
    double amount;

    void calculate() {
        amount = units * 6.5;
    }

    void show() {
        System.out.println("Units = " + units);
        System.out.println("Bill = " + amount);
    }
}

public class Electricity {
    public static void main(String[] args) {
        Bill b = new Bill();
        b.calculate();
        b.show();
    }
}
