package br.com.ecommerce.model;

import br.com.ecommerce.exception.NotaInvalidaException;

public class Avaliacao {

    private int idLoja;
    private int idProduto;
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

    public int getNotaLoja() {
        return notaLoja;
    }

    public void setNotaLoja(int notaLoja) throws NotaInvalidaException {
        if (notaLoja < 1 || notaLoja > 5) {
            throw new NotaInvalidaException("Nota da loja deve ser entre 1 e 5");
        }
        this.notaLoja = notaLoja;
    }

    public int getNotaProduto() {
        return notaProduto;
    }

    public void setNotaProduto(int notaProduto) throws NotaInvalidaException {
        if (notaProduto < 1 || notaProduto > 5) {
            throw new NotaInvalidaException("Nota do produto deve ser entre 1 e 5");
        }
        this.notaProduto = notaProduto;
    }

    public Avaliacao(int idProduto, int idLoja, String idCliente, int notaLoja, int notaProduto) throws NotaInvalidaException {
        this.idProduto = idProduto;
        this.idLoja = idLoja;
        setNotaLoja(notaLoja);
        setNotaProduto(notaProduto);
    }

    public Avaliacao() {
    }
}