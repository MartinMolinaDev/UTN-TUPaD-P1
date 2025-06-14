# EJERCICIO 01
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
n = int(input("Ingrese un número: "))
for i in range(1, n + 1):
    print(f"Factorial de {i}: {factorial(i)}")
    
# EJERCICIO 02
def fibonacci(pos):
    if pos == 0:
        return 0
    elif pos == 1:
        return 1
    else:
        return fibonacci(pos - 1) + fibonacci(pos - 2)
n = int(input("Ingrese posición máxima: "))
for i in range(n + 1):
    print(f"Posición {i}: {fibonacci(i)}")
    
# EJERCICIO 03
def potencia(base, exp):
    if exp == 0:
        return 1
    else:
        return base * potencia(base, exp - 1)
base = int(input("Base: "))
exponente = int(input("Exponente: "))
print(f"Resultado: {potencia(base, exponente)}")

# EJERCICIO 04
def decimal_a_binario(n):
    if n == 0:
        return ""
    else:
        return decimal_a_binario(n // 2) + str(n % 2)
numero = int(input("Número decimal: "))
if numero == 0:
    print("0")
else:
    print(f"Binario: {decimal_a_binario(numero)}")
    
# EJERCICIO 05
def es_palindromo(palabra):
    if len(palabra) <= 1:
        return True
    elif palabra[0] != palabra[-1]:
        return False
    else:
        return es_palindromo(palabra[1:-1])
texto = input("Ingrese palabra: ").lower()
print("Es palíndromo" if es_palindromo(texto) else "No es palíndromo")

# EJERCICIO 06
def suma_digitos(n):
    if n < 10:
        return n
    else:
        return (n % 10) + suma_digitos(n // 10)
numero = int(input("Número: "))
print(f"Suma de dígitos: {suma_digitos(numero)}")

# EJERCICIO 07
def contar_bloques(n):
    if n == 1:
        return 1
    else:
        return n + contar_bloques(n - 1)
nivel = int(input("Bloques en base: "))
print(f"Total de bloques: {contar_bloques(nivel)}")

# EJERCITO 08
def contar_digito(numero, digito):
    if numero == 0:
        return 0
    ultimo_digito = numero % 10
    conteo_resto = contar_digito(numero // 10, digito)
    return conteo_resto + (1 if ultimo_digito == digito else 0)
num = int(input("Número: "))
dig = int(input("Dígito a buscar: "))
print(f"Ocurrencias: {contar_digito(num,dig)}")