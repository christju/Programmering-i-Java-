

class Bil4Test {
  public static void main(String[] args) {

    /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil
     vha. standardkonstruktøren: */
    Bil4 minBil = new Bil4("VF-34567890", "Mercedez", 2000);
    Bil4 dinBil = new Bil4("CD-345678", "Mazda", 2005);

        minBil.start();
        minBil.økFarten(20);

    /* 2. programsetning: Skriver ut innholdet i minBils objektvariabler: */
    System.out.println("regnr " + minBil.getRegnr()
        + ", merke " + minBil.getMerke()
        + ", year " + minBil.getYear()
        + ", hastighet " + minBil.getHastighet()
        + ", motorenIGang " + minBil.isMotorenIGang());

        dinBil.start();
        dinBil.økFarten(30);

    System.out.println("regnr " + dinBil.getRegnr()
        + ", merke " + dinBil.getMerke()
        + ", year " + dinBil.getYear()
        + ", hastighet " + dinBil.getHastighet()
        + ", motorenIGang " + dinBil.isMotorenIGang());

        minBil.stopp();

    System.out.println("regnr " + minBil.getRegnr()
        + ", merke " + minBil.getMerke()
        + ", year " + minBil.getYear()
        + ", hastighet " + minBil.getHastighet()
        + ", motorenIGang " + minBil.isMotorenIGang());

        dinBil.brems(20);

    System.out.println("regnr " + dinBil.getRegnr()
        + ", merke " + dinBil.getMerke()
        + ", year " + dinBil.getYear()
        + ", hastighet " + dinBil.getHastighet()
        + ", motorenIGang " + dinBil.isMotorenIGang());
  }
}
