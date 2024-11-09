package Models;

import Calculos.Informacoes;
import Calculos.Pagavel;

public class Roupa extends Produto implements Pagavel, Informacoes {
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void descontoPagamento(String tipoPagamento) {
        double preco = this.getPreco();

        if (tipoPagamento.equalsIgnoreCase("pix") || tipoPagamento.equalsIgnoreCase("dinheiro")) {
            double desconto = preco * 0.1;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (tipoPagamento.equalsIgnoreCase("débito")) {
            double desconto = preco * 0.05;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (tipoPagamento.equalsIgnoreCase("crédito")) {
            System.out.printf("Valor com desconto: R$%.2f",preco);
        } else {
            System.out.println("Forma de pagamento inválida");
        }
    }


    @Override
    public void informacoesProduto() {
        System.out.println("\n\nProduto: " + getTitulo());
        System.out.println("Material: " + getMaterial());
        System.out.println("Tamanho: " + getTamanho() + " meses");
        System.out.println("Tempo de uso: " + getTempoDeUso() + " meses");
        System.out.println("Descrição: " + getDescricao());
        System.out.printf("Preço: R$%.2f\n",getPreco());
    }
}
