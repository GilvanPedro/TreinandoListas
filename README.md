# 🚀 Treinando Listas em Java

Este repositório é um conjunto de projetos didáticos em Java, cuidadosamente elaborados para o aprimoramento da proficiência na **manipulação de estruturas de dados do tipo lista** e na aplicação de **estruturas de controle de fluxo**. Cada módulo simula um cenário prático de gerenciamento de dados, oferecendo um ambiente de aprendizado prático e eficaz para desenvolvedores que buscam consolidar seus conhecimentos em Java.

## 🛠️ Tecnologias Utilizadas

| Categoria | Tecnologia | Versão Mínima |
| :--- | :--- | :--- |
| **Linguagem** | Java | 17+ |
| **Build Tool** | Apache Maven | 3.x |
| **Estrutura de Dados** | `java.util.ArrayList` | N/A |
| **Interface Gráfica** | Swing (Nos módulos `AlunosNotas` e `OrganizarBiblioteca`) | N/A |

## 📦 Módulos do Projeto

O repositório é composto por quatro módulos independentes, cada um explorando diferentes aspectos da manipulação de listas e lógica de negócios.

| Módulo | Descrição | Funcionalidades Chave | Interface |
| :--- | :--- | :--- | :--- |
| **AlunosNotas** | Sistema de gerenciamento de notas e cadastro de alunos. | Cadastro, listagem e exclusão de alunos; Cálculo da média de 4 notas. | **Gráfica (GUI)** |
| **OrganizarBiblioteca** | Sistema de gerenciamento de livros para uma biblioteca. | Cadastro de livros (Título, Autor, Gênero); Listagem e ordenação dos livros cadastrados. | **Gráfica (GUI)** |
| **ListaCompra** | Simulação de um sistema de controle de gastos. | Inserção de limite de crédito; Adição de itens de compra com validação de limite. | Console |
| **ListaVeiculos** | Sistema de cadastro e gerenciamento de veículos. | Cadastro de veículos com validação de placa (padrão Mercosul); Listagem dos veículos cadastrados. | Console |

### 📐 Arquitetura

Todos os projetos seguem uma estrutura simplificada, inspirada no padrão **Model-View-Controller (MVC)**, facilitando a separação de responsabilidades:

*   **Model/Entity**: Classes que representam os objetos de dados (ex: `Aluno`, `Biblioteca`, `Veiculo`).
*   **Controller**: Contém a **lógica de negócios** e as regras de manipulação das listas.
*   **View**: Responsável pela interação e apresentação de dados ao usuário (Console ou GUI).

## ⚙️ Como Executar os Projetos

Para compilar e executar as aplicações, é necessário ter o ambiente de desenvolvimento Java configurado.

### Pré-requisitos

Certifique-se de que as seguintes ferramentas estejam instaladas em sua máquina:

1.  **Java Development Kit (JDK)**: Versão 17 ou superior.
2.  **Apache Maven**: Ferramenta de automação de *build* e gerenciamento de projetos.

### Passos Detalhados para Execução

1.  **Clone o Repositório:**
    
    Inicie clonando o repositório para sua máquina local:
    
    ```bash
    git clone https://github.com/GilvanPedro/TreinandoListas.git
    cd TreinandoListas
    ```
    
2.  **Execução do Módulo `AlunosNotas` (GUI):**
    
    Este módulo inicia uma interface gráfica (GUI) para interação:
    
    ```bash
    cd AlunosNotas
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal (inicia a interface gráfica)
    mvn exec:java -Dexec.mainClass="br.com.AlunosNotas.Main"
    ```
    
3.  **Execução do Módulo `OrganizarBiblioteca` (GUI):**
    
    Este módulo também inicia uma interface gráfica (GUI) para interação:
    
    ```bash
    cd ../OrganizarBiblioteca
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal (inicia a interface gráfica)
    mvn exec:java -Dexec.mainClass="br.com.Main"
    ```
    
4.  **Execução do Módulo `ListaCompra` (Console):**
    
    Este módulo é executado diretamente no console:
    
    ```bash
    cd ../ListaCompra
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal
    mvn exec:java -Dexec.mainClass="br.com.ListaCompra.Main"
    ```
    
5.  **Execução do Módulo `ListaVeiculos` (Console):**
    
    Este módulo também é executado diretamente no console:
    
    ```bash
    cd ../ListaVeiculos
    # Compila e empacota o projeto
    mvn clean install
    # Executa a classe principal
    mvn exec:java -Dexec.mainClass="br.com.ListaVeiculos.Main"
    ```

## 🤝 Contribuição

Contribuições são bem-vindas! Se você deseja aprimorar algum módulo, corrigir um erro ou adicionar uma nova funcionalidade, sinta-se à vontade para abrir uma *Issue* ou enviar um *Pull Request*.

## 📄 Licença

Este projeto está licenciado sob a **Licença MIT**. Você pode encontrar o texto completo da licença no arquivo `LICENSE` na raiz do repositório.

***
