/*There is a group selection in a crowd for an event based on the entry ticket number. 
For every group, the group leader will be the one who’s ticket number has 10 as it’s factor. 
If anyone gives the ticket number tell him/her that they are a group leader or a group member.
Sample Input: 5423
Sample Output: Group Member
Sample Input: 5610
Sample Output: Group Leader
*/
import java.util.*;
public class exp13
{
    public static void main(String [] args)
    {
       int ticketno;
       Scanner sc=new Scanner(System.in);
       ticketno=sc.nextInt();
       if(ticketno%10==0)
       System.out.println("Group Leader");
       else
       System.out.println("Group Member");
    }
}