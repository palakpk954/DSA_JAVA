package if_else;
import java.util.Scanner;
public class question2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: " );
        int a = sc.nextInt();
        if (Math.abs(a) >69)
            {
            System.out.println("The number you want to check is greater than 69.");
            }
        else System.out.println("The number you want to check is less than 69.");
    }
}
