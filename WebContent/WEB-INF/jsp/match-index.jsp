<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Match</title>
	<link href="<c:url value="/resources/css/jquery-ui.structure.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/opusmagus.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/match.css" />" rel="stylesheet">
	
    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
    <script src="<c:url value="/resources/js/match.js" />"></script>
</head>
<body>
	<input id="hfAppRoot" type="hidden" value="<%=request.getContextPath()%>"> 	

 	<div id="matchWidget" style="width: 1600px; height: 1024px; background-image:url('<c:url value="/resources/images/match-background2.jpg" />'); background-size: contain; background-repeat: no-repeat; background-position: top center;">
 		<div style="font-size: 14pt;">Match</div>
 	 	<div style="font-size: 14pt; margin-top:0px;" id="leagueName"></div>
 	
 		<div style="font-size: 14pt;" id="minutesGone"></div>
 		<div id="homeTeamWidget" style="display: inline-block; width: 700px; height: 700px; border: solid 2px #ffffff; margin: 20px; border-radius: 8px;">
 			<div id="homeAttack" style="width: 660px; height: 200px; border: solid 2px #ffffff; margin: 20px; border-radius: 8px;"></div>
 			<div id="homeMidfield"></div>
 			<div id="homeDefence"></div>
 			<div id="homeKeeper"></div>
 		</div>
 		<div id="awayTeamWidget" style="display: inline-block; width: 700px; height: 700px; border: solid 2px #ffffff; margin: 20px; border-radius: 8px;">
 			<div id="awayAttack" style="width: 660px; height: 200px; border: solid 2px #ffffff; margin: 20px; border-radius: 8px;"></div>
 			<div id="awayMidfield"></div>
 			<div id="awayDefence"></div>
 			<div id="awayKeeper"></div>
 		</div> 		
	 	<div>
 			<img id="btnGoBack" src="<c:url value="/resources/images/arrow-back-icon-64.png" />" class="toolbarButton" alt="">
		</div>
		
		<!-- Templates -->
		<div id="playerCardTemplate" style="border: solid 2px #ffffff; border-radius: 4px; height: 160px; width: 100px; display: inline-block;">
			<div class="playerName">Lionel Messi</div>
			<div class="overallRating">95</div>
			<div class="stamina">99</div>
		</div>
 	</div>
</body>
</html>