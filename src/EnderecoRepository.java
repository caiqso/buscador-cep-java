import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoRepository {
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    private static final String ARQUIVO = "enderecos.json";

    private List<Endereco> enderecos = new ArrayList<>();

    public EnderecoRepository() {
        carregar();
    }

    // create
    public void adicionar(Endereco e) {
        enderecos.add(e);
        salvar();
    }

    // read
    public List<Endereco> listar() {
        return enderecos;
    }

    public Endereco buscarPorCep(String cep) {
        return enderecos.stream()
                .filter(e -> e.cep().replace("-", "").equals(cep))
                .findFirst()
                .orElse(null);
    }

    // update
    public boolean atualizar(String cep, Endereco novo) {
        Endereco atual =  buscarPorCep(cep);
        if (atual == null) {
            return false;
        }

        enderecos.remove(atual);
        enderecos.add(novo);
        salvar();
        return true;
    }

    // delete
    public boolean remover(String cep) {
        Endereco endereco =  buscarPorCep(cep);
        if (endereco == null) {
            return false;
        }

        enderecos.remove(endereco);
        salvar();
        return true;
    }

    // save archive
    private void salvar(){
        try (FileWriter escrever = new FileWriter(ARQUIVO)) {
            escrever.write(gson.toJson(enderecos));
        } catch (IOException e) {
            throw new RuntimeException("Não consegui gravar o arquivo.");
        }
    }

    // load archive
    public void carregar() {
        try (FileReader leitor = new FileReader(ARQUIVO)) {
            Endereco[] listaDeEnderecos = gson.fromJson(leitor, Endereco[].class);
            if (listaDeEnderecos != null)
                for (Endereco endereco : listaDeEnderecos) {
                    enderecos.add(endereco);
                }

        } catch (Exception ignored) {}
    }
}

