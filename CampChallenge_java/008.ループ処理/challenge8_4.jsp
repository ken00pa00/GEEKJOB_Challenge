<%
int num = 1000;
int count = 0;
while(num >= 100){
    num =num / 2;
    count++;
}
out.print(count);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>