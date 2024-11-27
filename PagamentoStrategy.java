
// Padrão Strategy aplicado para permitir diferentes formas de pagamento.
public interface PagamentoStrategy {
  // Método que deve ser implementado por diferentes estratégias de pagamento.
  void processarPagamento();
}

// Implementação de uma estratégia de pagamento com cartão.
public class PagamentoCartao implements PagamentoStrategy {
  @Override
  public void processarPagamento() {
      System.out.println("Pagamento realizado com cartão.");
  }
}

// Implementação de uma estratégia de pagamento em dinheiro.
public class PagamentoDinheiro implements PagamentoStrategy {
  @Override
  public void processarPagamento() {
      System.out.println("Pagamento realizado em dinheiro.");
  }
}

