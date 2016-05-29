package produtos;

import java.util.*;

public class ItemProduto {

    private int codigo;
    private Data validade;
    private Produto produto;
    
    public ItemProduto() {
    }

    public Produto getProduto() {
        return null;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean valido() {
        return false;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
