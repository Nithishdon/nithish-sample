/*Ask user to enter age, and sex ( M or F ), then using following rules print their place of service.
a)	if employee is female, then she will work only in urban areas.
b)	if employee is a male and age is in between 20 to 40 then he may work in anywhere
c)	if employee is male and age is in between 40 to 60 then he will work in urban areas only.
d)	And any other input of age should print "ERROR".
Sample Input: 26, F
Sample Output: Urban Area
Sample Input: 30, M
Sample Output: Anywhere
*/
import java.util.*;
public class exp14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age;
        char sex;
        age=sc.nextInt();
        sex=sc.next().charAt(0);
    
        sex=Character.toUpperCase(sex);
        if( sex=='F')
        System.out.println("Urban Area");
        else 
        if(sex=='M')
        {
            if(age>=40&&age<=60)
            System.out.println("Urban Area");
            else if(age>=20&&age<=40)
            System.out.println("Anywhere");
            else
            System.out.println("ERROR");
        }
        
        else
        System.out.println("ERROR");
    }
}
