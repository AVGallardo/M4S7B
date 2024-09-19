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
                venderCocina(cocina);
                break;
            case 2:
                venderRefrigerador();
                break;

            case 3:
                System.out.println("Gracias por preferirnos, vuelva pronto");
                break;
        }


    }
    private static void venderCocina(Cocina cocina){
        Scanner sc = new Scanner(System.in);
        String response = "";

        System.out.println("Valor: "+ cocina.getPrecio());
        System.out.println("Cuenta con: " + cocina.getQuemadores() + " quemadores");
        System.out.println("Articulos disponibles: " + cocina.getCantidadDisponible());
        while (response != "y" || response != "n"){
            System.out.println("Presione 'Y' para comprar o 'N' para cancelar ");
            response = sc.nextLine().toLowerCase();
            if (response.equals("y")){
                System.out.println("Desea incluir un gas?");
            }
        }

    }

    private static void venderRefrigerador(){
        System.out.println();
    }
}