/*5.	Kittu the ‘Giant Ant’ has 100 rooms in its colony.
All the ants in the colony can crawl from 1 room to another, from there to another, and so on. 
But our ‘Kittu’ has a special power that makes him jump from one room to the next 10th room directly. 
That is room no 1 to room no 11 or 3 to 13… But poor ‘Kittu’ doesn’t know how to calculate/find which room he can jump next. 
Help him saying all the room numbers to climb up. His starting room number can be the input.
Sample Input: 1
Sample output: 1 11 21 31 41….91
Sample Input: 5
Sample Output: 5 15 25 35 … 95
*/
import java.util.*;
public class sam5 {
    public static void main(String[] args)
    {
        int roomno;
        Scanner sc=new Scanner(System.in);
        roomno=sc.nextInt();
         if(roomno<=0)
         System.out.println("enter valid room no");
         else
         {
            int ans=0;
            while(roomno<=100)
            {
                
                System.out.print(roomno+" ");
                roomno+=10;
            }
         }
    }
}
