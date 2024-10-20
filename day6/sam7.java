/*7.	Write a program to print only the numbers divisible by 3 and 5 for a given number from 1.
 Sample Input: 20
Sample Output: 3 5 6 9 10 12 15 18 20
Sample Input: 40
Sample Output: 3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 39 40
*/
import java.util.*;
public class sam7 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=0)
        System.out.println("Ivalid Input");
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(i%3==0&&i%5==0)
                System.out.print(i+" ");
                else if(i%3==0)
                System.out.print(i+" ");
                else if(i%5==0)
                System.out.print(i+" ");
            }
        }
    }
}
