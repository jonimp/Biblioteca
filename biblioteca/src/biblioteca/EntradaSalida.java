package biblioteca;

import java.util.Scanner;


public class EntradaSalida {
    
    public static char leerChar(String texto){
        System.out.println(texto);
        Scanner teclado = new Scanner(System.in);
        return teclado.next().charAt(0);
    }
    
    public static String leerString(String s){
        System.out.print(s);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
    public static void mostrarString(String s){
        System.out.println(s);
    }
    
    static int leerInt(String s) {
        System.out.print(s);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    
    
    public static String leerTipo(){
        System.out.println("""
                                Ingrese el tipo  del vehiculo
                                [1] Motorhome
                                [2] Casa rodante
                                [3] Caravana
                                [4] Trailer
                           """);
        Scanner teclado = new Scanner(System.in);
        
        switch(teclado.next().charAt(0)){
            case '1':
                return "Motorhome";
            case '2':
                return "Casa rodante";
            case '3':
                return "Caravana";
            case '4':
                return "Trailer";
            default:
                System.out.println("Opcion incorrecta");
                return "";
        }
    }

    
}
