package secao5;

public class CondicionaisDois {
  public static void main(String[] args) {
    // 1 - Condicionais ternária
    int numero = 10;

    String resultado = (numero % 2 == 0) ? "Par" : "ímpar";

    System.out.println(resultado);

    // CONDICAO X > 5 EXPRESSAO SE É TRUE "OK" : EXPRESSAO SE É FALSE "NÃO OK"

    // 2 - if encadeado
    int idade = 25;
    boolean temCarteira = false;

    if (idade >= 18) {
      if (temCarteira) {
        System.out.println("Pode dirigir!");
      } else {
        System.out.println("Precisa ter Habilitação para dirigir!");
      }
    } else {
      System.out.println("Você não pode dirigir ainda!");
    }

    // 3 - Precedencia
    boolean a = true;
    boolean b = false;
    boolean c = true;

    // TRUE AND FALSE ->
    boolean resultado2 = a && b || c;

    System.out.println(resultado2);

    // TRUE OU FALSE -> TRUE AND TRUE -> TRUE
    boolean resultado3 = a || b && c;

    System.out.println(resultado3);

    boolean resultado4 = !(a || b) && c;

    // NOT (TRUE OU FALSE) => NOT(TRUE) => FALSE AND TRUE => FALSE
    System.out.println(resultado4);

    boolean resultado5 = (!a || b) && c;
    
    // (NOT TRUE OR FALSE) AND TRUE
    // (FALSE OR FALSE) AND TRUE 
    // FALSE AND TRUE
    // FALSE
    System.out.println(resultado5);
} 
}
