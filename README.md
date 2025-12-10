# Treinando Listas em Java

Este repositório contém dois projetos de console em Java, desenvolvidos para praticar a manipulação de listas e o uso de estruturas de controle de fluxo. Os projetos simulam cenários práticos para o gerenciamento de dados.

## Projetos Incluídos

O repositório é composto por dois módulos principais, cada um focado em um tipo de lista e lógica de negócios diferente:

1.  **ListaCompra**: Simula um sistema de controle de gastos. O usuário insere o limite de crédito e, em seguida, adiciona itens (descrição e valor) à lista de compras. O sistema verifica se o valor da compra excede o limite disponível.
2.  **ListaVeiculos**: Simula um sistema de cadastro de veículos. O usuário pode adicionar veículos à lista, informando placa (com validação do padrão Mercosul), marca, modelo e ano de lançamento. O sistema permite a exibição dos veículos cadastrados.

## Tecnologias Utilizadas

*   **Linguagem**: Java
*   **Gerenciador de Dependências**: Maven (estrutura de projeto padrão)
*   **Estruturas de Dados**: `ArrayList` (implícito ou explícito) para gerenciamento das listas.
*   **Entrada de Dados**: Classe `Scanner` para interação via console.

## Como Executar os Projetos

Ambos os projetos são aplicações de console baseadas em Maven. Para executá-los, você precisará ter o **Java Development Kit (JDK)** e o **Maven** instalados em sua máquina.

### Pré-requisitos

*   [JDK 17 ou superior](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
*   [Apache Maven](https://maven.apache.org/download.cgi)

### Passos para Execução

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/GilvanPedro/TreinandoListas.git
    cd TreinandoListas
    ```

2.  **Execute o projeto `ListaCompra`:**
    ```bash
    cd ListaCompra
    mvn clean install
    mvn exec:java -Dexec.mainClass="br.com.ListaCompra.Main"
    ```

3.  **Execute o projeto `ListaVeiculos`:**
    ```bash
    cd ../ListaVeiculos
    mvn clean install
    mvn exec:java -Dexec.mainClass="br.com.ListaVeiculos.Main"
    ```

## Estrutura do Código

Cada projeto segue uma estrutura simples de MVC (Model-View-Controller) adaptada para aplicações de console:

*   **`Main.java`**: Contém o ponto de entrada da aplicação e a lógica de interação com o usuário (simulando a **View**).
*   **`Controller`**: Contém a lógica de negócios para manipulação da lista (ex: `ListaController.java` e `VeiculoController.java`).
*   **`Entity`**: Contém as classes que representam os objetos a serem armazenados na lista (ex: `Lista.java` e `Veiculo.java`, simulando o **Model**).

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
