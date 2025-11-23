public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;

            int[] arr = new int[3];
            arr[5] = 50;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
        catch (Exception e) {
            System.out.println("Some other Exception occurred");
        }
    }
}
