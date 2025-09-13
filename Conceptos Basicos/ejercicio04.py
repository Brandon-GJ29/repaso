numero = int(input("Ingresa un numero:"))


for i in range (0,numero):
    print(i)
    if i%3==0:
        print(f"{i} Es multiplo de 3 -> Fizz")
    elif i%5==0:
        print(f"{i} Es multiplo de 5 -> Buzz")
    else:
        print("Otra opcion")
