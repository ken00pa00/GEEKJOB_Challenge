<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            
            String na = request.getParameter("name");
            String se = request.getParameter("sex");
            String hb = request.getParameter("hobby");
           
            out.print("名前は、" + na + "<br>");
            out.print("性別は、" + se + "<br>");
            out.print("趣味は、" + hb + "<br>");
           
            HttpSession hs = request.getSession();
            
            hs.setAttribute("Name", na);
            hs.setAttribute("Sex", se);
            hs.setAttribute("Hobby", hb);        
        %>
    </body>
</html>
