# 🚗 Lista de Veículos — Aplicação Java (Console)

Bem-vindo ao Lista de Veículos, um projeto desenvolvido em Java para
gerenciamento simples de veículos através do console, com validações
inteligentes e estrutura totalmente orientada a objetos.

------------------------------------------------------------------------

## ✨ Funcionalidades Principais

✔ Adicionar veículos com marca, modelo, placa e ano;
✔ Validação de placa Mercosul (LLLNLNN — ex: ABC1D23);
✔ Verificação de duplicidade de placa;
✔ Listagem organizada dos veículos cadastrados;
✔ Menu interativo em loop;
✔ Armazenamento interno usando ArrayList;

------------------------------------------------------------------------

## 🛠 Estrutura do Projeto

    src/
     └── br/com/ListaVeiculos/
          ├── Main.java
          ├── Controller/
          │     └── VeiculoController.java
          └── Entity/
                └── Veiculo.java

------------------------------------------------------------------------

## 📋 Menu Principal

O sistema funciona em loop exibindo:

    1 - Adicionar Veículo
    2 - Exibir Veículos
    3 - Sair

------------------------------------------------------------------------

## 🔐 Validação da Placa (Padrão Mercosul)

Formato aceito:

    LLLNLNN

Exemplo válido:

    ABC1D23

Regex utilizada:

    ^[A-Z]{3}[0-9][A-Z][0-9]{2}$

------------------------------------------------------------------------

## ❗ Verificação de Placa Duplicada

Antes de cadastrar um veículo, o sistema verifica se ele já existe:

    if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
        return true;
    }

------------------------------------------------------------------------

## 📄 Exemplo de Saída – Listagem de Veículos

    ========== VEÍCULOS ==========
    Veículo 1: Placa: ABC1D23 | Marca: Honda | Modelo: Civic | Ano: 2020
    Veículo 2: Placa: BRA2E19 | Marca: Toyota | Modelo: Corolla | Ano: 2019

------------------------------------------------------------------------

## ▶ Como Executar

### 1️⃣ Compile:

    javac Main.java

### 2️⃣ Execute:

    java Main

------------------------------------------------------------------------

## 💡 Melhorias Futuras

-   Persistência em arquivos CSV
-   Exclusão e edição de veículos
-   Interface gráfica com JavaFX ou Swing
-   Tratamento de exceções mais robusto
-   Sistema de cores no console

------------------------------------------------------------------------

## 🧑‍💻 Sobre o Projeto

Este projeto foi criado para fins de estudo e prática de:
- Java
- Programação Orientada a Objetos
- Validação de dados
- Manipulação de listas
