import java.util.Scanner;

public class large_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);
    }
}
