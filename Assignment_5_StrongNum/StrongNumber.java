import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting Number:");
        int start = sc.nextInt();

        System.out.println("Enter the Ending Number:");
        int end = sc.nextInt();

        System.out.println("Strong Numbers between "+start +" and "+ end +" are:");
        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
   
    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
