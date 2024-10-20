//prime no between n
import java.util.*;
public class exp8 {
    public static void main(String[] args) {
        int i,n,totcnt=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {

            int count=0;
            for(int j=1;j*j<=i;j++)
            {
                 if(i%j==0)
                 {
                 count++;
                 if(n/j!=j)
                 count++;
                 }
            }
            if(count==2){
            System.out.print(i+" ");
            totcnt++;
            }
       }
       System.out.println();
       System.out.println(totcnt);
    
}
}
