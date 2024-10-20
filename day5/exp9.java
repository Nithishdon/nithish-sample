/*9.	Write a program to read date of birth as input & calculate the age.
Sample Input: 4 7 1989
Sample Output: 33 years 2 months 3 days (May differ)
*/
import java.util.*;
import java.time.*;
public class exp9 {
    public void age(int date,int month,int year)
    {
         
        LocalDate curtdate=LocalDate.now();
        LocalDate persondate= LocalDate.of(year,month,date);
        Period age=Period.between(persondate,curtdate);
        int diffyear=age.getYears();
        int diffmonth=age.getMonths();
        int diffdate=age.getDays();
        System.out.println(diffyear+" years "+diffmonth+" months "+diffdate+" days ");
        

    }
    public static void main(String[] args)
    {
        int date,month,year; 
        Scanner sc=new Scanner(System.in);
        date =sc.nextInt();
        month =sc.nextInt();
        year =sc.nextInt();
        exp9 obj=new exp9();
        obj.age(date,month,year);
        sc.close();

    }
    
}
