//sum of digits in a number
import java.util.*;
public class exp9 {
    public static void main(String[] args) {
        double n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        double dcnt= (double)Math.log10(n)+1;
        int cnt=(int)dcnt;
        System.out.println(cnt);
    }
}
