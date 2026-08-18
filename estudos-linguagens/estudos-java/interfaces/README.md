# Sistema de Contratos e Parcelas

Projeto desenvolvido em **Java** para praticar conceitos de **Programação Orientada a Objetos (POO)**, interfaces, composição entre classes, listas e manipulação de datas.

O sistema recebe os dados de um contrato e sscalcula automaticamente suas parcelas, aplicando uma taxa de pagamento e juros de acordo com o número de meses.

## 📌 Funcionalidades

O programa permite informar:

* Número do contrato;
* Data do contrato;
* Valor total do contrato;
* Quantidade de parcelas.

Após o processamento, o sistema gera as parcelas com:

* Data de vencimento;
* Valor da parcela;
* Taxa de pagamento de 2%;
* Juros de 1% ao mês.

## 🧮 Cálculo das parcelas

O valor base da parcela é calculado dividindo o valor total do contrato pela quantidade de parcelas:

```text
valor da parcela = valor total / número de parcelas
```

Depois são aplicados:

```text
taxa de pagamento = valor da parcela × 2%
juros = valor da parcela × (1% × número da parcela)
```

Por fim:

```text
valor final = valor da parcela + taxa + juros
```

A data de vencimento é definida adicionando a quantidade correspondente de meses à data do contrato.

## 🏗️ Estrutura do projeto

O projeto é dividido nas seguintes classes:

### `Program`

Classe principal responsável pela interação com o usuário através do `Scanner`.

Realiza a leitura dos dados do contrato, chama o serviço de processamento e exibe as parcelas geradas.

### `Contract`

Representa o contrato, armazenando:

* Número;
* Data;
* Valor total;
* Lista de parcelas.

### `Installment`

Representa uma parcela do contrato, contendo:

* Data de vencimento;
* Valor da parcela.

### `ContractService`

Responsável por processar o contrato e gerar todas as parcelas.

A classe utiliza a interface `OnlinePaymentService` para realizar os cálculos de taxa e juros.

### `OnlinePaymentService`

Interface que define os métodos:

```java
Double paymentFee(Double amount);
Double interest(Double amount, Integer month);
```

### `PaypalService`

Implementação da interface `OnlinePaymentService`.

Responsável pelo cálculo da taxa de pagamento e dos juros:

* Taxa de pagamento: 2%;
* Juros: 1% ao mês.

## 🛠️ Tecnologias e conceitos utilizados

* **Java**
* Programação Orientada a Objetos
* Interfaces
* Implementação de interfaces
* Encapsulamento
* Composição entre classes

## 🎯 Objetivo

Este projeto foi desenvolvido como prática de **Java e Programação Orientada a Objetos**, com foco na utilização de interfaces e separação de responsabilidades entre as classes.

---

📚 **Projeto para fins de estudo e prática em Java.**
