# 📦 Sistema de Cadastro de Funcionários

Este projeto é um exercício acadêmico de Programação Orientada a Objetos em Java. Ele simula um sistema de cadastro de funcionários com validação de ID único e atualização salarial.


## 🚀 Funcionalidades

- **Validação de ID único:** impede o cadastro de funcionários com IDs repetidos.
- **Busca eficiente por ID:** uso de Stream para localizar funcionários.
- **Atualização salarial:** permite aplicar aumento percentual em um funcionário específico.
- **Validação de existência:** impede alterações em IDs inexistentes.
- **Encapsulamento:** uso de getters e controle de acesso aos atributos.

## 🛠️ Tecnologias utilizadas

- Linguagem: Java 17+ c/ Programação Orientada a Objetos (POO)
- Estruturas: List / ArrayList
- Stream API

## 📋 Como funciona

O sistema funciona via terminal e segue o fluxo abaixo:

- O usuário informa quantos funcionários serão cadastrados
- Para cada funcionário, são informados:
  - ID
  - Nome
  - Salário
- O sistema impede IDs duplicados
- Após o cadastro, o usuário informa um ID para aumento salarial
- Caso o ID exista, é aplicado um percentual de aumento
- No final, todos os funcionários são listados


## ▶️ Como executar

### Pré-requisitos
- Java JDK 17 ou superior instalado

### Execução

```bash
javac Program.java entities/Employee.java
java Program