/*3.	Create an array of integers, then find and print the size (number of elements) of the array.

Input Format:

A series of space-separated integers representing the elements of the array.

Output Format:

A single integer represents the size of the array.

Constraints:

The array can contain between 1 and 1000 integers. Each integer should be between -1000 and 1000.
 
Sample test Cases:


Test Cases	Test Case 1:	Test Case 2:	Test Case 3:
Input	10 20 30 40 50	-3 15 22 8	-54 9 -23 879 43 323
Output	5	4	6
*/
import java.util.*;
public class prg3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String[] strarr=input.split(",");
    int arr[]=new int[strarr.length];
    for(int i=0;i<strarr.length;i++)
    {
      arr[i]=Integer.parseInt(strarr[i]);
    }
    System.out.println(arr.length);
  }  
}
