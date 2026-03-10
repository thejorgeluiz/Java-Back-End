package secao2;

public class Variavel {
  public static void main(String[] args) {
    // 1 - o que são váriaveis
    // tipo -> nome -> atribuir um valor;
    String nome = "Jorge";
    

    //nome => "Jorge"
    System.out.println(nome);

    // 2 - Atribuição de Variável com outra
    String teste = "Teste";

    String testando = teste;

    System.out.println(testando);

    Long numeroGrande = 9999999999999L;

    //int numeroGrandeDois = numeroGrande;

    System.out.println(numeroGrande);

    // 3 - Coméntários
    //
    /* */
    /** */

    // 4 - String

    String firstName = "Jorge";
    String lastName = "Luiz";

    System.out.println(firstName +" " + lastName);

    // 5 - Char

    char letra = 'A';

    System.out.println(letra);

    String letra2 = "A";

    System.out.println(letra2);

    char simbolo = '$';

    System.out.println(simbolo);
    
    // 6 - int

    int n = 42;
    System.out.println(n);
    System.out.println(n + 5);
    System.out.println(n * 10);
    System.out.println(n / 5);
    int soma = n + 12;
    System.out.println(soma);

    // 7 - Long

    long populacaoMundial = 780000000000000L;

    System.out.println(populacaoMundial);

    long grandeNumero = 1_000_000L;

    System.out.println(grandeNumero + 1);

    // 8 - Double

    double preco = 19.99;

    System.out.println(preco);

    System.out.println(preco - 12);

    System.out.println(preco / 2);

    // 9 - OP. aritmeticos p1

    int soma2 = 12 + 5;

    System.out.println(soma2);

    System.out.println(22 + 4);

    System.out.println(10 - 5);

    System.out.println(10 * 5);

    System.out.println(10 / 2.5);

    System.out.println(10.0 / 2.5);
    // para ter um resultado quebrado (1.5), pelo menos 1 num da divisão tem que ser double

    System.out.println(10 / 3);

    System.out.println(10.0 / 3);


    // 10 - op. aritmeticos

    int x = 5;

    x++;
    x++;
    x++;
    x++;

    //Loops -> for, while

    System.out.println(x);

    int y  = 5;

    y--;
    System.out.println(y);

    int a = 10;

    a +=5;
    //a = a + 5;

    System.out.println(a);

    int b = 10;

    b-=5;

    System.out.println(b);

    b -= a;

    System.out.println(b);

    // 11 = type casting

    //implicito (widening)
    int numero2 = 42;

    long numeroLong = numero2;

    double numeroDouble = numero2;

    System.out.println(numeroLong);
    System.out.println(numeroDouble);

    //explicito (narrowing)

    double valorDouble = 9.78;

    int valorInt = (int) valorDouble;

    System.out.println(valorInt);

    // 12 - constantes

    final int DIAS_DA_SEMANA = 7;

    System.out.println("Dias da Semana: " + DIAS_DA_SEMANA);

    // 13 - var

    var z = 10;

    System.out.println(z);

    //z = "teste";
    z = 5;

    var texto2 = "teste";

    var doubleteste = 2.0;

    System.out.println(texto2);
    System.out.println(doubleteste);
  }
}
