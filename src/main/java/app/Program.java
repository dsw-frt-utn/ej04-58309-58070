package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import javax.swing.JOptionPane;
import views.ListarVehiculosView;
import views.AltaVehiculoView; // Importamos tu ventana nueva

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();

        // Creamos un menú de opciones simple
        String[] opciones = {"Dar de Alta Vehículo", "Listar Vehículos", "Salir"};
        
        int eleccion = JOptionPane.showOptionDialog(null, 
                "¿Qué desea hacer?", 
                "Menú Principal - Logística", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

        if (eleccion == 0) {
            // Abre TU ventana de alta
            AltaVehiculoView alta = new AltaVehiculoView();
            alta.setVisible(true);
        } else if (eleccion == 1) {
            // Abre la ventana de lista de tu compañero
            ListarVehiculosView lista = new ListarVehiculosView();
            lista.setVisible(true);
        }
    }
}