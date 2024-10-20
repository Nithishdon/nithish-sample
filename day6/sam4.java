/*4.	Smith and John, grade 3 students playing number games.
 When Smith gives a number John will say the natural numbers up to that number but in reverse order. 
 Shia, their friend will say the sum of those numbers. 
 Help John and Smith with your program.
Sample Input: 4
Sample Output: 4 3 2 1, 10
Sample Input: 7
Sample Output: 7 6 5 4 3 2 1, 28
*/
import java.util.*;
public class sam4 { 
    public void  john(int n)
    {
        if(n<=1)
        {
            System.out.println(n);
            return ;
        }
        else{
        System.out.print(n+" ");
        john(n-1);
        }
    }
    public int shia(int n)
    {
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sam4 obj=new sam4();
        obj.john(n);
       int sum=obj.shia(n);
       System.out.println(sum);

sc.close();
    }
}
