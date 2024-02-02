package supermercado;

public class ProdutoController {

    private ProdutoValidator produtoValidator;
    private MensagemService mensagemService;

    public ProdutoController() {
        this.produtoValidator = new ProdutoValidator();
        this.mensagemService = new MensagemService();
    }

    public boolean salvarProduto(ProdutoEntity produto) {
        if (produtoValidator.validacao(produto)){
            //... salvar no banco de dados ..//
            mensagemService.enviarMensagem();
            return true;
        } else {
            return false;
        }
    }
}
