import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        try {
            int opcion = 0;
            conversion conversion = new conversion();

            String menu = ("""
                    ****************************************************
                    Sea bienvenido/a al conversor de monedas
                    
                    1 - Dólar =>> Peso argentino
                    2 - Peso argentino =>> Dólar
                    3 - Dólar =>> Real brasileño
                    4 - Real brasileño =>> Dólar
                    5 - Dólar =>> Peso colombiano
                    6 - Peso colombiano =>> Dólar
                    7 - Personalizado
                    8 - Historial
                    9 - Salir
                    
                    Elija una opcion valida:
                    ****************************************************
                    """);

            Scanner lectura = new Scanner(System.in);
            while (opcion != 9) {
                System.out.println(menu);
                opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        conversion.opcion1();
                        break;
                    case 2:
                        conversion.opcion2();
                        break;
                    case 3:
                        conversion.opcion3();
                        break;
                    case 4:
                        conversion.opcion4();
                        break;
                    case 5:
                        conversion.opcion5();
                        break;
                    case 6:
                        conversion.opcion6();
                        break;
                    case 7:
                        conversion.setCambioPersonalizado();
                        break;
                    case 8:
                        conversion.verHistorial();
                        break;
                    case 9:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida elije otra opcion");
                }
            }
            lectura.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado, porfavor reinicie el conversor.");
        }
    }
}
