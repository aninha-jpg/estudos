# Mini projeto de calculadora via terminal com match case

number_one = int(input("Digite um número: "))
number_two = int(input("Digite outro número: "))

operation = input("Digite sua operação (Ela pode ser +(mais), -(menos), /(divisão), *(multiplicação)): ")

match operation:
    case '+':
        add = number_one + number_two
        print(f"O resultado da soma entre {number_one} e {number_two} é: {add}")
    case '-':
        subtract = number_one - number_two
        print(f"O resultado da subtração entre {number_one} e {number_two} é: {subtract}")
    case '/':
        divison = number_one / number_two
        print(f"O resultado da divisão entre {number_one} e {number_two} é: {divison}")
    case '*':
        multiplication = number_one * number_two
        print(f"O resultado da multiplicaçao entre {number_one} e {number_two} é: {multiplication}")
    case _:
        print("Confirme se as informações estão corretas.")
