# 🏦 Sistema Bancário em Java (CLI).

Este projeto é uma evolução de um exercício acadêmico de Programação Orientada a Objetos em Java. Diferente da versão padrão(Prof. Nélio Alves), implementei uma estrutura de repetição e lógica de validação para garantir a integridade dos dados.

## 💾 Melhorias Implementadas

Para sair do fluxo básico, adicionei funcionalidades que tornam o sistema mais robusto:

* **Menu Interativo:** Utilização de um loop `while` para permitir múltiplas operações (Saque/Depósito) sem encerrar o programa.

* **Validação de Saque:** O sistema impede saques com valores maiores que o saldo disponível, porém a cobrança de uma taxa fixa pode resultar em saldo negativo após a operação.

* **Filtro de Entradas Inválidas:** O sistema barra a entrada de números negativos.

* **Gestão de Recursos:** Uso de `try-with-resources` para manipulação segura do Scanner, evitando vazamentos de memória.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+

* **Paradigma:** Orientação a Objetos (Classes, Métodos, Encapsulamento).

* **Ambiente:** Linux (Ubuntu) / Vs Code.

## 📋 Como funciona

O sistema solicita os dados iniciais da conta e inicia um menu de opções:

* **Depósito:** Incrementa o valor (apenas valores positivos).

* **Saque:** Permite a retirada de valores até o limite do saldo disponível. Uma taxa fixa de 5,00 é aplicada por operação, podendo resultar em saldo negativo.

* **Fim:** Encerra a execução com segurança.

## ▶️ Como executar:

#### Clonar o repositório
`git clone https://github.com/aninha-jpg/estudos`

#### Entrar na pasta
`cd estudos/estudos-linguagens/estudos-java/mini-sistema-bancario`

#### Compilar
`javac Program.java`

#### Executar
`java Program`