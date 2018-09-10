
import static javax.swing.JOptionPane.*;

class Grader {
  public static void main(String[] args) {
    String fahrenheitLest = showInputDialog("Fahrenheit: ");
    double fahrenheit = Double.parseDouble(fahrenheitLest);
    double grader = (fahrenheit - 32) * 5/9;
    String utskrift = fahrenheit + " fahrenheit er lik " + grader  + " grader celsius.";
    showMessageDialog(null, utskrift);
  }
}
