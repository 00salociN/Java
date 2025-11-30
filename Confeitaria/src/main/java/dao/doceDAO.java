/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionFactory;
import model.doce;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Raquel
 */

public class doceDAO {
public void create(doce doce) {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    try {
        String sql = "INSERT INTO doces (nome_doce, categoria, preco, descricao) VALUES (?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);

        stmt.setString(1, doce.getnomedoce());
        stmt.setString(2, doce.getcategoria());
        stmt.setFloat(3, doce.getpreco());
        stmt.setString(4, doce.getdesc());

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Doce salvo com sucesso!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());

    } finally {
        try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
        try { if (con != null) con.close(); } catch (SQLException e) {}
    }
}

public List<doce> read() {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    List<doce> doces = new ArrayList<>();

    try {
        String sql = "SELECT * FROM doces";
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();

        while (rs.next()) {
            doce doce = new doce();

            doce.setId(rs.getInt("id_doce"));
            doce.setnomedoce(rs.getString("nome_doce"));
            doce.setcategoria(rs.getString("categoria"));
            doce.setpreco(rs.getFloat("preco"));
            doce.setdesc(rs.getString("descricao"));

            doces.add(doce);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao ler dados: " + e.getMessage());

    } finally {
        try { if (rs != null) rs.close(); } catch (SQLException e) {}
        try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
        try { if (con != null) con.close(); } catch (SQLException e) {}
    }

    return doces;
}

public void update(doce doce) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    try {
        String sql = "UPDATE doces SET nome_doce = ?, categoria = ?, preco = ?, descricao = ? WHERE id_doce = ?";
        stmt = con.prepareStatement(sql);

        stmt.setString(1, doce.getnomedoce());
        stmt.setString(2, doce.getcategoria());
        stmt.setFloat(3, doce.getpreco());
        stmt.setString(4, doce.getdesc());
        stmt.setInt(5, doce.getId());

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Doce atualizado com sucesso!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());

    } finally {
        try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
        try { if (con != null) con.close(); } catch (SQLException e) {}
    }
}


public void delete(int id_doce) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    try {
        String sql = "DELETE FROM doces WHERE id_doce = ?";
        stmt = con.prepareStatement(sql);

        stmt.setInt(1, id_doce);

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Doce excluído com sucesso!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());

    } finally {
        try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
        try { if (con != null) con.close(); } catch (SQLException e) {}
    }
}
}