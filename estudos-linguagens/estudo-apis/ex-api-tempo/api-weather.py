import requests

#passo a url da api
usercity = input("Digite o nome da sua cidade: ")

url = "http://api.weatherapi.com/v1/forecast.json"
myKey = ""

parameters = {
    'key': '',
    'q': usercity,
    'lang': 'pt'
}

answer = requests.get(url, params=parameters)
#verificando o estado (se retornar 200, está ok)
print(answer.status_code)

# se o status for 200 ele executa o codigo. 
try:
    if answer.status_code == 200:
        data = answer.json()
        temperature = data['current']['temp_c']
        city = data['location']['name']
        condition = data['current']['condition']['text']
        print(f"Em {city} agora faz {temperature}°C e o tempo está {condition}")
    else: 
        print("Cidade não encontrada.")
except Exception as e:
    #exceção caso dê algum erro
    print(f"Ocorreu um erro inesperado: {e}")

