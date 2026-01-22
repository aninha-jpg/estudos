function carregar(){
    let msg = window.document.getElementById("msg")
    let img = window.document.getElementById('imagem')
    let data = new Date()
    let hora = data.getHours()
    msg.innerHTML = `Agora são ${hora} horas.`

    if(hora >= 0 && hora < 12){
        //bom dia
        img.src = "../imagens/dia.jpg"
        document.body.style.background = "#76A6CB"
    } else if(hora >= 12 && hora <= 18){
        //boa tarde
        img.src = "../imagens/tarde.jpg"
        document.body.style.background = "#E0A8AB"
    } else{
        img.src = "../imagens/noite.jpg"
        document.body.style.background = "#E0A8AB"
        //boa noite
    }
}


/// tarde #E0A8AB
/// dia #76A6CB
/// noite #15233F