package if_else;
import java.util.Scanner;
public class Question1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number you want to check:");
        int n = sc.nextInt();
        if(n>999 && n<10000)
        {
            System.out.println("4 Digit Number.");
        }
        else System.out.println("Not a 4 Digit Number.");
    }
}
