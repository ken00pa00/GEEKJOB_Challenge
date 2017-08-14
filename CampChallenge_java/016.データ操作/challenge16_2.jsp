<%
    request.setCharacterEncoding("UTF-8");
    
    out.print("名前：" + request.getParameter("txtName") + "<br>");
    out.print("性別：" + request.getParameter("rdoSample") + "<br>");
    out.print("趣味：" + request.getParameter("mulText"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./challenge16_2.jsp" method="post">
            
        <p> 名前
            <input type="text" name="txtName">
        <p>
            性別
            <input type="radio" name="rdoSample" value="男">男
            <input type="radio" name="rdoSample" value="女">女
        <p> 
            趣味
            <p><textarea name="mulText" cols="20" rows="10"></textarea>
            <p><input type="submit" name="btnSubmit">
            
        </form>
    </body>
</html>
