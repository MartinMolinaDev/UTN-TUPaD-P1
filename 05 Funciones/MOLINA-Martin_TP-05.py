# EJERCICIO 01
def imprimir_hola_mundo():
    return print("Hola Mundo!")

# EJERCICIO 02
def saludar_usuario(nombre):
    return print(f"Hola {nombre}!")

# EJERCICIO 03
def informacion_personal(nombre, apellido, edad, residencia):
    print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}.")

# EJERCICIO 04
def calcular_area_circulo(radio):
    return print(3.14 * (radio ** 2))

def calcular_perimetro_circulo(radio):
    return print(2 * 3.14 * radio)

# EJERCICIO 05
def segundos_a_horas(segundos):
    return print(segundos / 3600)

# EJERCICIO 06
def tabla_multiplicar(numero):
    print(f"Tabla de multiplicar del {numero}:")
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero * i}")

# EJERCICIO 07
def operaciones_basicas(a, b):
    suma = a + b
    resta = a - b
    multiplicacion = a * b
    if b != 0:
        division = a / b
    else:
        division = "No se puede dividir por 0"
    return print(f"Suma: {suma}, Resta: {resta}, Multiplicacion: {multiplicacion}, Division: {division}")

# EJERCICIO 08
def calcular_imc(peso, altura):
    if altura <= 0:
        return print("Error: La altura debe ser mayor que cero para calcular el IMC.")
    else:
        imc = peso / (altura ** 2)
        return print(f"imc: {imc}")

# EJERCICIO 09
def celsius_a_fahrenheit(celsius):
    return print((celsius * 9/5) + 32)

# EJERCICIO 10
def calcular_promedio(a, b, c):
    return print((a+b+c)/3)