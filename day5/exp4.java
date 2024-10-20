/*4.	Once a baby lion lost his way in the jungle. An old deer took pity on him and planned to take him to his place. 
But the other deer and his other friends — rabbits, squirrels, and birds are scared so they accompanied.
 In the morning they counted themselves to see if the baby lion done any mischief. Help them to find it. 
 Total number of animals, count of each (rabbit, deer, birds, and squirrels) in the morning are the inputs. 
Sample Input: 240, 27,48,124,38
Sample Output: Baby lion is mischievous
Sample Input: 250, 42,46,115,47
Sample Output: Baby lion is well behaved
Sample Input: 120, 45,38,30, 27
Sample Output: Counted wrongly
*/
import java.util.*;
public class exp4 {
    public void ans(int tot,int rab,int deer,int bird,int sqr)
    {
        rab+=deer+bird+sqr;
        if(tot==rab)
        System.out.println("Baby lion is well behaved");
        else if(tot>rab)
        System.out.println(" Baby lion is mischievous");
        else if(tot<rab)
        System.out.println("Counted wrongly");
    }
    public static void main(String[] args)
    {
     int tot,rab,deer,bird,sqr;
     Scanner sc=new Scanner(System.in);
     tot=sc.nextInt();
     rab=sc.nextInt();
     deer=sc.nextInt();
     bird=sc.nextInt();
     sqr=sc.nextInt();
     exp4 obj=new exp4();
     obj.ans(tot,rab,deer,bird,sqr);

    }
}
