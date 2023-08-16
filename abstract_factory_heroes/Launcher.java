package abstract_factory_heroes;

import java.util.Scanner;

import abstract_factory_heroes.model.FlyingHero;
import abstract_factory_heroes.model.RichHero;
import abstract_factory_heroes.model.IFabrica;
import abstract_factory_heroes.model.dc.DC;
import abstract_factory_heroes.model.marvel.Marvel;

public class Launcher {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IFabrica iFabrica = null;
        String franquicia;
        String heroe;

        System.out.println("Bienvenido a la solicitud de personajes; de que franquicia de super héroes desea solicitar (Marvel o DC): ");
        franquicia = sc.nextLine().toLowerCase();
        if (franquicia.equals("dc")){
            iFabrica = new DC();
        } else if (franquicia.equals("marvel")){
            iFabrica = new Marvel();
        } else {
            System.out.println("No se ha ingresado una franquicia conocida.");
            System.exit(0);
        }

        System.out.println("Ingrese si desea crear un súper héroe de tipo volador o millonario: ");
        heroe = sc.nextLine().toLowerCase();
        if (heroe.equals("volador")){
            FlyingHero flyingHero = iFabrica.getFlyingHero();
            flyingHero.volar();
        } else if (heroe.equals("millonario")){
            RichHero richHero = iFabrica.getRichHero();
            richHero.chicanear();
        } else {
            System.out.println("No se ha ingresado un tipo de héroe válido.");
            System.exit(0);
        }

        sc.close();

    }

}
