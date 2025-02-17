
// Escriba un programa Java para crear un método que tome un número entero como parámetro
// y produzca una excepción si el número es impar.


import java.util.InputMismatchException;
import java.util.Scanner;

public class numerosimparesypares {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su numero: ");
        int numero1 = scanner.nextInt();

        try {
        comprobar(numero1);
        System.out.println("el numero es par y es: " +  numero1);
            
                       
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
           
    }
    

    public static void comprobar (int numero1) throws Exception {

        if (numero1 % 2 != 0) {
            throw new InputMismatchException("El numero es impar y es: " + numero1);
        }
    }
            
            
}
