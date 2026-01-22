function gerarTabuada(){

    // variáveis.

    let numero1 = window.document.querySelector("input#num1")  

    let selecttab = window.document.querySelector("select#tabuada")

    selecttab.innerHTML = "";

    if (numero1.value.length == 0){
        window.alert("Por favor, Digite um Número.")

    } else {

        for(let restabuada = 1; restabuada <= 10; restabuada++){

            let numero = Number(numero1.value)

            let resultadotab = restabuada * numero
            let novoOption = document.createElement("option")
            novoOption.value = `selecttab${restabuada}`
            novoOption.text = `${numero} x ${restabuada}: ${resultadotab}.`
            selecttab.appendChild(novoOption)

        }
    }
}


