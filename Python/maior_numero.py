lista = []
l = 0
n = 1
m = 1 
while l<3:
    n = float(input(f"Digite o {m}° número: "))
    m+=1
    l+=1
    lista.append(n)

print(f"O maior número é: {max(lista)}")