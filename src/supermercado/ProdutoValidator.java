package supermercado;

public class ProdutoValidator {

    public boolean validacao(ProdutoEntity produto){
        if (produto.getNome().equals("")){
            return false;
        } else {   
            return true;
        }
    }
}

