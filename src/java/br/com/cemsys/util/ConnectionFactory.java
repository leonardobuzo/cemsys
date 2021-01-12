/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cemsys.util;
/**
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {
    
   public static void main(String[] args) {
       String connectionUrl = "jdbc:sqlserver://localhost:1433;"
               + "databaseName=CEMSYS;";
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
           Connection conn = DriveManager.getConnection(connectionUrl, "sa", "123456");
           
           System.out.println("Conexão obtida com sucesso!");
       } catch(SQLException ex) {
           
           System.out.println("SQLException: " + ex.getMessage());
           System.out.println("SQLState: " + ex.getSQLState());
           System.out.println("VendorError: " + ex.getErrorCode());
       } catch (Exception e){
           System.out.println("Não foi possível conectar ao banco: " + e);
       }
     
   }
   **/
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {
    
    public static Connection conectar() throws Exception{
         try{
             Class.forName("org.postgresql.Driver");
             System.out.println("Conectou!");
             return DriverManager.getConnection(
              "jdbc:sqlserver://localhost:"
            + "1433;databaseName=CEMSYS;","sa","123456");
         }catch(Exception ex){
            throw new Exception("Erro ao conectar"
                 + ex.getMessage());
         }
     }
     public static void fecharConexao(
         Connection conn, Statement stmt,
             ResultSet rs) throws Exception{
         try{
             if(rs != null){
                 rs.close();
             }
             if(stmt != null) { stmt.close(); }
             if(conn != null) { conn.close(); }
         }catch(Exception ex){
             throw new Exception(
             "Erro ao fechar conexao"
                     + ex.getMessage());
         }
     }  
}

