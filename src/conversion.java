import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class conversion {

    private float cantidad1;
    private String divisa11;
    private String divisa22;

    private final Map<Integer, String> divisasMap = new HashMap<>() {{
        put(1, "USD");
        put(2, "EUR");
        put(3, "JPY");
        put(4, "GBP");
        put(5, "AUD");
        put(6, "CAD");
        put(7, "CHF");
        put(8, "CNY");
        put(9, "SEK");
        put(10, "NZD");
        put(11, "MXN");
        put(12, "SGD");
        put(13, "HKD");
        put(14, "NOK");
        put(15, "KRW");
    }};

    consulta exchange = new consulta();
    Scanner seleccion = new Scanner(System.in);
    List<String> historial = new ArrayList<>();
    DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private final String menuDivisas = """
            Selecciona una divisa:
                        1 - Dólar (USD)
                        2 - Euro (EUR)
                        3 - Yen Japonés (JPY)
                        4 - Libra Esterlina (GBP)
                        5 - Dólar Australiano (AUD)
                        6 - Dólar Canadiense (CAD)
                        7 - Franco Suizo (CHF)
                        8 - Renminbi / Yuan (CNY)
                        9 - Corona Sueca (SEK)
                        10 - Dólar Neozelandés (NZD)
                        11 - Peso Mexicano (MXN)
                        12 - Dólar de Singapur (SGD)
                        13 - Dólar de Hong Kong (HKD)
                        14 - Corona Noruega (NOK)
                        15 - Won Surcoreano (KRW)
            Elija una opción:
            """;

    public float getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(float cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public void setDivisa11(String divisa11) {
        this.divisa11 = divisa11;
    }

    public void setDivisa22(String divisa22) {
        this.divisa22 = divisa22;
    }

    private conversion datos(valoresConversion valoresConversion) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        String fechaHoraConFOrmato = fechaHoraActual.format(formatoDeFecha);
        String data = "["
                + fechaHoraConFOrmato +
                "] El resultado de convertir "
                + getCantidad1() + " "
                + valoresConversion.base_code()
                + " a " + valoresConversion.target_code()
                + " a una tasa de "
                + valoresConversion.conversion_rate()
                + " "
                + valoresConversion.target_code()
                + " es " + valoresConversion.conversion_result()
                + " " + valoresConversion.target_code();
        historial.add(data);
        System.out.println(data);
        return null;
    }

    public void opcion1() {
        System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion1 = exchange.tipoDeCambio("USD", "ARS", getCantidad1());
        datos(opcion1);
    }

    public void opcion2() {
        System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion2 = exchange.tipoDeCambio("ARS", "USD", getCantidad1());
        datos(opcion2);
    }

    public void opcion3() { System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion3 = exchange.tipoDeCambio("USD", "BRL", getCantidad1());
        datos(opcion3);
    }

    public void opcion4() { System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion4 = exchange.tipoDeCambio("BRL", "USD", getCantidad1());
        datos(opcion4);
    }

    public void opcion5() {
        System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion5 = exchange.tipoDeCambio("USD", "COP", getCantidad1());
        datos(opcion5);
    }

    public void opcion6(){
        System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();
        valoresConversion opcion6 = exchange.tipoDeCambio("COP", "USD", getCantidad1());
        datos(opcion6);
    }

    private String obtenerCodigoDivisa(int opcion) {
        if (divisasMap.containsKey(opcion)){
            return divisasMap.get(opcion);
        }else {
            System.out.println("Opcion no valida, seleccionado Dólar (USD) por defecto.");
            return "USD";
        }
    }

    public void setCambioPersonalizado(){
        System.out.println("Elija la divisa base");
        System.out.println(menuDivisas);
        int opcionBase = seleccion.nextInt();
        seleccion.nextLine();
        divisa11 = obtenerCodigoDivisa(opcionBase);
        //setDivisa11(obtenerCodigoDivisa(opcionBase));

        System.out.println("Elija la divisa destino");
        System.out.println(menuDivisas);
        int opcionDestino = seleccion.nextInt();
        seleccion.nextLine();
        divisa22 = obtenerCodigoDivisa(opcionDestino);

        System.out.println("Ingresa el valor que quieres convertir:");
        setCantidad1(seleccion.nextFloat());
        seleccion.nextLine();

        valoresConversion setCambioPersonalizado = exchange.tipoDeCambio(divisa11, divisa22, getCantidad1());
        datos(setCambioPersonalizado);
    }

    public void verHistorial() {
        if(historial.isEmpty()){
            System.out.println("No hay historial de conversiones.");
        } else {
            System.out.println("historial de conversiones:");
            for (String registro : historial) {
                System.out.println(registro);
            }

        }

    }

}