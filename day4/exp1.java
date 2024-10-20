/*Take values of length and breadth of a rectangle from user and check if it is square or not.
Sample Input: 5, 3
Sample Output: Not a Square
Sample Input: 7, 7
Sample Output: Square
*/
import java.util.*;
public class exp1 {
    public static void main(String[] args)
    {
        int len,breadth;
        Scanner sc=new Scanner(System.in);
        len=sc.nextInt();
        breadth=sc.nextInt();
        if(len==breadth)
        System.out.println("Square");
        else
        System.out.println("Not a Square");

    }
}
