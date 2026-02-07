const nome = document.querySelector("h1#nome_usuario")
const nome_input = document.querySelector("input#nometxt")

nome_input.addEventListener("input", function(e){
    nome.innerHTML = "Olá " + e.target.value + ", Como você está?"
})