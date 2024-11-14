package br.com.fiap.ecopower.dao;

import br.com.fiap.ecopower.factory.ConnectionFactory;
import br.com.fiap.ecopower.model.Investimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InvestimentoDAO {

    public void salvar(Investimento investimento) {
        String sql = "INSERT INTO servico (area_interesse, empresa, setor, valor_investimento, telefone_contato) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = new ConnectionFactory().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, investimento.getAreaInteresse());
            stmt.setString(2, investimento.getEmpresa());
            stmt.setString(3, investimento.getSetor());
            stmt.setDouble(4, investimento.getValorInvestimento());
            stmt.setString(5, investimento.getTelefone());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar serviço", e);
        }
    }
}
