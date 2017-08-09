/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author horiguchikentarou
 */
@WebServlet(urlPatterns = {"/blackjack"})
public class blackjack extends HttpServlet {

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
            
            
            Dealer dd = new Dealer() {};
            User uu = new User() {};
            
            dd.setCard(dd.deal());
            uu.setCard(dd.deal());
            
            
            while(dd.checkSum() == true){
                dd.setCard(dd.hit());
                if(dd.checkSum() == false){
                    break;
                }
            }
            out.println("ディーラーの合計は" + dd.open() + "です<br>");
            
            while(uu.checkSum() == true){
                uu.setCard(dd.hit());
                if(uu.checkSum() == false){
                    break;
                }
            }
            
            out.println("プレイヤーの合計は" + uu.open() + "です<br>");
            
            if(Objects.equals(uu.open(), dd.open())){
                out.println("引き分けです");
            }
            else if(uu.open() <= 21 && uu.open() > dd.open()){
                out.println("プレイヤーの勝ちです");
            }
            else{
                out.println("プレイヤーの負けです");
            }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet blackjack</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet blackjack at " + request.getContextPath() + "</h1>");
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
