/*18.	Create a program to display the "text" corresponding to a certain "numerical value", using the following equivalence:
a)	9,10 = Excellent
b)	7,8 = Notable
c)	6 = Good
d)	5 = Approved
e)	0-4 = Fail
f)	>=10= Invalid 
Sample Input: 9
Sample Output: Excellent 
Sample Input: 3
Sample Output: Fail
*/
import java.util.*;
public class exp18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        switch(num)
        {
            case 10:
            case 9:
                  System.out.println("Excellent");
                  break;
            case 8:
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Approved");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                 System.out.println("Fails");
                 break;
        }
    }
}
