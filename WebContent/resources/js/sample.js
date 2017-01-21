$(function() {
	console.log("jquery is enabled!");
	var customer = new Customer();
	//$("#btnLeagueTable").click(customer.getSampleCustomer());
	$("#btnLeagueTable").click(function() { customer.showLeagueTable() } );
});

function Customer() {

	var _this = this;
	_this.appRoot = $("#hfAppRoot").val();
	
	this.showLeagueTable = function() {
		window.location.href = _this.appRoot + "/league/index"
	};
	
	this.getSampleCustomer = function() {
		$.ajax({
			  type: "POST",
			  url: _this.appRoot + "/pure-rest/customer",
			  data: "id=100",			  
			  success: function(data) { 
				console.log("getSampleCustomer() success!"); 
			  },
			  error: function(err, err2) {
				  console.log("getSampleCustomer() error!");
				  console.log("getSampleCustomer() error!");
				  console.log("getSampleCustomer() error!");
			  },			  
			  complete: function() { 
				console.log("getSampleCustomer() complete."); 
			  }
		});
	};

}