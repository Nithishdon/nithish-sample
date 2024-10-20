/*11.	Write a program to perform the following:
a)	Display the question “What is the currency unit in India?”
b)	Accept the answer
c)	If the answer is wrong (other than Rupee) display “Try again!”.
d)	If it is correct “Rupee” displays the message “Answer is correct”.
 
e)	If the user gives the correct answer in the first two attempts the program will terminate.
f)	If the user fails to provide the correct answer in three attempts the program itself answers. 
Sample Input/Output:
What is the unit of currency in India? Rupee Answer is correct
Sample Input/Output:
What is the unit of currency in India? Euro Try again!
Rupee
Answer is correct Sample Input/Output:
What is the unit of currency in India? Yen Try again!
Pound Try again! Euro
Sorry it is a Rupee

*/
import java.util.*;
public class sam11 {
    public static void main(String[] args) {
        String currency;
        int count=0;
       
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            currency=sc.next();
            currency=currency.toUpperCase();
           if(currency.equals("RUPEE"))
        {
            System.out.println("answer is correct");
            break;
        }
        else
        {
          System.out.println("Try Again!");
          count++;
        }
        if(count==3){
            System.out.println("sorry it is a rupee");
        break;
       }
    }
}
}