/*Write a program to get a number from the user and print whether it is positive, negative or zero.
Sample Input: 56
Sample Output: positive
Sample Input: -235
Sample Output: negative
*/
import java.util.*;
public class exp3 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        System.out.println("POsitive");
        else if(n<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
}
