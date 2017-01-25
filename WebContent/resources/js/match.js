$(function() {
	var match = new Match();
	$("#btnGoBack").click(function() { match.goBackToMainPage() } );
	match.updateMatchWidget(1);
});

function Match() {

	var _this = this;
	_this.appRoot = $("#hfAppRoot").val();
	
	this.updateMatchWidget = function(teamId) {
		var data = {};
		data.teamId = teamId;
		$.ajax({
			  type: "POST",
			  url: _this.appRoot + "/match/advance",
			  data: data,			  
			  success: function(match) { 
				console.log("updateMatchWidget() success!");
								
				_this.updateClock(match);
				_this.drawPlayers(match);			
			  },
			  error: function(err, err2) {
				  console.log("drawLeagueTable() error!");
				  console.log("drawLeagueTable() error!");
				  console.log("drawLeagueTable() error!");
			  },			  
			  complete: function() { 
				console.log("drawLeagueTable() complete."); 
			  }
		});
	};
	
	this.drawPlayers = function(match) {
		_this.drawHomeTeam(match.HomeTeam);
		_this.drawAwayTeam(match.AwayTeam);
		$("#playerCardTemplate").hide();
	};
	
	this.addPlayer = function(player, isHomeTeam) {
		var playerCardTemplate = $("#playerCardTemplate");
		var playerCard = playerCardTemplate.clone();
		$(playerCard).removeAttr("id");
		$(playerCard).find(".playerName").text(player.Name);
		
		if(player.Position == "Attack") {
			if(isHomeTeam)
				$("#homeAttack").append(playerCard);
			else
				$("#awayAttack").append(playerCard);
		}
		
		return playerCard;
	};
	
	this.drawHomeTeam = function(team) {
		for(var playerIndex=0; playerIndex<team.Players.length; playerIndex++) {
			_this.addPlayer(team.Players[playerIndex], true);
		}
	};
	
	this.drawAwayTeam = function(team) {
		for(var playerIndex=0; playerIndex<team.Players.length; playerIndex++) {
			_this.addPlayer(team.Players[playerIndex], false);
		}
	};
		
	
	this.updateMatchWidgetOld = function(teamId) {
		var data = {};
		data.teamId = teamId;
		$.ajax({
			  type: "POST",
			  url: _this.appRoot + "/match/advance",
			  data: data,			  
			  success: function(match) { 
				console.log("updateMatchWidget() success!");
								
				_this.updateClock(match);
				_this.animate(match);				
				
			  },
			  error: function(err, err2) {
				  console.log("drawLeagueTable() error!");
				  console.log("drawLeagueTable() error!");
				  console.log("drawLeagueTable() error!");
			  },			  
			  complete: function() { 
				console.log("drawLeagueTable() complete."); 
			  }
		});
	};
	
	this.updateClock = function(match) {
		$("#minutesGone").html(match.MinutesGone);
	};
	
	this.animate = function(match) {
		var players = {};
		_this.animatePlayers();
		_this.animateBall(match.Ball);
	};
	
	this.animateBall = function(ball) {
		_this.drawDot(ball.LastXPos,ball.LastYPos, "white");
	};
		
	this.animatePlayers = function(players) {
		var player = {};
		_this.animatePlayer(player);
	};
	
	this.animatePlayer = function(player) {
		_this.drawDot(10,10, "red");
	};
	
	this.drawDot = function(xPos, yPos, dotColor) {
		var canvas = document.getElementById('matchWidget');
		var context = canvas.getContext('2d');
		//var centerX = canvas.width / 2;
		//var centerY = canvas.height / 2;
		var radius = 3;
	
		context.beginPath();
		context.arc(xPos, yPos, radius, 0, 2 * Math.PI, false);
		context.fillStyle = dotColor;
		context.fill();
		context.lineWidth = 1;
		context.strokeStyle = '#003300';
		context.stroke();
	};
	
	this.goBackToMainPage = function() {
		window.location.href = _this.appRoot + "/"
	};	

}