/*14.	Write a program to print the multiplication table from 1 to N (where N is a number entered by the user).
Sample Input: 10 
*/
import java.util.*;
public class sam14 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for( int j=1;j<=10;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        
    }
    
}
