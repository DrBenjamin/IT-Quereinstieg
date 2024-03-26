package org.benbox;
/* Hallo Welt Programm */
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class HalloWelt
{

    public static class Kreis
    {
        private double radius;
        private double x;
        private double y;

        public Kreis()
        {
            radius = 1;
            x = 0;
            y = 0;
        }

        public Kreis(double r)
        {
            this();
            if (r >= 0)
                radius = r;
        }

        public double berechneFlaeche()
        {
            return Math.PI * radius * radius;
        }
        
        public void verschiebe(int dx, int dy)
        {
            x = x + dx;
            y =y + dy;
        }
    }

    public static void main(String[] args)
    {
        Kreis k1 = new Kreis();
        Kreis k2 = new Kreis();
        k1.radius = -12;
        System.out.println("Kreis 1, Radius: " + k1.radius + " x: " + k1.x + " y: " + k1.y);
        System.out.println("Kreis 2, Radius: " + k2.radius + " x: " + k2.x + " y: " + k2.y);
        double flaeche = k1.berechneFlaeche();
        System.out.println("Fläche von k1: " + flaeche);
        System.out.println("Fläche von k2: " + k2.berechneFlaeche());

        Zeichnen(args);
    }
        
    public static void Zeichnen(String[] args)
    {
    StdDraw.setXscale(0, 100);
    StdDraw.setYscale(0, 100);
    StdDraw.line(0, 0, 50, 50);
    StdDraw.setPenColor(Color.BLUE);
    StdDraw.filledCircle(50, 50, 5);
    StdDraw.setPenRadius(0.01);
    StdDraw.line(50, 50, 100, 100);
    StdDraw.setPenColor(Color.GREEN);
    StdDraw.text(10,80,"Guten Tag!");

    // Speichern der Dateien als jpg
    }
        
}

