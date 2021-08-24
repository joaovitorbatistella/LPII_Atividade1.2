package AttAula12;

import java.util.ArrayList;

public class Descontador {
    Pedido pedido;
    double valorDescontado;

    public Descontador(Pedido pedido) {
        ArrayList<ItensProduto> ip = pedido.lista;
        HorarioCompra horario = pedido.horaCompra;
        for(int i = 0; i < ip.size(); i++) {
            if (pedido.lista.get(i).getSetor() == "Fruteira" && horario.getHora() >= 20  && horario.getMinuto() > 00) {
                ip.get(i).setPercentualDesconto(10);
            } else if(pedido.lista.get(i).getSetor() == "Açougue" && (horario.getDia() == "Segunda" || horario.getDia() == "segunda")){
                ip.get(i).setPercentualDesconto(15);
            } else if (pedido.lista.get(i).getQuantidade() > 10 && pedido.lista.get(i).getSetor() == "Bebidas") {
                ip.get(i).setPercentualDesconto(20);
            }
        }
        //this.aplicaDescontos(pedido.horaCompra, pedido.lista);
    }

    /*public void aplicaDescontos(HorarioCompra horario, ArrayList<ItensProduto> ip) {
        for(int i = 0; i < ip.size(); i++) {
            if (pedido.lista.get(i).getSetor() == "Fruteira" && horario.getHora() >= 20  && horario.getMinuto() > 00) {
                ip.get(i).setPercentualDesconto(10);
            } else if(pedido.lista.get(i).getSetor() == "Açougue" && (horario.getDia() == "Segunda" || horario.getDia() == "segunda")){
                ip.get(i).setPercentualDesconto(15);
            } else if (pedido.lista.get(i).getQuantidade() > 10 && pedido.lista.get(i).getSetor() == "Bebidas") {
                ip.get(i).setPercentualDesconto(20);
            }
        }
    }*/


}
