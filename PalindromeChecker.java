import javax.swing.JOptionPane;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        if (isPalindrome(number)) {
            JOptionPane.showMessageDialog(null, number + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not a palindrome.");
        }
    }
}
