//factorial using recursion
import java.util.*;
public class exp6 {
    public int factorial(int n)
    {
        if(n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        exp6 obj=new exp6();
        int ans=obj.factorial(n);
        System.out.println(ans);
    }
    
}
