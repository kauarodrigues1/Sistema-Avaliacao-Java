package br.com.ecommerce.dao;

import br.com.ecommerce.model.Avaliacao;
import br.com.ecommerce.exception.NotaInvalidaException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AvaliacaoDAO {

    public void salvar(Avaliacao avaliacao) throws NotaInvalidaException {
        try {
            Connection conn = ConnectionFactory.getConnection();

            String sql = "INSERT INTO avaliacao (id_cliente, nota_loja, nota_produto) VALUES (?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, avaliacao.getIdCliente());
            stmt.setInt(2, avaliacao.getNotaLoja());
            stmt.setInt(3, avaliacao.getNotaProduto());

            stmt.execute();

        } catch (SQLException e) {
            throw new NotaInvalidaException("Erro ao salvar avaliação no banco.");
        }
    }
}
