/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.java.projeto.conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.com.java.projeto.model.Carro;

/**
 *
 * @author fabricio
 */
public class CarroDAO {
    
public static void save(Carro c) {
            String sql = "INSERT INTO `agencia`.`carro` (`placa`, `nome`) VALUES (?, ?)";
            try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
                    ps.setString(1, c.getPlaca());
                    ps.setString(2, c.getNome());
                    ps.executeUpdate();
                    ConexaoFactory.close(conn);
            } catch (SQLException e) {
            }
    }

    public static List<Carro> searchAll() {
            String sql = "SELECT * FROM agencia.carro";
            List<Carro> carroList = new ArrayList<>();
            try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                            carroList.add(new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome")));
                    }
                    ConexaoFactory.close(conn, ps, rs);
                    return carroList;
            } catch (SQLException e) {
            }
            return null;
    }

    public static void deleteById(Integer idCarro) {
            String sql = "DELETE FROM `agencia`.`carro` WHERE (`id` = ?)";
            try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
                    ps.setInt(1, idCarro);
                    ps.executeUpdate();
            } catch (SQLException e) {
            }

    }

    public static void updateById(Carro c) {
    String sql = "UPDATE `agencia`.`carro` SET `placa` = ?, `nome` = ? WHERE (`id` = ?)";
            try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
                    ps.setString(1, c.getPlaca());
                    ps.setString(2, c.getNome());
                    ps.setInt(3, c.getId());
                    ps.executeUpdate();
                    ConexaoFactory.close(conn, ps);
            } catch (SQLException e) {
            }
    }

    public static Carro searchByPlaca(String placa) {
    String sql = "SELECT * FROM agencia.carro where placa LIKE ?";
    Carro carro = null;
            try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
                    ps.setString(1, placa);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                            carro = new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome"));
                    }
                    ConexaoFactory.close(conn, ps, rs);
                    return carro;
                    } catch (SQLException e) {
                    }
            return null;
    }
}
