//factorial program  using loop 
import java.util.*;
public class exp5 {
    public static void main(String[] args) {
        int i,n,sum=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
          sum*=i;
        }
        System.out.println(sum);
    }
    
}
