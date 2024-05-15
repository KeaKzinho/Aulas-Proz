filmes = []
nr_filmes = int(input("Quantos filmes você quer adicionar? "))
n = 0
b = 0

while n<nr_filmes:
    fil = input(f"Coloque o {n+1} filme: ")
    filmes.append(fil)
    n += 1

print("-" * 50)

while b<nr_filmes:
    print(f"- Filme {b+1}: ", filmes[b])
    b +=1


