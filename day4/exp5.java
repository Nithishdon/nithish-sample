/*Write a program to find the mobile chosen is within the budget or not. 
To find the budget mobiles is based on the below-mentioned criteria,
a)	If the cost of the mobile chosen is less than or equal to 15000 then display it as "Mobile chosen is within the budget"
b)	If the cost of the mobile chosen is greater than 15000 then display it as “Mobile chosen is beyond the budget” 
Sample Input: 12000
Sample Output: Mobile chosen is within the budget
Sample Input: 22000
Sample Output: Mobile chosen is beyond the budget 
*/
import java.util.*;
public class exp5 {
    public static void main(String[] args)
    {
        int cost;
        Scanner sc=new Scanner(System.in);
        cost=sc.nextInt();
        if(cost<=0)
        System.out.println("Invalid");
        else if(cost<=15000)
        System.out.println("Mobile chosen is within the budget");
        else
        System.out.println("Mobile chosen is beyond the budget ");
    }
}
