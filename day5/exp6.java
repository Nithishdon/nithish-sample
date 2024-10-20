/*6.	Write a program to read a Coordinate Point in a XY Coordinate System and Determine its Quadrant.
Sample Input: 2 2
Sample Output: 1
grapg quadrant I,II,III,Iv;
*/
import java.util.*;
public class exp6 {
    public String coordinate (int x,int y)
    {
        if(x==0&&y==0)
        return "orgin";
        else if(x>0&&y>0)
        return "I";
        else if(x<0&&y>0)
        return "II";
        else if(x<0&&y<0)
        return "III";
        else if (x>0&&y<0)
        return "IV";

        return "none";
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int x,y;
      x=sc.nextInt();
      y=sc.nextInt();
      exp6 obj=new exp6();
     String  ans=obj.coordinate(x,y);
      System.out.println(ans);

    }
    
}
