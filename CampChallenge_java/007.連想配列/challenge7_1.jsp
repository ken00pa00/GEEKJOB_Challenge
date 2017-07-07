<%@ page import="java.util.HashMap" %>
<%
HashMap<String, String> user =
            new HashMap<String, String>();

user.put("1", "AAA");
out.print("1" +user.get("1"));

user.put("hello", "world");
out.print("hello" +user.get("hello"));

user.put("soeda","33");
out.print("soeda" +user.get("soeda"));

user.put("20","20");
out.print("20" +user.get("20"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
