//Check Prime Number using a for loop
import java.util.*;
public class exp7 {
    public static void main(String[] args) {
        int i,n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
            count++;
            if(n/i!=1)
            count++;
        }
    }
        if(count==2)
        System.out.println(n+"is prime");
        else
        System.out.println(n+"is  not prime");
        
    
}
}
