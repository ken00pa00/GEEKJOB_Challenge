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

/**
 *
 * @author horiguchikentarou
 */
@WebServlet(urlPatterns = {"/challenge11_6"})
public class challenge11_6 extends HttpServlet {

    String[] add(int id){
        String[] aaa ={"11" , "名前1" , "生年月日1" , "住所1"};
        String[] bbb ={"22" , "名前2" , "生年月日2" , "住所2"};
        String[] ccc ={"33" , "名前3" , "生年月日3" , "住所3"};
        String[] ddd ={"" , "IDが間違ってるかも"};
        int aa1 = Integer.parseInt(aaa[0]);
        int bb1 = Integer.parseInt(bbb[0]);
        int cc1 = Integer.parseInt(ccc[0]);
        
        if(id == aa1){
            return aaa;
        }else if(id == bb1){
            return bbb;
        }else if(id == cc1){
            return ccc;
        }
        return ddd;
        
     }
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
            
            String[] prof = add(11);
            for(int i = 1; i < 4; i++) {
            out.println(prof[i]);
            }
        
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

