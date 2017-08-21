/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author horiguchikentarou
 */
public class challenge18_02 {
    
    public static void main(String[] arg){
        
        Connection db_con = null;
        PreparedStatement db_st = null;
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
               
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "kentaro", "kenkenpa");
            
            db_st = db_con.prepareStatement("INSERT INTO profiles (profilesID, name, tell, age, birthday) VALUES (?, ?, ?, ?, ?)");
            db_st.setInt(1, 6);
            db_st.setString(2, "ドラちゃん");
            db_st.setString(3, "000-0000-0000");
            db_st.setInt(4, 37);
            db_st.setString(5, "2112-09-03");
            int num = db_st.executeUpdate();
            
            db_st.setInt(1, 7);
            db_st.setString(2, "ピカねずみ");
            db_st.setString(3, "000-0000-0000");
            db_st.setInt(4, 22);
            db_st.setString(5, "1996-02-27");  
            num = db_st.executeUpdate();
            
            db_con.close();
            db_st.close();
            
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
