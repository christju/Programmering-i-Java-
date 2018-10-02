

class Bil3Test {
  public static void main(String[] args) {

    /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil
     vha. standardkonstruktøren: */
    Bil3 minBil = new Bil3("VF-34567890", "Mercedez", 2000);
    Bil3 dinBil = new Bil3("CD-345678", "Mazda", 2005);


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
