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
public class challenge18_07 {
    
    public static void main(String[] arg){
        
        Connection db_con = null;
        ResultSet db_data = null;
        PreparedStatement db_st = null;
        Statement db_state = null;
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
               
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "kentaro", "kenkenpa");
            
            db_st = db_con.prepareStatement("UPDATE profiles set name = ?, age = ?, birthday = ? where profilesID = ?");
            
            db_st.setString(1, "松岡修造");
            db_st.setInt(2, 48);
            db_st.setString(3, "1967-11-06");
            db_st.setInt(4, 1);
            int update = db_st.executeUpdate();
            
            db_state = db_con.createStatement();
            
            db_data = db_st.executeQuery("SELECT * FROM profiles");
            
            while(db_data.next()){
                int profilesID = db_data.getInt("profilesID");
                String name = db_data.getString("name");
                String tell = db_data.getString("tell");
                int age = db_data.getInt("age");
                String birthday = db_data.getString("birthday");
                
                System.out.println("プロフィールIDは" + profilesID + "　名前は" + name + "　電話番号は" + tell + "　年齢は" + age + "　誕生日は" + birthday);
            }
            
            db_con.close();
            db_data.close();
            db_st.close();
            db_state.close();
            
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
