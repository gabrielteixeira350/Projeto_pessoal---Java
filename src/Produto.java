public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private static int proximoId =1;
    private int id;

    public Produto(String nome, double preco, int quantidade){ // criamos este construtor, pois queremos que o construtor ja tenha seus valores, para que na classe main ao chamar o construtor o traga os seus valores. Não necessitando de getter e setter.

        this.id = proximoId;
        proximoId ++;

        this.nome =nome;

        if (preco >0){
            this.preco = preco;
            System.out.println("\nPreço válido");
        }else {
            this.preco = 0;
            System.out.println("\nPreço inválido");
        }

        if (quantidade>=0){
            this.quantidade = quantidade;
            System.out.println("\nQuantidade válida");
        }else{
            this.quantidade = 0;
            System.out.println("\nQuantidade inválida");
        }

        if (preco>0 && quantidade>=0){
            System.out.println("\nProduto criado com sucesso!");
        }
    }

    public void fichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço do Produto: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total do estoque: R$ " + valorTotalEstoque());
    }

    public void adicionarEstoque(int novaQuantidade){
        if (novaQuantidade < 0){
            System.out.println("Número Inválido");
        } else {
            this.quantidade += novaQuantidade;
            System.out.println("\nAdicionando Estoque!");
            System.out.println("Estoque Atual: " + quantidade);
        }
    }

    public void removerEstoque(int quantidadeRemover){
        if (quantidadeRemover < 0){
            System.out.println("Número Inválido");

            //invalido

        } else if (quantidadeRemover > quantidade) {
            System.out.println("Não foi possível remover, estoque insuficiente");

            //estoque insuficiente

        } else {
            this.quantidade -= quantidadeRemover;
            System.out.println("\nRemovendo do Estoque!");
            System.out.println("Estoque Atual: " + quantidade);
            System.out.println("Valor do estoque atualizado: R$" + valorTotalEstoque());
            //pode remover
        }
    }
    public double valorTotalEstoque() {
        return preco*quantidade;
    }

    public void vender(int vendidos){
        if (vendidos > quantidade) {
            System.out.println("Estoque insuficiente");

        } else if (vendidos <= 0) {
            System.out.println("\nNão foi possível vender");
        } else {
            this.quantidade -= vendidos;
            System.out.println("\nVenda realizada com sucesso!"+"\nEstoque atual: " + quantidade);
        }
    }

    private void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido");
        } else {
        this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        if (quantidade <0 ){
            System.out.println("Quantidade inválido");
        } else {
            this.quantidade = quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}

