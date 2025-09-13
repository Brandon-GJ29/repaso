#6.Implementa una función que encuentre el máximo y mínimo de un arreglo 
# sin usar funciones predefinidas.
import random
array = []

for i in range(0,5):
    array.append(random.randint(0,100))

low = array[0]
high = array[0]
for i in range(0,len(array)):
    if(array[i]<low):
        low=array[i]
    
    if(high<array[i]):
        high=array[i]
    

print(array)
print(f"El numero de menor valor es {low} y el de mayor {high}")


#Opcion 2 

maximo =max(array)
menor = min(array)
print(f"El numero de menor valor es {menor} y el de mayor {maximo}")

