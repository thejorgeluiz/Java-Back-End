import java.util.Scanner;

public class Exercise {
        int idade = 25;
        String nome = "João";
        boolean isEstudante = true;
        double altura = 1.75;
        public static void main(String[] args) {

          func("meu nome");
        }

        public static void func(String a) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Digite o seu nome");
          String nome = scanner.nextLine();
          System.out.println("Olá " + nome + "!");
          System.out.println("Jorge = "+ a);
          scanner.close();
        }
}