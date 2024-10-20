/*Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
 "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
Sample Input: 3 6 8
Sample Output: Increasing order
Sample Input: 9 5 1
Sample Output: Decreasing order
Sample Input: 4 9 2
Sample Output: Neither increasing nor decreasing order
*/
import java.util.*;
public class exp10 {
    public static void main(String [] args)
    {
        int no1,no2,no3;
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();
        if(no1>=no2&&no2>=no3)
        System.out.println("Decreasing order");
        else  if(no1<=no2&&no2<=no3)
        System.out.println("Increasing order");
        else
        System.out.println(" Neither increasing nor decreasing order");
    }
}
