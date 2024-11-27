public class UsuarioEstudante extends Usuario {
  private String carteiraEstudante;

  @Override
  public boolean validarUsuario() {
      // Lógica para validar o estudante
      return true;
  }

  public Pagamento aplicarDesconto(Pagamento pagamento) {
      pagamento.setComprovante("Desconto aplicado: Estudante");
      return pagamento;
  }
}
