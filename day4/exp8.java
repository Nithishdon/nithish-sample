/*In Chai Sung’s family the birthright will be given to the firstborn as a custom. 
Who will get the birthright among his three sons Choi Sung, Moui Sung, and Bhoi Sung if their ages are the input values? 
Sample Input: 34, 26, 18
Sample Output: Choi Sung
Sample Input: 28, 16, 30
Sample Output: Bhoi Sung
*/
import java.util.*;
public class exp8 {
    public static void main(String[] args)
    {
      int age1,age2,age3;
      Scanner sc=new Scanner(System.in);
      age1=sc.nextInt();
      age2=sc.nextInt();
      age3=sc.nextInt();
      if(age1>=age2&&age1>=age3)
      System.out.println("Choi Sung");
      else if(age2>=age1&&age2>=age3)
      System.out.println("Moui Sung");
      else
      System.out.println("Bhoi Sung");
    }
}
