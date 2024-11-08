import Models.AcessoriosAlimentacao;
import Models.AcessoriosConforto;
import Models.AcessoriosDistracao;
import Models.Roupa;

public class Main {
    public static void main(String[] args) {
        Roupa body = new Roupa();
        body.setTitulo("Body Rosa");
        body.setTamanho("6");
        body.setDescricao("Body rosa, sem mangas, gola U");
        body.setPreco(20);
        body.setTempoDeUso("8");
        body.setMaterial("Poliéster");
        body.informacoesProduto();
        body.descontoPagamento("PiX");

        Roupa conjuntoAzul = new Roupa();
        conjuntoAzul.setTitulo("Conjunto Azul");
        conjuntoAzul.setTamanho("11");
        conjuntoAzul.setDescricao("Blusa azul escuro, calça azul bebê, com mangas, gola V");
        conjuntoAzul.setPreco(35);
        conjuntoAzul.setTempoDeUso("3");
        conjuntoAzul.setMaterial("Algodão");
        conjuntoAzul.informacoesProduto();
        conjuntoAzul.descontoPagamento("Débito");

        AcessoriosConforto bercinho = new AcessoriosConforto();
        bercinho.setTitulo("Berço preto");
        bercinho.setAltura(80);
        bercinho.setLargura(70);
        bercinho.setProfundidade(120);
        bercinho.setMaterial("Aluminio");
        bercinho.setTamanho("Até 12");
        bercinho.setTempoDeUso("13");
        bercinho.setPreco(900);
        bercinho.setDescricao("Berço preto, estrutura em alumínio, balançável");
        bercinho.setPeso(2);
        bercinho.informacoesProduto();
        bercinho.descontoPagamento("Ticket Alimentação");

        AcessoriosAlimentacao mamadeira = new AcessoriosAlimentacao();
        mamadeira.setVolume(260);
        mamadeira.setMaterial("Polipropileno e Silicone Livre de BPA");
        mamadeira.setTitulo("Mamadeira philips avent");
        mamadeira.setTempoDeUso("3");
        mamadeira.setTamanho("3 meses");
        mamadeira.setDescricao("Mamadeira facil de limpar, formato ergonômico, sistema de circulação de ar");
        mamadeira.setPreco(35);
        mamadeira.informacoesProduto();
        mamadeira.descontoPagamento("créditO");

        AcessoriosDistracao chocalho = new AcessoriosDistracao();
        chocalho.setTitulo("Chocalho");
        chocalho.setCuidados("Próprio para morder");
        chocalho.setMaterial("Silicone Livre de BPA");
        chocalho.setTamanho("3 à 12");
        chocalho.setTempoDeUso("6");
        chocalho.setDescricao("");
        chocalho.setPreco(20);
        chocalho.informacoesProduto();
        chocalho.descontoPagamento("Dinheiro");
        
    }
}
