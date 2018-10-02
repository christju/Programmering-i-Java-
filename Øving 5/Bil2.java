
class Bil2{
    private final String regnr;
    private final String merke;
    private int year;
    private int hastighet;
    private Boolean motorenIGang;

    public Bil2(String regnr, String merke, int year, int hastighet, Boolean motorenIGang) {
      this.regnr = regnr;
      this.merke = merke;
      this.year = year;
      this.hastighet = hastighet;
      this.motorenIGang = motorenIGang;
    }

    public String getRegnr(){
      return regnr;
    }

    public String getMerke(){
      return merke;
    }

    public int getYear(){
      return year;
    }

    public int getHastighet(){
      return hastighet;
    }

    public Boolean isMotorenIGang(){
      return motorenIGang;
    }

    public void setHastighet(int nyHastighet){
      hastighet = nyHastighet;
    }






}
