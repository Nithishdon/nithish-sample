/*Given 2 integer values, ‘a’ and ‘b’, return their sum. However, "teen" values in the range 13…19 inclusive, are extra lucky.
 So, if either value is a teen, just return 19.
Sample Input: 3, 4
Sample Output: 7
Sample Input: 13, 8
Sample Output: 19
*/
import java.util.*;
public class exp6 {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if((a>=13&&a<=19)||(b>=13&&b<=19))
        System.err.println("19");
        else
        System.out.println(a+b);
    }
}
