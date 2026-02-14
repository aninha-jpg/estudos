let peso = window.document.querySelector('input#peso')
let altura = window.document.querySelector('input#altura')
let resultado = window.document.querySelector("div#resultado")

function mascaraAltura(){


}

function mascaraPeso(){


}

function calcular(){
    let pesoNum = Number(peso.value)
    let alturaNum = Number(peso.value)

    let conta = pesoNum/(alturaNum*alturaNum)
    resultado.innerHTML = `Seu IMC é ${conta}`
    
}

function limpar(){
    resultado.innerHTML = "Resultado.";
    peso.value = "";
    altura.value = "";
}