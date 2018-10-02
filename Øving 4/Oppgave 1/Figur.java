import static javax.swing.JOptionPane.*;

class Figur{
  public static void main(String[] args) {
    String tekst = showInputDialog("Tast antall linjer");
    int brukerInput = Integer.parseInt(tekst);

    for(int teller = 0; teller < brukerInput; teller++){
      for(int tall = 0; tall <= teller; tall++){
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
