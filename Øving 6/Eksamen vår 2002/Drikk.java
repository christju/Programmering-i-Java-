class Drikk{
  String navn;
  double alkoholprosent;

  public Drikk(String navn, double alkoholprosent){
    this.navn = navn;
    this.alkoholprosent = alkoholprosent;
  }

  public String getNavn(){
    return navn;
  }

  public double getAlkoholprosent(){
    return alkoholprosent;
  }

  public double finnGramAlkohol(int mlDrikk){
    return (alkoholprosent / 100) * 0,79 * mlDrikk;
  }

  


}
