<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>League Table</title>
	<link href="<c:url value="/resources/css/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/opusmagus.css" />" rel="stylesheet">
	
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
    <script src="<c:url value="/resources/js/league.js" />"></script>
</head>
<body>
	<input id="hfAppRoot" type="hidden" value="<%=request.getContextPath()%>">
 	<h1>League Table</h1>
 	<h2 style="margin-top:-30px;" id="leagueName"></h2>
 	<div id="leagueTable">
 		<div class="leagueTableRowHeader">
 			<div class="leagueTableCellHeader">Position</div>
 			<div class="leagueTableCellHeader">Team</div>
 			<div class="leagueTableCellHeader">GS</div>
 			<div class="leagueTableCellHeader">GC</div>
 			<div class="leagueTableCellHeader">GD</div>
 		</div>
 		<div id="leagueTableRowTemplate" class="leagueTableRow">
 			<div class="leagueTableCell leaguePosition">1</div>
 			<div class="leagueTableCell teamName">Team Name</div>
 			<div class="leagueTableCell goalsScored">45</div>
 			<div class="leagueTableCell goalsConceeded">21</div>
 			<div class="leagueTableCell goalDifference">+24</div>
 		</div>
 	</div>
 	<div>
 		<img id="btnGoBack" src="<c:url value="/resources/images/arrow-back-icon-64.png" />" class="toolbarButton" alt="">
		<img id="btnShowHigherDivision" src="<c:url value="/resources/images/arrow-up-64.png" />" class="toolbarButton" alt="">
		<img id="btnShowLowerDivision" src="<c:url value="/resources/images/arrow-down-64.png" />" class="toolbarButton" alt="">
	</div>
</body>
</html>