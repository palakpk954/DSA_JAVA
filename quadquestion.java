package if_else;

import java.util.Scanner;

public class quadquestion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int a = sc.nextInt();
        System.out.print("Enter the y coordinate: ");
        int b = sc.nextInt();

        if (a==0 && b==0){
            System.out.println("The Point is at Origin");}
        else if(a>0 && b>0){
            System.out.println("The Point is in 1st quad.");}
        else if(a<0 && b>0){
            System.out.println("The Point is in 2nd quad.");}
        else if(a>0 && b<0){
            System.out.println("The Point is in 3rd quad.");}
        else if(a<0 && b<0){
            System.out.println("The Point is in 4th quad.");}
        else if(a==0){
            System.out.println("The Point is at Xaxis");}
        else if(b==0){
            System.out.println("The Point is at Yaxis");
        }
    }
}
