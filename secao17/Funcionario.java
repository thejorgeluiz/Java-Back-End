package secao17;

public class Funcionario {
  public String nome;
  protected double salario;
  private String senha;

  public Funcionario(String nome, double salario, String senha) {
    this.nome = nome;
    this.salario = salario;
    this.senha  = senha;
  }

  public void exibirDados() {
    System.out.println("Nome: " + nome + ", salário: " + salario + ", senha: " + senha);
  }

  protected void aumentarSalario(double porcentagem) {
    this.salario +=((this.salario*porcentagem)/100);
    System.out.println("Salário agora é de: " + salario);
  }

  private boolean verificarSenha(String tentativaSennha) {
    return this.senha.equals(tentativaSennha);
  }

  public boolean autenticar(String tentativaSenha) {
    // outras lógicas
    return verificarSenha(tentativaSenha);
  }
}
