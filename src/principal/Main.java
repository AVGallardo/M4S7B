package principal;

import modelo.Cocina;
import modelo.Refrigerador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cocina cocina = new Cocina("110000",12,6);
        Refrigerador refrigerador = new Refrigerador("150000",15,"3000",3);
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 3){
            System.out.println("Que desea comprar?");
            System.out.println("1.- Cocina");
            System.out.println("2.- Refrigerador");
            System.out.println("3.- Salir");
            option = sc.nextInt();

            switch (option){
                case 1:
                    cocina = venderCocina(cocina);
                    break;
                case 2:
                    refrigerador = venderRefrigerador(refrigerador);
                    break;
                case 3:
                    System.out.println("Gracias por preferirnos, vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private static Cocina venderCocina(Cocina cocina){
        Scanner sc = new Scanner(System.in);
        String responseVenta = "";
        String responseGas = "";

        System.out.println("Valor: "+ cocina.getPrecio());
        System.out.println("Cuenta con: " + cocina.getQuemadores() + " quemadores");
        System.out.println("Articulos disponibles: " + cocina.getCantidadDisponible());

        while (!responseVenta.equals("y") && !responseVenta.equals("n") &&
                !responseVenta.equals("Y") && !responseVenta.equals("N")){

            System.out.println("Presione 'Y' para comprar o 'N' para cancelar ");
            responseVenta = sc.nextLine().toLowerCase();

            if (responseVenta.equals("y")){
                System.out.println("Desea incluir un gas? Y/N");
                cocina.setCantidadDisponible(cocina.getCantidadDisponible()-1);
                responseGas  = sc.nextLine().toLowerCase();
                System.out.println("Felicidades a comprado una cocina");

                if (responseGas.equals("y")){
                    cocina.incluirGas();
                    System.out.println("Total a pagar: " + (Integer.parseInt(cocina.getPrecio()) + 5000));

                } else if (responseGas.equals("n")){
                    System.out.println("Total a pagar: " + cocina.getPrecio());
                }

                System.out.println("Disponibles Actuales: " + cocina.getCantidadDisponible());

            } else if (responseVenta.equals("n")){
                System.out.println("Operacion cancelada");
            }
        }

        return cocina;
    }

    private static Refrigerador venderRefrigerador(Refrigerador refrigerador){
        Scanner sc = new Scanner(System.in);
        String responseVenta = "";

        System.out.println("Cuenta con: " + refrigerador.getPuertas() + " puertas");
        System.out.println("Tiene un gasto de: " + refrigerador.getGastoElectrico() + " KWH");
        System.out.println("Articulos disponibles: " + refrigerador.getCantidadDisponible());
        System.out.println("Valor: "+ refrigerador.getPrecio());
        System.out.println("Presione 'Y' para comprar o 'N' para cancelar ");
        responseVenta = sc.nextLine().toLowerCase();
        if (responseVenta.equals("y")){
            refrigerador.setCantidadDisponible(refrigerador.getCantidadDisponible()-1);
            System.out.println("Total: "+ refrigerador.getPrecio());
            System.out.println("Felicidades a comprado un refrigerador");

        } else if (responseVenta.equals("n")){
            System.out.println("Operacion cancelada");
        }
        System.out.println("Disponibles Actuales: " + refrigerador.getCantidadDisponible());

        return refrigerador;
    }
}