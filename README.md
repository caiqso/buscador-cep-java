# Buscador de CEP em Java / CEP Finder in Java

---
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/) 
[![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)](#)
---

**Português (pt-BR)**

Este é um projeto de portfólio desenvolvido em Java que demonstra a integração com a API ViaCEP para buscar 
informações de endereços brasileiros a partir de um CEP. A aplicação inclui um menu interativo no console para realizar 
operações CRUD (Criar, Ler, Atualizar, Deletar) em um repositório local de endereços, com persistência em 
um arquivo JSON.

**English (us)**

This is a portfolio project developed in Java that demonstrates integration with the ViaCEP API to search for 
brazilians address information from a ZIP code. The application includes an interactive console menu to perform CRUD 
operations on a local address repository, with persistence in a JSON file.

---

## Funcionalidades / Features

**Português (pt-BR)**

- **Buscar CEP via API**: Consulte a API ViaCEP para obter dados de endereço (logradouro, bairro, cidade, 
- estado, etc.) a partir de um CEP válido.
- **Adicionar CEP ao repositório**: Busque um CEP e salve-o localmente.
- **Listar CEPs salvos**: Exiba todos os endereços armazenados.
- **Buscar CEP salvo**: Consulte um CEP específico no repositório local.
- **Atualizar CEP salvo**: Substitua um endereço salvo por um novo, buscando novamente na API.
- **Remover CEP salvo**: Delete um endereço do repositório.
- **Persistência de dados**: Os endereços são salvos e carregados automaticamente de um arquivo `enderecos.json`.

**English (us)**

- **Search ZIP Code via API**: Query the ViaCEP API to get address data (street, neighborhood, city, state, etc.) from a valid ZIP code.
- **Add ZIP Code to Repository**: Search for a ZIP code and save it locally.
- **List Saved ZIP Codes**: Display all stored addresses.
- **Search Saved ZIP Code**: Query a specific ZIP code in the local repository.
- **Update Saved ZIP Code**: Replace a saved address with a new one by searching the API again.
- **Remove Saved ZIP Code**: Delete an address from the repository.
- **Data Persistence**: Addresses are automatically saved and loaded from a `enderecos.json` file.

---

## Tecnologias Utilizadas / Technologies Used

**Português (pt-BR)**

- **Java 11+**: Linguagem principal.
- **HttpClient**: Para fazer requisições HTTP à API ViaCEP.
- **Gson**: Biblioteca para serialização e desserialização de JSON.
- **Scanner**: Para entrada de dados via console.
- **IntelliJ IDEA**: Para desenvolvimento do projeto. 


**English (us)**

- **Java 11+**: Main language.
- **HttpClient**: For making HTTP requests to the ViaCEP API.
- **Gson**: Library for JSON serialization and deserialization.
- **Scanner**: For console input.
- **IntelliJ IDEA**: For project development.


---

## Pré-requisitos / Prerequisites

**Português (pt-BR)**

- JDK 11 ou superior instalado.
- Dependências: Adicione o Gson ao seu projeto (eu adicionei via Project Structure no IntelliJ IDEA).

**English (us)**

- JDK 11 or higher installed.
- Dependencies: Add Gson to your project (I added it via Project Structure in IntelliJ IDEA).

---

## Como Executar / How to Run

**Português (pt-BR)**

+ Clone o repositório: git clone https://github.com/caiqso/buscador-cep-java.git
+ Navegue até o diretório do projeto e compile: ```javac -cp gson.jar *.java```
+ Execute a aplicação: ```java -cp .:gson.jar Main```
+ Siga o menu interativo no console para interagir com o programa.

  
**English (us)**

+ Clone the repository: git clone https://github.com/caiqso/buscador-cep-java.git
+ Navigate to the project directory and compile: ```javac -cp gson.jar *.java```
+ Run the application: ```java -cp .:gson.jar Main```
+ Follow the interactive menu in the console to interact with the program.

---

## Estrutura do Projeto / Project Structure

**Português (pt-BR)**

```bash
buscador-cep-java
 │   src/
 │   ├── Endereco.java # Record que representa um endereço com campos como CEP, logradouro, localidade, etc.
 │   ├── EnderecoService.java # Classe responsável por fazer requisições à API ViaCEP e validar CEPs.
 │   ├── EnderecoRepository.java # Classe que gerencia a lista de endereços, incluindo operações CRUD e persistência em JSON.
 │   ├── enderecos.json # Arquivo gerado automaticamente para armazenar os endereços salvos.
 │   └── Main.java # Classe principal com o menu interativo.
 │
 └── README.md # Este arquivo.
````

**English (us)**

```bash
buscador-cep-java
 │   src/
 │   ├── Endereco.java #  Record representing an address with fields like ZIP code, street, city, etc.
 │   ├── EnderecoService.java # Class responsible for making requests to the ViaCEP API and validating ZIP codes.
 │   ├── EnderecoRepository.java #  Class that manages the list of addresses, including CRUD operations and JSON persistence.
 │   ├── enderecos.json #  Automatically generated file to store saved addresses.
 │   └── Main.java # Main class with the interactive menu.
 │
 └── README.md # This file.
````

--- 

## Exemplo de Uso / Usage Example

**Português (pt-BR)**

Ao executar, você verá um menu como:

```bash 
===== MENU viaCEP =====
1 - Buscar e adicionar CEP
2 - Listar todos
3 - Buscar CEP salvo
4 - Atualizar CEP salvo
5 - Deletar CEP salvo
0 - Sair
Opção: 1
CEP: 01001000
Endereco[cep=01001000, logradouro=Praça da Sé, localidade=São Paulo, bairro=Sé, complemento=s/n, uf=SP]
CEP adicionado com sucesso!
```

**English (us)**

When running, you will see a menu like:

```bash 
===== MENU viaCEP =====
1 - Buscar e adicionar CEP
2 - Listar todos
3 - Buscar CEP salvo
4 - Atualizar CEP salvo
5 - Deletar CEP salvo
0 - Sair
Opção: 1
CEP: 01001000
Endereco[cep=01001000, logradouro=Praça da Sé, localidade=São Paulo, bairro=Sé, complemento=s/n, uf=SP]
CEP adicionado com sucesso!
```

---

## Contribuição / Contribution

**Português (pt-BR)**

Este é um projeto de portfólio pessoal. Sinta-se à vontade para sugerir melhorias via issues ou pull requests.

This is a personal portfolio project. Feel free to suggest improvements via issues or pull requests.


**English (us)**

Licença / License
Este projeto é de código aberto e está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

This project is open-source and under the MIT license. See the LICENSE file for more details.

---

## Referências / References

+ **[API ViaCEP](https://viacep.com.br/)** -> Documentação oficial para consultas de CEP.
+ **[Biblioteca Gson](https://github.com/google/gson)** -> Usada para manipulação de JSON. 
+ **[Documentação Gson](https://github.com/google/gson)** -> Usada para melhor entendimento da maneira de uso.
+ Tutoriais/Aulas Java para HttpClient e operações CRUD. **[Oracle Java Doc](https://docs.oracle.com/en/java/)**,
 **[Alura](https://cursos.alura.com.br/)**

---

## Autor (Author)

Desenvolvido por Caíque Soares Silva.

Estudante de **Análise e Desenvolvimento de Sistemas**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/caiquesoaress/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:caiquesoaressilva13@gmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/caiqso)

---

_Projeto criado para fins educacionais e portfólio. Divirta-se buscando!_ 📍

_Project created for educational purposes and portfolio. Enjoy searching!_ 📍