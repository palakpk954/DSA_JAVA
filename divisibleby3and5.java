package if_else;

import java.util.Scanner;

public class divisibleby3and5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5");
        }
        else {
            System.out.println("The number is not divisible by 3 and 5");}
        sc.close();

    }

}
