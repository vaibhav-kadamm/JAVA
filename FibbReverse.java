import java.util.Scanner;

public class FibbReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of Fibonacci numbers:");
        int count = sc.nextInt();
        int[] fibonacci = new int[count];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Reverse Fibonacci sequence for count " + count + ":");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
