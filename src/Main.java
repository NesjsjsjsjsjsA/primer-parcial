import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<artículos_comunes> ListaArticulos = new ArrayList<artículos_comunes>();

    public static void main(String[] args) {

        System.out.println("hola java");

        menuOpciones();
    }

    private static void menuOpciones() {
        Scanner msg = new Scanner(System.in);
        menuElectroMArt();
        int opt1 = msg.nextInt();

        while (true) {

            if (opt1 == 0) {
                break;
            }

            try {
                switch (opt1) {
                    case 1:
                        creacion();
                        break;

                    case 2:
                        modificacion();
                        break;
                    case 3:
                        consultar();
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingresar un dato dentro de los validos");
            }
        }

    }

    private static void consultar()
    {
        System.out.println("Mostraremos los datos... ");
        for (int i = 0; i < ListaArticulos.size(); i++)
        {
            ListaArticulos.get(i);
        }
    }

    private static void modificacion()
    {
        Scanner msg = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String name = msg.nextLine();
        for (int i = 0; i < ListaArticulos.size(); i++)
        {
            if (ListaArticulos.get(i).getName().equals(name))
            {
                System.out.println("Cambio de descripcion: ");
                String descripcion = msg.nextLine();
                ListaArticulos.get(i).setDescripcion(descripcion);
            }
        }
    }

    private static void creacion() {

        Scanner msg = new Scanner(System.in);

        System.out.println("Bievenido al sistema de creación\n");
        System.out.println("Ingrese el nombre: ");
        String nombre = msg.nextLine();
        System.out.println("Ingrese una descripcion del producto: ");
        String descripcion = msg.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = msg.nextLine();
        System.out.println("Ingrese el precio: ");
        int precio = msg.nextInt();
        msg.nextLine();

        System.out.println("Deseas crear...\n"

                + "\t1. telefono\n"
                + "\t2. Laptop\n");

        int opt = msg.nextInt();

        switch (opt)
        {
            case 1:

                System.out.println("Ingrese la cantidad de lentes: ");
                int lCamara = msg.nextInt();
                System.out.println("Igngrese la cantidad de megapixeles: ");
                int megaPixeles = msg.nextInt();

                teléfono art = new teléfono(nombre, precio, modelo, descripcion, megaPixeles, lCamara);
                ListaArticulos.add(art);
                break;
            case 2:

                System.out.println("Ingrese color RGB: ");
                String RGBC = msg.nextLine();
                msg.nextLine();
                System.out.println("Ingrese los FPS GOD de la laptop: ");
                int FPS = msg.nextInt();

                Laptop art1 = new Laptop(nombre, precio, modelo, descripcion, RGBC, FPS);
                ListaArticulos.add(art1);
                break;
        }
    }

    private static void menuElectroMArt() {
        System.out.println("Bienvenido.... ingrese que desea hacer: \n"
                + "\t 1.Creacion de un articulo\n"
                + "\t 2.Modificacion de un articulo\n"
                + "\t 3.Consulta de un articulo\n"
                + "\t 0.Salir del programa\n"
        );
    }

}