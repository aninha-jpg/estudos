# 📁 CSV Summary Generator

Projeto desenvolvido durante o curso de Java do Prof. Nélio Alves.

## 🧠 Sobre o projeto

Esta aplicação realiza a leitura de um arquivo CSV contendo informações de produtos, cria objetos a partir dos dados lidos e gera automaticamente um arquivo `summary.csv` dentro de uma pasta `out`.

Para cada produto são lidos:

- Nome
- Preço
- Quantidade

Em seguida, o programa calcula o valor total de cada produto (`preço × quantidade`) e grava o resultado em um novo arquivo.

## 🚀 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- `File`
- `FileReader`
- `BufferedReader`
- `FileWriter`
- `BufferedWriter`
- `ArrayList`
- Tratamento de exceções (`IOException`)
- Try-with-resources

## 📂 Estrutura do arquivo de entrada

Exemplo de `itens-vendidos.csv`:

```csv
TV,1000.00,2
Mouse,40.00,5
Teclado,80.00,3
```

## 📄 Arquivo gerado

O programa cria automaticamente uma pasta `out` e gera o arquivo `summary.csv`:

```csv
TV,2000.00
Mouse,200.00
Teclado,240.00
```

## 📚 Conceitos praticados

- Leitura de arquivos CSV
- Escrita de arquivos
- Manipulação de diretórios
- Manipulação de caminhos de arquivos
- Conversão de dados (`String`, `double` e `int`)
- Criação de objetos a partir de dados lidos
- Manipulação de coleções (`ArrayList`)
- Cálculo de valores utilizando atributos dos objetos
- Tratamento de exceções com `try-with-resources`

## 📌 Funcionalidades

- Solicita o caminho do arquivo CSV.
- Lê todos os produtos do arquivo.
- Cria objetos da classe `Produto`.
- Armazena os produtos em uma lista.
- Cria automaticamente a pasta `out`, caso ela não exista.
- Gera um arquivo `summary.csv` contendo o nome do produto e seu valor total.

## 🎯 Objetivo

Praticar a manipulação de arquivos em Java, reforçando conceitos de entrada e saída de dados (I/O), Programação Orientada a Objetos e processamento de arquivos CSV.s