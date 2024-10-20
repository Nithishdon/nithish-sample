/*2.	Write a program to print the power of m raised to n. 
Sample Input: 7, 5
Sample Output: 16807
Sample Input: 4, 6
Sample Output: 4096
*/
import java.util.*;
public class sam2 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int ans=(int)Math.pow(n, m);
        System.out.println(ans);
        sc.close();
    }
}
