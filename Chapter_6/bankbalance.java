import java.util.Scanner;

public class bankbalance {
    public static void main(String[] args) {
        final double fixed_rate = 0.03;
        Scanner userinput = new Scanner(System.in);

        System.out.print("enter initial bank balance > ");
        double accounttotal = userinput.nextDouble();

        System.out.print("do you want to see next year's balance?\nenter 1 for yes or 9 for no >> ");
        int userchoice = userinput.nextInt();

        int yearcount = 0;
        while (userchoice == 1) {
            yearcount++;
            accounttotal *= (1 + fixed_rate);
            System.out.printf("after year %d at %.2f interest rate, balance is $%.1f%n",
                    yearcount, fixed_rate, accounttotal);

            System.out.print("do you want to see the balance at the end of another year?\nenter 1 for yes or 9 for no >> ");
            userchoice = userinput.nextInt();
        }

        System.out.println("thank you for using the bank balance calculator!");
        userinput.close();
    }
}
