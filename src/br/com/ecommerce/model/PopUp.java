package br.com.ecommerce.model;

import javax.swing.*;

public class PopUp {
    public static void main(String[] args) {

        
        String loja = JOptionPane.showInputDialog("Avalie a loja (1 a 5):");
        String produto = JOptionPane.showInputDialog("Avalie o produto (1 a 5):");

        JOptionPane.showMessageDialog(null,
                "Loja: " + loja + "\nProduto: " + produto);
    }
}
