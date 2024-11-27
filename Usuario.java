public abstract class Usuario {
  protected String nome;
  protected String cpf;
  protected String email;
  protected String senha;
  protected String telefone;
  protected String dataNascimento;

  public abstract boolean validarUsuario();
}
