class Ellipse extends Figuren {


    private double hauptachse = 0.00;
    private double nebenachse = 0.00;

    public Ellipse(double hauptachse, double nebenachse) {
        this.hauptachse = hauptachse;
        this.nebenachse = nebenachse;
    }

    @Override
    public double fläche() {
        return hauptachse * nebenachse * Math.PI;
    }

    @Override
    public double umfang() {
        return 2*Math.PI*Math.sqrt((Math.pow(nebenachse,2)+Math.pow(hauptachse,2))/2);
    }

    @Override
    public String ausgabe() {
        return "Ellipse mit Hauptachse "+hauptachse+" und Nebenachse "+nebenachse+": Flaeche => "+roundResult(fläche())+" , Umfang => "+roundResult(umfang());
    }
}






