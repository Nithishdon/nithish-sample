/*During lockdown, ATMs were allowed to dispatch currency bill in specific way. 
If user enters the amount, which is not multiple of 500 transactions will be rejected.
Sample Input: 3400 (assume balance is 10000)
Sample Output: Please enter amount multiple of 500
Sample Input: 2000 (assume balance is 10000)
Sample Output: Valid amount, transaction in process
*/
import java.util.*;
public class exp17 {
    public static void main(String[] args) {
        int Tamount,balance;
        Scanner sc=new Scanner(System.in);
        balance=sc.nextInt();
        Tamount=sc.nextInt();
       if(balance<=Tamount)
       System.out.println("ur balance is less than ur tamounnt");
       else{
           if(Tamount%500==0)
           System.out.println("Valid amount, transaction in process");
           else 
           System.out.println(" Please enter amount multiple of 500");
       }
    }
}
