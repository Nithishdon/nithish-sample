/*Write a program to check whether a kid is eligible for kinder garden school admission. 
If a child is of age 4 or more then he/she is eligible. 
Sample Input: 4
Sample Output: Eligible
Sample Input: 2
Sample Output: Not Eligible
*/
import java.util.*;
public class exp4 {
    public static void main(String [] args)
    {
     int  age;
     Scanner sc=new Scanner(System.in);
     age=sc.nextInt();
     if(age>=4)
     System.out.println("Eligible");
     else
     System.out.println("Not Eligible");
    }
}
