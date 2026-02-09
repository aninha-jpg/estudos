let numero1 = document.querySelector("input#parouimpar")

let resultado = document.querySelector("section.resultado")

function descobrir(){
    let numero = Number(numero1.value)
    if(numero % 2 === 0){
        resultado.innerHTML = `O número ${numero} é PAR!`
    } else {
        resultado.innerHTML = `O número ${numero} é ÍMPAR!`
    }
}