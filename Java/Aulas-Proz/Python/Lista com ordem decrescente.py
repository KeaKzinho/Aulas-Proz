instrucao = int(input("Digite quantos números você quer: "))
numero = 0

lista = []

while numero<instrucao:
    valor = int(input("Digite o número"))
    lista.append(valor)
    lista.sort(reverse=True)
    print(lista)
    numero+=1