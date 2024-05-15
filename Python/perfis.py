from os import system
lista = []
o = 0
n = 0
n_cadastro = int(input("Quantos cadastros deseja adicionar? \n"))

while n<n_cadastro:

    cadastro = {"Nome":input("Informe seu nome: "), "Idade":int(input("Informe sua idade: ")), "Signo":input("Informe seu signo: ")}
    
    lista.append(cadastro)

    n += 1

    if n < n_cadastro:
        input("Aperte Enter para começar a outra lista...")
        system("cls")
    elif n == n_cadastro:
        input("Todos os perfis foram criados, agora fique com a lista!")
        system("cls")

for item in lista:
    print(f"{item['Nome']} tem {item['Idade']} anos.")

