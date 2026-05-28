package secao12;
import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Resgatando Operação
    System.out.println("Digite o primeiro número: ");

    double num1 = scanner.nextDouble();

    System.out.println("Digite o segundo número: ");

    double num2 = scanner.nextDouble();
    // Resgatando Operação
    System.out.println("Escolha a operação: ");
    System.out.println("1) Adição (+) ");
    System.out.println("2) Subtração (-) ");
    System.out.println("3) Multiplição (*) ");
    System.out.println("4) Divisão (/) ");

    int operaçao = scanner.nextInt();
   // System.out.println(num1);
   // System.out.println(num2);
     //System.out.println(operaçao);

    // realizando cálculo
    double resultado = 0;

    switch (operaçao) {
      case 1:
        resultado = adicionar(num1, num2);
        break;
      case 2:
        resultado = subtrair(num1, num2);
        break;
      case 3:
        resultado = multiplicar(num1, num2);
        break;
      case 4:
        if (num2 != 0) {
          resultado = dividir(num1, num2);
        } else {
          System.out.println("Divisão por zero não permitida!");
          scanner.close();
          return;
        }
        break;
    
      default:
        System.out.println(" Operação inválida!");
        scanner.close();
        return;
    }

    // Exibição do resultado
    System.out.println("O resultado da operação é: " + resultado);


    // Fechando scanner
    scanner.close();
  }

  // Funçoes para cálculos

  public static double adicionar(double a, double b) {
    return a + b;
  }

  public static double subtrair(double a, double b) {
    return a - b;
  }

  public static double multiplicar(double a, double b) {
    return a * b;
  }

  public static double dividir(double a, double b) {
    return a / b;
  }
}
