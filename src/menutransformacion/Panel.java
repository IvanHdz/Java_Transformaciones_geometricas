package menutransformacion;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Panel extends JPanel {

    private Shape dibujo;
    AffineTransform tr = new AffineTransform();

    //Metodos para figuras
    public void dibLinea() {
        dibujo = new Line2D.Double(50, 50, 300, 100);
        repaint();
    }

    public void dibRectangulo() {
        dibujo = new Rectangle2D.Double(20, 50, 100, 50);
        repaint();
    }

    public void dibElipse() {
        dibujo = new Ellipse2D.Double(60, 70, 100, 80);
        repaint();
    }

    public void dibCuadratica() {
        dibujo = new QuadCurve2D.Double(20, 20, 100, 300, 300, 150);
        repaint();
    }

    public void salirAplicacion() {
        System.exit(0);
    }

    //Metodos para transformaciones
    public void mostrarTraslacion() {
        tr.setTransform(1, 0, 0, 1, 10, 10);
        //tr.setToTranslation(20,20);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarEscalado() {
        tr.setTransform(2, 0, 0, 2, 0, 0);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarCizallado() {
        tr.setTransform(1, 2, 2, 1, 0, 0);
        //   tr.setToShear(0.5,0.5);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarRotacion() {
        double cosB = Math.cos(10);
        double senB = Math.sin(10);
        tr.setTransform(cosB, senB, -senB, cosB, 0, 0);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarSimetriax() {
        tr.setTransform(1, 0, 0, -1, 0, 0);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarSimetriay() {
        tr.setTransform(-1, 0, 0, 1, 0, 0);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    public void mostrarSimetriaorig() {
        tr.setTransform(-1, 0, 0, -1, 0, 0);
        dibujo = tr.createTransformedShape(dibujo);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //Origen de las coordenadas
        g2.translate(getWidth() / 2, getHeight() / 2);
        Line2D linea1 = new Line2D.Double(-1 * getWidth() / 2, 0, getWidth(), 0);
        g2.draw(linea1);
        Line2D linea2 = new Line2D.Double(0, -getHeight() / 2, 0, getHeight());
        g2.draw(linea2);

        if (!(dibujo == null)) {
            g2.draw(dibujo);
        }
    }
}
