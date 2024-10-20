/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. 
Ask user for their salary and year of service and print the net bonus amount.
Sample Input: 20000, 7
Sample Output: 1000
Sample Input: 50000
Sample Output: 0 
*/
import java.util.*;
public class exp11 {
    public static void main(String[] args)
    {
        int salary,yexp;
        Scanner sc=new Scanner(System.in);
        salary=sc.nextInt();
        yexp=sc.nextInt();
        if(yexp>5)
        {
            double bonus=(double)salary*0.05;
           // double totamt=(double)bonus+salary;
            System.out.println(bonus);
        }
        else
        System.out.println("0");
    }
}
