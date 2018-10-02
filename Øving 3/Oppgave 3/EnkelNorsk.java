import static javax.swing.JOptionPane.*;

class EnkelNorsk{
  public static void main(String[] args) {
  String tekst = showInputDialog("Skriv inn tekst");

  int sjekk1 = tekst.indexOf('c');
  int sjekk2 = tekst.indexOf('q');
  int sjekk3 = tekst.indexOf('w');
  int sjekk4 = tekst.indexOf('x');
  int sjekk5 = tekst.indexOf('z');
  int sjekk6 = tekst.indexOf('æ');
  int sjekk7 = tekst.indexOf('ø');
  int sjekk8 = tekst.indexOf('å');

  if(sjekk1 == -1 && sjekk2 == -1 && sjekk3 == -1 && sjekk4 == -1 && sjekk5 == -1 || sjekk6 != -1 || sjekk7 != -1 || sjekk8 != -1){
    showMessageDialog(null, "Dette er enkelnorsk");
  }
  else{
    showMessageDialog(null, "Dette er ikke enkelnorsk");
  }
}
}
