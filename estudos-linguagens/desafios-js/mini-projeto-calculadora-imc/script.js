let peso = window.document.querySelector('input#peso')
let altura = window.document.querySelector('input#altura')
let resultado = window.document.querySelector("div#resultado")

function calcular(){
    let pesoNum = parseFloat(peso.value.replace(',','.'))
    let alturaNum = parseFloat(altura.value.replace(',','.'))

    if(alturaNum >= 3){
        let alturacont = alturaNum / 100
        alturaNum = alturacont
    } 

    let conta = pesoNum/(alturaNum*alturaNum)

    if(conta < 18.5){
        resultado.innerHTML = `Seu IMC é ${conta.toFixed(1)} e você está no Grau 0 e é classificado como Magreza.`
    } else if(conta >= 18.5 && conta <= 24.9){
        resultado.innerHTML = `Seu IMC é ${conta.toFixed(1)} e você está no Grau 0 e é classificado como Normal`
    } else if(conta >= 25 && conta <= 29.9){
        resultado.innerHTML = `Seu IMC é ${conta.toFixed(1)} e você está no Grau 1 e é classificado como Sobrepeso.`
    } else if(conta >= 30 && conta <= 39.9){
        resultado.innerHTML = `Seu IMC é ${conta.toFixed(1)} e você está no Grau 2 e é classificado como Obesidade.`
    } else if (conta >= 40){
        resultado.innerHTML = `Seu IMC é ${conta.toFixed(1)} e você está no Grau 3 e é classificado como Obesidade Grave.`
    } else {
        resultado.innerHTML = `[ERRO] Por favor, digite valores válidos.`
    }
}

function limpar(){
    resultado.innerHTML = "Resultado.";
    peso.value = "";
    altura.value = "";
}