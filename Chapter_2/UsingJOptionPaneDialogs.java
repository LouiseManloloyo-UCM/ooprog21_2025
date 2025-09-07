import javax.swing.JOptionPane;
public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?");
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
            if (answer == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break;
            } else if (answer == JOptionPane.NO_OPTION) {
                continue;
            } else {
                break;
            }
        }
    }
}
