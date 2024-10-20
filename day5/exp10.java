/*10.	Write a Java program to calculate frequency of digits in a number
Sample Input: 34593334
Sample Output:
3 occurs 4 times
4 occurs 2 times
5 occurs 1 times
9 occurs 1 times
*/
import java.util.*;
public class exp10 {
    public vooid frequency(int arr[],int n)
    {
        
    }
    public static void main(string [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        exp10 obj=new exp10();
        obj.frequency(arr,n);

    }
    
}
