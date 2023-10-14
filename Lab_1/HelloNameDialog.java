import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Duong Minh Phuc - 4648 Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi "+ name +"!");
        System.exit(0);
    }
}
