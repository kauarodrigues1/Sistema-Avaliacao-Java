import br.com.ecommerce.dao.ClienteDAO;
import br.com.ecommerce.model.Avaliacao;
import br.com.ecommerce.model.Cliente;
import br.com.ecommerce.exception.NotaInvalidaException;
import br.com.ecommerce.dao.AvaliacaoDAO;

import javax.swing.JOptionPane;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Avaliacao avaliacao = new Avaliacao();
        Cliente cliente = new Cliente(UUID.randomUUID().toString());

        try {
            int notaLoja = lerNota("Nota da loja (1 a 5):");
            int notaProduto = lerNota("Nota do produto (1 a 5):");

            avaliacao.setNotaLoja(notaLoja);
            avaliacao.setNotaProduto(notaProduto);

            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.salvar(cliente);

            AvaliacaoDAO dao = new AvaliacaoDAO();
            dao.salvar(avaliacao);

            JOptionPane.showMessageDialog(null, "Avaliação enviada com sucesso!");

            System.out.println("Cliente ID: " + cliente.getId());
            System.out.println("Cliente Nome: " + cliente.getNome());
            System.out.println("Loja: " + avaliacao.getNotaLoja());
            System.out.println("Produto: " + avaliacao.getNotaProduto());

        } catch (NotaInvalidaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static int lerNota(String mensagem) throws NotaInvalidaException {
        try {
            int nota = Integer.parseInt(JOptionPane.showInputDialog(mensagem));

            if (nota < 1 || nota > 5) {
                throw new NotaInvalidaException("Nota deve ser entre 1 e 5.");
            }

            return nota;

        } catch (NumberFormatException e) {
            throw new NotaInvalidaException("Digite um número válido.");
        }
    }
}
