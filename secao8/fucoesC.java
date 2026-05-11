package secao8;

public class fucoesC {
  public static void main(String[] args) {
    // 12 - Função recursiva
    int soma = somaRecursiva(6);
    // 6 + 5 + 4 + 3 + 2 + 1 = 21
    System.out.println(soma);
  }

  public static int somaRecursiva(int n) {
    if(n == 1) {
      return 1;
    } else {
      return n + somaRecursiva(n - 1);
    }
  }
}
