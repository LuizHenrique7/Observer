import java.util.Observable;

public class Loja extends Observable {

    private Integer preco;
    private Integer numeroEstoque;
    private String nomeProduto;
    private String nomeLoja;

    public Loja(Integer preco, Integer numeroEstoque, String nomeProduto, String nomeLoja) {
        this.preco = preco;
        this.numeroEstoque = numeroEstoque;
        this.nomeProduto = nomeProduto;
        this.nomeLoja = nomeLoja;
    }

    public void cadastrarProduto() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Loja{" +
                "preco=" + preco +
                ", numeroEstoque=" + numeroEstoque +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", nomeLoja='" + nomeLoja + '\'' +
                '}';
    }
}
