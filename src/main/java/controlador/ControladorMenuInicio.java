package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MenuInicio;
import vista.MenuJuego;
import vista.MenuOrdenar;
import vista.MenuTablero;

public class ControladorMenuInicio implements ActionListener {

    MenuInicio objMenuInicio;

    public ControladorMenuInicio(MenuInicio objMenuInicio) {
        this.objMenuInicio = objMenuInicio;
        this.objMenuInicio.jButton1.addActionListener(this);
        this.objMenuInicio.jButton2.addActionListener(this);
        this.objMenuInicio.jButton3.addActionListener(this);
        this.objMenuInicio.jButton4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.objMenuInicio.jButton1) {
            MenuJuego objMenuJuego = new MenuJuego();
            objMenuJuego.setVisible(true);
            this.objMenuInicio.dispose();
        }

        if (e.getSource() == this.objMenuInicio.jButton2) {
           MenuTablero objMenuTablero = new MenuTablero();
           objMenuTablero.setVisible(true);
           this.objMenuInicio.dispose();
        }

        if (e.getSource() == this.objMenuInicio.jButton3) {
            MenuOrdenar menuOrdenar = new MenuOrdenar();
            menuOrdenar.setVisible(true);
            this.objMenuInicio.dispose();
        }

        if (e.getSource() == this.objMenuInicio.jButton4) {
            // Cuenta
        }

    }

}
