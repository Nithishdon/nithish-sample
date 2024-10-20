/*Write a program to display the grade of a student based on his/her marks
Marks 		Grade		Marks 		Grade
>90	    O.    	  	81 to 90	   A
71 to 80   B	  	61 to 70	   C
50 to 60	 D. 		< 50		    F
*/
import java.util.*;
public class exp15 {
    public static void main(String [] args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>100&&marks<0)
        System.out.println("Invalid");
        else if(marks>90)
        System.out.println("O");
        else if(marks>80)
        System.out.println("A");
        else if(marks>70)
        System.out.println("B");
        else if(marks>60)
        System.out.println("C");
        else if(marks>=50)
        System.out.println("D");
        else
        System.out.println("F");
    }
}
