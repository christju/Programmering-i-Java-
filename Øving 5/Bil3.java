
class Bil3{
    public final String regnr;
    public final String merke;
    public int year;
    public int hastighet = 0;
    public Boolean motorenIGang = false;

    public Bil3(String regnr, String merke, int year) {
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

    public void setHastighet(int nyHastighet){
      hastighet = nyHastighet;
    }






}
