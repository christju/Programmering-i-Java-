class Aar{
  public int year;

  public Aar(int year){
    this.year = year;
  }


  public int getÅr(){
    return year;
  }

  public int beregnIFjor(){
    return year-=1;
  }

  public int beregnNesteÅr(){
    return year+=2;
  }

  public int beregnOmNoenÅr(int noenAar){
      return (year - 1) + noenAar;
  }

  public Boolean isSkuddår(){
    year = year - 1;
    boolean leap = false;
    if((year) % 4 == 0) {
      if( year % 100 == 0) {

          if ( year % 400 == 0){
            leap = true;
          }
          else{
              leap = false;
            }
      }
      else{
          leap = true;
        }
  }
  else{
      leap = false;
    }
    return leap;
}
}
