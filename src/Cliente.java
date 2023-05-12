import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Loja loja) {
        loja.addObserver(this);
    }

    public void update(Observable loja, Object arg1) {
        this.ultimaNotificacao = this.nome + ", produto disponível " + loja.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
