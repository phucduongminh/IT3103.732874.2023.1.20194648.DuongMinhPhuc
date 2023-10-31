import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String notification = "You've just entered: ";
        
        num1 = JOptionPane.showInputDialog(null, "Input first number: ", "First number", JOptionPane.INFORMATION_MESSAGE);
        notification += num1 + " and ";

        double number1 = Double.parseDouble(num1);

        num2 = JOptionPane.showInputDialog(null, "Input second number: ", "Second number", JOptionPane.INFORMATION_MESSAGE);
        notification += num2;

        double number2 = Double.parseDouble(num2);

        JOptionPane.showMessageDialog(null, notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Sum: " + (number1+number2) + "\nDifference: " + (number1-number2) + 
        "\nProduct: " + (number1*number2) + (number2 == 0?"\nCan't devide because number 2 = 0":("\nQuotient: " + (number1/number2))));

        System.exit(0);
    }
}
