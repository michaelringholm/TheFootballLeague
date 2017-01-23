$(function() {
	console.log("jquery is enabled!");
	var mainMenu = new MainMenu();
	$("#btnShowLeagueTable").click(function() { mainMenu.showLeagueTable() } );
	$("#btnShowMatchScreen").click(function() { mainMenu.showMatchScreen() } );
});

function MainMenu() {

	var _this = this;
	_this.appRoot = $("#hfAppRoot").val();
	
	this.showLeagueTable = function() {
		window.location.href = _this.appRoot + "/league/index"
	};
	
	this.showMatchScreen = function() {
		window.location.href = _this.appRoot + "/match/index"
	};

}