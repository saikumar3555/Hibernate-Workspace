<%@page import="com.nit.dto.ProjectDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
ProjectDTO dto=null;
dto=(ProjectDTO)request.getAttribute("pDetails");
if(dto!=null)
%>
<table>
<tr>
<td><%dto.getProjId();%></td>
<td><%dto.getProjName();%></td>
<td><%dto.getTeamSize();%></td>
<td><%dto.getDomaiin();%></td>
<td><%dto.getSdop();%></td>
<td><%dto.getCdop();%></td>
</tr>
</table>

</body>
</html>