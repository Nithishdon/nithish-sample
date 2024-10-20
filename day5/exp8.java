/*8.	Read total shopping amount purchased in the shop, and then apply the discount as per the following discount criteria, 
then find and print the final amount that must be paid by the customer after subtracting the discount amount: 			
Shopping Amount    Discount%
5000 and Above	      25%
1000 – 4999	      10%
Below 1000		       5%
*/
import java.util.*;
public class exp8
{
    public double discount(int tot)
    {
        if(tot>0&&tot<1000)
        {
            double temp=(double)tot*0.05;

        return tot-temp;
        }
        else if(tot>=1000&&tot<5000)
        {
            double temp=(double)tot*0.10;

            return tot-temp;
        }
        else if(tot>=5000)
        {
            
            double temp=(double)tot*0.25;

            return tot-temp;
        }
        else 
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int tot;
        tot=sc.nextInt();
        exp8 obj=new exp8();
        double ans=obj.discount(tot);
        if(ans==-1)
        System.out.println("Invalid");
        else
        System.out.println(ans);
    }
}