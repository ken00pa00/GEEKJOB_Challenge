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
            
            int num = Integer.parseInt(request.getParameter("num"));
            int i = 2;
            
            out.print(num + "の素数は、");
            
            while(num != 1){
                if(num % i == 0){
                    out.print(i + ", ");
                    num /= i;
                } else {
                    i++;
                }
            }
            
        %>    
    </body>
</html>
