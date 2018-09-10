import static javax.swing.JOptionPane.*;

class totaltSekunder {
  public static void main(String[] args) {
    String timerLest = showInputDialog("Timer: ");
    String minutterLest = showInputDialog("Minutter: ");
    String sekunderLest = showInputDialog("Sekunder: ");
    double timer = Double.parseDouble(timerLest);
    double minutter = Double.parseDouble(minutterLest);
    double sekunder = Double.parseDouble(sekunderLest);
    double totaltSekunder = (timer * 3600) + (minutter * 60) + sekunder;
    String utskrift = totaltSekunder + " er totalt antall sekunder. ";
    showMessageDialog(null, utskrift);
  }
}
