import javax.swing.JOptionPane;

public class Methods {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a name");
        JOptionPane.showMessageDialog(null, hello(name));

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1.34, 3.14));
        System.out.println(add(1.69, 3.14, 0.65));
    }

    static String hello(String name) {
        return "Hello " + name;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
