/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author venec
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProdutoEntity produto = new ProdutoEntity();
        produto.setId(1);
        produto.setNome("Refrigerante");
        produto.setPreco(10.90);
        
        ProdutoController cp = new ProdutoController();
        if (cp.salvarProduto(produto)){
            System.out.println("Produto salvo com sucesso");
        } else {
            System.out.println("Erro ao salvar produto");
        }
        
    }


}
