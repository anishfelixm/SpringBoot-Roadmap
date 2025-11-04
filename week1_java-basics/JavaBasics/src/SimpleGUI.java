import javax.swing.JOptionPane;

public class SimpleGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hi " + name);

        /*
         * The input from input dialog box comes back as a String
         * The parseint() is necessary to convert input from string to int
         */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
