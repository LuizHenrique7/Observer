import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        Loja loja = new Loja(3000, 3, "Notebook", "A");
        Cliente cliente = new Cliente("Cliente 1");
        cliente.cadastrar(loja);
        loja.cadastrarProduto();
        assertEquals("Cliente 1, produto disponível Loja{preco=3000, numeroEstoque=3, nomeProduto='Notebook', nomeLoja='A'}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientess() {
        Loja loja = new Loja(3000, 3, "Notebook", "A");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.cadastrar(loja);
        cliente2.cadastrar(loja);
        loja.cadastrarProduto();
        assertEquals("Cliente 1, produto disponível Loja{preco=3000, numeroEstoque=3, nomeProduto='Notebook', nomeLoja='A'}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, produto disponível Loja{preco=3000, numeroEstoque=3, nomeProduto='Notebook', nomeLoja='A'}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Loja loja = new Loja(3000, 3, "Notebook", "A");
        Cliente cliente = new Cliente("Cliente 1");
        loja.cadastrarProduto();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteLojaA() {
        Loja lojaA = new Loja(3000, 3, "Notebook", "A");
        Loja lojaB = new Loja(3200, 3, "Notebook", "B");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.cadastrar(lojaA);
        cliente2.cadastrar(lojaB);
        lojaA.cadastrarProduto();
        assertEquals("Cliente 1, produto disponível Loja{preco=3000, numeroEstoque=3, nomeProduto='Notebook', nomeLoja='A'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}