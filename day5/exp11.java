/*11.	To check whether the given number is Armstrong number or not.
Armstrong number in 3-digit numbers is a number whose sum of cubes of each digit is equal to the number itself.
  For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
Sample Input: 153
Sample Output: true
Sample Input: 121
Sample Output: false
*/
import java.util.*;
public class exp11 {
    public static void main(String [] args)
    {
        int n,rem,sum=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       String ch=String.valueOf(n);
       //typecast string to int
      // int n=Integer.parseInt(ch);
       int len=ch.length();
       int temp=n;
       while(n>0)
       {
        rem=n%10;
        sum+=Math.pow(rem, len);
        n=n/10;
       }
       if(temp==sum)
       System.out.println("ams");
       else
       System.out.println("not ams");
    }
    
}
