<%@ page import="com.mankraft.LoginBean"%>
<p>you are successfully logged in</p>
<%
  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());  
%> 