def pesquisa_binaria(lista, item): 
    # inicializa as variveis da lista/chutes
    baixo = 0
    alto = (len(lista) -1)
    # enquanto ainda não achar um único elemento, ele continua verificando o elemento central.
    while baixo <= alto:
        # necessário o int para ele arredondar os numeros, não aceita float.
        meio = int((baixo + alto) / 2)
        chute = lista[meio]
        # acha o item
        if chute == item: 
            return meio
        # chute muito alto
        if chute > item:
            alto = meio - 1
        # chute muito baixo
        else:
            baixo = meio + 1
    return None

minha_lista = [1, 3, 5, 7, 9]

print(pesquisa_binaria(minha_lista, 3))
print(pesquisa_binaria(minha_lista, -1))
