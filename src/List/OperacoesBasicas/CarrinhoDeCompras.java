package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        if (!this.itemList.isEmpty()) {
            for (Item i : this.itemList) {
                if (i.getNome().equals(nome)) {
                    itensRemover.add(i);
                }
            }
            itemList.removeAll(itensRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularTotal() {
        double valorTotal = 0d;
        if (!this.itemList.isEmpty()) {
            for (Item item: itemList){
                double valorItem = item.getPreco();
                valorTotal += valorItem;
            }
        return valorTotal;
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }
    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.addItem("Lápis", 2d, 3);
        carrinhoDeCompras.addItem("Lápis", 2d, 3);
        carrinhoDeCompras.addItem("Caderno", 35d, 1);
        carrinhoDeCompras.addItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotal());
    }
}
