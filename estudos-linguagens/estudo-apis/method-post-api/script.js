//testando métodos de api, com o jsonPlaceHolder

// utilizando a documentação da api

// modifico para testar o async/await
async function postData(newPost, callBack){
    const response = await fetch("https://jsonplaceholder.typicode.com/posts", {
    method: 'POST',
    body: JSON.stringify(newPost),
    headers: {
        'Content-type': 'aplicattion/json; charset=UTF-8',
    },
    });
    if(response.status === 201){
    const data = await response.json();

    callBack(null, data);
    } else {
        callBack("[ERRO] Houve um erro ao criar: " + response.status, null)
    }

}
// pega a resposta, transforma em json e mostra na tela

postData (
    {
    title: 'Meu primeiro post em uma api',
    body: 'Sempre aprendendo mais...',
    userID: 1,
    },
    (callBack, result) => {
        if(callBack) {
            console.log(callBack);
        } else {
            console.log("Sucesso. Recebido!: " + JSON.stringify(result));
        }
    }

)