package secao5;

public class Switch {
  public static void main(String[] args) {
    
    // 11 - Switch case e break

    // para validar dia da semana baseado no número
    // 1 = Domingo
    // 7 = Sábado
    int diaDaSemana = 4;

    switch (diaDaSemana) {
      case 1:
        System.out.println("Domingo");
        break;
        case 2:
        System.out.println("Segunda-Feira");
        break;
        case 3:
        System.out.println("Terça-Feira");
        break;
        case 4:
        System.out.println("Quarta-Feira");
        break;
    }

    // 12 - Default

    // Default é o else do Switch

    int n = 10;
    switch (n) {
      case 1:
        System.out.println("É 1");
        break;
      case 2:
        System.out.println("É 2");
        break;
    
      default:
        System.out.println("Número não encontrado");
        break;
    }

    // 13 - Switch sem break

    switch (1) {
      case 1:
        System.out.println("Excutou 1");
      case 2:
        System.out.println("Excutou 2");
      case 3:
        System.out.println("Excutou 3");
      
    
      default:
        System.out.println("Excutou 4");
    }
  }
}
