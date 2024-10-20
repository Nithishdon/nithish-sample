/*5.	A store charges $12 per item if you buy less than 10 items. 
If you buy between 10 and 99 items, the cost is $10 per item. 
If you buy 100 or more items, the cost is $7 per item.
 Write the logic that asks customer name, how many items they are buying and prints the customer’s name and total cost.
Sample Input: Smith, 40
Sample Output: Smith 400
Sample Input: Eve, 111
Sample Output: Eve 777
*/
import java.util.*;
public class exp5 {
    public int shop(int items)
    {
        if(items<=0)
        return -1;
        else if(items>=1&&items<10)
        return 12*items;
        else if(items>=10&&items<=99)
       return 10*items;
        else 
        return 7*items;

        
    }
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String name;
     int items;
     name=sc.nextLine();
     items=sc.nextInt();
     exp5 obj=new exp5();
    int ans=obj.shop(items);
    System.out.println(name+" "+ans);
    }
    
}
