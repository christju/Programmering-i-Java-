import static javax.swing.JOptionPane.*;

class Tid {
  public static void main(String[] args) {
    String sekunderLest = showInputDialog("Sekunder: ");
    int sekunder = Integer.parseInt(sekunderLest);
    int p1 = sekunder % 60;
        int p2 = sekunder / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
      String utskrift = p2 + ":" + p3 + ":" + p1;
    showMessageDialog(null, utskrift);
  }
}
