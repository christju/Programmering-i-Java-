import static javax.swing.JOptionPane.*;

class AarTest {
  public static void main(String[] args) {
    String årstallLest = showInputDialog("Årstall?");
    int year = Integer.parseInt(årstallLest);
    Aar år = new Aar(year);



    String tekst = "Året er " + år.getÅr()
        + "\nI fjor var det " + år.beregnIFjor()
        + "\nNeste år blir det " + år.beregnNesteÅr()
        + "\nFor tre år siden var det " + år.beregnOmNoenÅr(-3)
        + "\nOm tre år blir det " + år.beregnOmNoenÅr(3);


        if (år.isSkuddår()) {
          tekst += "\n" + year + " er skuddår";
        } else {
          tekst += "\n" + year + " er ikke skuddår";
        }

    showMessageDialog(null, tekst);
  }
} // AarTest

/* Hvis brukeren f.eks. oppgir 2016 som årstall, skal utskriften bli:
Året er 2016
I fjor var det 2015
Neste år blir det 2017
For tre år siden var det 2013
Om tre år blir det 2019
2016 er skuddår
*/
