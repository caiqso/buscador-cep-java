import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EnderecoService {

    private static final Gson gson = new Gson();

    public Endereco buscarPorCep(String cep) throws Exception {

        if (cep.length() != 8 || !cep.matches("\\d+")) {
            throw new IllegalArgumentException("CEP inválido!");
        }

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter endereço a partir deste CEP.");
        }

    }

}
