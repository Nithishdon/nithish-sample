/*Kumar is purchasing certain items in a store.
 While purchasing certain items, a discount of 10% is offered to his if the quantity purchased is more than 1000. 
 Help, Kumar to calculate the total expenses.
Sample Input: 1200, 15.50
Sample Output: 16740.0
Sample Input: 200, 15.50
Sample Output: 3100.0
*/
import java.util.*;
public class exp7 {
    public static void main(String[] args)
    {
        double items,cost;
       Scanner sc=new Scanner(System.in);
       items=sc.nextDouble();
       cost=sc.nextDouble();
       if(items>1000)
       {
           double tot=items*cost;
           double dis=tot*0.10;
          double ans=Math.abs(dis-tot);
           System.out.println(ans);
       }
       else
       {
        double dis=items*cost;
        System.out.println(dis);
       }
    }
}
