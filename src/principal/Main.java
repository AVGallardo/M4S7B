package principal;

import modelo.Cocina;
import modelo.Refrigerador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Cocina cocina = new Cocina("11000",12,6);
        Refrigerador refrigerador = new Refrigerador("150000",15,"3000",3);
        cocina.incluirGas();//acceso al metodo en el objeto cocina,que imnplementa a CocinaInterface
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 3){
            System.out.println("Que desea comprar?");
            System.out.println("1.- Cocina");
            System.out.println("2.- Refrigerador");
            System.out.println("3.- Salir");
            option = sc.nextInt();
        }

        switch (option){
            case 1:
                cocina = venderCocina(cocina);
                break;
            case 2:
                venderRefrigerador();
                break;

            case 3:
                System.out.println("Gracias por preferirnos, vuelva pronto");
                break;
        }
    }

    private static Cocina venderCocina(Cocina cocina){
        Scanner sc = new Scanner(System.in);
        String responseVenta = "";
        String responseGas = "";

        System.out.println("Valor: "+ cocina.getPrecio());
        System.out.println("Cuenta con: " + cocina.getQuemadores() + " quemadores");
        System.out.println("Articulos disponibles: " + cocina.getCantidadDisponible());

        while (responseVenta != "y" || responseVenta != "n"){
            System.out.println("Presione 'Y' para comprar o 'N' para cancelar ");
            responseVenta = sc.nextLine().toLowerCase();

            if (responseVenta.equals("y")){
                System.out.println("Desea incluir un gas? Y/N");
                cocina.setCantidadDisponible(cocina.getCantidadDisponible()-1);
                responseGas  = sc.nextLine().toLowerCase();
                System.out.println("Felicidades a comprado una cocina");

                if (responseGas.equals("y")){
                    System.out.println("Con gas incluido");
                    System.out.println("Total a pagar: " + cocina.getPrecio() + 5000);

                } else if (responseGas.equals("n")){
                    System.out.println("Total a pagar: " + cocina.getPrecio());
                }

                System.out.println("Disponibles: " + cocina.getCantidadDisponible());

            } else if (responseVenta.equals("n")){
                System.out.println("Operacion cancelada");
            }
        }

        return cocina;
    }

    private static void venderRefrigerador(){
        System.out.println();
    }
}