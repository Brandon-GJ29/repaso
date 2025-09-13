#2. Dado un arreglo de números , calcula la suma total.
array = []
for i in range (0,5): 
    array.append(int(input(f"Digita un numero en la posicion [{i}]: \n")))

total = 0
for i in range(len(array)):
    total= total + array[i]

print("El total del arreglo fue:",total)