function fromform() {

	console.log("Js file calling");

	var userName = $("#username-id").val();
	var password = $("#password-id").val();

	var myData = {
		userName : userName,
		password : password
	}
	console.log(myData);

	$.ajax({
		type : "POST",
		url : "/bin/aemLoginServlet",
		data : {
			"data" : JSON.stringify(myData)
		},
		success : function(data) {
			alert("sent to servlet");
		},

	});

}