print("*-" * 18)
salario = float(input("    Digite seu salário: "))
print("*-" * 18 )

# Variáveis de aumento junto com o salário:
aumento1 = salario * (1+15/100)
aumento2 = salario * (1+12/100)
aumento3 = salario * (1+10/100)
aumento4 = salario * (1+7/100)
aumento5 = salario * (1+4/100)
#--------------------------------------------------

# Variáveis de Reajuste
reajuste1 = aumento1 - salario
reajuste2 = aumento2 - salario
reajuste3 = aumento3 - salario
reajuste4 = aumento4 - salario
reajuste5 = aumento5 - salario
#--------------------------------------------------

# Aumento do salário entre 0 - 400

if (salario>0) and (salario<=400):
  print("-----------------------------")
  print(f"|   Novo salário: {aumento1:.2f}   |")
  print(f"|   Reajuste ganho: {reajuste1:.2f}  |")
  print(f"|   Em percentual: 15%     |")
  print("-----------------------------")
# ----------------------------------------------

# Aumento do salário entre 400.01 - 800

elif (salario>=400.01) and (salario<=800):
  print("-----------------------------")
  print(f"|   Novo salário: {aumento2:.2f}   |")
  print(f"|   Reajuste ganho: {reajuste2:.2f}  |")
  print(f"|   Em percentual: 12%     |")
  print("-----------------------------")
# ----------------------------------------------

# Aumento do salário entre 800.01 - 1200

elif (salario>=800.01) and (salario<=1200):
  print("-----------------------------")
  print(f"|   Novo salário: {aumento3:.2f}   |")
  print(f"|   Reajuste ganho: {reajuste3:.2f}  |")
  print(f"|   Em percentual: 10%     |")
  print("-----------------------------")
# ----------------------------------------------

# Aumento do salário entre 1200.01 - 2000

elif (salario>=1200.01) and (salario<=2000):
  print("-----------------------------")
  print(f"|   Novo salário: {aumento4:.2f}   |")
  print(f"|   Reajuste ganho: {reajuste4:.2f}  |")
  print(f"|   Em percentual: 7%       |")
  print("-----------------------------")
# ----------------------------------------------

# Aumento do salário maior do que 2000.01

elif salario>=2000.01:
  print("-----------------------------")
  print(f"|   Novo salário: {aumento5:.2f}   |")
  print(f"|   Reajuste ganho: {reajuste5:.2f}  |")
  print(f"|   Em percentual: 4%       |")
  print("-----------------------------")
# ----------------------------------------------

# Salário Inválido

elif salario<0:
  print("Salário Inválido, por favor, digite o salário de forma correta.")
