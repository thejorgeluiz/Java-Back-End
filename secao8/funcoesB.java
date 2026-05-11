package secao8;

public class funcoesB {
  // escopo global
  static int globalVar = 5;
  public static void main(String[] args) {
    // 5 - funções com condicionais
    String r2 = verificarAcesso(50, false, true);
    String r1 = verificarAcesso(19, false, false);
    System.out.println(r1);
    System.out.println(r2);

    // 6 - Funções com Switch
    System.out.println(obterDiaDaSemana(5));
    
    // 7 - System exist
    verificarAutentificacao("admin", "SenhaSegura");
    System.out.println("Oi!!!");

    // 8 - Documentação função
    System.out.println(calcularMedia(5, 6, 7));

    // 9 - escopos

    // escopo local
    int localVar = 10;
    if (true) {
      System.out.println(localVar);      
    }
    System.out.println(globalVar);

    escopoLocal();

  }
  public static String verificarAcesso(
    int idade, 
    boolean temCarteira, 
    boolean temHistoricoNegativo) {
      if(idade >= 18 && temCarteira && !temHistoricoNegativo) {
        return "Acesso permitido: todos os critérios atendidos!";
      } else if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
        return "Acesso negado: Histórico negativo detectado!";
      } else {
        return "Acesso negado: Critérios não atendidos!";
      }
    }
    public static String obterDiaDaSemana(int dia) {
      switch (dia) {
          case 1:
            return "Segunda-feira";
          case 2:
            return "Terça-feira";
          case 3:
            return "Quarta-feira";
          case 4:
            return "Quinta-feira";
          case 5:
            return "Sexta-feira";
          case 6:
            return "Sabádo";
          case 7:
            return "Domingo";
        default:
            return "Dia inválido";
      }
    }

    public static void verificarAutentificacao(String usuario, String senha) {
      if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
        System.out.println("Autenticação falhou");
        System.exit(1);
      }
      System.out.println("Autenticação bem sucedida");
    }

    /**
     * calcula a média de três Números inteiros
     * @param num1 o primeiro número/nota a ser enviado
     * @param num2 o segundo número/nota a ser enviado
     * @param num3 o terceiro número/nota a ser enviado
     * @return A média dos três números
     */
    public static double calcularMedia (int num1, int num2, int num3) {
      return(num1 + num2 + num3) / 3;
    }

    public static void escopoLocal() {
      System.out.println(globalVar);
    }
}