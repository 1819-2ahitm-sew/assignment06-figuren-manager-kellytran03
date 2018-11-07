abstract class Figuren {

    abstract   public double fläche();
    abstract  public double umfang();
    abstract  public String ausgabe();


    public String roundResult(double result){
        String roundedResult="";
        result=Math.round(result*1000.0)/1000.0;
        roundedResult +=result;

        return roundedResult;
    }

}
