package br.com.ecommerce.model;

public class Avaliacao {

    private int idLoja;
    private int idProduto;
    private String idCliente;
    private int notaLoja;
    private int notaProduto;

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getNotaLoja() {
        return notaLoja;
    }

    public void setNotaLoja(int notaLoja) {
        if (notaLoja < 1 || notaLoja > 5) {
            throw new RuntimeException("Nota deve ser entre 1 e 5");
        }
        this.notaLoja = notaLoja;
    }

    public int getNotaProduto() {
        return notaProduto;
    }

    public void setNotaProduto(int notaProduto) {
        if (notaProduto < 1 || notaProduto > 5) {
            throw new RuntimeException("Nota deve ser entre 1 e 5");
        }
        this.notaProduto = notaProduto;
    }

    public Avaliacao(int idProduto, int idLoja, String idCliente, int notaLoja, int notaProduto) {
        this.idProduto = idProduto;
        this.idLoja = idLoja;
        this.idCliente = idCliente;
        setNotaLoja(notaLoja);
        setNotaProduto(notaProduto);
    }

    public Avaliacao() {
    }


}
