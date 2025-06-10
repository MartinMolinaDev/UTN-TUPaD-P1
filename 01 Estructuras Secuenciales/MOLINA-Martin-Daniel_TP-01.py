# Ejercicio 01
print("Hola Mundo!")


# Ejercicio 02
print("Ingrese su nombre: ")
nombre = input()
print(f"Hola {nombrE}!")


# Ejercicio 03
print("Ingrese su nombre: ")
nombre = input()
print("Ingrese su apellido: ")
apellido = input()
print("Ingrese su edad: ")
edad = input()
print("Ingrese su residencia: ")
residencia = input()
print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}.")

# Ejercicio 04
print("Ingrese el radio de un circulo: ")
radio = input()
print("El area del circulo es: ", 3.14 * float(radio) ** 2)
print("El perimetro del circulo es: ", 2 * 3.14 * float(radio))


# Ejercicio 05
print("Ingrese cantidad de segundos para convertir en horas: ")
print("La cantidad de Horas  es: ", int(input()) // 3600)


# Ejercicio 06
print("Ingrese un numero para crear su tabla de multiplicar: ")
numero = int(input())
for i in range(1, 11):
        multiplicacion = numero * i
        print(f"{numero} x {i} = {multiplicacion}")


# Ejercicio 07
print("Ingrese un numero entero distinto de 0: ")
num_1 = input()
print("Ingrese otro numero entero distinto de 0: ")
num_2 = input()
print("Suma: ", int(num_1) + int(num_2))
print("Resta: ", int(num_1) - int(num_2))
print("Division: ", int(num_1) / int(num_2))
print("Multiplicacion: ", int(num_1) * int(num_2))


# Ejercicio 08
print("Ingrese su peso: ")
peso = input()
print("Ingrese su altura: ")
altura = input()
imc = float(peso) / float(altura) ** 2
print("Su masa corporal es: ", imc)


# Ejercicio 09
print("Ingrese una temperatura en Celsius: ")
celsius = input()
farenheit = float(celsius) * 1.8 + 32
print(f"El equivalente en Farenheit es: {farenheit}")


# Ejercicio 10
print("Ingrese el primer numero: ")
num_1 = float(input())
print("Ingrese el segundo numero: ")
num_2 = float(input())
print("Ingrese el tercer numero: ")
num_3 = float(input())
promedio = (num_1 + num_2 + num_3) / 3
print(f"El promedio es: {promedio}")