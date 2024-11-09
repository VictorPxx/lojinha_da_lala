package Models;

import Calculos.Informacoes;

public class AcessoriosAlimentacao extends Roupa implements Informacoes {
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void descontoPagamento(String tipoPagamento) {
        double preco = this.getPreco();

        if (tipoPagamento.equalsIgnoreCase("pix") || tipoPagamento.equalsIgnoreCase("dinheiro")) {
            double desconto = preco * 0.15;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (tipoPagamento.equalsIgnoreCase("débito")) {
            double desconto = preco * 0.08;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (tipoPagamento.equalsIgnoreCase("crédito")) {
            double desconto = preco * 0.03;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else {
            System.out.println("Forma de pagamento inválida");
        }
    }

    @Override
    public void informacoesProduto() {
        System.out.println("\n\nProduto: " + getTitulo());
        System.out.println("Material: " + getMaterial());
        System.out.println("Volume: " + getVolume() + " ml");
        System.out.println("Tempo de uso: " + getTempoDeUso() + " meses");
        System.out.println("Descrição: " + getDescricao());
        System.out.printf("Preço: R$%.2f\n",getPreco());
    }
}
