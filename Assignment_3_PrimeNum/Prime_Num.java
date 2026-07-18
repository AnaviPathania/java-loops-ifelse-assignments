import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Starting Number:");
        int start = sc.nextInt();
        
        System.out.println("Enter the Ending Number:");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true; 
    }
}
