<%@page import="javax.servlet.http.HttpSession"%>
<%
    request.setCharacterEncoding("UTF-8");           
    
    HttpSession hs = request.getSession();
    String na = "";
    String se = "";
    String hb = "";
    
    if(hs.getAttribute("Name") != null){
        na = (String)hs.getAttribute("Name");
    }
    
    if(hs.getAttribute("Sex") != null){
        se = (String)hs.getAttribute("Sex");
    }
    
    if(hs.getAttribute("Hobby") != null){
        hb = (String)hs.getAttribute("Hobby");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./challenge16_8_a.jsp" method="get">
            名前<input type="text" name="name" value="<%=na%>">
            <br><br>
            
            性格<br>
            <input type="radio" name="sex" value="男" 
                    <%if(se.equals("男")){
                        out.print("checked");
                    }%>>男<br>
            <input type="radio" name="sex" value="女" 
                    <%if(se.equals("女")){
                        out.print("checked");
                    }%>>女<br><br>
            
            趣味<br>
            <textarea name="hobby" cols="20" rows="10"><%=hb%></textarea>
            <br><br><br>
            
            <input type="submit" name="submit" value="送信">
        </form>
    </body>
</html>

