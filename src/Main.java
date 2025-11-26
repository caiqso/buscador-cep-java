import java.util.Scanner;

public class Main {
    private static final String WELCOME_MESSAGE = "Bem-vindo a API Buscador de CEP Java";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
        Scanner leitor = new Scanner(System.in);
        EnderecoService buscadorEndereco = new EnderecoService();
        EnderecoRepository repositorio = new EnderecoRepository();
        String opcao = "";

        while (!opcao.equals("0")) {

            System.out.println("\n===== MENU viaCEP =====");
            System.out.println("1 - Buscar e adicionar CEP");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Buscar CEP salvo");
            System.out.println("4 - Atualizar CEP salvo");
            System.out.println("5 - Deletar CEP salvo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = leitor.nextLine();

            switch (opcao) {

                case "1" -> {
                    System.out.print("CEP: ");
                    String cep = leitor.nextLine();

                    try {
                        Endereco e = buscadorEndereco.buscarPorCep(cep);
                        repositorio.adicionar(e);
                        System.out.println(e);
                        System.out.println("CEP adicionado com sucesso!");
                    } catch (Exception e) {
                        throw new RuntimeException("Erro: " + e.getMessage());
                    }
                }

                case "2" -> {
                    System.out.println(repositorio.listar());
                }

                case "3" -> {
                    System.out.print("CEP: ");
                    String cep = leitor.nextLine();

                    Endereco e = repositorio.buscarPorCep(cep);

                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("Nenhum CEP encontrado.");
                    }
                }

                case "4" -> {
                    System.out.print("CEP para atualizar: ");
                    String cep = leitor.nextLine();

                    try {
                        Endereco novo = buscadorEndereco.buscarPorCep(cep);
                        if (repositorio.atualizar(cep, novo)) {
                            System.out.println("CEP Atualizado!");
                        } else {
                            System.out.println("CEP não encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }

                case "5" -> {
                    System.out.print("CEP para remover: ");
                    String cep = leitor.nextLine();

                    if (repositorio.remover(cep)) {
                        System.out.println("CEP Removido!");
                    } else {
                        System.out.println("CEP não encontrado.");
                    }
                }

                case "0" -> System.out.println("Encerrando programa...");

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
