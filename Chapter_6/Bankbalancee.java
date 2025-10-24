import java.util.Scanner;
public class Bankbalancee {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
double bal=100;
double rate=0.03;
int yr=1;
int ans;
do{
bal = bal + (bal * rate);
System.out.println("after year " + yr + " at " + rate + " interest rate, balance is $" + bal);
System.out.println();
System.out.println("do you want to see the balance at the end of another year?");
System.out.println("enter 1 for yes");
System.out.print("or any other number for no >> ");
ans=input.nextInt();
yr=yr+1;
}while(ans==1);
input.close();
}
}
