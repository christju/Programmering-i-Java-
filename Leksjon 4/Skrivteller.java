/**
 * SkrivTeller.java  - "Programmering i Java", en variant av SkrivMangeLinjer.java
 *
 * Programmet skriver telleren på skjermen.
 */
class SkrivTeller {
  public static void main(String[] args) {
    int teller = 44;
    while (teller > 5) {
      System.out.println("teller er lik " + teller);
      teller -= 1;
    }
  }
}

/* Utskrift:
teller er lik 0
teller er lik 1
teller er lik 2
teller er lik 3
teller er lik 4*/
