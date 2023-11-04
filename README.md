# Controle de Contatos com Java e Spring Boot

Este projeto consiste em uma aplicação Java com Spring Boot que permite o gerenciamento de Pessoas e seus Contatos por meio de uma API Rest. Cada Pessoa pode ter vários Contatos, e as operações CRUD (Criar, Ler, Atualizar, Deletar) são suportadas para ambas as entidades.

![Print_Swagger](/pessoa-controller.png)
![Print_Swagger](/contato-controller.png)

## Funcionalidades
### CRUD de Pessoas:
- Criar Pessoa
- Obter Pessoa por ID
- Obter Pessoa por ID para mala direta
- Listar todas as Pessoas
- Atualizar Pessoa por ID
- Deletar Pessoa por ID

### CRUD de Contatos:
- Adicionar um novo Contato a uma Pessoa
- Obter Contato por ID
- Listar todos os Contatos de uma Pessoa
- Atualizar Contato por ID
- Deletar Contato por ID

## Tecnologias Utilizadas
- Java com Spring Boot
- JPA/Hibernate
- Banco de Dados MySQL
- OpenAPI (Swagger)

## Como Executar

**Pré-requisitos:**
- Java JDK 8 ou posterior instalado.
- MySQL instalado e configurado corretamente.

1. **Clonando o Repositório:**

   Para clonar o repositório do projeto para o seu ambiente local, execute o seguinte comando:
   
   git clone https://github.com/seu-usuario/seu-repositorio.git

3. **Configurando o Banco de Dados:**

   - Certifique-se de que você tenha um banco de dados MySQL configurado. Você pode criar um novo banco de dados se necessário.
   - No arquivo `application.properties`, localizado no diretório de recursos do projeto, configure as propriedades do banco de dados, incluindo a URL, nome de usuário e senha de acordo com a sua configuração.


4. **Acessando a Documentação da API:**

   Após a conclusão da inicialização, a documentação da API estará disponível no Swagger. Abra um navegador da web e acesse o seguinte URL:
   
   http://localhost:8080/swagger-ui/index.html#/
   
   Na documentação do Swagger, você encontrará informações detalhadas sobre os endpoints disponíveis e como usá-los.
