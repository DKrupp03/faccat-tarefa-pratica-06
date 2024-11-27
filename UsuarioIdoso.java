public class UsuarioIdoso extends Usuario {
  private String idade;

  @Override
  public boolean validarUsuario() {
      // Lógica para validar idoso
      return true;
  }

  public Pagamento aplicarDesconto(Pagamento pagamento) {
      pagamento.setComprovante("Desconto aplicado: Idoso");
      return pagamento;
  }
}
