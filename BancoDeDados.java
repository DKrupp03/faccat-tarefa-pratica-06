
// Padrão Singleton aplicado para garantir que a classe BancoDeDados tenha apenas uma instância.
public class BancoDeDados {
  private static BancoDeDados instancia;
  private String usuario;
  private String senha;

  // Construtor privado para impedir a criação de instâncias fora da classe.
  private BancoDeDados() {}

  // Método estático para obter a instância única da classe.
  public static BancoDeDados getInstancia() {
      if (instancia == null) {
          instancia = new BancoDeDados();
      }
      return instancia;
  }

  public boolean criarRegistro() {
      return true;
  }

  public boolean atualizaRegistro() {
      return true;
  }
}

