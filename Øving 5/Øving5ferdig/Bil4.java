
class Bil4{
    public final String regnr;
    public final String merke;
    public int year;
    public int hastighet = 0;
    public Boolean motorenIGang = false;

    public Bil4(String regnr, String merke, int year) {
      this.regnr = regnr;
      this.merke = merke;
      this.year = year;
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

    public void start(){
   hastighet = 0;
   motorenIGang = true;
  }

  public void økFarten(int økning){
   hastighet += økning;
  }

  public void brems(int minskning){
   hastighet -= minskning;
  }

  public void stopp(){
   hastighet = 0;
   motorenIGang = false;
  }
}
