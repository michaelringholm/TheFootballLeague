<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>The Football League</title>
	<link href="<c:url value="/resources/css/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/opusmagus.css" />" rel="stylesheet">
	
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
    <script src="<c:url value="/resources/js/sample.js" />"></script>
</head>
<body>
	<input id="hfAppRoot" type="hidden" value="<%=request.getContextPath()%>">
	<h1>The Football League</h1>
	<div>
	<img id="btnLeagueTable" src="<c:url value="resources/images/league-table.jpg" />" class="menuButton" alt="">
	<img src="<c:url value="resources/images/stadion-icon-256.png" />" class="menuButton" alt="">	
	<img src="<c:url value="resources/images/football-squad-icon-256.png" />" class="menuButton" alt="">
	<img src="<c:url value="resources/images/fitness-icon-png-256.png" />" class="menuButton" alt="">
	</div>
	<div>
	<img src="<c:url value="resources/images/market-256.png" />" class="menuButton" alt="">
	<img src="<c:url value="resources/images/trophy-icon-256.png" />" class="menuButton" alt="">		
	<img src="<c:url value="resources/images/directors-256.png" />" class="menuButton" alt="">
	<img src="<c:url value="resources/images/whistle-icon-256.png" />" class="menuButton" alt="">
	</div>
</body>
</html>