
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>保存</title>
    </head>
    <body>
        <form action="challenge18_09_s" method="post">
            
            <p>入力してください（数字は半角でお願いします）</p>
            <p><input type="number" name="profilesID" min="1">：プロフィールID（例：1）</p>
            <p><input type="text" name="name">：名前（例：東雲金右衛門）</p>
            <p><input type="tel" name="tell">：電話番号（例：000-0000-0000）</p>
            <p><input type="number" name="age" min="0">：年齢（例：30）</p>
            <p><input type="date" name="birthday">：生年月日（例：1510-01-01）</p>
            
            <p>入力が完了しましたら、保存ボタンを押してください</p>
            <p><input type="submit" name="btnSubmit" value="保存"></p>
        </form>
    </body>
</html>
