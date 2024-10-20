import java.util.*;

public class exp3 {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        
        
        for (i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int len = Integer.toString(i).length();
            
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, len);
                temp = temp / 10;
            }
            
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
