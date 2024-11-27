public class Pagamento {
  private String tipo;
  private String comprovante;

  public Pagamento validarPagamento() {
      // Lógica para validar pagamento
      return new Pagamento();
  }

  public boolean realizarReembolso() {
      // Lógica para reembolso
      return true;
  }

  public void setComprovante(String comprovante) {
      this.comprovante = comprovante;
  }
}
