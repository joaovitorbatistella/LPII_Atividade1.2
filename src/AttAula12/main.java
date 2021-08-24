package AttAula12;

public class main {
    public static void main(String[] args) {
        ItensProduto produto1 = new ItensProduto();
        ItensProduto produto2 = new ItensProduto();
        ItensProduto produto3 = new ItensProduto();

        produto1.setCodigo(1);
        produto1.setDescricao("Abacate");
        produto1.setSetor("Fruteira");
        produto1.setQuantidade(6);
        produto1.setValorUnitario(2.50);

        produto2.setCodigo(2);
        produto2.setDescricao("Coca-cola");
        produto2.setSetor("Bebidas");
        produto2.setQuantidade(10);
        produto2.setValorUnitario(8.50);

        produto3.setCodigo(3);
        produto3.setDescricao("Carne bovina");
        produto3.setSetor("Açougue");
        produto3.setQuantidade(20);
        produto3.setValorUnitario(8.00);

        HorarioCompra horario1 = new HorarioCompra();

        horario1.setHora(20);
        horario1.setMinuto(01);
        horario1.setDia("segunda");
        Pedido pedido1 = new Pedido();
        pedido1.setProdutoPedido(produto1, horario1);
        pedido1.setProdutoPedido(produto2, horario1);
        pedido1.setProdutoPedido(produto3, horario1);
        new Descontador(pedido1);

        pedido1.imprimirNota();
    }
}