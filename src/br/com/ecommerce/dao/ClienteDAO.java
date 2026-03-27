package br.com.ecommerce.dao;
import br.com.ecommerce.exception.NotaInvalidaException;
import br.com.ecommerce.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public void salvar(Cliente cliente) throws NotaInvalidaException {
        try {
            Connection conn = ConnectionFactory.getConnection();

            String sql = "INSERT INTO cliente (id_cliente, nome) VALUES (?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new NotaInvalidaException("Erro ao salvar avaliação no banco." + e.getMessage());
        }
    }

}
