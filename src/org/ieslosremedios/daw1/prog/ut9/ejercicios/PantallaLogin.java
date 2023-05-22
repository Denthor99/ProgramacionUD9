package org.ieslosremedios.daw1.prog.ut9.ejercicios;
import java.awt.*;
public class PantallaLogin {
    public static void main(String[] args) {
        /**
         * Enunciado: Queremos recrear en java una ventana de login. Esta ventana debe constar de:
         * - Nombre
         * - Password
         * - Botón Acceder
         * - Botón Cancelar
         * */

        // Creamos el Frame
        Frame logineo=new Frame("Creedenciales de Acceso");
        // Crearemos un fondo, para que no queda tan soso
        logineo.setBackground(Color.decode("#A9CCE3"));
        // Hacemos que sea visible
        logineo.setLayout(null);
        logineo.setVisible(true);

        // Indicamos el tamaño
        logineo.setSize(350,550);

        // Creamos un "textfield"
        Label lab=new Label("Nombre:");
        lab.setBounds(20,80,80,30);
        logineo.add(lab);
        Button aces=new Button("Acceder");
        aces.setBounds(100,100,80,30);
        logineo.add(aces);
        TextField nombre=new TextField("Nombre:");
        nombre.setBounds(20,100,80,30);
        nombre.setVisible(true);
        logineo.add(nombre);

    }
}
