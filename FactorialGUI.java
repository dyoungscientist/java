
import javax.swing.JOptionPane;


public class FactorialGUI {
   public static long factorial(int n) { // METHOD TO CALCULATE FACTORIAL
      long result = 1;
      for (int i = 1; i <= n; i++) result *= i;
      return result;
       
   } 
   public static void main(String[] args) {
      String input = javax.swing.JOptionPane.showInputDialog("Enter a non-negative integer: ");
      if (input == null)return;
      try {
          int n = Integer.parseInt(input.trim() );
      if (n<0){
        JOptionPane.showMessageDialog(null, "Error: Factorial is not defined for negative integers.");
        return;
      }  
      long fact = factorial(n);
        JOptionPane.showMessageDialog(null, "The factorial of " + n + " is " + fact);
        } catch (NumberFormatException e) {// ERROR HANDLING
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a non-negative integer.");
        }
   }
}
