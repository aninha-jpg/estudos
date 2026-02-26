// pegando os campos do html

let cep = document.getElementById('CEP')
let result = document.getElementById('result')

// funcao para achar o cep
async function foundCEP() {
    // se o cep vier com hífem, ele lima
    let cleanCEP = cep.value.replace(/\D/g, '');
    // se o tamanho for maior que 8 ele dá como inválido
        if(cleanCEP.length !== 8){
            result.innerHTML = "CEP inválido!, Digite 8 números.";
            // finaliza
            return;
        }
    // tenta conectar e acessar os dados do cep digitado
    try {
        const response = await fetch(`https://viacep.com.br/ws/${cleanCEP}/json/`);
        const data = await response.json();
        // se der algum erro ele acusa, se não ele escreve na tela as informações
        if (data.erro){
            result.innerHTML = `CEP não encontrado.`
        } else {
            result.innerHTML = `
            <p>Cidade:  ${data.localidade} </p>
            <p>Bairro: ${data.bairro} </p>
            <p>Logradouro: ${data.logradouro} </p>
            `;
        }
    // se caso houver algum erro na api
    } catch (erro){
        console.error("Deu erro na API:", erro);
        result.innerHTML = `Erro ao buscar o CEP. Tente novamente.`;
    }
}