package app;

import data.Persistencia;
import domain.VehiculoTipo;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.MainMenu;

public class Program {
    public static void main(String[] args){
        Persistencia.inicializar();
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
    }

    // public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
    //     Persistencia.inicializar();
    //     ListarVehiculosView view = new ListarVehiculosView();
    //     view.setVisible(true);
    // }
}
