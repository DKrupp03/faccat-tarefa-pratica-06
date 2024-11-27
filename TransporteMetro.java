public class TransporteMetro extends Transporte {
  private int numeroLinha;

  @Override
  protected void prepararVeiculo() {
      System.out.println("Preparando metrô...");
  }

  @Override
  protected void iniciar() {
      System.out.println("Metrô iniciado.");
  }

  @Override
  protected void verificarCondicoes() {
      System.out.println("Verificando condições do metrô...");
  }
}
