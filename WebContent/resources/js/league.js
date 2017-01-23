$(function() {
	var league = new League();
	$("#btnGoBack").click(function() { league.goBackToMainPage() } );
	league.drawLeagueTable(1);
});

function League() {

	var _this = this;
	_this.appRoot = $("#hfAppRoot").val();
	
	this.drawLeagueTable = function(divisionIndex) {
		var data = {};
		data.divisionIndex = divisionIndex;
		$.ajax({
			  type: "POST",
			  url: _this.appRoot + "/league/division",
			  data: data,			  
			  success: function(league) { 
				console.log("drawLeagueTable() success!");
				
				$("#leagueName").text(league.Name);
				for(var i=0; i<league.Teams.length; i++) {
					var leagueTableRow = $("#leagueTableRowTemplate").clone();
					$(leagueTableRow).removeAttr("id");
					var team = league.Teams[i];
					$(leagueTableRow).find(".leaguePosition").text(team.LeaguePosition);
					$(leagueTableRow).find(".teamName").text(team.Name);
					$(leagueTableRow).find(".goalsScored").text(team.GoalsScored);
					$(leagueTableRow).find(".goalsConceeded").text(team.GoalsConceeded);
					$(leagueTableRow).find(".goalDifference").text(team.goalDifference);
					$("#leagueTable").append(leagueTableRow);
				}
				
				$("#leagueTableRowTemplate").hide();
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
	}
	
	this.goBackToMainPage = function() {
		window.location.href = _this.appRoot + "/"
	};	

}