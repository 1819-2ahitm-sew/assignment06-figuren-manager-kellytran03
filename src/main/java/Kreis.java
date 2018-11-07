class Kreis extends Figuren{

    private double r = 0.00;


    public  Kreis(double r) {
        this.r = r;
    }


    @Override
    public double fläche() {

        return r * Math.PI * 2;
    }

    @Override
    public double umfang() {

        return (2 * r) * Math.PI;
    }

    @Override
    public String ausgabe() {
        return "Kreis mit dem Radius "+r+": Flaeche => "+roundResult(fläche())+", Umfang => "+roundResult(umfang());
    }
}


