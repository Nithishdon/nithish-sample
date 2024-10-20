/*3.	Kartik wants to help his younger brother with mathematics homework. 
Brother will enter the number and the output should give the table of that number. 
Write a program to print the table.
Sample Input: 4
Sample Output: 4 8 12 16 20 24 28 32 36 40
Sample Input: 6
Sample Output: 6 12 18 24 30 36 42 48 54 60
*/
import java.util.*;
public class sam3 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=0)
        System.out.println("zeroth table! pls enter some other table");
        else
        {
            for( i=1;i<=10;i++)
            {
            System.out.println(i+"*"+n+"="+(i*n));
            }
        }
    }
}
