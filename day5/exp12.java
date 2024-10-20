/*12.	During lockdown, ATMs were allowed to dispatch currencies in specific way. 
If user enters the amount, which is not multiple of 500 transactions will be rejected. 
If amount is 500 exactly, then 5 currencies of 100 will be dispatched by machine.
Sample Input: 500
Sample Output: please dispatch 5 notes of 100
Sample Input: 300
Sample Output: please enter the amount multiple of 500
*/
import java.util.*;
public class exp12 {
    public void atm(int amt)
    {
        if(amt%500==0){
            int count=amt/100;
        System.out.println("please dispatch "+count+" notes of 100");
        }
        else
        System.out.println("please enter the amount multiple of 500");
    }
public static void main(String [] args)
{
    int amt;
    Scanner sc=new Scanner(System.in);
    amt=sc.nextInt();
    exp12 obj=new exp12();
    obj.atm(amt);

}
    
}
