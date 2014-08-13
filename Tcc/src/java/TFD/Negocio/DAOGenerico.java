/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TFD.Negocio;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosy
 */
public abstract class DAOGenerico{
     private static EntityManager gerenciadorEntidade = null;
    
    /**
     * Metodo criado com a finalidade de retornar o gerenciador de entidade.
     * @return um objeto do tipo EntityManager, Reponsal por gerenciar o Banco de dados.
     */
    public static EntityManager getGerenciadorEntidade(){
        if (gerenciadorEntidade == null || !gerenciadorEntidade.isOpen()){
            gerenciadorEntidade = Persistence.createEntityManagerFactory("TccPU").createEntityManager();
        }
        return gerenciadorEntidade;
    }
}
