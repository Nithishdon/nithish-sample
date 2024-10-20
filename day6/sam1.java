/*1.	Write a program to print the first N natural numbers if N is the input. 
Sample Input: 5
Sample Output: 1 2 3 4 5
Sample Input: 7
Sample Output: 1 2 3 4 5 6 7
*/
import java.util.*;
public class sam1 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int i,n;
       n=sc.nextInt();
       
       for(i=1;i<=n;i++)
       
       System.out.println(i);
       sc.close();
    }
}
