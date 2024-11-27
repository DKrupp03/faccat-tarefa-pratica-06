
// Padrão Facade aplicado para simplificar a interação com o sistema de transporte.
public class SistemaTransporteFacade {
  private BancoDeDados bancoDeDados;
  private Sessao sessao;
  private Pagamento pagamento;

  // Construtor que inicializa os subsistemas necessários.
  public SistemaTransporteFacade() {
      bancoDeDados = BancoDeDados.getInstancia();
      sessao = Sessao.getInstancia();
      pagamento = new Pagamento();
  }

  // Método para login de usuário, delegando a autenticação ao banco de dados.
  public boolean loginUsuario(String usuario, String senha) {
      return bancoDeDados.validarUsuario(usuario, senha);
  }

  // Método para processar pagamento, usando a estratégia de pagamento definida.
  public void processarPagamento(String tipoPagamento) {
      PagamentoStrategy estrategia;
      if ("cartao".equals(tipoPagamento)) {
          estrategia = new PagamentoCartao();
      } else {
          estrategia = new PagamentoDinheiro();
      }
      estrategia.processarPagamento();
  }
}

