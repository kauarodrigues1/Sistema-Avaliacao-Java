import br.com.ecommerce.model.Avaliacao;
import br.com.ecommerce.model.Cliente;

import javax.swing.*;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Avaliacao avaliacao = new Avaliacao();
        Cliente cliente = new Cliente(UUID.randomUUID().toString(), "Kauã");

        avaliacao.setIdCliente(cliente.getId());

        avaliacao.setNotaLoja(Integer.parseInt(
                JOptionPane.showInputDialog("Nota da loja (1 a 5):")
        ));

        avaliacao.setNotaProduto(Integer.parseInt(
                JOptionPane.showInputDialog("Nota do produto (1 a 5):")
        ));

        System.out.println("Cliente ID: " + cliente.getId());
        System.out.println("Cliente Nome: " + cliente.getNome());
        System.out.println("Loja: " + avaliacao.getNotaLoja());
        System.out.println("Produto: " + avaliacao.getNotaProduto());

    }
}