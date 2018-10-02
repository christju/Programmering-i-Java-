import static javax.swing.JOptionPane.*;

class Posisjon{
  public static void main(String[] args) {

    String tekstInput = showInputDialog("Skriv inn en tekststreng");
    int pos = tekstInput.indexOf('c');

    if(pos == -1 ){
      showMessageDialog(null, "Strengen inneholder ikke c ");
    }
    else{
      showMessageDialog(null, "Første c er i posisjon: " + pos);
    }
  }
}
