import static javax.swing.JOptionPane.*;

class Verdier {
  public static void main(String[] args) {

        String intValue = showInputDialog("Please enter number: ");
        int val3 = Integer.parseInt(intValue);
        int value3 = 5;

        if(val3 == value3){
          showMessageDialog(null, "Det hemmelige taller er: " + value3 + ". Du skrev " + val3 + ". Sammenligningsresultat: true" );
        }
        else{
            showMessageDialog(null, "Det hemmelige taller er: " + value3 + ". Du skrev " + val3 + ". Sammenligningsresultat: false" );
        }

      String stringValue = showInputDialog("Please enter text: ");
      String value1 = "hello";
      boolean erDeLike = value1.equals(stringValue);

        if(erDeLike == true){
            showMessageDialog(null, "Den hemmelige teksten er: " + value1 + ". Du skrev: " + stringValue + ".Sammenligningsresultat: true");
        }
        else{
            showMessageDialog(null, "Den hemmelige teksten er: " + value1 + ". Du skrev: " + stringValue + ". Sammenligningsresultat: false");
        }

      String charValue = showInputDialog("Please enter character");
      char value2 = charValue.charAt(0);
      char val2 = 'h';

      if( value2 == val2){
        showMessageDialog(null, "Det hemmelige tegnet er: " + val2 + ". Du skrev: " + value2 + ". Sammenligningsresultat: true");
      }
      else{
        showMessageDialog(null, "Det hemmelige tegnet er:" + val2 +  ". Du skrev: " + value2 + ". Sammenligningsresultat: false");

      }

  }
}
