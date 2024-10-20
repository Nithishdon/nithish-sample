/*8.	Jack and Emma are playing a number game. 
Jack should say the sum of the numbers that Emma says. 
He should sum until Emma says ‘zero’. 
Help Emma check whether Jack is right by telling her the answer.
Sample Input: 2 5 9 4 0
Sample Output: 20
Sample Input: 6 8 2 5 3 9 0
Sample Output: 33
*/
import java.util.*;
public class sam8 {
    
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            n=sc.nextInt();
            if(n==0)
            break;
            sum+=n;
        }
        System.out.println(sum);
    }
}
