#algoritmo de pesquisa simples

Numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

target = 24

#função O(n)

def findTarget(num, target):
    memories = {}
    #guarda numeros já escolhidos na memória
    for i, num in enumerate(Numbers):
        complement = target - num
        if complement in memories:
            return [memories[complement], i]
        
        memories[num] = i
        print(memories)
    return "Nenhum par encontrado"

print(findTarget(Numbers, target))