quantidade = int(input("Digite a quantidade desejada: "))
argumentos = 0

valores = []

while argumentos<quantidade:
    valor = int(input("Digite aqui os números: "))
    valores.append(valor)
    print(valores)
    argumentos +=1
    
maior = max(valores, key=int)
menor = min(valores, key=int)

resultado = maior - menor

print(f"A diferença do maior e menor é de: {resultado}.")

