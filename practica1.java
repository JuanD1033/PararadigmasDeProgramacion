import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1) Dividir");
        System.out.println("2) Multiplicar");
        System.out.println("3) Calcular el factorial de un número");
        
        int opcion = input.nextInt();
        
        if (opcion == 1) {
            System.out.print("Ingresa el dividendo: ");
            int dividendo = input.nextInt();
            System.out.print("Ingresa el divisor: ");
            int divisor = input.nextInt();
            
            int[] resultado = divisionPorRestas(dividendo, divisor);
            System.out.println("Cociente: " + resultado[0]);
            System.out.println("Residuo: " + resultado[1]);
        } else if (opcion == 2) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = input.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numero2 = input.nextInt();
            
            int resultado = multiplicacionPorSumas(numero1, numero2);
            System.out.println("El resultado de " + numero1 + " x " + numero2 + " es: " + resultado);
        } else if (opcion == 3) {
            System.out.print("Ingresa un número para calcular su factorial: ");
            int numero = input.nextInt();
            
            int resultado = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        } else {
            System.out.println("Opción incorrecta");
        }
        
        input.close();
    }
    
    public static int[] divisionPorRestas(int numero, int divisor) {
        int cociente = 0;
        
        while (numero >= divisor) {
            numero -= divisor;
            cociente++;
        }
        
        int[] resultado = {cociente, numero};
        return resultado;
    }
    
    public static int multiplicacionPorSumas(int numero1, int numero2) {
        int resultado = 0;
        
        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }
        
        return resultado;
    }
    
    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}