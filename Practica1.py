print("""que quieres hacer?
    1)dividir
    2)multiplicar
    3)calcular el factorial de un numero
    """)

opcion = int(input("Elige una opcion:"))

if opcion == 1:
    def division_por_restas(numero, divisor):
        cociente = 0  # Inicializamos el cociente a 0

        while numero >= divisor:
            numero -= divisor  # Restamos el divisor del número
            cociente += 1     # Incrementamos el cociente en 1
    # Al salir del bucle, numero contendrá el residuo
        return cociente, numero
    # Ejemplo de uso:
    dividendo = int(input("Ingresa el dividendo: "))
    divisor = int(input("Ingresa el divisor: "))
    cociente, residuo = division_por_restas(dividendo, divisor)
    print(f"Cociente: {cociente}")
    print(f"Residuo: {residuo}")
    
elif opcion == 2:
    def multiplicacion_por_sumas(numero1, numero2):
        resultado = 0

        for i in range(numero2):
            resultado += numero1

        return resultado

# Ingresa los números que deseas multiplicar
    numero1 = int(input("Ingresa el primer número: "))
    numero2 = int(input("Ingresa el segundo número: "))

# Llama a la función para multiplicar los números e imprime el resultado
    resultado = multiplicacion_por_sumas(numero1, numero2)
    print(f"El resultado de {numero1} x {numero2} es: {resultado}")

elif opcion == 3:
     
    def factorial(numero):
        if numero == 0:
            return 1
        else:
            return numero * factorial(numero - 1)
# Ingresa el número para calcular su factorial
    numero = int(input("Ingresa un número para calcular su factorial: "))
# Llama a la función para calcular el factorial e imprime el resultado
    resultado = factorial(numero)
    print(f"El factorial de {numero} es: {resultado}")

else: print("opcion incorrecta")