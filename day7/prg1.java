/*1.	Create an integer array with size 5, then fetch the values from the keyboard, store them in the array, and display the elements.
Input format

The first line of each test case consists of elements of the array

Output format

Print the array elements.

Constraints

Use a one-dimensional array to store array elements and print the same as the output.

Sample test Cases:


Test Cases	Test Case 1:	Test Case 2:	Test Case 3:
Input	1 3 5 7 8	12 14 15 8 99	24 88 67 10 56
Output	1 3 5 7 8	12 14 15 8 99	24 88 67 10 56
 */
import java.util.*;
public class prg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int ans:arr)
        System.out.print(ans+" ");
    }
}
