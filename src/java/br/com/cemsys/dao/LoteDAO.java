/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cemsys.dao;

import br.com.cemsys.util.ConnectionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo
 */
public class LoteDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public LoteDAO() {   
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao BD " + e.getMessage());
        }
    }
 
    @Override
    public Boolean cadastrar(Object object) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "insert into lote (descricaoLote) values (?);";
            Lote lote = (Lote) object;
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, lote.getDescricaoLote().toUpperCase());

            
            stmt.execute();
            
        }catch (Exception e){
            retorno = false;
            System.out.println("Erro ao cadastrar loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return retorno;
    }

    @Override
    public List<Object> listar() throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from lote order by descricaoLote;";
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Lote lote = new Lote();
                lote.setId(rs.getInt("id"));
                lote.setDescricaoLote(rs.getString("descricaoLote"));
                
                lista.add(lote);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listar loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
    }

    @Override
    public Object carregar(Integer id) throws Exception {
        Lote lote = new Lote();
        
        try{
            String sql = "select * from lote where id=?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            rs.next();
            
            lote.setId(rs.getInt("id"));
            lote.setDescricaoLote(rs.getString("descricaoLote"));

            
        }catch(Exception e){
            System.out.println("Erro ao carregar quadraDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return setor;
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "update lote set descricaoLote = ? "
                        + "where id = ?;";
            Lote lote = (Lote) object;
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, lote.getDescricaoLote().toUpperCase());
            stmt.setInt(2, lote.getId());
           
            stmt.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao alterar loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return retorno;
    }

    @Override
    public Boolean excluir(Integer id) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "delete from lote where id = ?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
            
        }catch (Exception e){
            retorno = false;
            System.out.println("Erro ao excluir loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt,rs);
        }
        return retorno;
    }
    
    public List<Object> listarPorNome(String pesquisa) throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from lote where descricaoLote like ? order by descricaoLote;";
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa.toUpperCase() + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Lote lote = new Lote();
                lote.setId(rs.getInt("id"));
                lote.setDescricaoLote(rs.getString("descricaoLote"));

                
                lista.add(lote);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listarPorNome loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
    }
    
    public List<Object> listarPorCodigo(Integer pesquisa) throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from lote where id = ?;";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, pesquisa);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Lote lote = new Lote();
                lote.setId(rs.getInt("id"));
                lote.setDescricaoLote(rs.getString("descricaoLote"));
                
                lista.add(lote);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listarPorCodigo loteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
        
    }
}