numero =int(input("Digita un numero:"))

print(numero)

total=1
for i in range(numero,1,-1):
    total=total*i

    print(f"El total es :{total} El i: {i}")


print(total)