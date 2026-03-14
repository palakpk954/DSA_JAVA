package if_else;

import java.util.Scanner;

public class Greatestof3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("1st number is greatest." + num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("2nd number is greatest." + num2);
        }
        else if(num3>=num1 && num3>=num2){
            System.out.println("3rd number is greatest." + num3);
        }
    }
}
