# EJERCICIO 01
precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva': 1450}
precios_frutas['Naranja'] = 1200
precios_frutas['Manzana'] = 1500
precios_frutas['Pera'] = 2300

print(precios_frutas)

# EJERCICIO 02
precios_frutas['Banana'] = 1330
precios_frutas['Manzana'] = 1700
precios_frutas['Melón'] = 2800

print(precios_frutas)

# EJERCICIO 03
frutas = list(precios_frutas.keys())

print(frutas)

# EJERCICIO 04
agenda = {}
for i in range(5):
    nombre = input("Nombre: ")
    telefono = input("Teléfono: ")
    agenda[nombre] = telefono

consulta = input("¿Qué contacto querés buscar? ")
print(agenda.get(consulta, "Contacto no encontrado"))

# EJERCICIO 05
frase = input("Ingresá una frase: ")
palabras = frase.lower().split()
unicas = set(palabras)
conteo = {}
for palabra in palabras:
    conteo[palabra] = conteo.get(palabra, 0) + 1

print("Palabras únicas:", unicas)
print("Conteo:", conteo)

# EJERCICIO 06
for _ in range(3):
    nombre = input("Nombre del alumno: ")
    notas = tuple(float(input(f"Nota {i+1}: ")) for i in range(3))
    promedio = sum(notas) / 3
    print(f"{nombre} - Promedio: {promedio}")
    
# EJERCICIO 07
parcial1 = {1, 2, 3, 4}
parcial2 = {3, 4, 5, 6}

print("Ambos:", parcial1 & parcial2)
print("Solo uno:", parcial1 ^ parcial2)
print("Al menos uno:", parcial1 | parcial2)

# EJERCICIO 08
stock = {}

producto = input("Producto a consultar: ")
if producto in stock:
    print("Stock actual:", stock[producto])
    stock[producto] += int(input("¿Cuántas unidades agregar? "))
else:
    stock[producto] = int(input("Producto nuevo. ¿Cantidad inicial? "))

# EJERCICIO 09
agenda = {
    ("lunes", "10:00"): "Reunión",
    ("martes", "14:00"): "Clase de Python"
}

dia = input("Día: ")
hora = input("Hora: ")
print("Evento:", agenda.get((dia, hora), "No hay eventos"))

# EJERCICIO 10
original = {'Argentina': 'Buenos Aires', 'Francia': 'París', 'Italia': 'Roma'}
invertido = {}
for pais, capital in original.items():
    invertido[capital] = pais

print(original)
print(invertido)