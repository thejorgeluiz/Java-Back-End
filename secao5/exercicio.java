package secao5;
import java.util.Scanner;

public class exercicio {
  public static void main(String[] args) {

    // Exercício 1: Verificação de Categoria de preço

    /*double preco = 101;

    if (preco < 50) {
      System.out.println("Barato!");
    } else if (preco < 100) {
      System.out.println("Médio");
    } else {
      System.out.println("Tá caro!!!");
    } */

    // usando o scanner 
    Scanner scanner = new Scanner(System.in);

    /*System.out.println("Digite o Preço do Produto: ");

    double preco1 = scanner.nextDouble();

    if (preco1 < 50) {
      System.out.println("Categoria: Barato");
    } else if (preco1 >= 50 && preco1 <= 100) {
      System.out.println("Categoria: Média");
    } else { 
      System.out.println("categoria: caro");
    }




    // Exercício 2: Validação de Login
    /*
    String nome = "admin";
    String senha = "1234";

    if (nome == "admin" && senha == "1234"  ) {
      System.out.println("Acesso permitido");
    }else { 
      System.out.println("Acesso Negado!");
    } 
    */

     // com Scanner

     /*  System.out.println("Digite o nome do usuário: ");
      String usuario = scanner.next();

      System.out.println("Digite a senha do usuário: ");
      String usenha1 = scanner.next();*/

      // String => equals 
      /*if (usuario.equals("admin") && usenha1.equals("1234")) {
        System.out.println("Acesso permitido.");
      } else {
        System.out.println("Acesso negado");
      } */

        //Exercício 3
        /*System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // 12 / 2 = 6 -> resto 0;
        // 13 / 2 = 6 -> resto 1;

        String resultado = "";
        if (numero % 2 == 0) {
            resultado = "Par";          
        } else {
          resultado = "Impar";
        }
        System.out.println("O número é: " + resultado);*/

        // Exercício 4
        /*System.out.println("Insira um número de 1 a 7 (referente ao dia da semana)");
        int dia =scanner.nextInt();

        switch (dia) {
          case 1:
          case 7:
            System.out.println("final de semana");
            break;
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.println("Dia de semana");
            break;
          default:
            System.out.println("Número inválido!");
            break;
          }*/

            // Exercício 5
            /*System.out.println("Insira um número:");
            int n = scanner.nextInt();

            if (n >= 10 && n <= 20) {
              System.out.println("Dentro do Intervalo.");
            } else {
              System.out.println("Fora do Intervalo");
            }*/

              // Exercício 6
              System.out.println("Insira um letra:");
              String letra = scanner.next();

              switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                  System.out.println("Vogal");
                  break;
              
                default:
                  System.out.println("Consoante");
                  break;
              }


    scanner.close();
  }
}
