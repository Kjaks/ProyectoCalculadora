import java.util.Scanner;
    
public class pruebaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora(num1, num2);
        int resultado = calculadora.realizarOperacion("suma");
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
