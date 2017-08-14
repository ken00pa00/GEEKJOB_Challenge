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
        <form action="./challenge16_1.jsp" method="post">
            
        <p> 名前<input type="text" name="txtName">
        <p>
            性別
            <input type="radio" name="rdoSample" value="男">男
            <input type="radio" name="rdoSample" value="女">女
        <p> 
            趣味
        <p><textarea name="mulText" cols="20" rows="10"></textarea>
            
        </form>    
    </body>
</html>
