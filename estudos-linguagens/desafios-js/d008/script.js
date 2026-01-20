function contar(){
    let numero1 = window.document.querySelector("input#num1")
    
    let numero2 = window.document.querySelector("input#num2")
    
    let passo1 = window.document.querySelector("input#passo")

    let resultado = window.document.querySelector("div#resultado")
    
    //verifico se o input está vazio antes de transformar em number
    if(numero1.value.length == 0 || numero2.value.length == 0 || passo1.value.length == 0){
        window.alert("[ERRO] Por favor, digite um número.")
        // tratamento de erro caso não haja nada no input
    } else{

        //passo as variáveis após a verificação.
        let num1 = Number(numero1.value)
    
        let num2 = Number(numero2.value)
        
        let passo = Number(passo1.value)

        resultado.innerHTML = `Contando: <br>`
        if(passo <= 0){
            window.alert("Passo inválido. Considerando Passo 1!")
            passo = 1
        } 
        if (num1 < num2){
            //contagem crescente
            for(num1; num1 <= num2; num1 += passo){
                resultado.innerHTML += `${num1} 👉`
            } 
        } else{
            //contagem decrescente
            for(num1; num1 >= num2; num1 -= passo){
                resultado.innerHTML += `${num1} 👉`
            }
        }   
    }
    resultado.innerHTML += `🏁`
}