function verificar(){
    let data = new Date()
    let ano = data.getFullYear()
    let formAno = document.getElementById("txtano")
    let res = document.getElementById('res')
    if(formAno.value.length == 0 || formAno.value > ano) {
        window.alert("[ERRO] Verifique os dados e tente novamente!")
    } else {
      let fsex = document.getElementsByName('radsex')
      let idade = ano - Number(formAno.value)
      let genero = ""
      let img = document.createElement('img')
      img.setAttribute("id", "foto")
      img.style.borderRadius = "50%"
      img.style.width = "200px"
      img.style.height = "200px"
      img.style.boxShadow = "0px 4px 8px -2px"

      if(fsex[0].checked) {
        genero = "Homem"
        if(idade >=0 && idade <10){
            //criança
            img.setAttribute('src', '../imagens/menino.jpg')
        }else if(idade < 21){
            //jovem
            img.setAttribute('src', '../imagens/jovem.jpg')
        } else if(idade < 50){
            //adulto
            img.setAttribute('src', '../imagens/adulto.jpg')
        } else {
            //idoso
            img.setAttribute('src', '../imagens/idoso.jpg')
        }
      } else if(fsex[1].checked){
        genero = "Mulher"
        if(idade >=0 && idade <10){
            //criança
            img.setAttribute('src', '../imagens/menina.jpg')
        }else if(idade < 21){
            //jovem
            img.setAttribute('src', '../imagens/jovemmulher.jpg')
        } else if(idade < 50){
            //adulto
            img.setAttribute('src', '../imagens/adulta.jpg')
        } else {
            //idoso
            img.setAttribute('src', '../imagens/idosa.jpg')
        }
      }
      
      res.style.textAlign = "center"
      res.innerHTML = `Detectamos ${genero} com ${idade} anos`
      res.appendChild(img)
    }

}