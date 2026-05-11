package secao8;

public class funcoes {
  public static void main(String[] args) {
    // 1 - Criando a primeira função
    // tanto funções como variáveis, a gente nomeia
    saudacao();
    saudacao();
    saudacao();

    // 2 - parâmetros
    soma(2, 4);

    saudar("Jorge");

    // 3 - Return
    dobrar(4);// ultiliza o parâmetro 4 mais depois aqui embaixo mas usa mais vai usar o parametro 10
    int numero = 10;
    int numeroDobrado = dobrar(numero); //aqui, ele usa como parametro o 10
    System.out.println("O número dobrado é: "+ numeroDobrado);

    // 4 - Retorno em váriavel
    String r1 = verificarPar(numero);
    String r2 = verificarPar(3);
    System.out.println(r1);
    System.out.println(r2);
  }

  // NÍVEL DE ACESSO, STATIC => não precisa instanciar classe para execultar, TIPO DE RETORNO
  //NOME, OS PARENTESES (ARGS), BLOCO{}
  public static void saudacao() {
    System.out.println("Olá, esta é a minha primeira função");
  }

  public static void soma(int a, int b) {
    int resultado = a + b;
    System.out.println("resultado da soma é: " + resultado);
  }

  public static void saudar(String nome) {
    System.out.println("Olá, " + nome + ", tudo bem?");
  }

  //Parametros de funções diferentes, podem ter o mesmo nome
  public static int dobrar(int n) {
    return n*2;
  }

  public static String verificarPar(int n) {
    if(n % 2 == 0) {
      return "O número " + n + " é par";
    } else {
      return "O número " + n + " não é par!";
    }

  }
}
