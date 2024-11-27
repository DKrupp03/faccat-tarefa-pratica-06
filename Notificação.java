
// Padrão Observer aplicado para notificar operadores sobre eventos.
public interface NotificacaoObservador {
    // Método para atualizar o observador com uma mensagem.
    void atualizar(String mensagem);
}

// Implementação do observador que reage às notificações.
public class Operador implements NotificacaoObservador {
    private String nome;

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Operador " + nome + " notificado: " + mensagem);
    }
}

// Classe Notificacao que mantém uma lista de observadores e os notifica.
public class Notificacao {
    private List<NotificacaoObservador> observadores = new ArrayList<>();

    public void adicionarObservador(NotificacaoObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(NotificacaoObservador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (NotificacaoObservador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}

