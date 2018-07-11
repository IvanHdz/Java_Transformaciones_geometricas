package menutransformacion;

import java.awt.Component;
import javax.swing.*;

public class Ventana extends JFrame {

    private JMenuBar menu;
    private JMenu figuras;
    private JMenu transformacion;
    private JMenuItem linea;
    private JMenuItem rectangulo;
    private JMenuItem elipse;
    private JMenuItem curvaCuadratica;
    private JMenuItem salir;
    private JMenuItem traslacion;
    private JMenuItem escalado;
    private JMenuItem cizallado;
    private JMenuItem rotacion;
    private JMenuItem simetriax;
    private JMenuItem simetriay;
    private JMenuItem simetriaorig;
    Panel p;

    // private JFileChooser selec;
    //private BufferedReader entrada;
    public Ventana() {
        crearMenu();
        setTitle("Transformación de Figuras");
        setSize(600, 600);
        setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        p = new Panel();
        Component add = add(p);
        //Listener para figuras

        linea.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.dibLinea();
            }
        });

        rectangulo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.dibRectangulo();
            }
        });

        elipse.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.dibElipse();
            }
        });

        curvaCuadratica.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.dibCuadratica();
            }
        });

        salir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.salirAplicacion();
            }
        });

        //Listener para transformaciones
        traslacion.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarTraslacion();
            }
        });
        escalado.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarEscalado();
            }
        });

        cizallado.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarCizallado();
            }
        });
        rotacion.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarRotacion();
            }
        });
        simetriax.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarSimetriax();
            }
        });
        simetriay.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarSimetriay();
            }
        });
        simetriaorig.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p.mostrarSimetriaorig();
            }
        });
    }

    public void crearMenu() {
        menu = new JMenuBar();
        figuras = new JMenu("Figura");
        transformacion = new JMenu("Transformación");
        linea = new JMenuItem("Linea");
        rectangulo = new JMenuItem("Rectangulo");
        elipse = new JMenuItem("Elipse");
        curvaCuadratica = new JMenuItem("Curva Cuadratica");
        salir = new JMenuItem("Salir");
        traslacion = new JMenuItem("Traslacion");
        escalado = new JMenuItem("Escalado");
        cizallado = new JMenuItem("Cizallado");
        rotacion = new JMenuItem("Rotación");
        simetriax = new JMenuItem("Simetria X");
        simetriay = new JMenuItem("Simetria Y");
        simetriaorig = new JMenuItem("Simetria Origen");

        setJMenuBar(menu);
        menu.add(figuras);
        menu.add(transformacion);
        figuras.add(linea);
        figuras.add(rectangulo);
        figuras.add(elipse);
        figuras.add(curvaCuadratica);
        figuras.add(salir);

        transformacion.add(traslacion);
        transformacion.add(escalado);
        transformacion.add(cizallado);
        transformacion.add(rotacion);
        transformacion.add(simetriax);
        transformacion.add(simetriay);
        transformacion.add(simetriaorig);
    }
}
