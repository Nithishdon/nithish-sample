import java.util.*;

public class exp4 {
    public boolean palindrome(String name, int st, int end) {
        if (st >= end)
            return true;
        else {
            if (name.charAt(st) != name.charAt(end))
                return false;
            return palindrome(name, ++st, --end); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.next();  
        exp4 obj = new exp4();
        boolean ans = obj.palindrome(name, 0, name.length() - 1);
        System.out.println("Is palindrome: " + ans);  
        sc.close();
    }
}
