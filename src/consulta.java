import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consulta {
    public valoresConversion tipoDeCambio(String divisa1, String divisa2, float cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/687f07970c2c08c7aaf51f8f/pair/"
                + divisa1 + "/" + divisa2 + "/" + cantidad);
        //System.out.println(direccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), valoresConversion.class);

        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número válido.");
            throw new RuntimeException("No se puede realizar la acción solicitada.");
        }
    }
}
