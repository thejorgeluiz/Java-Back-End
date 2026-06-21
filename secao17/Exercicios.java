package secao17;

public class Exercicios {
  public static void main(String[] args) {

    //exercicio 1
    Celular iphone = new Celular();
    iphone.marca = "Apple";
    iphone.modelo = "Iphone 15";

    iphone.ligar();
    iphone.desligar();
    iphone.usar(10);

    Celular s10 = new Celular();

    iphone.marca = "Samsung";
    iphone.modelo = "S10";

    s10.usar(15);

    // Exercicio 2
    Aluno pedro = new Aluno("Pedro", 123,33.3);
    System.out.println(pedro.getNome());
    System.out.println(pedro.getNotaFinal());
    pedro.setNome("PedroAlves");
    pedro.setNotaFinal(50.0);
    pedro.exibirInfo();

    // exercicío 4
    ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 400, 12);
    microondas.aplicarDesconto(15);

    microondas.exibirInfo();

    // exercicio 5
    LivroBiblioteca livro1 = new LivroBiblioteca();
    livro1.setTitulo("Java: como programar");
    livro1.devolver();
    livro1.pegarEmprestado();
    livro1.pegarEmprestado();
    livro1.devolver();
  }
  
}
