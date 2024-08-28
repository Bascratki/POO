import random

def criar_lista(tamanho):
    lista = []
    
    for i in range(tamanho):
        lista.append(random.randint(1, 100))
        
    return lista
        
def verifica_numero(lista):
    multiplos_3 = []
    pares = []
    impares = []
    
    for num in lista:
        if num % 3 == 0:
            multiplos_3.append(num)
        if num % 2 == 0:
            pares.append(num)
        else:
            impares.append(num)
            
    return multiplos_3, pares, impares

tamanho = int(input('Digite o tamanho da lista: '))

lista = criar_lista(tamanho)
print(lista)

multiplos_3, pares, impares = verifica_numero(lista)

print(f'Múltiplos de 3: {multiplos_3}')
print(f'Pares: {pares}')
print(f'Ímpares: {impares}')
