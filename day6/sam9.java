/*9.	Write a program to print an ‘odd’ or ‘even’ number series based on the given number.
 That is if the input is an odd number, then it should generate the odd number series from 1 to the given number inclusive.
  If it is even, then it should generate the series from 2 to that number.
Sample Input: 13
Sample Output: 1 3 5 7 9 11 13
Sample Input: 16
Sample Output: 2 4 6 8 10 12 14 16
*/
import java.util.*;
public class sam9 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                System.out.print(i+" ");
            }
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                continue;
                else
                System.out.print(i+" ");
            }
        }
    }
}
