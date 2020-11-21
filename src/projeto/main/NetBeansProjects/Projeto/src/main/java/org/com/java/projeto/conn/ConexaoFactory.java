/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.java.projeto.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fabricio
 */
public class ConexaoFactory {
    
    public static Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
		String user = "root";
		String password = "@rR32dDa";
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
		}
		return null;
	}
    
    public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
		}
	}

	public static void close(Connection conn, Statement stat) {
		ConexaoFactory.close(conn);
		try {
			if (stat != null) {
				stat.close();
			}
		} catch (SQLException e) {
		}
	}
        
        public static void close(Connection conn, Statement stat, ResultSet rs) {
                ConexaoFactory.close(conn, stat);
                try {
                        if (rs != null) {
                            rs.close();
                        
                        }
                } catch (SQLException e) {
                }
	}
        
}
