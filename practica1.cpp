#include <iostream>

using namespace std;

int divisionPorRestas(int numero, int divisor) {
    int cociente = 0;
    
    while (numero >= divisor) {
        numero -= divisor;
        cociente++;
    }
    
    return cociente;
}

int multiplicacionPorSumas(int numero1, int numero2) {
    int resultado = 0;
    
    for (int i = 0; i < numero2; i++) {
        resultado += numero1;
    }
    
    return resultado;
}

int factorial(int numero) {
    if (numero == 0) {
        return 1;
    } else {
        return numero * factorial(numero - 1);
    }
}

int main() {
    int opcion;
    cout << "Que quieres hacer?" << endl;
    cout << "1) Dividir" << endl;
    cout << "2) Multiplicar" << endl;
    cout << "3) Calcular el factorial de un numero" << endl;
    
    cin >> opcion;
    
    if (opcion == 1) {
        int dividendo, divisor;
        cout << "Ingresa el dividendo: ";
        cin >> dividendo;
        cout << "Ingresa el divisor: ";
        cin >> divisor;
        
        int cociente = divisionPorRestas(dividendo, divisor);
        int residuo = dividendo - cociente * divisor;
        
        cout << "Cociente: " << cociente << endl;
        cout << "Residuo: " << residuo << endl;
    } else if (opcion == 2) {
        int numero1, numero2;
        cout << "Ingresa el primer número: ";
        cin >> numero1;
        cout << "Ingresa el segundo número: ";
        cin >> numero2;
        
        int resultado = multiplicacionPorSumas(numero1, numero2);
        
        cout << "El resultado de " << numero1 << " x " << numero2 << " es: " << resultado << endl;
    } else if (opcion == 3) {
        int numero;
        cout << "Ingresa un número para calcular su factorial: ";
        cin >> numero;
        
        int resultado = factorial(numero);
        
        cout << "El factorial de " << numero << " es: " << resultado << endl;
    } else {
        cout << "Opción incorrecta" << endl;
    }
    
    return 0;
}
