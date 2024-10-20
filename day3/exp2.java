//Fibonacci Series using recursion
import java.util.*;
public class exp2 {
public int recursion(int n)
{
    if(n==0)
    return 0;
    else if(n==1)
    return 1;
    else{
     int last=recursion(n-1);
     int secondlast=recursion(n-2);
     return last+secondlast;
    }
   

}
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n;
     n=sc.nextInt();
     exp2 obj=new exp2();
     for (int i = 0; i < n; i++) 
        System.out.print(obj.recursion(i) + " ");
           
    }
}
/*import java.util.*;

public class exp1 {

    // Recursive method to print Fibonacci series
    public void printFibonacci(int n, int f1, int f2, int i) {
        if (i >= n) {
            return; // Base case: Stop when we reach the nth term
        }
        
        int f3 = f1 + f2; // Next Fibonacci number
        System.out.print(f3 + " ");
        
        // Recursive call: Shift f1 and f2, and increment i
        printFibonacci(n, f2, f3, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        exp1 obj = new exp1();
        
        // Initial values for f1 = -1 and f2 = 1, as in your iterative approach
        System.out.println("Fibonacci series up to " + n + " terms:");
        obj.printFibonacci(n, -1, 1, 0);  // Initial values passed to the recursive function
    }
}
 */