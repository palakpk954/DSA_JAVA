package if_else;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter the SP: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            int profit = sp - cp;
            double profitPercent = (profit/cp) * 100;
            System.out.println("profit is: " + profit);
            System.out.println("profit Percent is: " + profitPercent + "%");
        }
        else if (cp > sp) {
            int loss = cp - sp;
            double lossPercent = (loss/sp) * 100;
            System.out.println("Loss is: " + loss);
            System.out.println("loss Percent is: " + lossPercent + "%");
        }
        else {
            System.out.println("No Profit No loss.");
        }
        sc.close();
    }
}
