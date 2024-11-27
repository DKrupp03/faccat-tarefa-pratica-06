
// Padrão Composto aplicado para organizar rotas e sub-rotas como uma estrutura hierárquica.
public class RotaComposta extends Rota {
  private List<Rota> subRotas = new ArrayList<>();

  // Método para adicionar uma sub-rota à rota composta.
  public void adicionarSubRota(Rota rota) {
      subRotas.add(rota);
  }

  // Método para remover uma sub-rota da rota composta.
  public void removerSubRota(Rota rota) {
      subRotas.remove(rota);
  }

  // Método para obter as sub-rotas associadas.
  public List<Rota> getSubRotas() {
      return subRotas;
  }
}

