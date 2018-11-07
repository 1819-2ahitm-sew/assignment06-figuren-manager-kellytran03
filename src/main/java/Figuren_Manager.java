public class Figuren_Manager {

    public static void main(String[] args) {


        Figur[] figuren = new Figur[5];

        Rechteck rechteck = new Rechteck(6, 4);
        Quadrat quadrat = new Quadrat(5);
        Dreieck dreieck = new Dreieck(6, 7, 8);
        Kreis kreis = new Kreis(8);
        Ellipse ellipse = new Ellipse(12, 5);

        figuren[0] = rechteck;
        figuren[1] = quadrat;
        figuren[2] = dreieck;
        figuren[3] = kreis;
        figuren[4] = ellipse;


        System.out.println("Datenanzeige: ");
        System.out.println("-------------");
        System.out.println();

        for (int i = 0; i < figuren.length; i++) {
            if (figuren[i] instanceof Rechteck) {
                Rechteck r = (Rechteck) figuren[i];
                System.out.println(r.ausgabe());

            } else if (figuren[i] instanceof Quadrat) {
                Quadrat q = (Quadrat) figuren[i];
                System.out.println(q.ausgabe());

            } else if (figuren[i] instanceof Dreieck) {
                Dreieck d = (Dreieck) figuren[i];
                System.out.println(d.ausgabe());

            } else if (figuren[i] instanceof Kreis) {
                Kreis k = (Kreis) figuren[i];
                System.out.println(k.ausgabe());

            } else if (figuren[i] instanceof Ellipse) {
                Ellipse e = (Ellipse) figuren[i];
                System.out.println(e.ausgabe());


            }
        }
    }
}
