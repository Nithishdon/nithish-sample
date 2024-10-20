//13.	Write a program to print all possible outcomes with two dice (6 sides with digits 1 to 6) Expected Output:
 import java.util.*;
public class sam13 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=6;i++)
        {
        for(j=1;j<=6;j++)
        {
          System.out.print("("+i+","+j+")");
        }
        System.out.println();
       }
    }
}
