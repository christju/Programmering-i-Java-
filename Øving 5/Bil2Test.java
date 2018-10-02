

class Bil2Test {
  public static void main(String[] args) {

    /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil
     vha. standardkonstruktøren: */
    Bil2 minBil = new Bil2("VF-303614", "BMW", 1998, 90, true);
    Bil2 dinBil = new Bil2("DL-324567", "Volvo", 2002, 100, true);


    /* 2. programsetning: Skriver ut innholdet i minBils objektvariabler: */
    System.out.println("regnr " + minBil.getRegnr()
        + ", merke " + minBil.getMerke()
        + ", year " + minBil.getYear()
        + ", hastighet " + minBil.getHastighet()
        + ", motorenIGang " + minBil.isMotorenIGang());

    System.out.println("regnr " + dinBil.getRegnr()
        + ", merke " + dinBil.getMerke()
        + ", year " + dinBil.getYear()
        + ", hastighet " + dinBil.getHastighet()
        + ", motorenIGang " + dinBil.isMotorenIGang());

    minBil.setHastighet(111);
    dinBil.setHastighet(222);

    System.out.println("regnr " + minBil.getRegnr()
        + ", merke " + minBil.getMerke()
        + ", year " + minBil.getYear()
        + ", hastighet " + minBil.getHastighet()
        + ", motorenIGang " + minBil.isMotorenIGang());

    System.out.println("regnr " + dinBil.getRegnr()
            + ", merke " + dinBil.getMerke()
            + ", year " + dinBil.getYear()
            + ", hastighet " + dinBil.getHastighet()
            + ", motorenIGang " + dinBil.isMotorenIGang());

  }
}
