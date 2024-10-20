/*4.	John has been given an integer array of numbers,
 his task is to read the integer numbers from the console and store them into an array then print the sum and average of array elements
  as output.
Input format

The first line of each test case consists of the size of the input array elements 
The second line of the input consists of elements to be stored in the array Output format
Print the sum and average of the array elements

Constraints

Get input in the integer format. Use a one-dimensional array to store and compute the sum.


Sample test Cases:

Test Cases	Test Case 1:	Test Case 2:	Test Case 3:
Input 1	3	4	5
Input 2	1 3 4	23 44 77 66	5 7 99 123 67
Output	8 2	210 52	301 60
*/

import java.util.Scanner;

public class prg4 {
  public static void main(String[] args) {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
      sum+=arr[i];
    }
System.out.println(sum+" "+sum/n);
    
  }  
}
