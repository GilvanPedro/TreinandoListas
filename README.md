# Treinando Listas em Java

Este repositório é uma coleção de projetos em Java, meticulosamente desenvolvidos com o propósito de aprimorar a proficiência na **manipulação de listas** e na aplicação de **estruturas de controle de fluxo**. Os projetos contidos aqui simulam cenários práticos de gerenciamento de dados, servindo como um recurso didático e prático para desenvolvedores que buscam consolidar seus conhecimentos em Java.

## Projetos Incluídos

O repositório é estruturado em três módulos principais, cada um dedicado a um caso de uso distinto, focando em diferentes aspectos da lógica de negócios e manipulação de coleções.

| Projeto | Descrição | Funcionalidade Principal | Interface | Estrutura de Dados |
| :--- | :--- | :--- | :--- | :--- |
| **AlunosNotas** | Sistema de gerenciamento de alunos e notas. | Permite o cadastro, listagem e exclusão de alunos, além de calcular a média de 4 notas. | **Gráfica (GUI - Swing)** | `ArrayList` de objetos `Aluno`. |
| **ListaCompra** | Simulação de um sistema de controle de gastos e limite de crédito. | Permite ao usuário inserir um limite de crédito inicial e adicionar itens de compra (descrição e valor), com validação em tempo real para verificar se o valor total excede o limite disponível. | Console | `ArrayList` de objetos de compra. |
| **ListaVeiculos** | Simulação de um sistema de cadastro e gerenciamento de veículos. | Permite o cadastro de veículos, exigindo a inserção de placa (com validação do padrão Mercosul), marca, modelo e ano de lançamento. Oferece a funcionalidade de exibição de todos os veículos cadastrados. | Console | `ArrayList` de objetos de veículo. |

## Tecnologias e Arquitetura

O desenvolvimento dos projetos utiliza o ecossistema padrão do Java, garantindo portabilidade e facilidade de execução.

*   **Linguagem de Programação**: Java.
*   **Gerenciador de Dependências**: **Apache Maven**, utilizado para a gestão da estrutura do projeto e das dependências.
*   **Estruturas de Dados**: O cerne dos projetos reside na utilização da classe `ArrayList` para o gerenciamento dinâmico das listas de dados.
*   **Interação com o Usuário**: A entrada de dados e a interação são gerenciadas pela classe `Scanner` (para projetos de console) ou por componentes **Swing** (para o projeto GUI).

A arquitetura de cada projeto adota uma estrutura simplificada, inspirada no padrão **Model-View-Controller (MVC)**:

*   **View**: Contém a lógica de interação e apresentação de dados ao usuário (seja via console ou GUI).
*   **Controller**: Contém a **lógica de negócios** e as regras de manipulação das listas.
*   **Model/Entity**: Representado pelas classes que definem os objetos a serem armazenados nas listas.

## Como Executar os Projetos

Para compilar e executar as aplicações, é necessário ter o ambiente de desenvolvimento Java configurado.

### Pré-requisitos

É imprescindível que as seguintes ferramentas estejam instaladas em sua máquina:

1.  **Java Development Kit (JDK)**: Versão 17 ou superior.
2.  **Apache Maven**: Ferramenta de automação de *build* e gerenciamento de projetos.

### Passos para Execução

Siga os passos abaixo para clonar o repositório e executar cada módulo:

1.  **Clone o Repositório:**
    
    ```bash
    git clone https://github.com/GilvanPedro/TreinandoListas.git
    cd TreinandoListas
    ```
    
2.  **Execução do Módulo `AlunosNotas` (GUI):**
    
    ```bash
    cd AlunosNotas
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal (inicia a interface gráfica)
    mvn exec:java -Dexec.mainClass="br.com.AlunosNotas.Main"
    ```
    
3.  **Execução do Módulo `ListaCompra` (Console):**
    
    ```bash
    cd ../ListaCompra
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal
    mvn exec:java -Dexec.mainClass="br.com.ListaCompra.Main"
    ```
    
4.  **Execução do Módulo `ListaVeiculos` (Console):**
    
    ```bash
    cd ../ListaVeiculos
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal
    mvn exec:java -Dexec.mainClass="br.com.ListaVeiculos.Main"
    ```

## Licença

Este projeto é distribuído sob a **Licença MIT**. Para obter detalhes completos sobre os termos de uso e permissões, consulte o arquivo `LICENSE` na raiz do repositório.

***
