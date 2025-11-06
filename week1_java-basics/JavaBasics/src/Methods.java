import javax.swing.JOptionPane;

public class Methods {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a name");
        JOptionPane.showMessageDialog(null, hello(name));
    }

    static String hello(String name) {
        return "Hello " + name;
    }
}
