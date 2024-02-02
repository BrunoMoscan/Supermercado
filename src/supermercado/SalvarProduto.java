package supermercado;

public class SalvarProduto {
    public boolean salvarProduto(ProdutoEntity produto) {
        
        if (this.validacao(produto)){
            //... salvar no banco de dados ..//
            this.enviarMensagem();
            return true;
        } else {
            return false;
        }
    }
    
    private boolean validacao(ProdutoEntity produto) {
        boolean validacao = true;
        return validacao;
        
    }

    public void enviarMensagem(){
        //enviar mensagem 
    }
}
