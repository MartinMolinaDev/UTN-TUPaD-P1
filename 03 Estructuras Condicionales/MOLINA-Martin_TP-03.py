from statistics import mode, median, mean
import random

# EJERCICIO 01

print("Ingrese su edad: ")
edad = int(input())
if (edad >= 18):
    print("Es mayor de edad")


# EJERCICIO 02

print("Ingrese su nota: ")
nota = int(input())
if (nota >= 6):
    print("Aprobado")
else:
    print("Desaprobado")


# EJERCICIO 03

# Opción 1 - Sólo usando condicionales, y si se ingresa un numero impar termina el programa.
print("Ingrese un número par: ")
numero = int(input())
if (numero % 2) == 0:
    print("Ha ingresado un número par.")
else:
    print("Por favor ingrese un número par.")

# Opción 2 - Usando ciclo repetitivo emulando un "Do While" para que hasta que no se ingresa un número par el programa no termine.
while True:
    print("Ingrese un número par: ")
    numero = int(input())
    if (numero % 2) == 0:
        print("Ha ingresado un número par.")
        break


# EJERCICIO 04

print("Ingrese su edad: ")
edad = int(input())
if (edad < 1):
    print("Ingresó una edad inválida.")
else:
    if (edad < 12):
        print('Usted pertenece a la categoria "Niño/a".')
    else:
        if (edad >= 12) and (edad < 18):
            print('Usted pertenece a la categoria "Adolecente".')
        else:
            if (edad >= 18) and (edad < 30):
                print('Usted pertenece a la categoria "Adulto/a joven".')
            else:
                if (edad >= 30):
                    print('Usted pertenece a la categoria "Adulto/a".')


# EJERCICIO 05

# Opción 1 - Sólo usando condicionales, y si se ingresa una contraseñe que no tenga entre 8 y 14 caracteres termina el programa.
print("Ingrese una contraseña que contenga entre 8 y 14 caracteres: ")
contrasenia = input()
if (len(contrasenia) >= 8) and (len(contrasenia) <= 14):
    print("Ha ingresado una contraseña correcta.")
else:
    print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres.")

# Opción 2 - Usando ciclo repetitivo emulando un "Do While" para que hasta que no se ingresa una contraseña válida el programa no termine.
while True:
    print("Ingrese una contraseña que contenga entre 8 y 14 caracteres: ")
    contrasenia = input()
    if (len(contrasenia) >= 8) and (len(contrasenia) <= 14):
        print("Ha ingresado una contraseña correcta.")
        break


# EJERCICIO 06

numeros_aleatorios = [random.randint(1, 100)  for i in range(50)]
moda = mode(numeros_aleatorios)
mediana = median(numeros_aleatorios)
media = mean(numeros_aleatorios)
print(f"Moda: {moda}")
print(f"Mediana: {mediana}")
print(f"Media: {media}")

if (media > mediana) and (mediana > moda):
    print("Sesgo positivo.")
if (media < mediana) and (mediana < moda):
    print("Sesgo negativo.")
if (media == mediana) and (media == moda):
    print("Sin Sesgo.")


# EJERCICIO 07

print("Ingrese una frase: ")
frase = input()
if ((frase[len(frase)-1] == "a") or (frase[len(frase)-1] == "A") or (frase[len(frase)-1] == "e") or (frase[len(frase)-1] == "E") or
    (frase[len(frase)-1] == "i") or (frase[len(frase)-1] == "I") or (frase[len(frase)-1] == "u") or (frase[len(frase)-1] == "U")):
    print(frase + "!")
else:
    print(frase)


# EJERCICIO 08

print("Ingrese su nombre: ")
nombre = input()
print("INGRESE UNA DE LAS SIGUIENTES OPCIONES:\n1) Su nombre en mayúsculas.\n2) Su nombre en minúsculas.\n3) Su nombre con la primera letra mayúscula.")
opcion = int(input())
if (opcion == 1):
    print(nombre.upper())
else:
    if (opcion == 2):
        print(nombre.lower())
    else:
        if (opcion == 3):
            print(nombre.title())
        else:
            print("Ingresó una opción incorecta.")


# EJERCICIO 09

print("Ingrese la magnitud del terremoto: ")
magnitud = int(input())
if (magnitud < 3):
    print('"Muy leve" (imperceptible).')
else:
    if (magnitud >= 3) and (magnitud < 4): # Acá hay un eror en el enunciado porque decir Mayor o igual que 3 y menor que 4 es igual a decir es igual a 3
        print('"Leve" (ligeramente perceptible). ')
    else:
        if (magnitud >= 4) and (magnitud < 5): # Acá hay un eror en el enunciado porque decir Mayor o igual que 4 y menor que 5 es igual a decir es igual a 4
            print('"Moderado" (sentido por personas, pero generalmente no causa daños).')
        else:
            if (magnitud >= 5) and (magnitud < 6): # Acá hay un eror en el enunciado porque decir Mayor o igual que 5 y menor que 6 es igual a decir es igual a 5
                print('"Fuerte" (puede causar daños en estructuras débiles).')
            else:
                if (magnitud >= 6) and (magnitud < 7): # Acá hay un eror en el enunciado porque decir Mayor o igual que 6 y menor que 7 es igual a decir es igual a 6
                    print('"Muy Fuerte" (puede causar daños significativos).')
                else:
                    if (magnitud >= 7):
                        print('"Extremo" (puede causar graves daños a gran escala).')


# EJERCICIO 10

print("¿En qué hemisferio estás? (N/S): ")
hemisferio = input().upper()
print("¿Qué mes es? (1-12): ")
mes = int(input())
print("¿Qué día es? (1-31): ")
dia = int(input())

if hemisferio == "N":
    if (mes == 12 and dia >= 21) or (mes in [1, 2]) or (mes == 3 and dia <= 20):
        print("Invierno")
    elif (mes == 3 and dia >= 21) or (mes in [4, 5]) or (mes == 6 and dia <= 20):
        print("Primavera")
    elif (mes == 6 and dia >= 21) or (mes in [7, 8]) or (mes == 9 and dia <= 20):
        print("Verano")
    else:
        print("Otoño")

elif hemisferio == "S":
    if (mes == 12 and dia >= 21) or (mes in [1, 2]) or (mes == 3 and dia <= 20):
        print("Verano")
    elif (mes == 3 and dia >= 21) or (mes in [4, 5]) or (mes == 6 and dia <= 20):
        print("Otoño")
    elif (mes == 6 and dia >= 21) or (mes in [7, 8]) or (mes == 9 and dia <= 20):
        print("Invierno")
    else:
        print("Primavera")
else:
    print("Hemisferio no válido.")