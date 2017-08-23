/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 *
 * @author horiguchikentarou
 */
@WebServlet(urlPatterns = {"/challenge18_10_s"})
public class challenge18_10_s extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            request.setCharacterEncoding("UTF-8");
            
            String id = request.getParameter("deleteID");
            
            Connection db_con = null;
            ResultSet db_data;
            PreparedStatement db_st;

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();  

                db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "kentaro", "kenkenpa");

                db_st = db_con.prepareStatement("DELETE FROM profiles WHERE profilesID = ?");
                
                db_st.setString(1, id);
                int num = db_st.executeUpdate();
                out.print("削除しました");

                db_data = db_st.executeQuery("SELECT * FROM profiles");

                while(db_data.next()){
                    int profilesID = db_data.getInt("profilesID");
                    String name = db_data.getString("name");
                    String tell = db_data.getString("tell");
                    int age = db_data.getInt("age");
                    String birthday = db_data.getString("birthday");
                }

                db_con.close();
                db_data.close();
                db_st.close();
                
            }
            catch(SQLException e_sql){
                System.out.println("接続時にエラーが発生しました（SQL）" + e_sql.toString());
            }
            catch(Exception e) {
                System.out.println("接続時にエラーが発生しました" + e.toString());
            }
            finally{
                if(db_con != null){
                    try{
                        db_con.close();
                    }
                    catch(SQLException e_con){
                        System.out.println(e_con.getMessage());
                    }
                }
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
