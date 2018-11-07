class Rechteck extends Figuren {

    private double a = 0.00;
    private double b = 0.00;



    public Rechteck(double a, double b ) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double fläche()  {


        return a * b;
    }

    @Override
    public double umfang() {

        return a*2 + b*2;
    }

    @Override
    public String ausgabe() {

        return "Rechteck mit der Laenge "+a+" und der Breite "+b+" : Flaeche => "+roundResult(fläche())+", Umfang => "+roundResult(umfang());
    }
}
