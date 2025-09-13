word= str(input("Ingresa una palabra:"))

newWord=""
for i in range(len(word)-1,-1,-1):
    newWord= newWord+ word[i]

print(newWord)

#Opcion 2 
newWord2 = word[::-1]

print(newWord2)