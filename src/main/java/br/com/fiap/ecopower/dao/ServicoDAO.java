package br.com.fiap.ecopower.dao;

import br.com.fiap.ecopower.factory.ConnectionFactory;
import br.com.fiap.ecopower.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServicoDAO {

    public void salvar(Servico servico) {
        String sql = "INSERT INTO servico (local_servico, tipo, tipo_local, detalhes_servico, telefone_contato) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = new ConnectionFactory().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, servico.getLocalServico());
            stmt.setString(2, servico.getTipo());
            stmt.setString(3, servico.getTipoLocal());
            stmt.setString(4, servico.getDetalhesServico());
            stmt.setString(5, servico.getTelefone());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar serviço", e);
        }
    }
}
