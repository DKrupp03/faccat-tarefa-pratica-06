public abstract class Transporte {
  protected String tipo;
  protected int capacidade;
  protected int numeroVeiculo;
  protected int status;

  public final void iniciarTransporte() {
      prepararVeiculo();
      iniciar();
      verificarCondicoes();
  }

  protected abstract void prepararVeiculo();
  protected abstract void iniciar();
  protected abstract void verificarCondicoes();
}
