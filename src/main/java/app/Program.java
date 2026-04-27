package app;

import data.Persistencia;
import domain.VehiculoTipo;
import java.util.InvalidPropertiesFormatException;
import javax.swing.JOptionPane;
import views.ListarVehiculosView;
import views.AltaVehiculoView; // Importamos tu ventana nueva
import views.MainMenu;

public class Program {
    public static void main(String[] args){
        Persistencia.inicializar();
        ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
    }
}
