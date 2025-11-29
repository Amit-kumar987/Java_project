import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int n = num;
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        System.out.println("Binary of " + num + " = " + binary);
    }
}
