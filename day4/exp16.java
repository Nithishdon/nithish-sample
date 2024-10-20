/*The policy followed by a company to process customer orders is given by the following rules: Suppose stock=100.
 If a customer order is less than or equal to that in stock and his credit is OK, supply his requirements. 
 If his credit is not OK do not supply. Send him intimation.
  If his credit is OK but the item in stock is less than is order, supply the available stock and inform as ‘Out of stock. 
  Balance will be refunded’.
Sample Input: 150, 100, ‘N’
Sample Output: 100 supplied
Sample Input: 150, 100, ‘Y’
Sample Output:  Cannot supply
Sample Input: 150, 200, ‘N’
Sample Output: 150 supplied. Out of stock. Balance will be refunded.
*/


import java.util.Scanner;

public class exp16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading stock value from user
        System.out.print("Enter available stock: ");
        int stock = scanner.nextInt();

        // Reading customer order
        System.out.print("Enter customer order quantity: ");
        int customerOrder = scanner.nextInt();

        // Reading customer's credit status
        System.out.print("Enter customer's credit status (Y for OK, N for Not OK): ");
        char creditStatus = scanner.next().charAt(0);

        // Processing the order based on the conditions
        if (creditStatus == 'Y') {
            if (customerOrder <= stock) {
                // Case where order can be fully supplied
                System.out.println(customerOrder + " supplied");
            } else {
                // Case where stock is less than order, but credit is OK
                System.out.println(stock + " supplied. Out of stock. Balance will be refunded.");
            }
        } else {
            // Case where credit is not OK, no supply
            System.out.println("Cannot supply");
        }

        scanner.close();
    }
}
