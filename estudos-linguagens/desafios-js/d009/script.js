//crio o array

let listaNumeros = [];

let contas = window.document.querySelector("div#contas")

function adicionar(){
    // se adicionar um novo número, é preciso que o resultado desapareça...
    contas.innerHTML = ""
    let numero1 = window.document.querySelector("input#numero")

    // crio uma função de tratamento, caso o usuário não digite no input.
    if(numero1.value.length == 0 || numero1.value >= 101 || numero1.value <= 0 || listaNumeros.includes(Number(numero1.value))){
        window.alert("Número Inválido ou Já adicionado. Confira e Tente Novamente!")
    } else {
        // após confirmação, transformo em número
        let numero = Number(numero1.value)
        //crio os options do select
        let adcNumeros = document.createElement("option")
        adcNumeros.text = `O Valor ${numero} foi adicionado` 
        adicionarNumeros.appendChild(adcNumeros)
        // precisamos adicionar este número no array push(numero)
        listaNumeros.push(numero)
        // preciso que a lista limpe se caso adicionar um novo número listaNumeros = ""??
    } 

    // depois de adicionar todos os números, ao finalizar chama a função:

}
function finalizar(){

    if(listaNumeros.length == 0){
        window.alert("Por favor, adicione um número e tente novamente!")
        } else {
            let soma = 0;
            // inicializo as variáveis com a posição 0 do array
            let maiorNumero = listaNumeros[0];
            let menorNumero = listaNumeros[0];
            //i = 0, se i for menor que o comprimento do array ele adiciona 1 na variável soma.
            for(let i = 0; i < listaNumeros.length; i++){
                // ele lê todos os números do array e guarda na variável soma, ex: lê a posição 0 e guarda. lê a posição 1, soma com a 0 e guarda...
                soma += listaNumeros[i]
            }
            let media = soma / listaNumeros.length
            let somaTotal = soma
            //media = soma todos os números e divide pelo comprimento do array. 
            // somaTotal soma todos os números do array

            // para saber o maior numero
            for(let ma = 0; ma < listaNumeros.length; ma++){
                numMaiorlist = listaNumeros[ma]
                if(numMaiorlist > maiorNumero){
                    maiorNumero = numMaiorlist;
                }
            }
            // para saber o menor numero
            for(let me = 0; me < listaNumeros.length; me++){
                numMenorlist = listaNumeros[me]
                if(numMenorlist < menorNumero){
                    menorNumero = numMenorlist;
                }
            }
        //media = soma todos os números e divide pelo comprimento do array. 
        // somaTotal soma todos os números do array
        contas.innerHTML = `Ao todo temos ${listaNumeros.length} números. <br> O maior valor informado foi = ${maiorNumero}. <br>O menor valor informado foi = ${menorNumero}.<br>Somando todos os valores temos = ${soma}. <br> A média dos valores digitados é = ${media}.<br>`
    }   
}

