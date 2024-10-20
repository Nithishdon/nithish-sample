/*2.	Richard has to read n number of values in an array and he needs to print them in reverse order
Input format

The first line of each test case consists of the size of the array

The second line of each test case has elements of the array to perform the reverse task
 
Output format

Print the array elements in reverse order.

Constraints

Get first-line and second-line input in the integer format.

Use a one-dimensional array to store array elements and reverse them by accessing the array index position.
Sample test Cases:


Test Cases	Test Case 1:	Test Case 2:	Test Case 3:
Input 1	4	5	3
Input 2	2 3 5 18	2 8 97 75 99	76 37 2
Output	18 5 3 2	99 75 97 8 2	2 37 76
*/
import java.util.*;
public class prg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
       for(int i=n-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}
