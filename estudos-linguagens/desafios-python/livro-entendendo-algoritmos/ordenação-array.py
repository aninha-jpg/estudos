# buscar o menor valor no array
def buscarMenor(arr):
    # armazenar o menor valor e o indice dele
    menor = arr[0]
    menor_indice = 0
    # laço pega o menor valor do array e se for menor que o já armazenado ele recebe o novo valor
    for i in range(1, len(arr)):
        if arr[i] < menor:
            menor = arr[i]
            menor_indice = i
    return menor_indice

# função de ordenação

def ordenacaoPorSelecaoMenor(arr):
    novoArr = []
    # ele encontra o menor elemento do array e adiciona ao novo array
    for i in range(len(arr)):
        # recebe a função
        menor = buscarMenor(arr)
        # remove o menor da lista antiga e coloca na nova, para evitar que o numero seja escolhido novamente
        novoArr.append(arr.pop(menor))
    return novoArr

# buscar o maior valor no array - mesma lógica, só muda o sinal

def buscarMaior(arr):
    # armazenar o menor valor e o indice dele
    maior = arr[0]
    maior_indice = 0
    # laço pega o menor valor do array e se for menor que o já armazenado ele recebe o novo valor
    for i in range(1, len(arr)):
        if arr[i] > maior:
            maior = arr[i]
            maior_indice = i
    return maior_indice

def ordenacaoPorSelecaoMaior(arr):
    novoArr = []
    # ele encontra o maior elemento do array e adiciona ao novo array
    for i in range(len(arr)):
        # recebe a função
        maior = buscarMaior(arr)
        # remove o maior da lista antiga e coloca na nova, para evitar que o numero seja escolhido novamente
        novoArr.append(arr.pop(maior))
    return novoArr



print(ordenacaoPorSelecaoMaior([1, 2, 36, 9999, 3, 34, 2345, 2245, 1, 0, 4455, 222, 111, 555, 2456, 5777, 34677, 34, 34, 1, 2, 4, 34, 5, 23, 2345, 2222222, 3345555, 123234565, 6547675687, 8]))
print(ordenacaoPorSelecaoMenor([1, 2, 36, 9999, 3, 34, 2345, 2245, 1, 0, 4455, 222, 111, 555, 2456, 5777, 34677, 34, 34, 1, 2, 4, 34, 5, 23, 2345, 2222222, 3345555, 123234565, 6547675687, 8]))
