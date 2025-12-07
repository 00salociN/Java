/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author cleri
 */

import connection.ConnectionFactory;
import model.Tenismodel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TenisDAO {

    public void create(Tenismodel t) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO tenis (nome, marca, cor, tamanho, preco) VALUES (?, ?, ?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getNome());
            stmt.setString(2, t.getMarca());
            stmt.setString(3, t.getCor());
            stmt.setInt(4, t.getTamanho());
            stmt.setDouble(5, t.getPreco());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tênis salvo com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar tênis: " + e.getMessage());
        } finally {
            try { if (stmt != null) stmt.close(); } catch (SQLException ex) {}
            try { if (con != null) con.close(); } catch (SQLException ex) {}
        }
    }

    public List<Tenismodel> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tenismodel> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tenis";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Tenismodel t = new Tenismodel();
                t.setId(rs.getInt("id_tenis"));
                t.setNome(rs.getString("nome"));
                t.setMarca(rs.getString("marca"));
                t.setCor(rs.getString("cor"));
                t.setTamanho(rs.getInt("tamanho"));
                t.setPreco(rs.getDouble("preco"));
                lista.add(t);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler tênis: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException ex) {}
            try { if (stmt != null) stmt.close(); } catch (SQLException ex) {}
            try { if (con != null) con.close(); } catch (SQLException ex) {}
        }
        return lista;
    }

    public void update(Tenismodel t) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "UPDATE tenis SET nome = ?, marca = ?, cor = ?, tamanho = ?, preco = ? WHERE id_tenis = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getNome());
            stmt.setString(2, t.getMarca());
            stmt.setString(3, t.getCor());
            stmt.setInt(4, t.getTamanho());
            stmt.setDouble(5, t.getPreco());
            stmt.setInt(6, t.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tênis atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tênis: " + e.getMessage());
        } finally {
            try { if (stmt != null) stmt.close(); } catch (SQLException ex) {}
            try { if (con != null) con.close(); } catch (SQLException ex) {}
        }
    }

    public void delete(int id_tenis) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "DELETE FROM tenis WHERE id_tenis = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id_tenis);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tênis excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir tênis: " + e.getMessage());
        } finally {
            try { if (stmt != null) stmt.close(); } catch (SQLException ex) {}
            try { if (con != null) con.close(); } catch (SQLException ex) {}
        }
    }
}