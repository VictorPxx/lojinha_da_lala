package Models;

public class AcessoriosConforto extends Roupa{
    private double altura;
    private double largura;
    private double profundidade;
    private double peso;

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void descontoPagamento(String tipoPagamento) {
        double preco = this.getPreco();

        if (tipoPagamento.equalsIgnoreCase("pix") || tipoPagamento.equalsIgnoreCase("dinheiro")) {
            double desconto = preco * 0.06;
            System.out.printf("Valor com desconto: R$%.2f",preco - desconto);
        } else if (tipoPagamento.equalsIgnoreCase("débito")) {
            double desconto = preco * 0.03;
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
        System.out.printf("Medidas em centímetros: %.2fL x %.2fA x %.2fP \n",getLargura() , getAltura(), getProfundidade());
        System.out.printf("Peso: %.2fkg\n",getPeso());
        System.out.println("Tempo de uso: " + getTempoDeUso() + " meses");
        System.out.println("Descrição: " + getDescricao());
        System.out.printf("Preço: R$%.2f\n",getPreco());
    }
}
