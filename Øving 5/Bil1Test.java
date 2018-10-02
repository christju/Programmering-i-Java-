

class Bil1Test {
  public static void main(String[] args) {

    /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil
     vha. standardkonstruktøren: */
    Bil1 minBil = new Bil1("VF-303614", "BMW", 1998, 90, true);
    Bil1 dinBil = new Bil1("DL-324567", "Volvo", 2002, 100, true);


    /* 2. programsetning: Skriver ut innholdet i minBils objektvariabler: */
    System.out.println("regnr " + minBil.regnr
        + ", merke " + minBil.merke
        + ", year " + minBil.year
        + ", hastighet " + minBil.hastighet
        + ", motorenIGang " + minBil.motorenIGang);

    System.out.println("regnr " + dinBil.regnr
        + ", merke " + dinBil.merke
        + ", year " + dinBil.year
        + ", hastighet " + dinBil.hastighet
        + ", motorenIGang " + dinBil.motorenIGang);

    minBil.hastighet = 111;
    dinBil.hastighet = 222;

    System.out.println("regnr " + minBil.regnr
        + ", merke " + minBil.merke
        + ", year " + minBil.year
        + ", hastighet " + minBil.hastighet
        + ", motorenIGang " + minBil.motorenIGang);

    System.out.println("regnr " + dinBil.regnr
            + ", merke " + dinBil.merke
            + ", year " + dinBil.year
            + ", hastighet " + dinBil.hastighet
            + ", motorenIGang " + dinBil.motorenIGang);

  }
}
