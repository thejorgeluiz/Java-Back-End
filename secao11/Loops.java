package secao11;

public class Loops {
  public static void main(String[] args) {
    // 1 - for
    // loop que vai rodar de 1 a 5

    //Variável de inicilização = i, j, k
    //Condição -> determina até quando ou quantas vezes, o loop vai rodar
    //Incremento -> a variável vai chegar na condição
    for(int i = 1; i <= 5; i++) {
      //repetir
      System.out.println("Contador: "+ i);
    }

    //Mostrar cada caractere de uma string
    String palavra = "Java";
    
    //length em string da o número de letras
    //arrays e strings a primeira posição é o 0
    //J -> 0, a -> 3
    for(int i = 0; i < palavra.length(); i++) {
      //palavra.charAt(0) => palavra.charAt(1)...
      //i < 4
      System.out.println("Caractere: " + palavra.charAt(i));
    }

    //contagem regressiva
    for(int i = 5; i > 0; i--) {
      System.out.println("contador: " + i);
    }
    // 2 - While
    int i = 0;

    while (i <= 5) {
      System.out.println("while contador: " + i);
      i++;
    }

    int valor = 0;

    while(valor != 7) {
      // .111 => 1
      valor = (int)(Math.random() * 100);

      System.out.println("valor aleatorio: " + valor);
    }

    // 4 - do while
    int j = 10;

    do {
        System.out.println("O valor de j é: " + j);
        j--;
    } while (j > 0);

    // 5 - break
    // break pode ser utilizado com qualquer estrutura de loop
    for(int x = 0; x <= 10; x++) {
      System.out.println("O valor de x é: " + x);
      if (x==5) {
        System.out.println("Parando o loop!");
        break;
      }
    }

    // 6 - continue

    for(int x = 10; x > 0; x--) {
      if (x % 2 == 0) {
        System.out.println("par");
        continue;
      }
      //quando ele pula, isso daqui não executa
      System.out.println("Contando: " + x);
    }

    // 7 - nested loops
    for(int m = 1; m <= 3; m++) {
      System.out.println("EXTERNO!");
      for(int n = 1; n <= 3; n++) {
        System.out.println(m + " X " + n + " = " + (m*n));
      }
    }

  }
}
