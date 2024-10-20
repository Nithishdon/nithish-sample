/*Write a program to print absolute value of a number entered by user without using library method.
Sample Input: 1
Sample Output: 1
Sample Input: -1
Sample Output: 1
*/
import java.util.*;
public class exp12 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=0)
        System.out.println(n);
        else
        System.out.println((n*-1));
        //  or using Math.abs(n);
    }
}
