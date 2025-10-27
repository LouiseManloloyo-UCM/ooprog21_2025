import java.util.*;

public class bankbalanceinterest {
 public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double bal;
System.out.print("enter initial bank balance > ");
 bal = sc.nextDouble();
        
double rate[] = {0.02,0.03,0.04,0.05};
 double newbal;

for(int i=0;i<rate.length;i++){
newbal=bal;
System.out.println("\nwith an initial balance of $" + bal + " at an interest rate of " + rate[i]);
for(int y=1;y<=4;y++){
newbal=newbal+(newbal*rate[i]);
System.out.println("after year " + y + " balance is $" + newbal);
            }
        }
sc.close();
System.out.println("\n----jgrasp: operation complete.");
    }
}

