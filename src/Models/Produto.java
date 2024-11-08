package Models;

public class Produto {
    private String titulo;
    private String material;
    private double preco;
    private String tempoDeUso;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTempoDeUso() {
        return tempoDeUso;
    }

    public void setTempoDeUso(String tempoDeUso) {
        this.tempoDeUso = tempoDeUso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void informacoesProduto() {

    }
}
