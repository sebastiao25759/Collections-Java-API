package set.Operacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> ordenadoAlfabeticamente() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> ordenadoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new CompartorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1l, "m", 1, 1);
        cadastroProduto.adicionarProduto(1, "g", 2, 2);
        cadastroProduto.adicionarProduto(0, "t", 3, 3);
        cadastroProduto.adicionarProduto(11, "a", 4, 4);

        System.out.println(cadastroProduto.ordenadoAlfabeticamente());
        System.out.println(cadastroProduto.ordenadoPorPreco());
    }

}