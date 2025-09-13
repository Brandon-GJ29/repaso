#7.Dado un arreglo de enteros, elimina los elementos duplicados.
import random
array=[]
arrayAux=[]

for i in range (0,5):
    array.append(random.randint(0,5))

print(array)


for i in range(0, len(array)):
    aux = False
   
    for j in range(0,len(array)):
        print(f"i:{array[i]} j:{array[j]}")
        if(i!=j):
            if(array[i]==array[j]):
                print("duplicado")
                aux=True
    
    if(aux==False):
        arrayAux.append(array[i])


print(arrayAux)


#Opcion 2

array=list(set(array))
print(array)