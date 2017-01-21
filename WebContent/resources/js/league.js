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
				
				for(var i=0; i<league.Teams.length; i++) {
					$("#leagueTable").append("<div>" + league.Teams[i].Name + "</div>");
				}
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