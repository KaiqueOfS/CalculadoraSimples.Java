import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = switch (operacao) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 != 0) ? num1 / num2 : Double.NaN;
            default -> Double.NaN;
        };

        if (Double.isNaN(resultado)) {
            System.out.println("Operação inválida ou divisão por zero.");
        } else {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
