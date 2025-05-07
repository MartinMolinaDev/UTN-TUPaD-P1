import math, random

# EJERCICIO 01

for i in range (1, 101):
    print(i)
    

# EJERCICIO 02

numero = int(input("Ingrese un Número positivo distinto de 0: "))
contador = 0
if numero != 0:
    while numero != 0:
        contador = contador + 1
        numero = math.trunc(numero / 10)
    print(f"Cantidad de Dígitos: {contador}")
else:
    print("Usted ingresó un número no valido.")
    

# EJERCICIO 03

rango_minimo = int(input("Ingrese el primer numero del rango: "))
rango_maximo = int(input("Ingrese el primer numero del rango: "))
for i in range(rango_minimo, rango_maximo +1):
    print(i)
    
    
# EJERCICIO 04

suma = 0
while True:
    numero = int(input("Ingrese un numero para sumar '0' Sale del programa: "))
    if numero != 0:
        suma = suma + numero
    else:
        break     
print(f"La suma es: {suma}")

# EJERCICIO 05

random = random.randint(0,9)
acierto = False
cont = 0
while acierto == False:
    cont = cont +1
    numero = int(input("Ingrese un numero del '0' al '9': "))
    if numero == random:
        acierto = True
print(f"{cont} intentos.")


# EJERCICIO 06

for i in range(100, -1, -1):
    if (i % 2) == 0 and (i != 0):
        print(i)


# EJERCICIO 07

num = int(input("Ingrese in número entero positivo: "))
sum = 0
for i in range(num +1):
    sum = sum + i
print(sum)

# EJERCICIO 08

pares = 0
impares = 0
positivos = 0
negativos = 0
for i in range(100):
    num = int(input(f"Ingrese el numero ({i+1}): "))
    if (num % 2 == 0) and (num != 0):
        pares = pares + 1
    elif (num != 0):
        impares = impares +1
        
    if (num > 0):
        positivos = positivos + 1
    elif (num < 0):
        negativos = negativos + 1
print(f"Par: {pares} Impares: {impares} Negativos: {negativos} Positivos: {positivos}")


# EJERCICIO 09

num = 0
sum = 0
promedio = 0
for i in range(100):
    num = int(input(f"Ingrese el numero ({i+1}): "))
    sum = sum + num
print(f"Promedio: {sum / (i +1)}")


# EJERCICIO 10

num = int(input("Ingrese un numero positivo: "))
aux = ""
while (num > 0):
    aux = aux + str(num % 10)
    num = num // 10
print(aux)