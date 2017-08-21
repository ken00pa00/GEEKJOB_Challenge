/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.db.servlet;

import java.sql.*;

/**
 *
 * @author horiguchikentarou
 */
public class challenge18_01_a {
    
    public static void main(String[] arg){
        
        Connection db_con = null;
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
               
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "kentaro", "kenkenpa");
            System.out.println("データベースに接続しました");
                
            db_con.close();
            
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました（SQL）" + e_sql.toString());
        }catch(Exception e) {
            System.out.println("接続時にエラーが発生しました" + e.toString());
        }finally{
            if(db_con != null){
                try{
                    db_con.close();
                }catch(SQLException e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }    
    }
}
