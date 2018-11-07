class Quadrat extends Figuren {

    private double a = 0.00;

    public Quadrat(double a) {
        this.a= a;
    }


    @Override
    public double fläche() {
        return a*a;
    }

    @Override
    public double umfang() {
        return a*4;
    }

    @Override
    public String ausgabe() {
        return "Quadrat mit der Seitenlaenge "+a+" : Flaeche => "+roundResult(fläche())+", Umfang => "+roundResult(umfang());
    }
}
