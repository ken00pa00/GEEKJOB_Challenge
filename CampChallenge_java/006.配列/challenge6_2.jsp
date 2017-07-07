<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
ArrayList<String> data = new ArrayList<String>();

data.add("10");
out.print(data.get(0));

data.add("100");
out.print(data.get(1));

data.add("soeda");
data.set(2,"33");
out.print(data.get(2));

data.add("hayashi");
out.print(data.get(3));

data.add("-20");
out.print(data.get(4));

data.add("118");
out.print(data.get(5));

data.add("END");
out.print(data.get(6));

%>

