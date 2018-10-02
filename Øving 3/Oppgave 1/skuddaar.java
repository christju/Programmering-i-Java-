import static javax.swing.JOptionPane.*;

class Skuddaar{
  public static void main(String[] args) {

        String yearInput = showInputDialog("Please enter year: ");
        int year = Integer.parseInt(yearInput);

        boolean leap = false;

        if(year % 4 == 0) {
          if( year % 100 == 0) {

              if ( year % 400 == 0){
                leap = true;
              }
              else{
                  leap = false;
                }
          }
          else{
              leap = true;
            }
      }
      else{
          leap = false;
        }

      if(leap){
          showMessageDialog(null, "År " + year + " er skuddår");
        }
      else{
          showMessageDialog(null, "År " + year + " er ikke skuddår");
        }
  }
}
