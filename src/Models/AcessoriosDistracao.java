package Models;

import Calculos.Informacoes;

public class AcessoriosDistracao extends Roupa implements Informacoes {
    private String cuidados;

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    @Override
    public void descontoPagamento(String tipoPagamento) {
        double preco = this.getPreco();

        if (tipoPagamento.equalsIgnoreCase("pix") || tipoPagamento.equalsIgnoreCase("dinheiro")) {
            double desconto = preco * 0.08;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (!tipoPagamento.equalsIgnoreCase("crédito") && !tipoPagamento.equalsIgnoreCase("débito")){
            System.out.println("Forma de pagamento inválida");
        } else {
            System.out.printf("Valor com desconto: R$%.2f",getPreco());
        }
    }

    @Override
    public void informacoesProduto() {
        System.out.println("\n\nProduto: " + getTitulo());
        System.out.println("Material: " + getMaterial());
        System.out.println("Cuidados: " + getCuidados());
        System.out.println("Tempo de uso: " + getTempoDeUso());
        System.out.println("Descrição: " + getDescricao());
        System.out.printf("Preço: R$%.2f\n",getPreco());
    }
}
