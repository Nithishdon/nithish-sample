/*2.	Write a program if an integer variable currentNumber is odd, change its value so that it is now 3 times currentNumber plus 1,
 otherwise change its value so that it is now half of currentNumber.
Sample Input: 17 
Sample Output: 52
Sample Input: 26
Sample Output: 13
*/
import java.util.*;
public class exp2 {
        
    public void ans(int num)
    {
        if(num%2==0)
        System.err.println(num/2);
        else
        System.err.println((num*3)+1);    
    }
public  static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int  num;
num=sc.nextInt();
exp2 obj=new exp2();
obj.ans(num);
    }
}
