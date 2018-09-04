/**
 * Arealberegning.java - "Programmering i Java", 4.utgave - 2009-07-01
 *
 * Programmet beregner grader fra fahrenheit til celsius.
 */

class Grader {
  public static void main(String[] args) {
    double fahrenheit = 98;
    double grader = (fahrenheit - 32) * 5/9;
    System.out.println(fahrenheit + " fahrenheit er lik " + grader  + " grader celsius.");
  }
}

/* Kjøring av programmet:
98.0 fahrenheit er lik 36.666666666666664 grader celsius
*/
