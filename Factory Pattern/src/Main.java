import Factory.FiguraFactory;
import Figuras.Figura;
import Figuras.TipoFIgura;
import Menus.Menu;;

public class Main {
    public static void main(String[] args) {
        try {
            TipoFIgura figuraE = Menu.menu();
            Figura figura = FiguraFactory.crearFigura(figuraE);
            System.out.println("El area de la figura es: " + figura.calcularArea());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}