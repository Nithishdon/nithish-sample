/*3.	Write a program to read an integer variable ‘Code’. If the Code value is 1, read double values and print the sum.
 If the Code value is 2, read the integers and print the product. If the code value is 3, read the strings and join them. 
Sample Input: 1, 24.50, 67.00
Sample Output: 91.5
Sample Input: 3, ‘Hello’, ‘World’
Sample Output: HelloWorld
*/
import java.util.*;
public class exp3 {
    public void ans(int code,Scanner sc)
    {
        if(code==1)
        {
           double a,b;
           a=sc.nextDouble();
           b=sc.nextDouble();
           System.out.println(a+b);
        }
       else if(code==2)
        {
           int a,b;
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println(a*b);
        }
       else if(code==3)
        {
            String a,b;
            a=sc.next();
            b=sc.next();
            System.out.println(a+b);
        }
        else
        {
            System.out.println("Invalid ");
        }
    }
    public static void main(String[] args)
    {
        int code;
        Scanner sc=new Scanner(System.in);
        code=sc.nextInt();
        exp3 obj=new exp3();
        obj.ans(code,sc);

    }
}
