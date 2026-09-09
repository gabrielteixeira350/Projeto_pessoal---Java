public class Main {
    public static void main(String[] args){

        Produto produto = new Produto("Notebook", 0,-1);
        System.out.println("ID do produto: " + produto.getId());

        produto.fichaTecnica();

        produto.adicionarEstoque(5);
        produto.removerEstoque(3);

        Produto produto1 = new Produto("Celular",4500,8);
        System.out.println("ID do produto: " + produto1.getId());
        produto1.fichaTecnica();


        produto1.vender(1);


        System.out.println(produto.getPreco());
        //produto.setPreco(-500);
        System.out.println(produto.getPreco());

        //produto.setQuantidade(0);
        System.out.println(produto.getQuantidade());

        System.out.println(produto1.getPreco());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getQuantidade());
        System.out.println(produto.getId());
        System.out.println(produto1.getId());
    }
}
