let city = window.document.getElementById('city');
let state = window.document.getElementById('state');
let country = window.document.getElementById('country');

let result = window.document.getElementById('result');

async function search(){
    try {

        // passando a url da api geocoding.
        const response = await fetch(`http://api.openweathermap.org/geo/1.0/direct?q=${city.value},${state.value},${country.value}&appid=`);

        const data = await response.json();
        // se a resposta da api for igual a 200(ok) e a lista for maior que 0, ele roda a api, se não cai do else e mostra o erro na tela.
        if(response.status == 200 && data.length > 0){
        // pegando a latitute e longitude.
            let latitude = data[0].lat;
            let longitude = data[0].lon;
            // inicio api weather
            const responseweather = await fetch(`https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=`);


            const dataweather = await responseweather.json();

            result.innerHTML = `<p> A Temperatura em ${city.value} é de: ${dataweather.main.temp}°.</p>
            <br>
            <p> No momento está: ${dataweather.weather[0].description}. <img src="https://openweathermap.org/img/wn/${dataweather.weather[0].icon}@2x.png"></p>
            <br>
            <p> A temperatura máxima pode chegar a: ${dataweather.main.temp_max}°.</p>
            <br>
            <p> E a Temperatura mínima: ${dataweather.main.temp_min}°.</p>
            `;
        } else {
            result.innerHTML = `Cidade não encontrada. Por favor, verifique as informações.`
        }
    } catch (error){
            console.error("Deu um erro na API", error);
            result.innerHTML = `Houve um erro ao buscar a cidade. Tente novamente.`;
    }

}

/*

1 - input do usuario apra o nome da cidade -- ok

2 - testa p geocoding api 200 ok, ele passa long e lat

3 - manda a lon e lat para o weather api, que se retornar 200 ele mostra a temperatura e etc


-- precisa da long e lat para chamar a api

-- usar async e await

call api weather: https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}

latitute e longitude e a chave são obrigatórios e o exlude, units e langs são opcionais

lan pt_br Português Brasil
en English


geocondig: http://api.openweathermap.org/geo/1.0/direct?q={city name},{state code},{country code}&limit={limit}&appid={API key}

geocoding requere nome da cidade, status, pais e a chave, limit é opcional

tratamento de erros == checar se a lista que o geocondig retorna é maior q 0

*/