public class TransporteTrem extends Transporte {
  private int numeroVagoes;

  @Override
  protected void prepararVeiculo() {
      System.out.println("Preparando trem...");
  }

  @Override
  protected void iniciar() {
      System.out.println("Trem iniciado.");
  }

  @Override
  protected void verificarCondicoes() {
      System.out.println("Verificando condições do trem...");
  }
}
