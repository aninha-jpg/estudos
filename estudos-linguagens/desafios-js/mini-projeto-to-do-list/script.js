
function adicionar(){
    let tarefaInput = document.querySelector("input#txtlista").value;

    let tarefaAdicionada = document.createElement("li");
    tarefaAdicionada.innerHTML = tarefaInput + '<span onclick="deletarTarefa(this)"> 🗙 </span>'

    document.querySelector("ul").appendChild(tarefaAdicionada)


    document.querySelector("input#txtlista").value = ""
}

function deletarTarefa(tarefaAdicionada) {
    tarefaAdicionada.parentElement.remove()
}
