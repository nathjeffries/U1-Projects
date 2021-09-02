import javax.swing.JOptionPane;
public class Sales {

    public static void main(String[] args) {


     double  discount, quantity, price, salesTax, subTotal;
     double taxTotal,totalCost;

     price = Integer.parseInt(JOptionPane.showInputDialog("What is the sale price?"));
     discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount?"));
     quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
     salesTax = Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax?"));

     subTotal = (quantity * (price * (1 - (discount/100))));
     taxTotal = (subTotal * (salesTax/100));
     totalCost = subTotal + taxTotal;

        JOptionPane.showMessageDialog(null, "Here is your Sub Total: $" + subTotal);
        JOptionPane.showMessageDialog(null, "Here is your Tax Total: $" + taxTotal);
        JOptionPane.showMessageDialog(null, "Here is your Total Cost: $" + totalCost);

        System.exit(0);
    }

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
