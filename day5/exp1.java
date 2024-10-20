/*1.	There is a movie club for under 20 in the city where the entry is age restricted.
 Based on their age allow them into either ‘Cartoon Club’ or ‘Teens Club’.
Sample Input: 10
Sample Output: Cartoon Club
Sample Input: 15
Sample Output: Teens Club
Sample Input: -10
Sample Output: Invalid Age
Sample Input: 25
Sample Output: Not Allowed
*/

import java.util.*;
public class exp1
{
    public void club(int age)
    {
        if(age<0)
            System.out.println("invalid");
        else if(age>=1&&age<=12)
        System.err.println("Cartoon Club");
        else if(age>=13&&age<=19)
        System.err.println("Teens CLub");
        else if(age>19)
        System.err.println("Not Allowed");

        
    }
public static void main(String [] args)
{
    int age;
    Scanner sc=new Scanner(System.in);
    age=sc.nextInt();
    exp1 obj=new exp1();

   obj.club(age);
    sc.close();
}

}