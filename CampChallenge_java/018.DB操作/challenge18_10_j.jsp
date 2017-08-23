<%-- 
    Document   : challenge18_10_j
    Created on : 2017/08/23, 10:30:27
    Author     : horiguchikentarou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除</title>
    </head>
    <body>
        <form action="challenge18_10_s" method="post">
            <p>削除したいプロフィールのIDを入力してください（数字は半角でお願いします）</p>
            <p><input type="number" name="deleteID" min="1">：プロフィールID（例：1）</p>
            <input type="submit" name="btnSubmit" value="削除">
        </form>    
    </body>
</html>
