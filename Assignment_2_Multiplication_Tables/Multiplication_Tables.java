import java.util.Scanner;

public class Multiplication_Tables {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(" ");
            System.out.println("Multiplication Table for "+i);
            System.out.println(" ");
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
        }
        
    }
}
