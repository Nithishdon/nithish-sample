/*7.	A person pays tax 10% if his income is more than 2.5 lacs for the amount excess to 2.5 lacs. 
Person having annual income lesser than 2.5 lac is exempted from tax. Write a program to implement it.
Sample Input: 200000
Sample Output: You are exempted from tax
Sample Input: 400000
Sample Output: Tax amount is 15000
*/
import java.util.*;
public class exp7 {
    public String tax(int amt)
    {
      if(amt>250000)
      {
        amt-=250000;
         double temp=(double)amt*0.10;
      
      return "Tax amount is "+temp;
      }
      else
      return "You are exempted from tax";

    }
    public static void main(String [] args)
    {
       int amt;
       Scanner sc=new Scanner(System.in);
       amt=sc.nextInt();
       exp7 obj=new exp7();
       String ans=obj.tax(amt);
       System.out.println(ans);
    }
    
}
