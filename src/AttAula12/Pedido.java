package AttAula12;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Pedido {
    ArrayList<ItensProduto> lista = new ArrayList<ItensProduto>();
    HorarioCompra horaCompra = new HorarioCompra();
    double valorFinal;

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public void setProdutoPedido(ItensProduto produto, HorarioCompra hora) {
        this.lista.add(produto);
        this.horaCompra = hora;
    }

    public double calculaPrecoFinal() {
        for(int i = 0; i < this.lista.size(); i++) {
            double desconto = 0;
            if (this.lista.get(i).getPercentualDesconto() > 0){
                desconto = (this.lista.get(i).getValorUnitario() * ((this.lista.get(i).getPercentualDesconto() + 100) / 100)) - this.lista.get(i).getValorUnitario();
                this.valorFinal += (this.lista.get(i).getValorUnitario() - desconto) * this.lista.get(i).quantidade;
                desconto = 0;
            } else {
                this.valorFinal += this.lista.get(i).getValorUnitario()  * this.lista.get(i).quantidade;
            }

        }
        return this.valorFinal;
    }

    public double getValorDescontado() {
        double desconto = 0;
        for(int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getPercentualDesconto() > 0){
                desconto += (this.lista.get(i).getValorUnitario() * ((this.lista.get(i).getPercentualDesconto() + 100) / 100)) - this.lista.get(i).getValorUnitario();
            }
        }
        return desconto;
    }

    public void  imprimirNota() {
        System.out.println("Valor Total R$ " + df2.format(this.calculaPrecoFinal()));
        System.out.println("Valor Descontado R$ " + df2.format(this.getValorDescontado()));
    }
}
