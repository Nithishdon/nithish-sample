/*10.	Given a number, Find the factorial of the given number using iterative. 
Sample Input: 5
Sample Output: 120
Sample Input: 7
Sample Output: 5040
*/
import java.util.*;
public class sam10 {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>=1)
        {
            fact*=n;
            n-=1;
        }
        System.out.println(fact);
    }
}
