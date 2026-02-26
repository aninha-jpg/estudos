let cep = document.getElementById('CEP')
let result = document.getElementById('result')

async function foundCEP() {
    let cleanCEP = cep.value.replace(/\D/g, '');
        if(cleanCEP.length !== 8){
            result.innerHTML = "CEP inválido!, Digite 8 números.";
            return;
        }

    try {
        const response = await fetch(`https://viacep.com.br/ws/${cleanCEP}/json/`);
        const data = await response.json();

        if (data.error){
            result.innerHTML = `CEP não encontrado.`
        } else {
            result.innerHTML = `
            <p>Cidade:  ${data.localidade} </p>
            <p>Bairro: ${data.bairro} </p>
            <p>Logradouro: ${data.logradouro} </p>
            `;
        }
    } catch (erro){
        console.error("Deu erro na API:", erro);
        result.innerHTML = `Erro ao buscar o CEP. Tente novamente.`;
    }
}