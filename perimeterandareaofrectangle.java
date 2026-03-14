package if_else;

import java.util.Scanner;

public class perimeterandareaofrectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int n = sc.nextInt();
        System.out.print("Enter side width: ");
        int w = sc.nextInt();
        int area = n*w;
        System.out.println("The area of the rectangle is "+area);
        int perimeter = 2*(n+w);
        System.out.println("The perimeter of the rectangle is "+perimeter);

        if (area > perimeter) {
            System.out.println("The area is greater than perimeter of the rectangle");
        }
        else System.out.println("The area is less than perimeter of the rectangle");

    }
}
