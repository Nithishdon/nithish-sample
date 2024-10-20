/*5.	Given input salaries of three employees in integer data type,
 your task is to count the number of employees getting salaries between 5000 to 10000.
Input format

The first line of each test case consists of salaries of employees in integer.

Output format

Print the number of employees getting salaries in the specified range.

Constraints

Get input in the integer format.

Use one dimensional array to store employee salaries and do selection using if- else statement.
Sample test Cases:



Test Cases	Test Case 1:	Test Case 2:	Test Case 3:
Input 1	Salary of Emp 1 :12000

Salary of Emp 2 :3000

Salary of Emp 3 :8000	Salary of Emp1 :1000 Salary of Emp 2 :7500
Salary of Emp 3 :9800	Salary of Emp 1 :1000

Salary of Emp 2 :800

Salary of Emp 3 :2500
Output	2	3	NIL
 */
import java.util.*;
public class prg5 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        if(arr[i]>=5000&&arr[i]<=10000)
        count++;
    }
    if(count>=1)
    System.out.println(count);
    else
    System.out.println("NIL");
 }   

}
