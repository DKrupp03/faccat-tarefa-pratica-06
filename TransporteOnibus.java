public class TransporteOnibus extends Transporte {
  private String placa;

  @Override
  protected void prepararVeiculo() {
      System.out.println("Preparando ônibus...");
  }

  @Override
  protected void iniciar() {
      System.out.println("Ônibus iniciado.");
  }

  @Override
  protected void verificarCondicoes() {
      System.out.println("Verificando condições do ônibus...");
  }
}
