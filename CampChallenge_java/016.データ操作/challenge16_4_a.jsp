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
 
            int type = Integer.parseInt(request.getParameter("type"));
 
            switch (type) {
                case 1:
                    out.print("お客様が購入された商品種別は雑貨になります。 <br>");
                    break;
 
                case 2:
                    out.print("お客様が購入された商品種別は生鮮食品になります。 <br>");
                    break;

                case 3:
                    out.print("お客様が購入された商品種別その他になります。 <br>");
                    break;
            }
 
            int total = Integer.parseInt(request.getParameter("total"));
            int count = Integer.parseInt(request.getParameter("count"));
 
            out.print("総額は" + total + "円になります。 <br>");
            out.print("個数は" + count + "個になります。 <br>");
            out.print("1個あたりは" + (total / count) + "円になります。<br><br>");
            
            out.print("総額3000円以上で4%のポイント、<br>そしていつもご利用いただいているお客様限定：5000円以上お買い上げで5%のポイントが付きます。<br><br>");
            
            if(total > 5000){
                out.print("いつもご利用いただきありがとうございます！<br>" + Math.round((total * 0.05)) + "ポイントがあなたのものになりました。");                 
            } else if(total > 3000){
                out.print("まあまあだね<br>" + Math.round((total * 0.04)) + "ポイントがあなたのものになりました。<br>もっと買うとさらにポイントが！");
            } else {
                out.print("今回はポイントがつきませんでした。<br>次回からはもっと買いなさい！");
            }
            
        %>
    </body>
</html>
