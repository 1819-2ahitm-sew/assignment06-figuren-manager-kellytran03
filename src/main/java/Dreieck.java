class Dreieck extends Figuren {

    private double a = 0.00;
    private double b = 0.00;
    private double c = 0.00;

    public Dreieck (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double fläche() {
        return (a * b) /2;
    }

    @Override
    public double umfang() {
        return a + b + c ;
    }

    @Override
    public String ausgabe() {
        return "Dreieck mit der Laenge "+a+", der Breite "+b+" und der Hoehe "+c+" : Flaeche => "+roundResult(fläche())+", Umfang=> "+roundResult(umfang());
    }
}
