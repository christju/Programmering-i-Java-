import static javax.swing.JOptionPane.*;

class Gjett{
  public static void main(String[] args) {

    // String tekst = showInputDialog("Skriv tekst");
    // String skrivTegn = showInputDialog("Skriv tegn");
    // int lengde = tekst.length();
    //
    // int count = 0;

    String someString = showInputDialog("Skriv tekst");
    String someChar = showInputDialog("Skriv tegn");

    while(someChar.isEmpty()){
      someChar = showInputDialog("Skriv tegn");

    }
    char tegn = someChar.charAt(0);
    int count = 0;



  for (int i = 0; i < someString.length(); i++) {
      if (someString.charAt(i) == tegn) {
          count++;
      }
    }
      int svar = showConfirmDialog(null, "Vil du gjette?");

        if(svar == 0  ){

          String gjett = showInputDialog("Gjett");
          int gjettSvar = Integer.parseInt(gjett);
          while(svar==0 && gjettSvar!=count){
            svar = showConfirmDialog(null, "Det var galt. Vil du gjette mer?");
            if(svar == 0){
              gjett = showInputDialog("Gjett");
              gjettSvar = Integer.parseInt(gjett);
            }
            else{
              showMessageDialog(null, "Antall " + tegn + " i " + someString + " er " + count);
            }
          }
          if(gjettSvar == count){
            showMessageDialog(null, "Antall " + tegn + " i " + someString + " er " + count);
          }
        }
        else{
          showMessageDialog(null, "Antall " + tegn + " i " + someString + " er " + count);
        }


  }
}
