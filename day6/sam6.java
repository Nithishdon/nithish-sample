/*6.	Write a program to print the numbers from 1 to 20 other than the given number. 
Input should be between 1 to 20.
Sample Input: 6
Sample Output: 1 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Sample Input: 17
Sample Output: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 19 20
Sample Input: 23
Sample Output: Invalid Input
*/
import java.util.*;
public class sam6 {
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n<=0||n>20)
    System.out.println("invalid input! enter no between 1 to 20");
    else{

    
    for(int i=1;i<=20;i++)
    {
        if(n==i)
        continue;
        else
        System.out.print(i+" ");
    }
  }
  }  
}
