/*Write a program to check error in marks entry while user enters the marks in the system. 
Consider Error as marks entered less than 0 and more than 100.
Sample Input: 83
Sample Output: Valid entry
Sample Input: 101
Sample Output: Invalid entry
Sample Input: -6
Sample Output: Invalid entry
*/
import java.util.*;
public class exp9 {
    public static void main(String[] args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks<0 || marks>100)
        System.out.println("Invalid entry");
        else
        System.out.println("Valid entry");
    }
}
