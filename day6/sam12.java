/*12.	Read N. Find the Sum of the first N odd numbers. Sample Input: 3
Sample Output: 9
Sample Input: 7
Sample Output: 49
*/
import java.util.*;
public class sam12
{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int odd=1;
        for(int i=0;i<n;i++)
        {
            sum+=odd;
            odd+=2;
        }
       System.out.println(sum);
    }
}