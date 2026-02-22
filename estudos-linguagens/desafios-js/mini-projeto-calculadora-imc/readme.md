# 🧍‍♀️ Calculadora de IMC(Índice de Massa Corporal)

![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

Uma ferramenta web simples para calcular o IMC e verificar a classificação de peso de acordo com os padrões de saúde.

## 📱 Funcionalidades

* **Tratamento de Input:** Aceita numeros com ponto ou vírgula.
* **Auto-correção de Altura:** Se o usuário digitar a altura em centímetros(ex: 170), o sistema converte automaticamente para metros(1,70).
* **Reset de campos:** botão para limpar rapidamente os dados inseridos.

## 📊 Tabela de Classificação Utilizada

O projeto segue a seguinte lógica de cálculo, baseada no IMC ($$IMC = \frac{peso}{altura^2}$$):

---

| Status | IMC | Classificação | Grau |
| :---: | :--- | :--- | :---: |
| 🔵 | Menor que 18.5 | Magreza | 0 |
| ✅ | 18.5 a 24.9 | Normal | 0 |
| ⚠️ | 25.0 a 29.9 | Sobrepeso | 1 |
| 🟠 | 30.0 a 39.9 | Obesidade | 2 |
| 🔴 | Maior que 40.0 | Obesidade Grave | 3 |

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com o "trio fundamental" do Front-end:

*  **HTML5** - Estruturação dos elementos.
*  **CSS3** - Estilização e layout responsivo.
*  **JavaScript** - Lógica do cálculo e interatividade.

## 💻 Como executar o projeto

1.  Clone este repositório:
    ```bash
    git clone https://github.com/aninha-jpg/estudos.git
    ```
2.  Navegue até a pasta do projeto.
3.  Abra o arquivo `index.html` no seu navegador de preferência.

---

## 👩‍💻 Autora

Criado com ❤️ por **Ana Luiza**.
