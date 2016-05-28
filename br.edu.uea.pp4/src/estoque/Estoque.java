package estoque;
import produtos.*;
import java.util.*;

public class Estoque {

    private ArrayList<ItemProduto> itemsProdutos;
    
    public Estoque() {
    }

    public void entraItem(ItemProduto item) {
        itemsProdutos.add(item);
    }

    public ItemProduto saiItem(ItemProduto item) {
        itemsProdutos.remove(item);
        return item;
    }

    public ArrayList<ItemProduto> getItens() {
        return itemsProdutos;
    }

    public ArrayList<ItemProduto> getItens(Marca marca) {
        ArrayList<ItemProduto> itemsMarca;
        for(ItemProduto p : itemsProdutos) {
            if(p.getProduto().getMarca().getNome().equals(marca.getNome())) {
                itemsMarca.add(p);
            }
        }
        return itemsMarca;
    }

    public ArrayList<ItemProduto> getItens(Produto produto) {
       ArrayList<ItemProduto> itemsProduto;
        for(ItemProduto p : itemsProdutos) {
            if(p.getProduto().getCodigo().equals(produto.getCodigo())) {
                itemsProduto.add(p);
            }
        }
        return itemsProduto;
    }

    public int qtdItens() {
        return itemsProdutos.size();
    }
    
    public ArrayList<ItemProduto> getItens(Genero genero) {
        ArrayList<ItemProduto> itemsGenero;
        for(ItemProduto p : itemsProdutos) {
            if(p instanceof genero) {
                itemsGenero.add(p);
            }
        }
        return itemsGenero;
    }
}
