/*Write a program to check whether the given number is odd or even.
Sample Input: 20
Sample Output: Even
Sample Input: 87
Sample Output: Odd
*/
import java.util.*;
public class exp2 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
