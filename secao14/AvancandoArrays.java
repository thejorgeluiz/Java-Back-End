package secao14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class AvancandoArrays {
  public static void main(String[] args) {
    // 1 - ordenação

    // Ordenação array de inteiros
    int[] numbers = {5, 6, 1, 4, 2, 22, 1};

    // Modifica o array original
    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    // Ordenação com comparator
    String[] names = {"João", "Bob", "Pedro", "Marco"};
    Arrays.sort(names, Comparator.reverseOrder());
    System.out.println(Arrays.toString(names));

    // Ordenação de matriz 
    int[][] matriz = {
      {4, 5, 1},
      {3, 8 ,9},
      {2, 3, 1}
    };

    //Ordenação de linhas, por um valor de coluna 
    Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

    for(int[] linha : matriz) {
      System.out.println(Arrays.toString(linha));
    }
    //Imprimir matriz, sem foreach
    System.out.println(Arrays.deepToString(matriz));

    // 2 - Manipulação avançada

    //copia
    int[] original = {1, 2, 2, 3};
    int[] copia = Arrays.copyOf(original, 0);
    System.out.println(Arrays.toString(copia));

    //fill - preenchimento
    int[] numeros = new int[5];
    System.out.println(Arrays.toString(numeros));
    Arrays.fill(numeros, 5);
    System.out.println(Arrays.toString(numeros));

    //transformação de arrays para stream
    int[] values = {1, 2, 3, 4, 5};

    // fazer uma soma dos els 

    int sum = Arrays.stream(values).sum();
    System.out.println(sum);

    // Arrays dinâmicos 
    ArrayList<String> frutas = new ArrayList<>();
    System.out.println(frutas);

    frutas.add("Maçã");
    frutas.add("Banana");
    System.out.println(frutas);
    for(String fruta : frutas) {
      System.out.println(fruta);
    }
    frutas.remove("Banana");
    System.out.println(frutas);
  }
}
