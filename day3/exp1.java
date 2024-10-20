 //Fibonacci Series without using recursion
import java.util.*;
public class exp1 {
    public static void main(String[] args) {
        int n,i,f3,f1=-1,f2=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         for(i=0;i<n;i++)
         {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
         }
    }
}
