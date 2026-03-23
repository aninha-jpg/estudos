# 📦 Sistema de Controle de Estoque Interativo
Este projeto é uma evolução de um exercício acadêmico de Programação Orientada a Objetos em Java. Diferente da versão padrão(Prof. Nélio Alves), implementei uma estrutura de repetição e lógica de validação para garantir a integridade dos dados do estoque.

## 🚀 Melhorias Implementadas

Para sair do fluxo básico, adicionei funcionalidades que tornam o sistema mais robusto:

* **Menu Interativo:** Utilização de um loop `while` para permitir múltiplas operações (Adicionar/Remover) sem encerrar o programa.

* **Validação de Saldo Negativo:** Implementei uma trava lógica que impede a remoção de produtos se a quantidade solicitada for maior que o saldo em estoque.

* **Filtro de Entradas Inválidas:** O sistema barra a entrada de números negativos ou zero nas operações de ajuste.

* **Gestão de Recursos:** Uso de `try-with-resources` para manipulação segura do Scanner, evitando vazamentos de memória.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17+

* **Paradigma:** Orientação a Objetos (Classes, Métodos, Encapsulamento, `toString`).

* **Ambiente:** Linux (Ubuntu) / Vs Code.

## 📋 Como funciona

O sistema solicita os dados iniciais do produto e abre um menu de opções:

* **Adicionar:** Incrementa a quantidade (apenas valores positivos).

* **Remover:** Decrementa a quantidade, validando se há saldo suficiente para evitar estoque negativo.

* **Fim:** Encerra a execução com segurança.
