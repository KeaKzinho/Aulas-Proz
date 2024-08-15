num_func = int(input("Informe seu número de identificação: "))
print("-"*50)
horas_trab = float(input("Quantas horas você trabalhou? "))
print("-"*50)
valor_hora = int(input("Quanto você recebe por hora? "))
print("-"*50)
salario = horas_trab * valor_hora


print(f"Olá funcionário de número {num_func}! Seu salário esse mês é de {salario:.2f}.")