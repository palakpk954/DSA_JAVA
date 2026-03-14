package if_else;

import java.util.Scanner;

public class question3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%5==0 && num%3==0){
            System.out.println("Apurva");}

        else if (num%3==0){
            System.out.println("Bhanu");
        }

        else if(num%5==0){
                System.out.println("Riya");
        }

        else if (num%3!=0 && num%5!=0){
            System.out.println("Isha");
        }
    }
}
